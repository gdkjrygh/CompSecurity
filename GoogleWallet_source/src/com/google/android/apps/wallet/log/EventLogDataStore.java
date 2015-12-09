// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.Column;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.log:
//            EventLogEntry

public class EventLogDataStore
{

    private static final String TAG = com/google/android/apps/wallet/log/EventLogDataStore.getSimpleName();
    private final WalletDatabaseHelper dbHelper;
    private final int eventCountHighWater;
    private final int eventCountLowWater;

    EventLogDataStore(WalletDatabaseHelper walletdatabasehelper)
    {
        this(walletdatabasehelper, 2000, 1800);
    }

    private EventLogDataStore(WalletDatabaseHelper walletdatabasehelper, int i, int j)
    {
        dbHelper = walletdatabasehelper;
        eventCountHighWater = i;
        eventCountLowWater = j;
    }

    private int getNumStoredEvents()
    {
        return Ints.checkedCast(DatabaseUtils.queryNumEntries(dbHelper.getWritableDatabase(), Table.EVENT_LOG.getTableName()));
    }

    private static void internalDeleteEvent(SQLiteDatabase sqlitedatabase, long l)
    {
        sqlitedatabase.delete(Table.EVENT_LOG.getTableName(), String.valueOf(Column.INTEGER_ID.getColumnName()).concat("=?"), new String[] {
            Long.toString(l)
        });
    }

    private void trimExcessEventsIfNeeded(SQLiteDatabase sqlitedatabase)
    {
        int i = getNumStoredEvents();
        if (i > eventCountHighWater)
        {
            i -= eventCountLowWater;
            Object obj = TAG;
            int j = eventCountHighWater;
            int k = eventCountLowWater;
            WLog.w(((String) (obj)), (new StringBuilder(82)).append("max event log size exceeded; purging ").append(i).append(" events: ").append(j).append(" / ").append(k).toString());
            obj = peek(i).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                long l = ((EventLogEntry)((Iterator) (obj)).next()).getId();
                WLog.dfmt(TAG, "purging event log entry with id %d", new Object[] {
                    Long.valueOf(l)
                });
                internalDeleteEvent(sqlitedatabase, l);
            }
        }
    }

    public final void deleteIds(List list)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = dbHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        for (list = list.iterator(); list.hasNext(); internalDeleteEvent(sqlitedatabase, ((Long)list.next()).longValue())) { }
        break MISSING_BLOCK_LABEL_54;
        list;
        sqlitedatabase.endTransaction();
        throw list;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    public final List peek(int i)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = dbHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        Object obj;
        Object obj1;
        obj = ImmutableList.builder();
        obj1 = Table.EVENT_LOG.getTableName();
        String s = Column.INTEGER_ID.getColumnName();
        String s1 = Column.PROTO.getColumnName();
        String s2 = Integer.toString(i);
        obj1 = sqlitedatabase.query(((String) (obj1)), new String[] {
            s, s1
        }, null, null, null, null, null, s2);
_L1:
        long l;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        l = ((Cursor) (obj1)).getLong(0);
        ((com.google.common.collect.ImmutableList.Builder) (obj)).add(new EventLogEntry(l, (com.google.wallet.proto.NanoWalletLogging.WalletEventLog)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletLogging.WalletEventLog(), ((Cursor) (obj1)).getBlob(1))));
          goto _L1
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        invalidprotocolbuffernanoexception;
        Throwables.propagate(invalidprotocolbuffernanoexception);
          goto _L1
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        ((Cursor) (obj1)).close();
        sqlitedatabase.setTransactionSuccessful();
        obj = ((com.google.common.collect.ImmutableList.Builder) (obj)).build();
        sqlitedatabase.endTransaction();
        return ((List) (obj));
    }

    public final void persistEvent(com.google.wallet.proto.NanoWalletLogging.WalletEventLog walleteventlog)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = dbHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(Column.PROTO.getColumnName(), MessageNano.toByteArray(walleteventlog));
        if (sqlitedatabase.insert(Table.EVENT_LOG.getTableName(), null, contentvalues) != -1L)
        {
            trimExcessEventsIfNeeded(sqlitedatabase);
            sqlitedatabase.setTransactionSuccessful();
        }
        sqlitedatabase.endTransaction();
        return;
        walleteventlog;
        sqlitedatabase.endTransaction();
        throw walleteventlog;
    }

}
