// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.content.ContentResolver;
import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.contacts:
//            ContactUtils, ContactConstants, ContactJson

public class ContactFinder
{
    private class ContactData
    {

        public JSONArray aAddresses;
        public JSONArray aCategories;
        public JSONArray aEmails;
        public JSONArray aImpp;
        public JSONArray aJobTitles;
        public JSONArray aNotes;
        public JSONArray aNumbers;
        public JSONArray aOrganizations;
        public JSONArray aPhotos;
        public JSONArray aUrls;
        public String anniversary;
        public String birthday;
        public String gender;
        public String lastUpdated;
        public JSONObject oName;
        final ContactFinder this$0;

        private void ensurePut(JSONObject jsonobject, String s, Object obj)
        {
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_11;
            }
            jsonobject.put(s, obj);
            return;
            jsonobject;
            Log.e("ContactFinder", (new StringBuilder()).append("ensurePut - Failed to add json data: ").append(jsonobject.toString()).toString());
            return;
        }

        public JSONObject ensurePut(long l)
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("id", l);
            }
            catch (JSONException jsonexception)
            {
                Log.e("ContactFinder", (new StringBuilder()).append("ensurePut - Failed to build json data: ").append(jsonexception.toString()).toString());
            }
            ensurePut(jsonobject, "name", oName);
            ensurePut(jsonobject, "lastUpdated", lastUpdated);
            ensurePut(jsonobject, "emails", aEmails);
            ensurePut(jsonobject, "photos", aPhotos);
            ensurePut(jsonobject, "urls", aUrls);
            ensurePut(jsonobject, "categories", aCategories);
            ensurePut(jsonobject, "addresses", aAddresses);
            ensurePut(jsonobject, "phoneNumbers", aNumbers);
            ensurePut(jsonobject, "organizations", aOrganizations);
            ensurePut(jsonobject, "jobTitles", aJobTitles);
            ensurePut(jsonobject, "birthday", birthday);
            ensurePut(jsonobject, "notes", aNotes);
            ensurePut(jsonobject, "impp", aImpp);
            ensurePut(jsonobject, "anniversary", anniversary);
            ensurePut(jsonobject, "gender", gender);
            return jsonobject;
        }

        private ContactData()
        {
            this$0 = ContactFinder.this;
            super();
        }

    }

    public static class FindOption
    {

        public String mSortOrder;
        public String mWhere;
        public String mWhereArgs[];

        public FindOption(String s, String as[], String s1)
        {
            mWhere = s;
            mWhereArgs = as;
            mSortOrder = s1;
        }
    }


    private static final String TAG = "ContactFinder";
    private ContactUtils mUtils;

    public ContactFinder(ContentResolver contentresolver)
    {
        mUtils = new ContactUtils(contentresolver);
    }

    private JSONObject addArrayTop(JSONObject jsonobject, Cursor cursor, String s, String s1)
    {
        return ensureAddArrayTop(jsonobject, cursor, s, cursor.getString(cursor.getColumnIndex(s1)));
    }

    private JSONObject addArrayTop(JSONObject jsonobject, Cursor cursor, String s, String s1, Map map)
    {
        return ensureAddArrayTop(jsonobject, cursor, s, (String)ContactUtils.getKeyFromValue(map, Integer.valueOf(cursor.getString(cursor.getColumnIndex(s1)))));
    }

    private JSONArray addString(JSONArray jsonarray, Cursor cursor, String s)
    {
        JSONArray jsonarray1 = jsonarray;
        if (jsonarray == null)
        {
            jsonarray1 = new JSONArray();
        }
        jsonarray = cursor.getString(cursor.getColumnIndex(s));
        if (jsonarray != null)
        {
            jsonarray1.put(jsonarray);
        }
        return jsonarray1;
    }

    private JSONObject addString(JSONObject jsonobject, Cursor cursor, String s, String s1)
    {
        Object obj = jsonobject;
        try
        {
            s1 = cursor.getString(cursor.getColumnIndex(s1));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("ContactFinder", (new StringBuilder()).append("addString - Failed to build json data: ").append(jsonobject.toString()).toString());
            return ((JSONObject) (obj));
        }
        cursor = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = jsonobject;
        cursor = new JSONObject();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = cursor;
        cursor.put(s, s1);
        return cursor;
    }

    private JSONArray addTypeArray(JSONArray jsonarray, Cursor cursor, String s, Map map, Map map1)
    {
        JSONArray jsonarray1 = jsonarray;
        String s1;
        JSONObject jsonobject;
        int i;
        if (jsonarray == null)
        {
            try
            {
                jsonarray1 = new JSONArray();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Log.e("ContactFinder", (new StringBuilder()).append("addTypeArray - Failed to build json data: ").append(cursor.toString()).toString());
                return jsonarray;
            }
        }
        jsonarray = jsonarray1;
        if (cursor.getString(cursor.getColumnIndex((String)map.get("isSuperPrimary"))).equals("1"))
        {
            s1 = "true";
        } else
        {
            s1 = "false";
        }
        jsonarray = jsonarray1;
        jsonobject = new JSONObject();
        jsonarray = jsonarray1;
        jsonobject.put("preferred", s1);
        jsonarray = jsonarray1;
        addArrayTop(jsonobject, cursor, "types", (String)map.get("type"), map1);
        jsonarray = jsonarray1;
        map = cursor.getString(cursor.getColumnIndex(s));
        s = map;
        jsonarray = jsonarray1;
        if (!cursor.getString(cursor.getColumnIndex("mimetype")).equals("vnd.android.cursor.item/im"))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        jsonarray = jsonarray1;
        i = cursor.getInt(cursor.getColumnIndex("data5"));
        jsonarray = jsonarray1;
        cursor = (String)ContactUtils.getKeyFromValue(ContactConstants.imProtocolMap, Integer.valueOf(i));
        jsonarray = jsonarray1;
        s = (new StringBuilder()).append(cursor).append(':').append(map).toString();
        jsonarray = jsonarray1;
        jsonobject.put("value", s);
        jsonarray = jsonarray1;
        jsonarray1.put(jsonobject);
        return jsonarray1;
    }

    private FindOption createFindIDOption(String s)
    {
        Object obj = new ContactJson(s);
        String s1;
        if (s != null)
        {
            s1 = ((ContactJson) (obj)).getString("value");
        } else
        {
            s1 = null;
        }
        if (s1 == null || s1.equals("") || s.equals(""))
        {
            return new FindOption(null, null, null);
        }
        ArrayList arraylist = new ArrayList();
        Object obj1 = ((ContactJson) (obj)).getStringArray("fields");
        s = ((ContactJson) (obj)).getString("operator");
        if (s == null)
        {
            return new FindOption(null, null, null);
        }
        if (s.equals("is"))
        {
            s = " = ";
        } else
        if (s.equals("contains"))
        {
            s = " LIKE ";
            s1 = (new StringBuilder()).append("%").append(s1).append("%").toString();
        } else
        {
            Log.e("ContactFinder", (new StringBuilder()).append("find - Wrong Operator: [").append(s).append("], should be 'is' or 'contains'").toString());
            return null;
        }
        obj = "";
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj2 = (String)((Iterator) (obj1)).next();
            obj2 = (String)ContactConstants.findFieldMap.get(obj2);
            if (obj2 != null)
            {
                obj2 = (Pair)ContactConstants.contactDataMap.get(obj2);
                obj = (new StringBuilder()).append(((String) (obj))).append((String)((Pair) (obj2)).first).append(s).append(" ? AND ").append("mimetype").append(" = ? or ").toString();
                arraylist.add(s1);
                arraylist.add(((Pair) (obj2)).second);
            }
        } while (true);
        if (obj == "")
        {
            return new FindOption(null, null, null);
        } else
        {
            return new FindOption(((String) (obj)).substring(0, ((String) (obj)).length() - 3), (String[])arraylist.toArray(new String[arraylist.size()]), null);
        }
    }

    private JSONObject ensureAddArrayTop(JSONObject jsonobject, Cursor cursor, String s, String s1)
    {
        cursor = jsonobject;
        JSONArray jsonarray;
        if (jsonobject == null)
        {
            try
            {
                cursor = new JSONObject();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Log.e("ContactFinder", (new StringBuilder()).append("ensureAddArrayTop - Failed to build json data: ").append(cursor.toString()).toString());
                return jsonobject;
            }
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        jsonobject = cursor;
        jsonarray = new JSONArray();
        jsonobject = cursor;
        jsonarray.put(s1);
        jsonobject = cursor;
        cursor.put(s, jsonarray);
        return cursor;
    }

    private Set getContactIds(FindOption findoption)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        findoption = mUtils.mResolver.query(android.provider.ContactsContract.Data.CONTENT_URI, null, findoption.mWhere, findoption.mWhereArgs, findoption.mSortOrder);
        obj = findoption;
        obj1 = findoption;
        HashSet hashset = new HashSet();
        for (; findoption.moveToNext(); hashset.add(String.valueOf(findoption.getLong(findoption.getColumnIndex("contact_id"))))) { }
          goto _L1
        obj1;
_L5:
        obj = findoption;
        Log.e("ContactFinder", (new StringBuilder()).append("getContactIds: ").append(((SecurityException) (obj1)).toString()).toString());
        if (findoption != null)
        {
            findoption.close();
        }
        return null;
_L1:
        if (findoption != null)
        {
            findoption.close();
        }
        return hashset;
        obj1;
        findoption = ((FindOption) (obj));
        obj = obj1;
_L3:
        if (findoption != null)
        {
            findoption.close();
        }
        throw obj;
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        SecurityException securityexception;
        securityexception;
        findoption = ((FindOption) (obj1));
        obj1 = securityexception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private JSONArray getContacts(Set set, String s, String s1, Long long1)
    {
        Object obj;
        Cursor cursor;
        String as[];
        obj = null;
        as = null;
        if (set.size() != 0)
        {
            obj = (new StringBuilder()).append("contact_id in (").append(ContactUtils.makeQuestionMarkList(set)).append(")").toString();
            as = (String[])set.toArray(new String[set.size()]);
        }
        cursor = null;
        set = null;
        obj = mUtils.mResolver.query(android.provider.ContactsContract.Data.CONTENT_URI, null, ((String) (obj)), as, s);
        set = ((Set) (obj));
        cursor = ((Cursor) (obj));
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (s == null) goto _L2; else goto _L1
_L1:
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break;
            }
            if (((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("mimetype")).equals(s1))
            {
                long l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("contact_id"));
                if (!linkedhashmap.containsKey(Long.valueOf(l)))
                {
                    linkedhashmap.put(Long.valueOf(l), new ContactData());
                }
            }
        } while (true);
          goto _L3
        s;
