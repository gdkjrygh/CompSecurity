// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class ContactUtils
{

    private static final String TAG = "ContactUtils";
    public ContentResolver mResolver;

    public ContactUtils(ContentResolver contentresolver)
    {
        mResolver = contentresolver;
    }

    public static Object getKeyFromValue(Map map, Object obj)
    {
        Object obj1 = null;
        Iterator iterator = map.entrySet().iterator();
        do
        {
            map = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            map = (java.util.Map.Entry)iterator.next();
            if (obj == null || !obj.equals(map.getValue()))
            {
                continue;
            }
            map = ((Map) (map.getKey()));
            break;
        } while (true);
        return map;
    }

    public static String makeQuestionMarkList(Set set)
    {
        String s = "";
        for (int i = 0; i < set.size(); i++)
        {
            s = (new StringBuilder()).append(s).append("?,").toString();
        }

        return s.substring(0, s.length() - 1);
    }

    private String timeConvertToJS(long l)
    {
        return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())).format(new Date(l));
    }

    public void cleanByMimeType(String s, String s1)
    {
        mResolver.delete(android.provider.ContactsContract.Data.CONTENT_URI, String.format("%s = ? AND %s = ?", new Object[] {
            "contact_id", "mimetype"
        }), new String[] {
            s, s1
        });
    }

    public String dateTrim(String s)
    {
        try
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            s = simpledateformat.format(simpledateformat.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("ContactUtils", (new StringBuilder()).append("dateFormat - parse failed: ").append(s.toString()).toString());
            return null;
        }
        return s;
    }

    public Set getCurrentRawIds()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj2 = mResolver.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, new String[] {
            "_id"
        }, null, null, null);
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
        hashset.add(((Cursor) (obj2)).getString(0));
        if (true) goto _L2; else goto _L1
        obj2;
        obj1 = obj;
        Log.e("ContactUtils", (new StringBuilder()).append("getCurrentRawIds: ").append(((SecurityException) (obj2)).toString()).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = null;
_L4:
        return ((Set) (obj));
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

    public String[] getDefaultAccountNameAndType()
    {
        Object obj;
        obj = new ArrayList();
        ((ArrayList) (obj)).add(ContentProviderOperation.newInsert(android.provider.ContactsContract.RawContacts.CONTENT_URI).withValue("account_name", null).withValue("account_type", null).build());
        ContentProviderResult acontentproviderresult[];
        android.net.Uri uri;
        long l;
        acontentproviderresult = mResolver.applyBatch("com.android.contacts", ((ArrayList) (obj)));
        break MISSING_BLOCK_LABEL_45;
        exception;
        if (!(exception instanceof RemoteException) && !(exception instanceof OperationApplicationException) && !(exception instanceof SecurityException)) goto _L2; else goto _L1
_L1:
        Log.e("ContactUtils", (new StringBuilder()).append("getDefaultAccountNameAndType - Failed to apply batch: ").append(exception.toString()).toString());
_L4:
        return null;
_L2:
        throw new RuntimeException(exception);
        Cursor cursor;
        String s2;
        String s3;
        uri = null;
        l = 0L;
        int j = acontentproviderresult.length;
        Exception exception;
        for (int i = 0; i < j; i++)
        {
            uri = acontentproviderresult[i].uri;
            l = ContentUris.parseId(uri);
        }

        cursor = null;
        exception = null;
        s2 = "";
        s3 = "";
        Cursor cursor1 = mResolver.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, new String[] {
            "account_type", "account_name"
        }, "_id=?", new String[] {
            String.valueOf(l)
        }, null);
        String s;
        String s1;
        s1 = s3;
        s = s2;
        exception = cursor1;
        cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_297;
        }
        s1 = s3;
        s = s2;
        exception = cursor1;
        cursor = cursor1;
        if (cursor1.isAfterLast())
        {
            break MISSING_BLOCK_LABEL_297;
        }
        exception = cursor1;
        cursor = cursor1;
        s = cursor1.getString(cursor1.getColumnIndex("account_type"));
        exception = cursor1;
        cursor = cursor1;
        s1 = cursor1.getString(cursor1.getColumnIndex("account_name"));
        if (cursor1 != null)
        {
            cursor1.close();
        }
        mResolver.delete(uri, null, null);
        return (new String[] {
            s1, s
        });
        SecurityException securityexception;
        securityexception;
        cursor = exception;
        Log.e("ContactUtils", (new StringBuilder()).append("getDefaultAccountNameAndType: ").append(securityexception.toString()).toString());
        if (exception == null) goto _L4; else goto _L3
