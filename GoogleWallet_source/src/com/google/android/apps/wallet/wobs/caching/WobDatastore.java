// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.apps.wallet.datastore.Column;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobCategory

public class WobDatastore
{

    private static final String TAG = com/google/android/apps/wallet/wobs/caching/WobDatastore.getSimpleName();
    private final WalletDatabaseHelper databaseHelper;

    public WobDatastore(WalletDatabaseHelper walletdatabasehelper)
    {
        databaseHelper = walletdatabasehelper;
    }

    private boolean ifWobInCacheHead(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        return ifWobInCachedRange(wobinstance, true);
    }

    private boolean ifWobInCachedRange(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance, boolean flag)
    {
        Object obj = databaseHelper.getReadableDatabase();
        Object obj1 = (new StringBuilder()).append(Column.WOB_CATEGORY.getColumnName()).append("=?");
        if (flag)
        {
            ((StringBuilder) (obj1)).append(" AND ").append(Column.IS_INSIDE_CACHE_HEAD.getColumnName()).append("=1");
        }
        String s = Table.WOB.getTableName();
        String s1 = Column.SORT_KEY.getColumnName();
        obj1 = ((StringBuilder) (obj1)).toString();
        String s2 = Integer.toString(wobinstance.categoryId.intValue());
        String s3 = String.valueOf(Column.SORT_KEY.getColumnName()).concat(" DESC");
        obj = ((SQLiteDatabase) (obj)).query(s, new String[] {
            s1
        }, ((String) (obj1)), new String[] {
            s2
        }, null, null, s3, "1");
        if (((Cursor) (obj)).getCount() == 0)
        {
            return true;
        }
        if (!((Cursor) (obj)).moveToFirst())
        {
            return false;
        }
        return ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(Column.SORT_KEY.getColumnName())).compareTo(wobinstance.sortKey) >= 0;
    }

    private void removeTailWobsForCategory(Integer integer)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        String s = Table.WOB.getTableName();
        String s1 = String.valueOf(Column.WOB_CATEGORY.getColumnName());
        integer = String.valueOf(integer);
        String s2 = String.valueOf(Column.IS_INSIDE_CACHE_HEAD);
        sqlitedatabase.delete(s, (new StringBuilder(String.valueOf(s1).length() + 14 + String.valueOf(integer).length() + String.valueOf(s2).length())).append(s1).append(" == ").append(integer).append(" AND ").append(s2).append(" == 0").toString(), null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        integer;
        sqlitedatabase.endTransaction();
        throw integer;
    }

    private static void upsert(SQLiteDatabase sqlitedatabase, Table table, Object obj, ContentValues contentvalues)
        throws SQLException
    {
        sqlitedatabase.beginTransaction();
        if (sqlitedatabase.update(table.getTableName(), contentvalues, String.valueOf(table.getPrimaryKeyColumn().getColumnName()).concat("=?"), new String[] {
    obj.toString()
}) == 0)
        {
            sqlitedatabase.insertOrThrow(table.getTableName(), null, contentvalues);
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        table;
        sqlitedatabase.endTransaction();
        throw table;
    }

    private static void upsertWob(SQLiteDatabase sqlitedatabase, com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(Column.ID.getColumnName(), wobinstance.id);
        contentvalues.put(Column.SORT_KEY.getColumnName(), wobinstance.sortKey);
        contentvalues.put(Column.WOB_CATEGORY.getColumnName(), wobinstance.categoryId);
        contentvalues.put(Column.PROTO.getColumnName(), MessageNano.toByteArray(wobinstance));
        String s = Column.IS_INSIDE_CACHE_HEAD.getColumnName();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        try
        {
            upsert(sqlitedatabase, Table.WOB, wobinstance.id, contentvalues);
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            String s1 = TAG;
            sqlitedatabase = String.valueOf(wobinstance.id);
            if (sqlitedatabase.length() != 0)
            {
                sqlitedatabase = "Failed to upsert WOB with id: ".concat(sqlitedatabase);
            } else
            {
                sqlitedatabase = new String("Failed to upsert WOB with id: ");
            }
            WLog.e(s1, sqlitedatabase);
            throw sqliteexception;
        }
    }

    private void writeHeadState(com.google.wallet.proto.api.NanoWalletWobs.HeadState headstate)
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(Column.WOB_CATEGORY.getColumnName(), headstate.categoryId);
        contentvalues.put(Column.HEAD_STATE.getColumnName(), MessageNano.toByteArray(headstate));
        upsert(sqlitedatabase, Table.WOB_CATEGORY, headstate.categoryId, contentvalues);
    }

    private void writeHeadWobs(SQLiteDatabase sqlitedatabase, com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[])
    {
        writeWobs(sqlitedatabase, awobinstance, true);
    }

    private void writeWobs(SQLiteDatabase sqlitedatabase, com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[], boolean flag)
    {
        int j = awobinstance.length;
        for (int i = 0; i < j; i++)
        {
            upsertWob(sqlitedatabase, awobinstance[i], flag);
        }

    }

    public final byte[] getNextPageToken(WobCategory wobcategory)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getReadableDatabase();
        sqlitedatabase.beginTransaction();
        String s = Table.WOB_CATEGORY.getTableName();
        String s1 = Column.NEXT_PAGE_TOKEN.getColumnName();
        String s2 = String.valueOf(Column.WOB_CATEGORY.getColumnName()).concat("=?");
        int i = wobcategory.getId();
        wobcategory = (new StringBuilder(11)).append(i).toString();
        wobcategory = sqlitedatabase.query(s, new String[] {
            s1
        }, s2, new String[] {
            wobcategory
        }, null, null, null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        if (wobcategory.getCount() <= 0)
        {
            return null;
        } else
        {
            wobcategory.moveToNext();
            return wobcategory.getBlob(0);
        }
        wobcategory;
        sqlitedatabase.endTransaction();
        throw wobcategory;
    }

    final boolean ifWobInCachedRange(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        return ifWobInCachedRange(wobinstance, false);
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.HeadState readHeadState(int i)
    {
        Object obj;
        obj = databaseHelper.getReadableDatabase();
        ((SQLiteDatabase) (obj)).beginTransaction();
        Object obj1;
        obj1 = Table.WOB_CATEGORY.getTableName();
        String s = Column.HEAD_STATE.getColumnName();
        String s1 = String.valueOf(Column.WOB_CATEGORY.getColumnName()).concat("=?");
        String s2 = (new StringBuilder(11)).append(i).toString();
        obj1 = ((SQLiteDatabase) (obj)).query(((String) (obj1)), new String[] {
            s
        }, s1, new String[] {
            s2
        }, null, null, null);
        ((SQLiteDatabase) (obj)).endTransaction();
        if (((Cursor) (obj1)).getCount() <= 0)
        {
            obj = new com.google.wallet.proto.api.NanoWalletWobs.HeadState();
            obj.categoryId = Integer.valueOf(i);
            return ((com.google.wallet.proto.api.NanoWalletWobs.HeadState) (obj));
        }
        break MISSING_BLOCK_LABEL_128;
        obj1;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw obj1;
        ((Cursor) (obj1)).moveToNext();
        com.google.wallet.proto.api.NanoWalletWobs.HeadState headstate;
        try
        {
            headstate = (com.google.wallet.proto.api.NanoWalletWobs.HeadState)MessageNano.mergeFrom(new com.google.wallet.proto.api.NanoWalletWobs.HeadState(), ((Cursor) (obj1)).getBlob(0));
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            WLog.e(TAG, (new StringBuilder(68)).append("A HeadState in the DB is corrupted! For WOB category id: ").append(i).toString(), invalidprotocolbuffernanoexception);
            com.google.wallet.proto.api.NanoWalletWobs.HeadState headstate1 = new com.google.wallet.proto.api.NanoWalletWobs.HeadState();
            headstate1.categoryId = Integer.valueOf(i);
            return headstate1;
        }
        return headstate;
    }

    public final com.google.wallet.proto.NanoWalletObjects.WobInstance readWob(String s)
    {
        Object obj;
        obj = databaseHelper.getReadableDatabase();
        ((SQLiteDatabase) (obj)).beginTransaction();
        Object obj1;
        obj1 = Table.WOB.getTableName();
        String s2 = Column.PROTO.getColumnName();
        String s3 = String.valueOf(Column.ID.getColumnName()).concat("=?");
        obj1 = ((SQLiteDatabase) (obj)).query(((String) (obj1)), new String[] {
            s2
        }, s3, new String[] {
            s
        }, null, null, null, "1");
        ((SQLiteDatabase) (obj)).endTransaction();
        if (((Cursor) (obj1)).getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        ((Cursor) (obj1)).moveToNext();
        obj = (com.google.wallet.proto.NanoWalletObjects.WobInstance)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletObjects.WobInstance(), ((Cursor) (obj1)).getBlob(0));
        return ((com.google.wallet.proto.NanoWalletObjects.WobInstance) (obj));
        s;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw s;
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        invalidprotocolbuffernanoexception;
        String s1 = TAG;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "A WobInstance in the DB is corrupted! id: ".concat(s);
        } else
        {
            s = new String("A WobInstance in the DB is corrupted! id: ");
        }
        WLog.e(s1, s, invalidprotocolbuffernanoexception);
        return null;
    }

    final List readWobsByCategoryId(int i)
    {
        Object obj;
        obj = databaseHelper.getReadableDatabase();
        ((SQLiteDatabase) (obj)).beginTransaction();
        Object obj1;
        obj1 = Table.WOB.getTableName();
        String s = Column.PROTO.getColumnName();
        String s1 = String.valueOf(Column.WOB_CATEGORY.getColumnName()).concat("=?");
        String s2 = (new StringBuilder(11)).append(i).toString();
        String s3 = Column.SORT_KEY.getColumnName();
        obj1 = ((SQLiteDatabase) (obj)).query(((String) (obj1)), new String[] {
            s
        }, s1, new String[] {
            s2
        }, null, null, s3);
        ((SQLiteDatabase) (obj)).endTransaction();
        obj = Lists.newArrayList();
        while (((Cursor) (obj1)).moveToNext()) 
        {
            try
            {
                ((List) (obj)).add(MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletObjects.WobInstance(), ((Cursor) (obj1)).getBlob(0)));
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                WLog.e(TAG, "Unable to deserialize a WobInstance stored in our database, skipping it.");
            }
        }
        break MISSING_BLOCK_LABEL_164;
        Exception exception;
        exception;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw exception;
        return ((List) (obj));
    }

    public final transient void removeAllWobsInCategories(Integer ainteger[])
    {
        SQLiteDatabase sqlitedatabase;
        if (ainteger.length == 0)
        {
            return;
        }
        sqlitedatabase = databaseHelper.getWritableDatabase();
        ainteger = Joiner.on(", ").join(ainteger);
        sqlitedatabase.beginTransaction();
        String s = Table.WOB.getTableName();
        String s1 = String.valueOf(Column.WOB_CATEGORY.getColumnName());
        sqlitedatabase.delete(s, (new StringBuilder(String.valueOf(s1).length() + 6 + String.valueOf(ainteger).length())).append(s1).append(" IN (").append(ainteger).append(")").toString(), null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        ainteger;
        sqlitedatabase.endTransaction();
        throw ainteger;
    }

    public final void removeCategories(Integer ainteger[])
    {
        SQLiteDatabase sqlitedatabase;
        if (ainteger.length == 0)
        {
            return;
        }
        sqlitedatabase = databaseHelper.getWritableDatabase();
        ainteger = Joiner.on(", ").join(ainteger);
        sqlitedatabase.beginTransaction();
        String s = Table.WOB_CATEGORY.getTableName();
        String s1 = String.valueOf(Column.WOB_CATEGORY.getColumnName());
        sqlitedatabase.delete(s, (new StringBuilder(String.valueOf(s1).length() + 6 + String.valueOf(ainteger).length())).append(s1).append(" IN (").append(ainteger).append(")").toString(), null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        ainteger;
        sqlitedatabase.endTransaction();
        throw ainteger;
    }

    final void removeWobs(int i, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        if (as.length == 0)
        {
            return;
        }
        sqlitedatabase = databaseHelper.getWritableDatabase();
        as = Lists.transform(Arrays.asList(as), new Function() {

            final WobDatastore this$0;

            private static String apply(String s3)
            {
                return (new StringBuilder(String.valueOf(s3).length() + 2)).append("'").append(s3).append("'").toString();
            }

            public final volatile Object apply(Object obj)
            {
                return apply((String)obj);
            }

            
            {
                this$0 = WobDatastore.this;
                super();
            }
        });
        as = Joiner.on(", ").join(as);
        sqlitedatabase.beginTransaction();
        String s = Table.WOB.getTableName();
        String s1 = String.valueOf(Column.ID.getColumnName());
        String s2 = String.valueOf(Column.WOB_CATEGORY.getColumnName());
        sqlitedatabase.delete(s, (new StringBuilder(String.valueOf(s1).length() + 23 + String.valueOf(as).length() + String.valueOf(s2).length())).append(s1).append(" IN (").append(as).append(") AND ").append(s2).append("=").append(i).toString(), null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        as;
        sqlitedatabase.endTransaction();
        throw as;
    }

    final void updateCacheHead(int i, com.google.wallet.proto.api.NanoWalletWobs.HeadState headstate, boolean flag, String as[], com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[])
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        writeHeadState(headstate);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        removeAllWobsInCategories(new Integer[] {
            Integer.valueOf(i)
        });
        if (as.length > 0 || awobinstance.length > 0)
        {
            removeTailWobsForCategory(Integer.valueOf(i));
        }
        removeWobs(i, as);
        writeHeadWobs(sqlitedatabase, awobinstance);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        headstate;
        sqlitedatabase.endTransaction();
        throw headstate;
    }

    final void updateNextPageToken(Integer integer, byte abyte0[])
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        sqlitedatabase = databaseHelper.getWritableDatabase();
        contentvalues = new ContentValues();
        contentvalues.put(Column.NEXT_PAGE_TOKEN.getColumnName(), abyte0);
        sqlitedatabase.beginTransaction();
        abyte0 = Table.WOB_CATEGORY.getTableName();
        String s = String.valueOf(Table.WOB_CATEGORY.getPrimaryKeyColumn());
        sqlitedatabase.update(abyte0, contentvalues, (new StringBuilder(String.valueOf(s).length() + 2)).append(s).append("=?").toString(), new String[] {
            Integer.toString(integer.intValue())
        });
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        integer;
        sqlitedatabase.endTransaction();
        throw integer;
    }

    public final void upsertWob(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        upsertWob(sqlitedatabase, wobinstance, ifWobInCacheHead(wobinstance));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        wobinstance;
        sqlitedatabase.endTransaction();
        throw wobinstance;
    }

    final void writeTailWobs(com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[])
    {
        writeWobs(databaseHelper.getWritableDatabase(), awobinstance, false);
    }

}
