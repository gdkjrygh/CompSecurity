// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.test;

import android.database.sqlite.SQLiteDatabase;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.schema.Table;
import com.soundcloud.propeller.test.matchers.QueryBinding;
import org.junit.rules.ExternalResource;

public abstract class IntegrationTest
{
    public final class TestDatabase extends ExternalResource
    {

        final IntegrationTest this$0;

        protected final void before()
            throws Throwable
        {
            database = provideDatabase();
            propeller = new PropellerDatabase(database);
        }

        public TestDatabase()
        {
            this$0 = IntegrationTest.this;
            super();
        }
    }


    private SQLiteDatabase database;
    private PropellerDatabase propeller;
    public final TestDatabase testDatabase = new TestDatabase();

    public IntegrationTest()
    {
    }

    public SQLiteDatabase database()
    {
        return database;
    }

    protected void dropTable(Table table)
    {
        sql((new StringBuilder("DROP TABLE IF EXISTS ")).append(table.name()).toString());
    }

    public PropellerDatabase propeller()
    {
        return propeller;
    }

    protected abstract SQLiteDatabase provideDatabase();

    protected QueryBinding select(Query query)
    {
        return new QueryBinding(database, query);
    }

    protected void sql(String s)
    {
        database.execSQL(s);
    }



/*
    static SQLiteDatabase access$002(IntegrationTest integrationtest, SQLiteDatabase sqlitedatabase)
    {
        integrationtest.database = sqlitedatabase;
        return sqlitedatabase;
    }

*/


/*
    static PropellerDatabase access$102(IntegrationTest integrationtest, PropellerDatabase propellerdatabase)
    {
        integrationtest.propeller = propellerdatabase;
        return propellerdatabase;
    }

*/
}
