// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.contacts:
//            Contacts

public class ContactEventListener extends ContentObserver
{

    private static final String TAG = "ContactsEventListener";
    private HashSet mContactIDs;
    private final Contacts mContacts;
    private boolean mIsListening;
    private HashMap mRawID2ContactIDMaps;
    private HashMap mRawID2VersionMaps;
    private final ContentResolver mResolver;

    public ContactEventListener(Handler handler, Contacts contacts, ContentResolver contentresolver)
    {
        super(handler);
        mIsListening = false;
        mContacts = contacts;
        mResolver = contentresolver;
    }

    private HashSet compareAllRawContactInfo(HashSet hashset)
    {
        Object obj2 = null;
        Object obj1 = null;
        Object obj;
        HashSet hashset1;
        String s;
        String s1;
        try
        {
            obj = mResolver.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, null, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (HashSet hashset)
        {
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = obj1;
        }
        obj1 = obj;
        obj2 = obj;
        hashset1 = new HashSet();
        obj1 = new HashMap();
        for (; ((Cursor) (obj)).moveToNext(); ((HashMap) (obj1)).put(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("_id")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("version")))) { }
          goto _L1
        hashset;
_L5:
        obj1 = obj;
        Log.e("ContactsEventListener", (new StringBuilder()).append("compareAllRawContactInfo: ").append(hashset.toString()).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return null;
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw hashset;
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = ((HashMap) (obj1)).keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj2 = (String)((Iterator) (obj)).next();
            s = (String)((HashMap) (obj1)).get(obj2);
            s1 = (String)mRawID2VersionMaps.get(obj2);
            if (s1 == null || !s.equals(s1))
            {
                obj2 = (String)mRawID2ContactIDMaps.get(obj2);
                if (obj2 != null && hashset.contains(obj2))
                {
                    hashset1.add(obj2);
                }
            }
        } while (true);
        return hashset1;
        hashset;
        continue; /* Loop/switch isn't completed */
        hashset;
        if (true) goto _L3; else goto _L2
        hashset;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private JSONArray convertSet2JSONArray(HashSet hashset)
    {
        JSONArray jsonarray = new JSONArray();
        for (hashset = hashset.iterator(); hashset.hasNext(); jsonarray.put(hashset.next())) { }
        return jsonarray;
    }

    private HashSet getAllContactIDs()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj2 = mResolver.query(android.provider.ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        obj = obj2;
        obj1 = obj2;
        HashSet hashset = new HashSet();
_L2:
        obj = obj2;
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        obj1 = obj2;
        hashset.add(((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("_id")));
        if (true) goto _L2; else goto _L1
        obj2;
        obj1 = obj;
        Log.e("ContactsEventListener", (new StringBuilder()).append("getAllContactIDs: ").append(((SecurityException) (obj2)).toString()).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = null;
_L4:
        return ((HashSet) (obj));
_L1:
        obj = hashset;
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        ((Cursor) (obj2)).close();
        return hashset;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw exception;
    }

    private HashSet getDiffSet(HashSet hashset, HashSet hashset1)
    {
        HashSet hashset2 = new HashSet();
        hashset2.addAll(hashset);
        hashset2.removeAll(hashset1);
        return hashset2;
    }

    private HashSet getIntersectSet(HashSet hashset, HashSet hashset1)
    {
        HashSet hashset2 = new HashSet();
        hashset2.addAll(hashset);
        hashset2.retainAll(hashset1);
        return hashset2;
    }

    private void notifyChanges(boolean flag)
    {
        HashSet hashset;
        HashSet hashset1;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            hashset1 = getAllContactIDs();
        }
        catch (JSONException jsonexception)
        {
            Log.e("ContactsEventListener", (new StringBuilder()).append("notifyChanges: ").append(jsonexception.toString()).toString());
            return;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (hashset1.size() <= mContactIDs.size()) goto _L3; else goto _L2
_L2:
        hashset = getDiffSet(hashset1, mContactIDs);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (hashset.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        jsonobject.put("added", convertSet2JSONArray(hashset));
_L6:
        notifyContactChanged(jsonobject);
        mContactIDs = hashset1;
        readAllRawContactInfo();
        return;
_L3:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        if (hashset1.size() >= mContactIDs.size())
        {
            break MISSING_BLOCK_LABEL_167;
        }
        hashset = getDiffSet(mContactIDs, hashset1);
        if (!flag) goto _L5; else goto _L4
_L4:
        if (hashset1.size() >= 0) goto _L6; else goto _L5
_L5:
        jsonobject.put("removed", convertSet2JSONArray(hashset));
          goto _L6
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        jsonexception = getIntersectSet(mContactIDs, hashset1);
_L7:
        jsonexception = compareAllRawContactInfo(jsonexception);
        if (jsonexception.size() != 0)
        {
            jsonobject.put("modified", convertSet2JSONArray(jsonexception));
        }
          goto _L6
        jsonexception = hashset1;
          goto _L7
    }

    private void notifyContactChanged(JSONObject jsonobject)
    {
        if (jsonobject == null || jsonobject.length() == 0)
        {
            return;
        }
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("reply", "contactschange");
            jsonobject1.put("data", jsonobject);
            mContacts.broadcastMessage(jsonobject1.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("ContactsEventListener", (new StringBuilder()).append("notifyContactChanged: ").append(jsonobject.toString()).toString());
        }
    }

    private void readAllRawContactInfo()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj2 = mResolver.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, null, null, null, null);
        obj = obj2;
        obj1 = obj2;
        mRawID2ContactIDMaps = new HashMap();
        obj = obj2;
        obj1 = obj2;
        mRawID2VersionMaps = new HashMap();
_L4:
        obj = obj2;
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToNext()) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj1 = obj2;
        String s = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("contact_id"));
        obj = obj2;
        obj1 = obj2;
        String s1 = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("_id"));
        obj = obj2;
        obj1 = obj2;
        String s2 = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("version"));
        obj = obj2;
        obj1 = obj2;
        mRawID2ContactIDMaps.put(s1, s);
        obj = obj2;
        obj1 = obj2;
        mRawID2VersionMaps.put(s1, s2);
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj1 = obj;
        Log.e("ContactsEventListener", (new StringBuilder()).append("readAllRawContactInfo: ").append(((SecurityException) (obj2)).toString()).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L6:
        return;
_L2:
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj2)).close();
        return;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw exception;
    }

    public void onChange(boolean flag)
    {
        super.onChange(flag);
        if (!mIsListening)
        {
            return;
        } else
        {
            notifyChanges(false);
            return;
        }
    }

    protected void onResume()
    {
        if (!mIsListening)
        {
            return;
        } else
        {
            notifyChanges(true);
            return;
        }
    }

    protected void startListening()
    {
        if (mIsListening)
        {
            return;
        } else
        {
            mIsListening = true;
            mContactIDs = getAllContactIDs();
            readAllRawContactInfo();
            return;
        }
    }
}
