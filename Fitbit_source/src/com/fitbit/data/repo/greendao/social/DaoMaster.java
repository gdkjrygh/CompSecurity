// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            RankedUserDao, FriendshipDao, BadgeDao, CheerBadgeRelationDao, 
//            DaoSession

public class DaoMaster extends AbstractDaoMaster
{
    public static class DevOpenHelper extends OpenHelper
    {

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            Log.i("greenDAO", (new StringBuilder()).append("Upgrading schema from version ").append(i).append(" to ").append(j).append(" by dropping all tables").toString());
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
        }

        public DevOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory);
        }
    }

    public static abstract class OpenHelper extends SQLiteOpenHelper
    {

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            Log.i("greenDAO", "Creating tables for schema version 2");
            DaoMaster.createAllTables(sqlitedatabase, false);
        }

        public OpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory, 2);
        }
    }


    public static final int SCHEMA_VERSION = 2;

    public DaoMaster(SQLiteDatabase sqlitedatabase)
    {
        super(sqlitedatabase, 2);
        registerDaoClass(com/fitbit/data/repo/greendao/social/RankedUserDao);
        registerDaoClass(com/fitbit/data/repo/greendao/social/FriendshipDao);
        registerDaoClass(com/fitbit/data/repo/greendao/social/BadgeDao);
        registerDaoClass(com/fitbit/data/repo/greendao/social/CheerBadgeRelationDao);
    }

    public static void createAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        RankedUserDao.createTable(sqlitedatabase, flag);
        FriendshipDao.createTable(sqlitedatabase, flag);
        BadgeDao.createTable(sqlitedatabase, flag);
        CheerBadgeRelationDao.createTable(sqlitedatabase, flag);
    }

    public static void dropAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        RankedUserDao.dropTable(sqlitedatabase, flag);
        FriendshipDao.dropTable(sqlitedatabase, flag);
        BadgeDao.dropTable(sqlitedatabase, flag);
        CheerBadgeRelationDao.dropTable(sqlitedatabase, flag);
    }

    public DaoSession newSession()
    {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType identityscopetype)
    {
        return new DaoSession(db, identityscopetype, daoConfigMap);
    }

    public volatile AbstractDaoSession newSession()
    {
        return newSession();
    }

    public volatile AbstractDaoSession newSession(IdentityScopeType identityscopetype)
    {
        return newSession(identityscopetype);
    }
}