_L25:
        set = ((Set) (obj));
        if (s instanceof NumberFormatException) goto _L5; else goto _L4
_L4:
        set = ((Set) (obj));
        if (!(s instanceof SecurityException)) goto _L6; else goto _L5
_L5:
        set = ((Set) (obj));
        Log.e("ContactFinder", (new StringBuilder()).append("getContacts: ").append(s.toString()).toString());
        set = ((Set) (obj));
        s = new JSONArray();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return s;
_L3:
        ((Cursor) (obj)).moveToFirst();
_L2:
        if (!((Cursor) (obj)).moveToNext()) goto _L8; else goto _L7
_L7:
        long l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("contact_id"));
        if (!linkedhashmap.containsKey(Long.valueOf(l1)))
        {
            linkedhashmap.put(Long.valueOf(l1), new ContactData());
        }
        set = (ContactData)linkedhashmap.get(Long.valueOf(l1));
        if (((ContactData) (set)).lastUpdated == null && android.os.Build.VERSION.SDK_INT >= 18)
        {
            set.lastUpdated = mUtils.getLastUpdated(l1);
        }
        s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("mimetype"));
        if (!s.equals("vnd.android.cursor.item/name")) goto _L10; else goto _L9
_L9:
        set.oName = addString(((ContactData) (set)).oName, ((Cursor) (obj)), "displayName", "data1");
        set.oName = addArrayTop(((ContactData) (set)).oName, ((Cursor) (obj)), "honorificPrefixes", "data4");
        set.oName = addArrayTop(((ContactData) (set)).oName, ((Cursor) (obj)), "givenNames", "data2");
        set.oName = addArrayTop(((ContactData) (set)).oName, ((Cursor) (obj)), "additionalNames", "data5");
        set.oName = addArrayTop(((ContactData) (set)).oName, ((Cursor) (obj)), "familyNames", "data3");
        set.oName = addArrayTop(((ContactData) (set)).oName, ((Cursor) (obj)), "honorificSuffixes", "data6");
          goto _L2
        s;
        set = ((Set) (obj));
