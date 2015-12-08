// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.kohls.mcommerce.opal.helper.error.AppException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.helper.db:
//            DBQueries, VOProcessor, DBHelper

public class DBOperationsHelper
{

    private static final String TAG = com/kohls/mcommerce/opal/helper/db/DBOperationsHelper.getSimpleName();

    public DBOperationsHelper()
    {
    }

    private boolean isTableExists(SQLiteDatabase sqlitedatabase, String s)
    {
        boolean flag = true;
        if (s != null && sqlitedatabase != null && sqlitedatabase.isOpen())
        {
            if ((sqlitedatabase = sqlitedatabase.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE type = ? AND name = ?", new String[] {
    "table", s
})).moveToFirst())
            {
                int i = sqlitedatabase.getInt(0);
                sqlitedatabase.close();
                if (i <= 0)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public int count(String s)
    {
        String s1;
        String s2;
        SQLiteDatabase sqlitedatabase;
        int j;
        sqlitedatabase = getReadableDb();
        s2 = null;
        s1 = null;
        j = 0;
        s = performQuery(DBQueries.COUNT.getQuery().replaceAll("[/?]", s), new String[0], sqlitedatabase);
        s1 = s;
        s2 = s;
        int i = s.getInt(0);
        j = i;
        if (s != null)
        {
            dispose(s);
            j = i;
        }
_L2:
        return j;
        s;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        dispose(s1);
        return 0;
        s;
        if (s2 != null)
        {
            dispose(s2);
        }
        throw s;
    }

    public void delete(String s, String s1, String s2)
    {
        SQLiteDatabase sqlitedatabase = getWritableDb();
        sqlitedatabase.delete(s, (new StringBuilder()).append(s1).append("= ?").toString(), new String[] {
            s2
        });
        dispose(sqlitedatabase);
    }

    public void deleteAll(String s)
    {
        SQLiteDatabase sqlitedatabase = getWritableDb();
        sqlitedatabase.delete(s, null, null);
        dispose(sqlitedatabase);
    }

    protected void dispose(Cursor cursor)
    {
        cursor.close();
    }

    protected void dispose(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.close();
    }

    protected void dispose(SQLiteDatabase sqlitedatabase, Cursor cursor)
    {
    }

    public Object get(String s, String s1, String s2, Class class1)
        throws Exception
    {
        class1 = getReadableDb();
        Cursor cursor = class1.query(s, null, (new StringBuilder()).append(s1).append("=?").toString(), new String[] {
            s2
        }, null, null, null);
        if (cursor == null || !cursor.moveToFirst())
        {
            throw new AppException((new StringBuilder()).append("No rows obtained for: table: ").append(s).append(", whereColumnName: ").append(s1).append(", whereColumnValue: ").append(s2).toString());
        } else
        {
            s = ((String) (VOProcessor.getInstance().getVO(s, cursor)));
            dispose(class1, cursor);
            return s;
        }
    }

    public List getAll(String s)
        throws AppException
    {
        List list = null;
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        sqlitedatabase = getReadableDb();
        if (!isTableExists(sqlitedatabase, s))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        cursor = sqlitedatabase.query(s, null, null, null, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        throw new AppException((new StringBuilder()).append("No rows obtained for: table: ").append(s).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        list = VOProcessor.getInstance().getVOList(s, cursor);
        dispose(sqlitedatabase, cursor);
        this;
        JVM INSTR monitorexit ;
        return list;
    }

    protected SQLiteDatabase getReadableDb()
    {
        return DBHelper.getInstance().getReadableDatabase();
    }

    protected SQLiteDatabase getWritableDb()
    {
        return DBHelper.getInstance().getWritableDatabase();
    }

    public long insert(String s, Object obj)
    {
        SQLiteDatabase sqlitedatabase = getWritableDb();
        long l = performInsert(s, obj, sqlitedatabase);
        dispose(sqlitedatabase);
        return l;
    }

    public long insertAll(String s, List list)
    {
        SQLiteDatabase sqlitedatabase;
        long l;
label0:
        {
            sqlitedatabase = getWritableDb();
            long l1 = 0L;
            l = l1;
            if (list == null)
            {
                break label0;
            }
            list = list.iterator();
            l = l1;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                l1 = performInsert(s, list.next(), sqlitedatabase);
                l = l1;
            } while (l1 > -1L);
            l = l1;
        }
        dispose(sqlitedatabase);
        return l;
    }

    protected long performInsert(String s, Object obj, SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.insert(s, null, VOProcessor.getInstance().getContentValues(s, obj));
    }

    protected Cursor performQuery(DBQueries dbqueries, String as[], SQLiteDatabase sqlitedatabase)
        throws Exception
    {
        return performQuery(dbqueries.getQuery(), as, sqlitedatabase);
    }

    protected Cursor performQuery(String s, String as[], SQLiteDatabase sqlitedatabase)
        throws Exception
    {
        s = sqlitedatabase.rawQuery(s, as);
        if (s == null || !s.moveToFirst())
        {
            throw new Exception("No rows found");
        } else
        {
            return s;
        }
    }

    public List query(String s, DBQueries dbqueries, String as[])
        throws AppException
    {
        DBQueries dbqueries1;
        DBQueries dbqueries2;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getWritableDb();
        dbqueries2 = null;
        dbqueries1 = null;
        dbqueries = performQuery(dbqueries, as, sqlitedatabase);
        dbqueries1 = dbqueries;
        dbqueries2 = dbqueries;
        s = VOProcessor.getInstance().getVOList(s, dbqueries);
        if (dbqueries != null)
        {
            dispose(dbqueries);
        }
        return s;
        s;
        dbqueries2 = dbqueries1;
        s.printStackTrace();
        dbqueries2 = dbqueries1;
        throw new AppException(s.getMessage());
        s;
        if (dbqueries2 != null)
        {
            dispose(dbqueries2);
        }
        throw s;
    }

    public int update(String s, String s1, String s2, Object obj)
    {
        SQLiteDatabase sqlitedatabase = getWritableDb();
        int i = sqlitedatabase.update(s, VOProcessor.getInstance().getContentValues(s, obj), (new StringBuilder()).append(s1).append("=?").toString(), new String[] {
            s2
        });
        dispose(sqlitedatabase);
        return i;
    }

}
