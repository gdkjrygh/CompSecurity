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
//            DynamicTitle, DaoSession

public class DynamicTitleDao extends AbstractDao
{

    public static final String TABLENAME = "DYNAMIC_TITLE";

    public DynamicTitleDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public DynamicTitleDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'DYNAMIC_TITLE' ('TEXT' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'DYNAMIC_TITLE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, DynamicTitle dynamictitle)
    {
        sqlitestatement.clearBindings();
        dynamictitle = dynamictitle.getText();
        if (dynamictitle != null)
        {
            sqlitestatement.bindString(1, dynamictitle);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (DynamicTitle)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((DynamicTitle)obj);
    }

    public Void getKey(DynamicTitle dynamictitle)
    {
        return null;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public DynamicTitle readEntity(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 0);
        }
        return new DynamicTitle(cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, DynamicTitle dynamictitle, int i)
    {
        if (cursor.isNull(i + 0))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 0);
        }
        dynamictitle.setText(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (DynamicTitle)obj, i);
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
        return updateKeyAfterInsert((DynamicTitle)obj, l);
    }

    protected Void updateKeyAfterInsert(DynamicTitle dynamictitle, long l)
    {
        return null;
    }
}
