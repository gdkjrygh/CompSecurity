// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.facebook.analytics.c.a;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ik;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bq
{

    private static final Class b = com/facebook/analytics/bq;
    Map a;
    private final a c;

    public bq(a a1)
    {
        c = a1;
    }

    private Long a(String s)
    {
        if (a == null)
        {
            a = a();
        }
        Long long2 = (Long)a.get(s);
        Long long1 = long2;
        if (long2 == null)
        {
            Long long3 = Long.valueOf(b(s));
            long1 = long3;
            if (long3.longValue() > 0L)
            {
                a.put(s, long3);
                long1 = long3;
            }
        }
        return long1;
    }

    private Map a()
    {
        Object obj;
        HashMap hashmap;
        obj = c.e();
        hashmap = ik.a();
        Cursor cursor = ((SQLiteDatabase) (obj)).query(true, "counter_names", new String[] {
            "_id", "name"
        }, null, null, null, null, null, null);
        obj = cursor;
        boolean flag = cursor.moveToFirst();
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = cursor;
        hashmap.put(cursor.getString(1), Long.valueOf(cursor.getLong(0)));
        obj = cursor;
        flag = cursor.moveToNext();
        if (true) goto _L2; else goto _L1
_L1:
        obj = cursor;
        cursor.close();
        if (false)
        {
            throw new NullPointerException();
        }
_L4:
        return hashmap;
        Exception exception1;
        exception1;
        cursor = null;
_L7:
        obj = cursor;
        com.facebook.debug.log.b.e(b, "Exception caught: ", exception1);
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return hashmap;
        Exception exception;
        exception;
        obj = null;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        exception1;
          goto _L7
    }

    private void a(long l, long l1, long l2)
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("time", Long.valueOf(l));
        contentvalues.put("counter", Long.valueOf(l1));
        contentvalues.put("value", Long.valueOf(l2));
        sqlitedatabase = c.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.insert("counter_values", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    private long b(String s)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = c.e();
        sqlitedatabase.beginTransaction();
        long l;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", s);
        l = sqlitedatabase.insert("counter_names", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return l;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public List a(long l, long l1)
    {
        Object obj;
        et et1;
        et1 = es.e();
        obj = c.e();
        String s = n.a("(time>= %d) and (time< %d)", new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
        obj = ((SQLiteDatabase) (obj)).query("view_counter", new String[] {
            "name", "sum(value)"
        }, s, null, "name", null, null);
        boolean flag = ((Cursor) (obj)).moveToFirst();
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        et1.b(new Pair(((Cursor) (obj)).getString(0), Long.valueOf(((Cursor) (obj)).getLong(1))));
        flag = ((Cursor) (obj)).moveToNext();
        if (true) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return et1.b();
        Exception exception;
        exception;
        obj = null;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(long l, String s, Map map)
    {
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (((Long)entry.getValue()).longValue() > 0L)
            {
                a(l, a((new StringBuilder()).append(s).append(".").append((String)entry.getKey()).toString()).longValue(), ((Long)entry.getValue()).longValue());
            }
        } while (true);
    }

    public int b(long l, long l1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = c.e();
        sqlitedatabase.beginTransaction();
        int i;
        i = sqlitedatabase.delete("counter_values", n.a("(time>= %d) and (time< %d)", new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        }), null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return i;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

}
