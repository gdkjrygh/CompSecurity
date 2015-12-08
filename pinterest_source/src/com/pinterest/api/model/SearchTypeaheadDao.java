// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            SearchTypeahead, DaoSession

public class SearchTypeaheadDao extends AbstractDao
{

    public static final String TABLENAME = "SEARCH_TYPEAHEAD";

    public SearchTypeaheadDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public SearchTypeaheadDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "IF NOT EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL((new StringBuilder("CREATE VIRTUAL TABLE ")).append(s).append("'SEARCH_TYPEAHEAD' USING fts4('_id' INTEGER PRIMARY KEY ,'CACHE_EXPIRATION_DATE' INTEGER,'QUERY' TEXT PRIMARY KEY NOT NULL ,'SCORE' REAL);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SEARCH_TYPEAHEAD'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, SearchTypeahead searchtypeahead)
    {
        sqlitestatement.clearBindings();
        Object obj = searchtypeahead.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = searchtypeahead.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = searchtypeahead.getQuery();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        searchtypeahead = searchtypeahead.getScore();
        if (searchtypeahead != null)
        {
            sqlitestatement.bindDouble(4, searchtypeahead.floatValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (SearchTypeahead)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((SearchTypeahead)obj);
    }

    public Void getKey(SearchTypeahead searchtypeahead)
    {
        return null;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public SearchTypeahead readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Date date;
        String s;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            cursor = obj;
        } else
        {
            cursor = Float.valueOf(cursor.getFloat(i + 3));
        }
        return new SearchTypeahead(long1, date, s, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, SearchTypeahead searchtypeahead, int i)
    {
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        searchtypeahead.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        searchtypeahead.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        searchtypeahead.setQuery(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            cursor = obj1;
        } else
        {
            cursor = Float.valueOf(cursor.getFloat(i + 3));
        }
        searchtypeahead.setScore(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (SearchTypeahead)obj, i);
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    public Void readKey(Cursor cursor, int i)
    {
        return null;
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((SearchTypeahead)obj, l);
    }

    protected Void updateKeyAfterInsert(SearchTypeahead searchtypeahead, long l)
    {
        return null;
    }
}
