// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.datastore:
//            WalletDatabaseHelper, Table, Column

public class KeyValueStore
{

    private static final String TAG = com/google/android/apps/wallet/datastore/KeyValueStore.getSimpleName();
    private final WalletDatabaseHelper dbHelper;
    private final Table table;

    public KeyValueStore(Table table1, WalletDatabaseHelper walletdatabasehelper)
    {
        table = table1;
        dbHelper = walletdatabasehelper;
    }

    public final boolean delete(String s)
    {
        SQLiteDatabase sqlitedatabase;
        boolean flag;
        flag = true;
        sqlitedatabase = dbHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        int i = dbHelper.getWritableDatabase().delete(table.getTableName(), String.valueOf(Column.ID.getColumnName()).concat("=?"), new String[] {
            s
        });
        if (i >= 0 && i <= 1)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        WLog.e(TAG, (new StringBuilder(String.valueOf(s).length() + 50)).append("Unexpected num rows deleted for id '").append(s).append("': ").append(i).toString());
        sqlitedatabase.setTransactionSuccessful();
        if (i <= 0)
        {
            flag = false;
        }
        sqlitedatabase.endTransaction();
        return flag;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public final byte[] load(String s)
    {
        SQLiteDatabase sqlitedatabase = dbHelper.getWritableDatabase();
        String s1 = table.getTableName();
        String s2 = Column.PROTO.getColumnName();
        String s3 = String.valueOf(Column.ID.getColumnName()).concat("=?");
        s = sqlitedatabase.query(s1, new String[] {
            s2
        }, s3, new String[] {
            s
        }, null, null, null);
        boolean flag = s.moveToFirst();
        if (!flag)
        {
            s.close();
            return null;
        }
        byte abyte0[] = s.getBlob(0);
        s.close();
        return abyte0;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final void store(String s, byte abyte0[])
    {
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put(Column.ID.getColumnName(), s);
        contentvalues.put(Column.PROTO.getColumnName(), abyte0);
        abyte0 = dbHelper.getWritableDatabase();
        abyte0.beginTransaction();
        if (abyte0.update(table.getTableName(), contentvalues, String.valueOf(Column.ID.getColumnName()).concat("=?"), new String[] {
    s
}) == 0)
        {
            abyte0.insertOrThrow(table.getTableName(), null, contentvalues);
        }
        abyte0.setTransactionSuccessful();
        abyte0.endTransaction();
        return;
        s;
        abyte0.endTransaction();
        throw s;
    }

}