_L3:
        exception.close();
        return null;
        Exception exception1;
        exception1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception1;
    }

    public String getEnsuredGroupId(String s)
    {
        String s2 = getGroupId(s);
        String s1 = s2;
        if (s2 == null)
        {
            newGroup(s);
            s = getGroupId(s);
            s1 = s;
            if (s == null)
            {
                return null;
            }
        }
        return s1;
    }

    public String getGroupId(String s)
    {
        Cursor cursor;
        Cursor cursor1;
        cursor1 = null;
        cursor = null;
        Cursor cursor2 = mResolver.query(android.provider.ContactsContract.Groups.CONTENT_URI, null, "deleted=? and group_visible=?", new String[] {
            "0", "1"
        }, null);
        cursor = cursor2;
        cursor1 = cursor2;
        cursor2.moveToFirst();
        int i = 0;
_L2:
        cursor = cursor2;
        cursor1 = cursor2;
        if (i >= cursor2.getCount())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor2;
        cursor1 = cursor2;
        if (!cursor2.getString(cursor2.getColumnIndex("title")).equals(s))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        cursor = cursor2;
        cursor1 = cursor2;
        s = cursor2.getString(cursor2.getColumnIndex("_id"));
        if (cursor2 != null)
        {
            cursor2.close();
        }
        return s;
        cursor = cursor2;
        cursor1 = cursor2;
        cursor2.moveToNext();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (cursor2 != null)
        {
            cursor2.close();
        }
        return null;
        s;
        cursor1 = cursor;
        Log.e("ContactUtils", (new StringBuilder()).append("getGroupId: ").append(s.toString()).toString());
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        s;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw s;
    }

    public String getGroupTitle(String s)
    {
        Cursor cursor;
        Cursor cursor1;
        cursor1 = null;
        cursor = null;
        Cursor cursor2 = mResolver.query(android.provider.ContactsContract.Groups.CONTENT_URI, null, "deleted=? and group_visible=?", new String[] {
            "0", "1"
        }, null);
        cursor = cursor2;
        cursor1 = cursor2;
        cursor2.moveToFirst();
        int i = 0;
_L2:
        cursor = cursor2;
        cursor1 = cursor2;
        if (i >= cursor2.getCount())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor2;
        cursor1 = cursor2;
        if (!cursor2.getString(cursor2.getColumnIndex("_id")).equals(s))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        cursor = cursor2;
        cursor1 = cursor2;
        s = cursor2.getString(cursor2.getColumnIndex("title"));
        if (cursor2 != null)
        {
            cursor2.close();
        }
        return s;
        cursor = cursor2;
        cursor1 = cursor2;
        cursor2.moveToNext();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (cursor2 != null)
        {
            cursor2.close();
        }
        return null;
        s;
        cursor1 = cursor;
        Log.e("ContactUtils", (new StringBuilder()).append("getGroupTitle: ").append(s.toString()).toString());
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        s;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw s;
    }

    public String getId(String s)
    {
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        s = mResolver.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, new String[] {
            "contact_id"
        }, "_id=?", new String[] {
            s
        }, null);
        s1 = s;
        s2 = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s1 = s;
        s2 = s;
        String s3 = s.getString(0);
        if (s != null)
        {
            s.close();
        }
        return s3;
        if (s != null)
        {
            s.close();
        }
        return null;
        s;
        s2 = s1;
        Log.e("ContactUtils", (new StringBuilder()).append("getId: ").append(s.toString()).toString());
        if (s1 != null)
        {
            s1.close();
        }
        return null;
        s;
        if (s2 != null)
        {
            s2.close();
        }
        throw s;
    }

    public String getLastUpdated(long l)
    {
        String s1;
        Cursor cursor;
        s1 = null;
        android.net.Uri uri = ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, l);
        cursor = mResolver.query(uri, new String[] {
            "contact_last_updated_timestamp"
        }, null, null, null);
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        String s = timeConvertToJS(cursor.getLong(0));
        s1 = s;
        if (cursor != null)
        {
            cursor.close();
            s1 = s;
        }
_L4:
        return s1;
_L2:
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return null;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    public String getRawId(String s)
    {
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        s = mResolver.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, new String[] {
            "_id"
        }, "contact_id=?", new String[] {
            s
        }, null);
        s1 = s;
        s2 = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s1 = s;
        s2 = s;
        String s3 = s.getString(0);
        if (s != null)
        {
            s.close();
        }
        return s3;
        if (s != null)
        {
            s.close();
        }
        return null;
        s;
        s2 = s1;
        Log.e("ContactUtils", (new StringBuilder()).append("getRawId: ").append(s.toString()).toString());
        if (s1 != null)
        {
            s1.close();
        }
        return null;
        s;
        if (s2 != null)
        {
            s2.close();
        }
        throw s;
    }

    public boolean hasID(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        s = mResolver.query(android.provider.ContactsContract.Contacts.CONTENT_URI, null, "_id = ?", new String[] {
            s
        }, null);
        s1 = s;
        s2 = s;
        int i = s.getCount();
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s != null)
        {
            s.close();
        }
        return flag;
        s;
        s2 = s1;
        Log.e("ContactUtils", (new StringBuilder()).append("hasID: ").append(s.toString()).toString());
        if (s1 == null) goto _L1; else goto _L3
_L3:
        s1.close();
        return false;
        s;
        if (s2 != null)
        {
            s2.close();
        }
        throw s;
    }

    public void newGroup(String s)
    {
        String as[] = getDefaultAccountNameAndType();
        ArrayList arraylist = new ArrayList();
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Groups.CONTENT_URI).withValue("title", s).withValue("group_visible", Boolean.valueOf(true)).withValue("account_name", as[0]).withValue("account_type", as[1]).build());
        try
        {
            mResolver.applyBatch("com.android.contacts", arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if ((s instanceof RemoteException) || (s instanceof OperationApplicationException) || (s instanceof SecurityException))
        {
            Log.e("ContactUtils", (new StringBuilder()).append("newGroup - Failed to create new contact group: ").append(s.toString()).toString());
            return;
        } else
        {
            throw new RuntimeException(s);
        }
    }
}
