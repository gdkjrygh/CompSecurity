// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            Friendship, DaoSession, RankedUserDao, RankedUser

public class FriendshipDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property LeftId = new Property(1, java/lang/Long, "leftId", false, "LEFT_ID");
        public static final Property RightId = new Property(2, java/lang/Long, "rightId", false, "RIGHT_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "FRIENDSHIP";
    private DaoSession daoSession;
    private Query rankedUser_FriendshipsQuery;
    private String selectDeep;

    public FriendshipDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public FriendshipDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
        daoSession = daosession;
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'FRIENDSHIP' (").append("'_id' INTEGER PRIMARY KEY ,").append("'LEFT_ID' INTEGER,").append("'RIGHT_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FRIENDSHIP'").toString());
    }

    public List _queryRankedUser_Friendships(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (rankedUser_FriendshipsQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.LeftId.eq(null), new WhereCondition[0]);
            rankedUser_FriendshipsQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = rankedUser_FriendshipsQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void attachEntity(Friendship friendship)
    {
        super.attachEntity(friendship);
        friendship.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((Friendship)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Friendship friendship)
    {
        sqlitestatement.clearBindings();
        Long long1 = friendship.getId();
        if (long1 != null)
        {
            sqlitestatement.bindLong(1, long1.longValue());
        }
        long1 = friendship.getLeftId();
        if (long1 != null)
        {
            sqlitestatement.bindLong(2, long1.longValue());
        }
        friendship = friendship.getRightId();
        if (friendship != null)
        {
            sqlitestatement.bindLong(3, friendship.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Friendship)obj);
    }

    public Long getKey(Friendship friendship)
    {
        if (friendship != null)
        {
            return friendship.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Friendship)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getRankedUserDao().getAllColumns());
            stringbuilder.append(" FROM FRIENDSHIP T");
            stringbuilder.append(" LEFT JOIN RANKED_USER T0 ON T.'RIGHT_ID'=T0.'_id'");
            stringbuilder.append(' ');
            selectDeep = stringbuilder.toString();
        }
        return selectDeep;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public List loadAllDeepFromCursor(Cursor cursor)
    {
        ArrayList arraylist;
        int i = cursor.getCount();
        arraylist = new ArrayList(i);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (identityScope != null)
        {
            identityScope.lock();
            identityScope.reserveRoom(i);
        }
        boolean flag;
        do
        {
            arraylist.add(loadCurrentDeep(cursor, false));
            flag = cursor.moveToNext();
        } while (flag);
        if (identityScope != null)
        {
            identityScope.unlock();
        }
        return arraylist;
        cursor;
        if (identityScope != null)
        {
            identityScope.unlock();
        }
        throw cursor;
    }

    protected Friendship loadCurrentDeep(Cursor cursor, boolean flag)
    {
        Friendship friendship = (Friendship)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        friendship.setPerson((RankedUser)loadCurrentOther(daoSession.getRankedUserDao(), cursor, i));
        return friendship;
    }

    public Friendship loadDeep(Long long1)
    {
        assertSinglePk();
        if (long1 == null)
        {
            return null;
        }
        Object obj = new StringBuilder(getSelectDeep());
        ((StringBuilder) (obj)).append("WHERE ");
        SqlUtils.appendColumnsEqValue(((StringBuilder) (obj)), "T", getPkColumns());
        obj = ((StringBuilder) (obj)).toString();
        long1 = long1.toString();
        long1 = db.rawQuery(((String) (obj)), new String[] {
            long1
        });
        boolean flag = long1.moveToFirst();
        if (!flag)
        {
            long1.close();
            return null;
        }
        if (!long1.isLast())
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected unique result, but count was ").append(long1.getCount()).toString());
        }
        break MISSING_BLOCK_LABEL_138;
        Exception exception;
        exception;
        long1.close();
        throw exception;
        Friendship friendship = loadCurrentDeep(long1, true);
        long1.close();
        return friendship;
    }

    protected List loadDeepAllAndCloseCursor(Cursor cursor)
    {
        List list = loadAllDeepFromCursor(cursor);
        cursor.close();
        return list;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public transient List queryDeep(String s, String as[])
    {
        return loadDeepAllAndCloseCursor(db.rawQuery((new StringBuilder()).append(getSelectDeep()).append(s).toString(), as));
    }

    public Friendship readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Long long2;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 2));
        }
        return new Friendship(long1, long2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Friendship friendship, int i)
    {
        Object obj = null;
        Long long1;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        friendship.setId(long1);
        if (cursor.isNull(i + 1))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 1));
        }
        friendship.setLeftId(long1);
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 2));
        }
        friendship.setRightId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Friendship)obj, i);
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

    protected Long updateKeyAfterInsert(Friendship friendship, long l)
    {
        friendship.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Friendship)obj, l);
    }
}
