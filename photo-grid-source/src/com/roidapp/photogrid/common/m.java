// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.json.JSONArray;

// Referenced classes of package com.roidapp.photogrid.common:
//            l

public final class m
{

    public static JSONArray a(Context context)
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj2 = null;
        obj = new JSONArray();
        l l1 = new l(context);
        Object obj1 = l1.getReadableDatabase();
        obj2 = ((SQLiteDatabase) (obj1)).query("folder", null, null, null, null, null, null);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        context = ((Context) (obj));
_L4:
        if (!((Cursor) (obj2)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("folderlist"));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj)).startsWith("#") || ((String) (obj)).length() <= 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new JSONArray(((String) (obj)).substring(1));
        context = ((Context) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
        }
        if (obj1 != null)
        {
            ((SQLiteDatabase) (obj1)).close();
        }
        l1.close();
        obj = context;
_L6:
        return ((JSONArray) (obj));
        obj1;
        obj3 = null;
        l1 = null;
        context = ((Context) (obj));
        obj = obj3;
_L9:
        ((Exception) (obj1)).printStackTrace();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (obj2 != null)
        {
            ((SQLiteDatabase) (obj2)).close();
        }
        obj = context;
        if (l1 == null) goto _L6; else goto _L5
_L5:
        l1.close();
        return context;
        context;
        obj = null;
        l1 = null;
        obj2 = obj3;
_L8:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (obj2 != null)
        {
            ((SQLiteDatabase) (obj2)).close();
        }
        if (l1 != null)
        {
            l1.close();
        }
        throw context;
        context;
        obj = null;
        obj2 = obj3;
        continue; /* Loop/switch isn't completed */
        context;
        obj = null;
        obj2 = obj1;
        continue; /* Loop/switch isn't completed */
        context;
        obj = obj2;
        obj2 = obj1;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
        Object obj4 = null;
        context = ((Context) (obj));
        obj = obj4;
          goto _L9
        Exception exception;
        exception;
        Object obj5 = null;
        obj2 = obj1;
        context = ((Context) (obj));
        obj1 = exception;
        obj = obj5;
          goto _L9
        exception;
        Object obj6 = obj1;
        obj = obj2;
        obj1 = exception;
        obj2 = obj6;
          goto _L9
_L2:
        context = ((Context) (obj));
        if (true) goto _L3; else goto _L10
_L10:
    }

    public static boolean a(Context context, String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        ContentValues contentvalues;
        obj1 = null;
        contentvalues = null;
        obj2 = null;
        obj = null;
        l l1 = new l(context);
        context = contentvalues;
        obj = l1;
        obj1 = l1.getWritableDatabase();
        context = ((Context) (obj1));
        obj = l1;
        obj2 = obj1;
        ((SQLiteDatabase) (obj1)).beginTransaction();
        context = ((Context) (obj1));
        obj = l1;
        obj2 = obj1;
        ((SQLiteDatabase) (obj1)).delete("folder", null, null);
        context = ((Context) (obj1));
        obj = l1;
        obj2 = obj1;
        contentvalues = new ContentValues();
        context = ((Context) (obj1));
        obj = l1;
        obj2 = obj1;
        contentvalues.put("folderlist", s);
        context = ((Context) (obj1));
        obj = l1;
        obj2 = obj1;
        long l2 = ((SQLiteDatabase) (obj1)).insert("folder", null, contentvalues);
        context = ((Context) (obj1));
        obj = l1;
        ((SQLiteDatabase) (obj1)).setTransactionSuccessful();
        context = ((Context) (obj1));
        obj = l1;
        ((SQLiteDatabase) (obj1)).endTransaction();
        long l3;
        if (obj1 != null)
        {
            ((SQLiteDatabase) (obj1)).close();
        }
        l1.close();
        l3 = l2;
_L1:
        Exception exception;
        return l3 != -1L;
        exception;
        l2 = -1L;
        obj1 = null;
        s = ((String) (obj));
_L4:
        context = s;
        obj = obj1;
        exception.printStackTrace();
        if (s != null)
        {
            s.close();
        }
        l3 = l2;
        if (obj1 != null)
        {
            ((l) (obj1)).close();
            l3 = l2;
        }
          goto _L1
        s;
        obj = null;
        context = ((Context) (obj1));
_L3:
        if (context != null)
        {
            context.close();
        }
        if (obj != null)
        {
            ((l) (obj)).close();
        }
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        exception;
        l2 = -1L;
        s = ((String) (obj2));
        obj1 = l1;
          goto _L4
        exception;
        s = ((String) (obj1));
        obj1 = l1;
          goto _L4
    }
}
