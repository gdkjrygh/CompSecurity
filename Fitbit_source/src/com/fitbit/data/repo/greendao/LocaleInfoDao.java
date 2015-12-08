// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            LocaleInfo, DaoSession

public class LocaleInfoDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Country = new Property(2, java/lang/String, "country", false, "COUNTRY");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Locale = new Property(1, java/lang/String, "locale", false, "LOCALE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "LOCALE_INFO";

    public LocaleInfoDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public LocaleInfoDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'LOCALE_INFO' (").append("'_id' INTEGER PRIMARY KEY ,").append("'LOCALE' TEXT,").append("'COUNTRY' TEXT);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'LOCALE_INFO'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, LocaleInfo localeinfo)
    {
        sqlitestatement.clearBindings();
        Object obj = localeinfo.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = localeinfo.getLocale();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        localeinfo = localeinfo.getCountry();
        if (localeinfo != null)
        {
            sqlitestatement.bindString(3, localeinfo);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (LocaleInfo)obj);
    }

    public Long getKey(LocaleInfo localeinfo)
    {
        if (localeinfo != null)
        {
            return localeinfo.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((LocaleInfo)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public LocaleInfo readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
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
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
        }
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 2);
        }
        return new LocaleInfo(long1, s, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, LocaleInfo localeinfo, int i)
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
        localeinfo.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        localeinfo.setLocale(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 2);
        }
        localeinfo.setCountry(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (LocaleInfo)obj, i);
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

    protected Long updateKeyAfterInsert(LocaleInfo localeinfo, long l)
    {
        localeinfo.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((LocaleInfo)obj, l);
    }
}
