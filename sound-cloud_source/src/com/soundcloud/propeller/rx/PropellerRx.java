// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.rx;

import android.content.ContentValues;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.schema.Table;
import java.util.List;
import rx.b;
import rx.b.a;

public class PropellerRx
{

    private final PropellerDatabase propeller;

    public PropellerRx(PropellerDatabase propellerdatabase)
    {
        propeller = propellerdatabase;
    }

    private static a release(final QueryResult queryResult)
    {
        return new _cls1();
    }

    private static b resultObservable(WriteResult writeresult)
    {
        if (writeresult.success())
        {
            return b.just(writeresult);
        } else
        {
            return b.error(writeresult.getFailure());
        }
    }

    public b bulkInsert(final Table table, final List contentValuesList)
    {
        return b.defer(new _cls5());
    }

    public b bulkUpsert(final Table table, final List contentValuesList)
    {
        return b.defer(new _cls9());
    }

    public PropellerDatabase database()
    {
        return propeller;
    }

    public b delete(final Table table)
    {
        return b.defer(new _cls6());
    }

    public b delete(final Table table, final Where whereClause)
    {
        return b.defer(new _cls7());
    }

    public b insert(final Table table, final ContentValues contentValues)
    {
        return b.defer(new _cls4());
    }

    public b query(final Query query)
    {
        return b.defer(new _cls2());
    }

    public b queryResult(final Query query)
    {
        return b.defer(new _cls3());
    }

    public b runTransaction(final com.soundcloud.propeller.PropellerDatabase.Transaction transaction)
    {
        return b.defer(new _cls12());
    }

    public b truncate(final Table table)
    {
        return b.defer(new _cls11());
    }

    public b update(final Table table, final ContentValues contentValues, final Where whereClause)
    {
        return b.defer(new _cls10());
    }

    public b upsert(final Table table, final ContentValues contentValues)
    {
        return b.defer(new _cls8());
    }




    private class _cls1
        implements a
    {

        final QueryResult val$queryResult;

        public final void call()
        {
            queryResult.release();
        }

        _cls1()
        {
            queryResult = queryresult;
            super();
        }
    }


    private class _cls5
        implements e
    {

        final PropellerRx this$0;
        final List val$contentValuesList;
        final Table val$table;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.bulkInsert(table, contentValuesList));
        }

        _cls5()
        {
            this$0 = PropellerRx.this;
            table = table1;
            contentValuesList = list;
            super();
        }
    }


    private class _cls9
        implements e
    {

        final PropellerRx this$0;
        final List val$contentValuesList;
        final Table val$table;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.bulkUpsert(table, contentValuesList));
        }

        _cls9()
        {
            this$0 = PropellerRx.this;
            table = table1;
            contentValuesList = list;
            super();
        }
    }


    private class _cls6
        implements e
    {

        final PropellerRx this$0;
        final Table val$table;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.delete(table));
        }

        _cls6()
        {
            this$0 = PropellerRx.this;
            table = table1;
            super();
        }
    }


    private class _cls7
        implements e
    {

        final PropellerRx this$0;
        final Table val$table;
        final Where val$whereClause;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.delete(table, whereClause));
        }

        _cls7()
        {
            this$0 = PropellerRx.this;
            table = table1;
            whereClause = where;
            super();
        }
    }


    private class _cls4
        implements e
    {

        final PropellerRx this$0;
        final ContentValues val$contentValues;
        final Table val$table;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.insert(table, contentValues));
        }

        _cls4()
        {
            this$0 = PropellerRx.this;
            table = table1;
            contentValues = contentvalues;
            super();
        }
    }


    private class _cls2
        implements e
    {

        final PropellerRx this$0;
        final Query val$query;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            QueryResult queryresult = propeller.query(query);
            return b.from(queryresult).doOnUnsubscribe(PropellerRx.release(queryresult));
        }

        _cls2()
        {
            this$0 = PropellerRx.this;
            query = query1;
            super();
        }
    }


    private class _cls3
        implements e
    {

        final PropellerRx this$0;
        final Query val$query;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return b.just(propeller.query(query));
        }

        _cls3()
        {
            this$0 = PropellerRx.this;
            query = query1;
            super();
        }
    }


    private class _cls12
        implements e
    {

        final PropellerRx this$0;
        final com.soundcloud.propeller.PropellerDatabase.Transaction val$transaction;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.runTransaction(transaction));
        }

        _cls12()
        {
            this$0 = PropellerRx.this;
            transaction = transaction1;
            super();
        }
    }


    private class _cls11
        implements e
    {

        final PropellerRx this$0;
        final Table val$table;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.truncate(table));
        }

        _cls11()
        {
            this$0 = PropellerRx.this;
            table = table1;
            super();
        }
    }


    private class _cls10
        implements e
    {

        final PropellerRx this$0;
        final ContentValues val$contentValues;
        final Table val$table;
        final Where val$whereClause;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.update(table, contentValues, whereClause));
        }

        _cls10()
        {
            this$0 = PropellerRx.this;
            table = table1;
            contentValues = contentvalues;
            whereClause = where;
            super();
        }
    }


    private class _cls8
        implements e
    {

        final PropellerRx this$0;
        final ContentValues val$contentValues;
        final Table val$table;

        public volatile Object call()
        {
            return call();
        }

        public b call()
        {
            return PropellerRx.resultObservable(propeller.upsert(table, contentValues));
        }

        _cls8()
        {
            this$0 = PropellerRx.this;
            table = table1;
            contentValues = contentvalues;
            super();
        }
    }

}
