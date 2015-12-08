// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.contacts:
//            ContactUtils, ContactJson, ContactConstants

public class ContactSaver
{

    private static final String TAG = "ContactSaver";
    private JSONObject mContact;
    private String mId;
    private boolean mIsUpdate;
    private ContactJson mJson;
    private ArrayList mOps;
    private ContactUtils mUtils;

    public ContactSaver(ContentResolver contentresolver)
    {
        mUtils = new ContactUtils(contentresolver);
    }

    private void PutToContact(String s, String s1)
    {
        if (s == null)
        {
            return;
        }
        try
        {
            mContact.put(s, s1);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("ContactSaver", (new StringBuilder()).append("Failed to set ").append(s).append(" = ").append(s1).append(" for contact").append(jsonexception.toString()).toString());
        }
    }

    private void buildByArray(String s, String s1, List list)
    {
        if (mIsUpdate)
        {
            mUtils.cleanByMimeType(mId, s);
        }
        list = list.iterator();
        do
        {
            String s2;
            android.content.ContentProviderOperation.Builder builder;
label0:
            {
                if (list.hasNext())
                {
                    s2 = (String)list.next();
                    builder = newInsertContactOrFieldBuilder(s);
                    if (builder != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            builder.withValue(s1, s2);
            mOps.add(builder.build());
        } while (true);
    }

    private void buildByArray(ContactConstants.ContactMap contactmap)
    {
        if (mContact.has(contactmap.mName)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.content.ContentProviderOperation.Builder builder;
        int i;
        if (mIsUpdate)
        {
            mUtils.cleanByMimeType(mId, contactmap.mMimeType);
        }
        Object obj;
        String s;
        JSONArray jsonarray;
        ContactJson contactjson;
        Iterator iterator;
        java.util.Map.Entry entry;
        int j;
        try
        {
            jsonarray = mContact.getJSONArray(contactmap.mName);
        }
        catch (JSONException jsonexception)
        {
            Log.e("ContactSaver", (new StringBuilder()).append("Failed to parse json data of ").append(contactmap.mName).append(": ").append(jsonexception.toString()).toString());
            return;
        }
        i = 0;
_L7:
        if (i >= jsonarray.length()) goto _L1; else goto _L3
_L3:
        contactjson = new ContactJson(jsonarray.getJSONObject(i));
        obj = contactjson.getStringArray("types");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_414;
        }
        obj = (String)((List) (obj)).get(0);
        obj = (Integer)contactmap.mTypeValueMap.get(obj);
        builder = newInsertContactOrFieldBuilder(contactmap.mMimeType);
        if (builder == null) goto _L1; else goto _L4
_L4:
        if (contactjson.getBoolean("preferred"))
        {
            builder.withValue((String)contactmap.mTypeMap.get("isPrimary"), Integer.valueOf(1));
            builder.withValue((String)contactmap.mTypeMap.get("isSuperPrimary"), Integer.valueOf(1));
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        builder.withValue((String)contactmap.mTypeMap.get("type"), obj);
        iterator = contactmap.mDataMap.entrySet().iterator();
_L6:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_401;
        }
        entry = (java.util.Map.Entry)iterator.next();
        s = contactjson.getString((String)entry.getValue());
        obj = s;
        if (!contactmap.mName.equals("impp"))
        {
            break MISSING_BLOCK_LABEL_339;
        }
        j = s.indexOf(':');
        if (-1 == j) goto _L6; else goto _L5
_L5:
        obj = s.substring(0, j);
        builder.withValue("data5", ContactConstants.imProtocolMap.get(obj));
        obj = s.substring(j + 1);
        builder.withValue((String)entry.getKey(), obj);
          goto _L6
        mOps.add(builder.build());
        i++;
          goto _L7
    }

    private void buildByArray(ContactConstants.ContactMap contactmap, String s, List list)
    {
        if (mContact.has(contactmap.mName))
        {
            buildByArray(contactmap.mMimeType, s, list);
        }
    }

    private void buildByContactMapList()
    {
        for (Iterator iterator = ContactConstants.contactMapList.iterator(); iterator.hasNext();)
        {
            ContactConstants.ContactMap contactmap = (ContactConstants.ContactMap)iterator.next();
            if (contactmap.mTypeMap != null)
            {
                buildByArray(contactmap);
            } else
            {
                buildByArray(contactmap, (String)contactmap.mDataMap.get("data"), mJson.getStringArray(contactmap.mName));
            }
        }

    }

    private void buildByDate(String s, String s1, String s2, String s3, int i)
    {
        if (!mContact.has(s))
        {
            return;
        }
        s = mJson.getString(s);
        s = mUtils.dateTrim(s);
        s1 = newBuilder(s1);
        s1.withValue(s2, s);
        if (s3 != null)
        {
            s1.withValue(s3, Integer.valueOf(i));
        }
        mOps.add(s1.build());
    }

    private void buildByEvent(String s, int i)
    {
        buildByDate(s, "vnd.android.cursor.item/contact_event", "data1", "data2", i);
    }

    private android.content.ContentProviderOperation.Builder newBuilder(String s)
    {
        if (mIsUpdate)
        {
            return newUpdateBuilder(s);
        } else
        {
            return newInsertBuilder(s);
        }
    }

    private android.content.ContentProviderOperation.Builder newInsertBuilder(String s)
    {
        android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI);
        builder.withValueBackReference("raw_contact_id", 0);
        builder.withValue("mimetype", s);
        return builder;
    }

    private android.content.ContentProviderOperation.Builder newInsertContactOrFieldBuilder(String s)
    {
        if (mIsUpdate)
        {
            return newInsertFieldBuilder(s);
        } else
        {
            return newInsertBuilder(s);
        }
    }

    private android.content.ContentProviderOperation.Builder newInsertFieldBuilder(String s)
    {
        if (mUtils.getRawId(mId) == null)
        {
            Log.e("ContactSaver", (new StringBuilder()).append("Failed to create builder to insert field of ").append(mId).toString());
            return null;
        } else
        {
            android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI);
            builder.withValue("raw_contact_id", mUtils.getRawId(mId));
            builder.withValue("mimetype", s);
            return builder;
        }
    }

    private android.content.ContentProviderOperation.Builder newUpdateBuilder(String s)
    {
        android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI);
        builder.withSelection("contact_id=? AND mimetype=?", new String[] {
            mId, s
        });
        return builder;
    }