_L22:
        if (set != null)
        {
            set.close();
        }
        throw s;
_L10:
label0:
        {
            if (!s.equals("vnd.android.cursor.item/nickname"))
            {
                break label0;
            }
            set.oName = addArrayTop(((ContactData) (set)).oName, ((Cursor) (obj)), "nicknames", "data1");
        }
          goto _L2
label1:
        {
            if (!s.equals("vnd.android.cursor.item/email_v2"))
            {
                break label1;
            }
            set.aEmails = addTypeArray(((ContactData) (set)).aEmails, ((Cursor) (obj)), "data1", ContactConstants.emailTypeMap, ContactConstants.emailTypeValuesMap);
        }
          goto _L2
label2:
        {
            if (!s.equals("vnd.android.cursor.item/photo"))
            {
                break label2;
            }
            set.aPhotos = addString(((ContactData) (set)).aPhotos, ((Cursor) (obj)), "data15");
        }
          goto _L2
label3:
        {
            if (!s.equals("vnd.android.cursor.item/website"))
            {
                break label3;
            }
            set.aUrls = addTypeArray(((ContactData) (set)).aUrls, ((Cursor) (obj)), "data1", ContactConstants.websiteTypeMap, ContactConstants.websiteTypeValuesMap);
        }
          goto _L2
        if (!s.equals("vnd.android.cursor.item/group_membership"))
        {
            break MISSING_BLOCK_LABEL_769;
        }
        s = mUtils.getGroupTitle(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1")));
        if (s == null) goto _L2; else goto _L11
_L11:
        if (((ContactData) (set)).aCategories == null)
        {
            set.aCategories = new JSONArray();
        }
        ((ContactData) (set)).aCategories.put(s);
          goto _L2
label4:
        {
            if (!s.equals("vnd.android.cursor.item/postal-address_v2"))
            {
                break label4;
            }
            set.aAddresses = addTypeArray(((ContactData) (set)).aAddresses, ((Cursor) (obj)), "data1", ContactConstants.addressTypeMap, ContactConstants.addressTypeValuesMap);
        }
          goto _L2
label5:
        {
            if (!s.equals("vnd.android.cursor.item/phone_v2"))
            {
                break label5;
            }
            set.aNumbers = addTypeArray(((ContactData) (set)).aNumbers, ((Cursor) (obj)), "data1", ContactConstants.phoneTypeMap, ContactConstants.phoneTypeValuesMap);
        }
          goto _L2
label6:
        {
            if (!s.equals("vnd.android.cursor.item/organization"))
            {
                break label6;
            }
            set.aOrganizations = addString(((ContactData) (set)).aOrganizations, ((Cursor) (obj)), "data1");
        }
          goto _L2
label7:
        {
            if (!s.equals("vnd.android.cursor.item/organization"))
            {
                break label7;
            }
            set.aJobTitles = addString(((ContactData) (set)).aJobTitles, ((Cursor) (obj)), "data4");
        }
          goto _L2
        int i;
        if (!s.equals("vnd.android.cursor.item/contact_event"))
        {
            break MISSING_BLOCK_LABEL_996;
        }
        i = Integer.valueOf(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data2"))).intValue();
        if (i != 3) goto _L13; else goto _L12
_L12:
        set.birthday = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
          goto _L2
_L13:
        if (i != 1) goto _L2; else goto _L14
_L14:
        set.anniversary = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
          goto _L2
label8:
        {
            if (!s.equals("vnd.android.cursor.item/note"))
            {
                break label8;
            }
            set.aNotes = addString(((ContactData) (set)).aNotes, ((Cursor) (obj)), "data1");
        }
          goto _L2
        if (!s.equals("vnd.android.cursor.item/im")) goto _L16; else goto _L15
_L15:
        set.aImpp = addTypeArray(((ContactData) (set)).aImpp, ((Cursor) (obj)), "data1", ContactConstants.imTypeMap, ContactConstants.imTypeValuesMap);
          goto _L2
_L16:
        if (!s.equals("vnd.android.cursor.item/contact_custom_gender")) goto _L2; else goto _L17
_L17:
        set.gender = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
          goto _L2
_L8:
        int j;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        j = 0;
        set = new JSONArray();
        s = linkedhashmap.entrySet().iterator();
_L23:
        if (!s.hasNext()) goto _L19; else goto _L18
_L18:
        s1 = (java.util.Map.Entry)s.next();
        i = j;
        if (long1 == null) goto _L21; else goto _L20
_L20:
        j++;
        i = j;
        if ((long)j <= long1.longValue()) goto _L21; else goto _L19
_L19:
        return set;
_L6:
        set = ((Set) (obj));
        throw new RuntimeException(s);
        s;
          goto _L22
_L21:
        set.put(((ContactData)s1.getValue()).ensurePut(((Long)s1.getKey()).longValue()));
        j = i;
          goto _L23
        s;
        obj = cursor;
        if (true) goto _L25; else goto _L24
_L24:
    }

    private String getSortOrder(List list, String s)
    {
        String s1;
        if (s == null)
        {
            return null;
        }
        s1 = "";
        if (!s.equals("ascending")) goto _L2; else goto _L1
_L1:
        s1 = " ASC";
_L4:
        s = "";
        Iterator iterator = list.iterator();
        list = s;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s = (String)iterator.next();
            s = (Pair)ContactConstants.contactDataMap.get(s);
            if (s != null)
            {
                list = (new StringBuilder()).append(list).append((String)((Pair) (s)).first).append(s1).append(",").toString();
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (s.equals("descending"))
        {
            s1 = " DESC";
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (list != "")
        {
            list = list.substring(0, list.length() - 1);
        } else
        {
            list = null;
        }
        return list;
    }

    public JSONArray find(String s)
    {
        Set set = getContactIds(createFindIDOption(s));
        if (set == null)
        {
            return new JSONArray();
        }
        Object obj = new ContactJson(s);
        s = ((ContactJson) (obj)).getStringArray("sortBy");
        String s1 = getSortOrder(s, ((ContactJson) (obj)).getString("sortOrder"));
        if (s1 == null)
        {
            s = null;
        } else
        {
            s = (String)((Pair)ContactConstants.contactDataMap.get(s.get(0))).second;
        }
        obj = ((ContactJson) (obj)).getString("resultsLimit");
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(((String) (obj)));
        }
        return getContacts(set, s1, s, ((Long) (obj)));
    }
}
