// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.util.Log;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.QueryHelper;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.schema.Table;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.propeller:
//            ChangeResult, InsertResult, QueryResult, CursorReader, 
//            TxnResult, WriteResult, PropellerWriteException

public class PropellerDatabase
{
    public static abstract class Transaction
    {

        private final TxnResult txnResult = new TxnResult();

        public TxnResult execute(PropellerDatabase propellerdatabase)
        {
            steps(propellerdatabase);
            return txnResult;
        }

        public WriteResult step(WriteResult writeresult)
        {
            if (!writeresult.success())
            {
                writeresult = new PropellerWriteException("Transaction failed", writeresult.getFailure());
                txnResult.fail(writeresult);
                throw writeresult;
            } else
            {
                return writeresult;
            }
        }

        public abstract void steps(PropellerDatabase propellerdatabase);

        public boolean success()
        {
            return txnResult.success();
        }


        public Transaction()
        {
        }
    }


    private static final String TAG = "Propeller";
    private boolean assertBackgroundThread;
    private final SQLiteDatabase database;

    public PropellerDatabase(SQLiteDatabase sqlitedatabase)
    {
        database = sqlitedatabase;
    }

    private void assertBackgroundThread()
    {
        if (assertBackgroundThread && Thread.currentThread() == Looper.getMainLooper().getThread())
        {
            throw new IllegalStateException("Database access on main thread detected");
        } else
        {
            return;
        }
    }

    private static void logQuery(Query query1)
    {
        if (Log.isLoggable("Propeller", 3))
        {
            query1.toString();
        }
    }

    private static void logQuery(String s)
    {
        Log.isLoggable("Propeller", 3);
    }

    private static void logWrite(String s, String s1, ContentValues contentvalues)
    {
        if (Log.isLoggable("Propeller", 3))
        {
            (new StringBuilder()).append(s).append(" ").append(s1).append(" [").append(contentvalues).append("]");
        }
    }

    public TxnResult bulkInsert(Table table, List list)
    {
        return bulkInsert(table, list, 5);
    }

    public TxnResult bulkInsert(final Table table, final List contentValuesList, final int conflictStrategy)
    {
        assertBackgroundThread();
        return runTransaction(new _cls1());
    }

    public TxnResult bulkUpsert(final Table table, final List contentValuesList)
    {
        assertBackgroundThread();
        return runTransaction(new _cls2());
    }

    public ChangeResult delete(Table table)
    {
        assertBackgroundThread();
        logWrite("DELETE FROM", table.name(), null);
        ChangeResult changeresult;
        try
        {
            changeresult = new ChangeResult(database.delete(table.name(), "1", null));
        }
        catch (SQLException sqlexception)
        {
            return ChangeResult.failedDelete(table.name(), sqlexception);
        }
        return changeresult;
    }

    public ChangeResult delete(Table table, Where where)
    {
        assertBackgroundThread();
        logWrite("DELETE FROM", table.name(), null);
        try
        {
            where = new ChangeResult(database.delete(table.name(), where.getSelection(), where.getArguments()));
        }
        // Misplaced declaration of an exception variable
        catch (Where where)
        {
            return ChangeResult.failedDelete(table.name(), where);
        }
        return where;
    }

    public InsertResult insert(Table table, ContentValues contentvalues)
    {
        return insert(table, contentvalues, 5);
    }

    public InsertResult insert(Table table, ContentValues contentvalues, int i)
    {
        assertBackgroundThread();
        logWrite("INSERT INTO", table.name(), contentvalues);
        InsertResult insertresult;
        long l;
        try
        {
            l = database.insertWithOnConflict(table.name(), null, contentvalues, i);
        }
        catch (SQLException sqlexception)
        {
            return InsertResult.failedInsert(table.name(), i, contentvalues, sqlexception);
        }
        if (l != -1L)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        return InsertResult.failedInsert(table.name(), i, contentvalues, null);
        insertresult = new InsertResult(l);
        return insertresult;
    }

