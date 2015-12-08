// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;

// Referenced classes of package com.pinterest.api.model:
//            AggregatedPinData, DaoSession

public class AggregatedPinDataDao extends AbstractDao
{

    public static final String TABLENAME = "AGGREGATED_PIN_DATA";

    public AggregatedPinDataDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public AggregatedPinDataDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'AGGREGATED_PIN_DATA' ('UID' TEXT,'SAVES' INTEGER,'LIKES' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'AGGREGATED_PIN_DATA'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, AggregatedPinData aggregatedpindata)
    {
        sqlitestatement.clearBindings();
        Object obj = aggregatedpindata.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = aggregatedpindata.getSaves();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Integer) (obj)).intValue());
        }
        aggregatedpindata = aggregatedpindata.getLikes();
        if (aggregatedpindata != null)
        {
            sqlitestatement.bindLong(3, aggregatedpindata.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (AggregatedPinData)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((AggregatedPinData)obj);
    }

    public Void getKey(AggregatedPinData aggregatedpindata)
    {
        return null;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public AggregatedPinData readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        Integer integer;
        if (cursor.isNull(i + 0))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 0);
        }
        if (cursor.isNull(i + 1))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 2));
        }
        return new AggregatedPinData(s, integer, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, AggregatedPinData aggregatedpindata, int i)
    {
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 0);
        }
        aggregatedpindata.setUid(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 1));
        }
        aggregatedpindata.setSaves(((Integer) (obj)));
        if (cursor.isNull(i + 2))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 2));
        }
        aggregatedpindata.setLikes(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (AggregatedPinData)obj, i);
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
        return updateKeyAfterInsert((AggregatedPinData)obj, l);
    }

    protected Void updateKeyAfterInsert(AggregatedPinData aggregatedpindata, long l)
    {
        return null;
    }
}
