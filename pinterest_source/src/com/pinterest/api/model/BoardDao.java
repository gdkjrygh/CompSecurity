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
//            Board, DaoSession

public class BoardDao extends AbstractDao
{

    public static final String TABLENAME = "BOARD";

    public BoardDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public BoardDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'BOARD' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'CACHE_EXPIRATION_DATE' INTEGER,'UID' TEXT UNIQUE ,'USER_UID' TEXT,'CREATED_AT' INTEGER,'SYNCED_AT' INTEGER,'LAST_MODIFIED_AT' INTEGER,'NAME' TEXT,'CATEGORY' TEXT,'DESCRIPTION' TEXT,'URL' TEXT,'IMAGE_THUMBNAIL_URLS' TEXT,'PIN_IMAGE_URLS' TEXT,'IMAGE_PREVIEW_URL' TEXT,'IMAGE_COVER_URL' TEXT,'IMAGE_COVER_THUMBNAIL' TEXT,'FOLLOWING' INTEGER,'COLLABORATIVE' INTEGER,'COLLABORATOR_INVITES_ENABLED' INTEGER,'COLLABORATOR' INTEGER,'SECRET' INTEGER,'LARGEST_PIN_INDEX' INTEGER,'PIN_COUNT' INTEGER,'FOLLOWER_COUNT' INTEGER,'COLLABORATOR_COUNT' INTEGER,'LAYOUT' TEXT,'RECOMMENDATION_BLOB' TEXT,'RECOMMENDATION_REASON' TEXT,'RECOMMENDATION_BOARD_UID' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'BOARD'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Board board)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = board.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = board.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = board.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = board.getUserUid();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = board.getCreatedAt();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = board.getSyncedAt();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Date) (obj)).getTime());
        }
        obj = board.getLastModifiedAt();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Date) (obj)).getTime());
        }
        obj = board.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = board.getCategory();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = board.getDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = board.getUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = board.getImageThumbnailUrls();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = board.getPinImageUrls();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = board.getImagePreviewUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = board.getImageCoverUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = board.getImageCoverThumbnail();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = board.getFollowing();
        long l;
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(17, l);
        }
        obj = board.getCollaborative();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(18, l);
        }
        obj = board.getCollaboratorInvitesEnabled();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(19, l);
        }
        obj = board.getCollaborator();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(20, l);
        }
        obj = board.getSecret();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(21, l);
        }
        obj = board.getLargestPinIndex();
        if (obj != null)
        {
            sqlitestatement.bindLong(22, ((Integer) (obj)).intValue());
        }
        obj = board.getPinCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(23, ((Integer) (obj)).intValue());
        }
        obj = board.getFollowerCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(24, ((Integer) (obj)).intValue());
        }
        obj = board.getCollaboratorCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(25, ((Integer) (obj)).intValue());
        }
        obj = board.getLayout();
        if (obj != null)
        {
            sqlitestatement.bindString(26, ((String) (obj)));
        }
        obj = board.getRecommendationBlob();
        if (obj != null)
        {
            sqlitestatement.bindString(27, ((String) (obj)));
        }
        obj = board.getRecommendationReason();
        if (obj != null)
        {
            sqlitestatement.bindString(28, ((String) (obj)));
        }
        board = board.getRecommendationBoardUid();
        if (board != null)
        {
            sqlitestatement.bindString(29, board);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Board)obj);
    }

    public Long getKey(Board board)
    {
        if (board != null)
        {
            return board.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Board)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Board readEntity(Cursor cursor, int i)
    {
        Long long1;
        Date date;
        String s;
        String s1;
        Date date1;
        Date date2;
        Date date3;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        Boolean boolean1;
        Boolean boolean2;
        Boolean boolean3;
        Boolean boolean4;
        Boolean boolean5;
        Integer integer;
        Integer integer1;
        Integer integer2;
        Integer integer3;
        String s11;
        String s12;
        String s13;
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
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            date1 = null;
        } else
        {
            date1 = new Date(cursor.getLong(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            date3 = null;
        } else
        {
            date3 = new Date(cursor.getLong(i + 6));
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
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 16) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 17))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 17) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 18))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 18) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 19))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 19) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 20))
        {
            boolean5 = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 20) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            boolean5 = Boolean.valueOf(flag4);
        }
        if (cursor.isNull(i + 21))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 21));
        }
        if (cursor.isNull(i + 22))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 22));
        }
        if (cursor.isNull(i + 23))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 23));
        }
        if (cursor.isNull(i + 24))
        {
            integer3 = null;
        } else
        {
            integer3 = Integer.valueOf(cursor.getInt(i + 24));
        }
        if (cursor.isNull(i + 25))
        {
            s11 = null;
        } else
        {
            s11 = cursor.getString(i + 25);
        }
        if (cursor.isNull(i + 26))
        {
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 26);
        }
        if (cursor.isNull(i + 27))
        {
            s13 = null;
        } else
        {
            s13 = cursor.getString(i + 27);
        }
        if (cursor.isNull(i + 28))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 28);
        }
        return new Board(long1, date, s, s1, date1, date2, date3, s2, s3, s4, s5, s6, s7, s8, s9, s10, boolean1, boolean2, boolean3, boolean4, boolean5, integer, integer1, integer2, integer3, s11, s12, s13, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Board board, int i)
    {
        boolean flag5 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        board.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        board.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        board.setUid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        board.setUserUid(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        board.setCreatedAt(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 5));
        }
        board.setSyncedAt(((Date) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 6));
        }
        board.setLastModifiedAt(((Date) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        board.setName(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        board.setCategory(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        board.setDescription(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        board.setUrl(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        board.setImageThumbnailUrls(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        board.setPinImageUrls(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        board.setImagePreviewUrl(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        board.setImageCoverUrl(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        board.setImageCoverThumbnail(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 16) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        board.setFollowing(((Boolean) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 17) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        board.setCollaborative(((Boolean) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 18) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        board.setCollaboratorInvitesEnabled(((Boolean) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 19) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        board.setCollaborator(((Boolean) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 20) != 0)
            {
                flag4 = flag5;
            } else
            {
                flag4 = false;
            }
            obj = Boolean.valueOf(flag4);
        }
        board.setSecret(((Boolean) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 21));
        }
        board.setLargestPinIndex(((Integer) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 22));
        }
        board.setPinCount(((Integer) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 23));
        }
        board.setFollowerCount(((Integer) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 24));
        }
        board.setCollaboratorCount(((Integer) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 25);
        }
        board.setLayout(((String) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 26);
        }
        board.setRecommendationBlob(((String) (obj)));
        if (cursor.isNull(i + 27))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 27);
        }
        board.setRecommendationReason(((String) (obj)));
        if (cursor.isNull(i + 28))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 28);
        }
        board.setRecommendationBoardUid(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Board)obj, i);
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

    protected Long updateKeyAfterInsert(Board board, long l)
    {
        board.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Board)obj, l);
    }
}
