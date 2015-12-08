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
//            DynamicRelationship, DaoSession

public class DynamicRelationshipDao extends AbstractDao
{

    public static final String TABLENAME = "DYNAMIC_RELATIONSHIP";

    public DynamicRelationshipDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public DynamicRelationshipDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'DYNAMIC_RELATIONSHIP' ('ACTION_TEXT' TEXT,'HIGHLIGHTED_ID' TEXT,'ACTION_DEEP_LINK' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'DYNAMIC_RELATIONSHIP'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, DynamicRelationship dynamicrelationship)
    {
        sqlitestatement.clearBindings();
        String s = dynamicrelationship.getActionText();
        if (s != null)
        {
            sqlitestatement.bindString(1, s);
        }
        s = dynamicrelationship.getHighlightedId();
        if (s != null)
        {
            sqlitestatement.bindString(2, s);
        }
        dynamicrelationship = dynamicrelationship.getActionDeepLink();
        if (dynamicrelationship != null)
        {
            sqlitestatement.bindString(3, dynamicrelationship);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (DynamicRelationship)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((DynamicRelationship)obj);
    }

    public Void getKey(DynamicRelationship dynamicrelationship)
    {
        return null;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public DynamicRelationship readEntity(Cursor cursor, int i)
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
        return new DynamicRelationship(s, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, DynamicRelationship dynamicrelationship, int i)
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
        dynamicrelationship.setActionText(s);
        if (cursor.isNull(i + 1))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
        }
        dynamicrelationship.setHighlightedId(s);
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 2);
        }
        dynamicrelationship.setActionDeepLink(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (DynamicRelationship)obj, i);
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
        return updateKeyAfterInsert((DynamicRelationship)obj, l);
    }

    protected Void updateKeyAfterInsert(DynamicRelationship dynamicrelationship, long l)
    {
        return null;
    }
}
