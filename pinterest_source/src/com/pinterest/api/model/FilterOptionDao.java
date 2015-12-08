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
//            FilterOption, DaoSession

public class FilterOptionDao extends AbstractDao
{

    public static final String TABLENAME = "FILTER_OPTION";

    public FilterOptionDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public FilterOptionDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'FILTER_OPTION' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'CACHE_EXPIRATION_DATE' INTEGER,'COUNT' INTEGER,'TYPE_VALUE' TEXT,'DISPLAY_COUNT' TEXT,'DISPLAY_NAME' TEXT,'LARGE_ICON_URL' TEXT,'SMALL_ICON_URL' TEXT,'DOMINANT_COLOR' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FILTER_OPTION'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, FilterOption filteroption)
    {
        sqlitestatement.clearBindings();
        Object obj = filteroption.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = filteroption.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = filteroption.getCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        obj = filteroption.getTypeValue();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = filteroption.getDisplayCount();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = filteroption.getDisplayName();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = filteroption.getLargeIconUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = filteroption.getSmallIconUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        filteroption = filteroption.getDominantColor();
        if (filteroption != null)
        {
            sqlitestatement.bindString(9, filteroption);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (FilterOption)obj);
    }

    public Long getKey(FilterOption filteroption)
    {
        if (filteroption != null)
        {
            return filteroption.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((FilterOption)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public FilterOption readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Date date;
        Integer integer;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
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
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 8);
        }
        return new FilterOption(long1, date, integer, s, s1, s2, s3, s4, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, FilterOption filteroption, int i)
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
        filteroption.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        filteroption.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        filteroption.setCount(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        filteroption.setTypeValue(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        filteroption.setDisplayCount(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        filteroption.setDisplayName(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        filteroption.setLargeIconUrl(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        filteroption.setSmallIconUrl(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 8);
        }
        filteroption.setDominantColor(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (FilterOption)obj, i);
    }

    public Long readKey(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            return null;
        } else
        {
            return Long.valueOf(cursor.getLong(i + 0));
        }
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    protected Long updateKeyAfterInsert(FilterOption filteroption, long l)
    {
        filteroption.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((FilterOption)obj, l);
    }
}