    public QueryResult query(Query query1)
    {
        assertBackgroundThread();
        logQuery(query1);
        android.database.Cursor cursor = database.rawQuery(query1.build(), query1.getArguments());
        boolean flag;
        if (query1.getProjection() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new QueryResult(new CursorReader(cursor, flag));
    }

    public transient QueryResult query(String s, Object aobj[])
    {
        assertBackgroundThread();
        logQuery(s);
        return new QueryResult(new CursorReader(database.rawQuery(s, QueryHelper.toStringArgs(aobj)), false));
    }

    public TxnResult runTransaction(Transaction transaction)
    {
        assertBackgroundThread();
        database.beginTransaction();
        transaction.execute(this);
        if (transaction.success())
        {
            database.setTransactionSuccessful();
        }
        database.endTransaction();
_L2:
        return transaction.txnResult;
        Exception exception;
        exception;
        database.endTransaction();
        if (true) goto _L2; else goto _L1
_L1:
        transaction;
        database.endTransaction();
        throw transaction;
    }

    public void setAssertBackgroundThread()
    {
        assertBackgroundThread = true;
    }

    public ChangeResult truncate(Table table)
    {
        assertBackgroundThread();
        logWrite("TRUNCATE", table.name(), null);
        ChangeResult changeresult;
        try
        {
            changeresult = new ChangeResult(database.delete(table.name(), "1", null));
            database.delete("SQLITE_SEQUENCE", "name = ?", new String[] {
                table.name()
            });
        }
        catch (SQLException sqlexception)
        {
            return ChangeResult.failedDelete(table.name(), sqlexception);
        }
        return changeresult;
    }

    public ChangeResult update(Table table, ContentValues contentvalues, Where where)
    {
        assertBackgroundThread();
        logWrite("UPDATE", table.name(), contentvalues);
        try
        {
            where = new ChangeResult(database.update(table.name(), contentvalues, where.getSelection(), where.getArguments()));
        }
        // Misplaced declaration of an exception variable
        catch (Where where)
        {
            return ChangeResult.failedUpdate(table.name(), where, contentvalues);
        }
        return where;
    }

    public ChangeResult upsert(Table table, ContentValues contentvalues)
    {
        Object obj;
label0:
        {
            logWrite("UPSERT INTO", table.name(), contentvalues);
            obj = Filter.filter();
            Object obj1 = table.primaryKey().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj1)).next();
                if (contentvalues.containsKey(s))
                {
                    ((Where) (obj)).whereEq(s, contentvalues.get(s));
                }
            } while (true);
            if (((Where) (obj)).getArguments() == null)
            {
                obj = new ChangeResult(0);
            } else
            {
                obj = update(table, contentvalues, ((Where) (obj)));
            }
            obj1 = obj;
            if (((ChangeResult) (obj)).getNumRowsAffected() == 0)
            {
                table = insert(table, contentvalues);
                if (!table.success())
                {
                    break label0;
                }
                obj1 = new ChangeResult(1);
            }
            return ((ChangeResult) (obj1));
        }
        ((ChangeResult) (obj)).fail(table.getFailure());
        return ((ChangeResult) (obj));
    }

    private class _cls1 extends Transaction
    {

        final PropellerDatabase this$0;
        final int val$conflictStrategy;
        final List val$contentValuesList;
        final Table val$table;

        public void steps(PropellerDatabase propellerdatabase)
        {
            propellerdatabase = contentValuesList.iterator();
            do
            {
                if (!propellerdatabase.hasNext())
                {
                    break;
                }
                ContentValues contentvalues = (ContentValues)propellerdatabase.next();
                step(insert(table, contentvalues, conflictStrategy));
            } while (success());
        }

        _cls1()
        {
            this$0 = PropellerDatabase.this;
            contentValuesList = list;
            table = table1;
            conflictStrategy = i;
            super();
        }
    }


    private class _cls2 extends Transaction
    {

        final PropellerDatabase this$0;
        final List val$contentValuesList;
        final Table val$table;

        public void steps(PropellerDatabase propellerdatabase)
        {
            propellerdatabase = contentValuesList.iterator();
            do
            {
                if (!propellerdatabase.hasNext())
                {
                    break;
                }
                ContentValues contentvalues = (ContentValues)propellerdatabase.next();
                step(upsert(table, contentvalues));
            } while (success());
        }

        _cls2()
        {
            this$0 = PropellerDatabase.this;
            contentValuesList = list;
            table = table1;
            super();
        }
    }

}
