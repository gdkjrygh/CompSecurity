// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.repo.greendao.migration.MigrationHelper;
import com.fitbit.data.repo.greendao.social.Badge;
import com.fitbit.data.repo.greendao.social.BadgeDao;
import com.fitbit.data.repo.greendao.social.DaoMaster;
import com.fitbit.data.repo.greendao.social.DaoSession;
import com.fitbit.data.repo.greendao.social.Friendship;
import com.fitbit.data.repo.greendao.social.FriendshipDao;
import com.fitbit.data.repo.greendao.social.RankedUser;
import com.fitbit.data.repo.greendao.social.RankedUserDao;
import com.fitbit.e.a;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory

public static class nit> extends com.fitbit.data.repo.greendao.social.
{

    private static final int MIGRATION_VERSION = 147;
    private static final String SOCIAL_MIGRATION_ERROR = "social_migration_error";

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        super.(sqlitedatabase);
        Object obj = DaoFactory.access$000(DaoFactory.getInstance()).getWritableDatabase();
        if (((SQLiteDatabase) (obj)).getVersion() == 147)
        {
            DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
            obj = (new DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
            sqlitedatabase = (new DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
            Object obj1 = ((DaoSession) (obj)).getFriendshipDao();
            Object obj2 = sqlitedatabase.getFriendshipDao();
            Friendship friendship;
            for (Iterator iterator1 = ((FriendshipDao) (obj1)).loadAll().iterator(); iterator1.hasNext(); ((FriendshipDao) (obj2)).insertOrReplace(friendship))
            {
                friendship = (Friendship)iterator1.next();
                ((FriendshipDao) (obj1)).detach(friendship);
            }

            obj1 = ((DaoSession) (obj)).getRankedUserDao();
            obj2 = sqlitedatabase.getRankedUserDao();
            RankedUser rankeduser;
            for (Iterator iterator2 = ((RankedUserDao) (obj1)).loadAll().iterator(); iterator2.hasNext(); ((RankedUserDao) (obj2)).insertOrReplace(rankeduser))
            {
                rankeduser = (RankedUser)iterator2.next();
                ((RankedUserDao) (obj1)).detach(rankeduser);
            }

            obj = ((DaoSession) (obj)).getBadgeDao();
            sqlitedatabase = sqlitedatabase.getBadgeDao();
            Badge badge;
            for (Iterator iterator = ((BadgeDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insertOrReplace(badge))
            {
                badge = (Badge)iterator.next();
                ((BadgeDao) (obj)).detach(badge);
            }

        }
        DaoMaster.dropAllTables(DaoFactory.access$000(DaoFactory.getInstance()).getWritableDatabase(), true);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a("DaoFactory", "Upgrading SocialDB schema from version [%s] to [%s]", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        boolean flag;
        try
        {
            flag = MigrationHelper.migrateSocialDB(sqlitedatabase, i, j);
        }
        catch (Throwable throwable)
        {
            a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
            return;
        }
        if (flag)
        {
            FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "social_migration_error", null, 0);
            com.fitbit.savedstate.d.c(true);
        }
    }

    public r(Context context)
    {
        super(context, "social_db", null);
    }
}
