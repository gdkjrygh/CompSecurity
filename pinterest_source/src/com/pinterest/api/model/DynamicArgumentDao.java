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
//            DynamicArgument, DaoSession

public class DynamicArgumentDao extends AbstractDao
{

    public static final String TABLENAME = "DYNAMIC_ARGUMENT";

    public DynamicArgumentDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public DynamicArgumentDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'DYNAMIC_ARGUMENT' ('TYPE' TEXT,'ID' TEXT,'RENDER' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'DYNAMIC_ARGUMENT'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, DynamicArgument dynamicargument)
    {
        sqlitestatement.clearBindings();
        String s = dynamicargument.getType();
        if (s != null)
        {
            sqlitestatement.bindString(1, s);
        }
        s = dynamicargument.getId();
        if (s != null)
        {
            sqlitestatement.bindString(2, s);
        }
        dynamicargument = dynamicargument.getRender();
        if (dynamicargument != null)
        {
            sqlitestatement.bindString(3, dynamicargument);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (DynamicArgument)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((DynamicArgument)obj);
    }

    public Void getKey(DynamicArgument dynamicargument)
    {
        return null;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public DynamicArgument readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        if (cursor.isNull(i + 0))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 0);
        }
        if (cursor.isNull(i + 1))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 1);
        }
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 2);
        }
        return new DynamicArgument(s, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, DynamicArgument dynamicargument, int i)
    {
        Object obj = null;
        String s;
        if (cursor.isNull(i + 0))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 0);
        }
        dynamicargument.setType(s);
        if (cursor.isNull(i + 1))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
        }
        dynamicargument.setId(s);
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 2);
        }
        dynamicargument.setRender(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (DynamicArgument)obj, i);
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
        return updateKeyAfterInsert((DynamicArgument)obj, l);
    }

    protected Void updateKeyAfterInsert(DynamicArgument dynamicargument, long l)
    {
        return null;
    }
}
