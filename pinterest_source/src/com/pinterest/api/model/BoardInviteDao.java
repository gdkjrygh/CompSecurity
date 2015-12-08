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
//            BoardInvite, DaoSession

public class BoardInviteDao extends AbstractDao
{

    public static final String TABLENAME = "BOARD_INVITE";

    public BoardInviteDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public BoardInviteDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'BOARD_INVITE' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'UID' TEXT,'CACHE_EXPIRATION_DATE' INTEGER,'CREATED_AT' INTEGER,'INVITER_UID' TEXT NOT NULL ,'BOARD_UID' TEXT NOT NULL ,'STATUS' TEXT,'TYPE' TEXT,'IS_ACCEPTABLE' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'BOARD_INVITE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, BoardInvite boardinvite)
    {
        sqlitestatement.clearBindings();
        Object obj = boardinvite.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = boardinvite.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = boardinvite.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Date) (obj)).getTime());
        }
        obj = boardinvite.getCreatedAt();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        sqlitestatement.bindString(5, boardinvite.getInviterUid());
        sqlitestatement.bindString(6, boardinvite.getBoardUid());
        obj = boardinvite.getStatus();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = boardinvite.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        boardinvite = boardinvite.getIsAcceptable();
        if (boardinvite != null)
        {
            long l;
            if (boardinvite.booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(9, l);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (BoardInvite)obj);
    }

    public Long getKey(BoardInvite boardinvite)
    {
        if (boardinvite != null)
        {
            return boardinvite.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((BoardInvite)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public BoardInvite readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        String s;
        Date date;
        Date date1;
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
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
        }
        if (cursor.isNull(i + 2))
        {
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            date1 = null;
        } else
        {
            date1 = new Date(cursor.getLong(i + 3));
        }
        s3 = cursor.getString(i + 4);
        s4 = cursor.getString(i + 5);
        if (cursor.isNull(i + 6))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            cursor = obj;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        return new BoardInvite(long1, s, date, date1, s3, s4, s1, s2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, BoardInvite boardinvite, int i)
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
        boardinvite.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        boardinvite.setUid(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 2));
        }
        boardinvite.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        boardinvite.setCreatedAt(((Date) (obj)));
        boardinvite.setInviterUid(cursor.getString(i + 4));
        boardinvite.setBoardUid(cursor.getString(i + 5));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        boardinvite.setStatus(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        boardinvite.setType(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            cursor = obj1;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        boardinvite.setIsAcceptable(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (BoardInvite)obj, i);
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

    protected Long updateKeyAfterInsert(BoardInvite boardinvite, long l)
    {
        boardinvite.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((BoardInvite)obj, l);
    }
}