    public JSONObject save(String s)
    {
        mOps = new ArrayList();
        try
        {
            mContact = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("ContactSaver", (new StringBuilder()).append("Failed to parse json data: ").append(s.toString()).toString());
            return new JSONObject();
        }
        mJson = new ContactJson(mContact);
        mId = mJson.getString("id");
        mIsUpdate = mUtils.hasID(mId);
        s = null;
        if (!mIsUpdate)
        {
            s = mUtils.getCurrentRawIds();
            mId = null;
            android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(android.provider.ContactsContract.RawContacts.CONTENT_URI);
            builder.withValue("account_type", null);
            builder.withValue("account_name", null);
            mOps.add(builder.build());
        }
        if (mContact.has("name"))
        {
            JSONObject jsonobject = mJson.getObject("name");
            ContactJson contactjson = new ContactJson(jsonobject);
            android.content.ContentProviderOperation.Builder builder3 = newBuilder("vnd.android.cursor.item/name");
            builder3.withValue("data1", contactjson.getString("displayName"));
            builder3.withValue("data3", contactjson.getFirstValue("familyNames"));
            builder3.withValue("data2", contactjson.getFirstValue("givenNames"));
            builder3.withValue("data5", contactjson.getFirstValue("additionalNames"));
            builder3.withValue("data4", contactjson.getFirstValue("honorificPrefixes"));
            builder3.withValue("data6", contactjson.getFirstValue("honorificSuffixes"));
            mOps.add(builder3.build());
            if (jsonobject.has("nicknames"))
            {
                android.content.ContentProviderOperation.Builder builder1 = newBuilder("vnd.android.cursor.item/nickname");
                builder1.withValue("data1", contactjson.getFirstValue("nicknames"));
                mOps.add(builder1.build());
            }
        }
        if (mContact.has("categories"))
        {
            ArrayList arraylist = new ArrayList();
            String s2;
            for (Iterator iterator = mJson.getStringArray("categories").iterator(); iterator.hasNext(); arraylist.add(mUtils.getEnsuredGroupId(s2)))
            {
                s2 = (String)iterator.next();
            }

            buildByArray("vnd.android.cursor.item/group_membership", "data1", arraylist);
        }
        if (mContact.has("gender"))
        {
            String s1 = mJson.getString("gender");
            if (Arrays.asList(new String[] {
    "male", "female", "other", "none", "unknown"
}).contains(s1))
            {
                android.content.ContentProviderOperation.Builder builder2 = newBuilder("vnd.android.cursor.item/contact_custom_gender");
                builder2.withValue("data1", s1);
                mOps.add(builder2.build());
            }
        }
        buildByEvent("birthday", 3);
        buildByEvent("anniversary", 1);
        buildByContactMapList();
        try
        {
            mUtils.mResolver.applyBatch("com.android.contacts", mOps);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if ((s instanceof RemoteException) || (s instanceof OperationApplicationException) || (s instanceof SecurityException))
            {
                Log.e("ContactSaver", (new StringBuilder()).append("Failed to apply batch: ").append(s.toString()).toString());
                return new JSONObject();
            } else
            {
                throw new RuntimeException(s);
            }
        }
        if (!mIsUpdate)
        {
            Set set = mUtils.getCurrentRawIds();
            if (set == null)
            {
                return new JSONObject();
            }
            set.removeAll(s);
            if (set.size() != 1)
            {
                Log.e("ContactSaver", (new StringBuilder()).append("Something wrong after batch applied, new raw ids are: ").append(set.toString()).toString());
                return mContact;
            }
            mId = mUtils.getId((String)set.iterator().next());
            PutToContact("id", mId);
        }
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            PutToContact("lastUpdated", String.valueOf(mUtils.getLastUpdated(Long.valueOf(mId).longValue())));
        }
        return mContact;
    }
}
