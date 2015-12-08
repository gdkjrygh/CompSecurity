// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database.migration;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class RemoveUnusedTimeLimitsMigration
    implements SchemaMigration
{

    public RemoveUnusedTimeLimitsMigration()
    {
    }

    private static long getExpirationThresholdTimestampClientOffset(long l, long l1, long l2)
    {
        return l2 - (l - l1);
    }

    public final int getNewDbVersion()
    {
        return 2;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        Object obj = sqlitedatabase.query("AtcTable", null, null, null, null, null, null, null);
        Object obj1;
        int i = ((Cursor) (obj)).getColumnIndexOrThrow("_id");
        int j = ((Cursor) (obj)).getColumnIndexOrThrow("expirationTime");
        int k = ((Cursor) (obj)).getColumnIndexOrThrow("expirationThresholdTimestamp");
        int l = ((Cursor) (obj)).getColumnIndexOrThrow("expirationTimeClientOffset");
        obj1 = Maps.newHashMap();
        for (; ((Cursor) (obj)).moveToNext(); ((Map) (obj1)).put(Long.valueOf(((Cursor) (obj)).getLong(i)), Long.valueOf(getExpirationThresholdTimestampClientOffset(((Cursor) (obj)).getLong(j), ((Cursor) (obj)).getLong(k), ((Cursor) (obj)).getLong(l))))) { }
        break MISSING_BLOCK_LABEL_138;
        obj1;
        ((Cursor) (obj)).close();
        throw obj1;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        ((Cursor) (obj)).close();
        sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", new Object[] {
            "AtcTable", "expirationThresholdTimestampClientOffset"
        }));
        sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", new Object[] {
            "AtcTable", "duration"
        }));
        sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[] {
            "AtcTable", "stringDuration"
        }));
        long l1 = TimeUnit.DAYS.toMillis(1L);
        ContentValues contentvalues;
        long l2;
        for (Iterator iterator = ((Map) (obj1)).entrySet().iterator(); iterator.hasNext(); sqlitedatabase.update("AtcTable", contentvalues, String.format("%s = ?", new Object[] {
    "_id"
}), new String[] {
    Long.toString(l2)
}))
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            l2 = ((Long)((java.util.Map.Entry) (obj2)).getKey()).longValue();
            obj2 = (Long)((java.util.Map.Entry) (obj2)).getValue();
            contentvalues = new ContentValues();
            contentvalues.put("expirationThresholdTimestampClientOffset", ((Long) (obj2)));
            contentvalues.put("duration", Long.valueOf(l1));
            contentvalues.put("stringDuration", "24 hours");
            contentvalues.put("expirationTime", Long.valueOf(-1L));
            contentvalues.put("expirationThresholdTimestamp", Long.valueOf(-1L));
        }

        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }
}
