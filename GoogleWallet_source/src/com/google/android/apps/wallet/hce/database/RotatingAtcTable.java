// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.hce.util.Hex;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.hce.database:
//            AbstractDatabaseTable

public class RotatingAtcTable extends AbstractDatabaseTable
{

    public static final String NON_ID_COLUMNS[] = {
        "readerAtcs", "secretAtcs", "currentAtcIndex", "expirationTimeClientOffset", "transactionCountThreshold", "expirationThresholdTimestampClientOffset", "duration", "stringDuration"
    };
    private static final String TAG = com/google/android/apps/wallet/hce/database/RotatingAtcTable.getSimpleName();
    private final com.google.android.apps.wallet.hce.emv.RotatingAtc.Listener mListener;
    private final System mSystem;

    public RotatingAtcTable(com.google.android.apps.wallet.hce.emv.RotatingAtc.Listener listener, System system, SQLiteOpenHelper sqliteopenhelper)
    {
        super("AtcTable", sqliteopenhelper);
        mListener = listener;
        mSystem = system;
    }

    private static String arrayToAtcString(int ai[])
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(ai.length * 4);
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            bytebuffer.putInt(ai[i]);
        }

        return Hex.encode(bytebuffer.array());
    }

    private static int[] atcStringToIntArray(String s)
    {
        s = Hex.decode(s);
        int ai[];
        boolean flag;
        if (s.length % 4 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "length: %s", new Object[] {
            Integer.valueOf(s.length)
        });
        s = ByteBuffer.wrap(s).asIntBuffer();
        ai = new int[s.capacity()];
        s.get(ai);
        return ai;
    }

    public static void createTable(SQLiteDatabase sqlitedatabase)
    {
        WLog.ifmt(TAG, "createTable", new Object[0]);
        sqlitedatabase.execSQL(String.format("create table %s (%s integer primary key, %s text, %s text, %s integer, %s integer, %s integer, %s integer, %s integer)", new Object[] {
            "AtcTable", "_id", "readerAtcs", "secretAtcs", "currentAtcIndex", "expirationTime", "expirationTimeClientOffset", "expirationThresholdTimestamp", "transactionCountThreshold"
        }));
    }

    private static com.google.android.apps.wallet.hce.emv.RotatingAtc.UsageLimits limitsFromCursor(Cursor cursor)
    {
        return new com.google.android.apps.wallet.hce.emv.RotatingAtc.UsageLimits(getLong(cursor, "expirationTimeClientOffset"), getInt(cursor, "transactionCountThreshold"), getLong(cursor, "expirationThresholdTimestampClientOffset"), getLong(cursor, "duration"), getString(cursor, "stringDuration"));
    }

    public final List getAllAtcs()
    {
        Cursor cursor = helper.getWritableDatabase().query("AtcTable", NON_ID_COLUMNS, null, null, null, null, null);
        Object obj;
        obj = Lists.newArrayListWithCapacity(cursor.getCount());
        for (; cursor.moveToNext(); ((List) (obj)).add(getAtc(cursor))) { }
        break MISSING_BLOCK_LABEL_64;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        return ((List) (obj));
    }

    final RotatingAtc getAtc(Cursor cursor)
    {
        String s = getString(cursor, "readerAtcs");
        String s1 = getString(cursor, "secretAtcs");
        return new RotatingAtc(atcStringToIntArray(s), atcStringToIntArray(s1), getInt(cursor, "currentAtcIndex"), limitsFromCursor(cursor), mListener, mSystem);
    }

    final long insert(RotatingAtc rotatingatc)
    {
        String s = arrayToAtcString(rotatingatc.getReaderAtcs());
        String s1 = arrayToAtcString(rotatingatc.getSecretAtcs());
        ContentValues contentvalues = new ContentValues();
        contentvalues.putNull("_id");
        contentvalues.put("readerAtcs", s);
        contentvalues.put("secretAtcs", s1);
        contentvalues.put("currentAtcIndex", Integer.valueOf(rotatingatc.getCurrentAtcIndex()));
        rotatingatc = rotatingatc.getLimits();
        contentvalues.put("expirationTimeClientOffset", Long.valueOf(rotatingatc.getExpirationTimeClientEpoch()));
        contentvalues.put("transactionCountThreshold", Integer.valueOf(rotatingatc.getTransactionCountThreshold()));
        contentvalues.put("expirationThresholdTimestampClientOffset", Long.valueOf(rotatingatc.getExpirationThresholdTimeClientEpoch()));
        contentvalues.put("duration", Long.valueOf(rotatingatc.getDuration()));
        contentvalues.put("stringDuration", rotatingatc.getStringDuration());
        return helper.getWritableDatabase().insertOrThrow("AtcTable", null, contentvalues);
    }

    final void nextAtcs(Long along[])
    {
        String s = String.format("UPDATE %s SET %s = %s + 1 %s", new Object[] {
            "AtcTable", "currentAtcIndex", "currentAtcIndex", getWhereIdInClause(along.length)
        });
        helper.getWritableDatabase().execSQL(s, along);
    }

}
