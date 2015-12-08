// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.dao.query;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDao;

// Referenced classes of package de.greenrobot.dao.query:
//            AbstractQuery, AbstractQueryData

public class DeleteQuery extends AbstractQuery
{
    private static final class QueryData extends AbstractQueryData
    {

        protected volatile AbstractQuery createQuery()
        {
            return createQuery();
        }

        protected DeleteQuery createQuery()
        {
            return new DeleteQuery(this, dao, sql, (String[])initialValues.clone());
        }

        private QueryData(AbstractDao abstractdao, String s, String as[])
        {
            super(abstractdao, s, as);
        }

    }


    private final QueryData queryData;

    private DeleteQuery(QueryData querydata, AbstractDao abstractdao, String s, String as[])
    {
        super(abstractdao, s, as);
        queryData = querydata;
    }


    static DeleteQuery create(AbstractDao abstractdao, String s, Object aobj[])
    {
        return (DeleteQuery)(new QueryData(abstractdao, s, toStringArray(aobj))).forCurrentThread();
    }

    public void executeDeleteWithoutDetachingEntities()
    {
        SQLiteDatabase sqlitedatabase;
        checkThread();
        sqlitedatabase = dao.getDatabase();
        if (sqlitedatabase.isDbLockedByCurrentThread())
        {
            dao.getDatabase().execSQL(sql, parameters);
            return;
        }
        sqlitedatabase.beginTransaction();
        dao.getDatabase().execSQL(sql, parameters);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public DeleteQuery forCurrentThread()
    {
        return (DeleteQuery)queryData.forCurrentThread(this);
    }

    public volatile void setParameter(int i, Object obj)
    {
        super.setParameter(i, obj);
    }
}
