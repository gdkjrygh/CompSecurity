// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            RankedUserDao, FriendshipDao, BadgeDao, CheerBadgeRelationDao, 
//            RankedUser, Friendship, Badge, CheerBadgeRelation

public class DaoSession extends AbstractDaoSession
{

    private final BadgeDao badgeDao;
    private final DaoConfig badgeDaoConfig;
    private final CheerBadgeRelationDao cheerBadgeRelationDao;
    private final DaoConfig cheerBadgeRelationDaoConfig;
    private final FriendshipDao friendshipDao;
    private final DaoConfig friendshipDaoConfig;
    private final RankedUserDao rankedUserDao;
    private final DaoConfig rankedUserDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        rankedUserDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/social/RankedUserDao)).clone();
        rankedUserDaoConfig.initIdentityScope(identityscopetype);
        friendshipDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/social/FriendshipDao)).clone();
        friendshipDaoConfig.initIdentityScope(identityscopetype);
        badgeDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/social/BadgeDao)).clone();
        badgeDaoConfig.initIdentityScope(identityscopetype);
        cheerBadgeRelationDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/social/CheerBadgeRelationDao)).clone();
        cheerBadgeRelationDaoConfig.initIdentityScope(identityscopetype);
        rankedUserDao = new RankedUserDao(rankedUserDaoConfig, this);
        friendshipDao = new FriendshipDao(friendshipDaoConfig, this);
        badgeDao = new BadgeDao(badgeDaoConfig, this);
        cheerBadgeRelationDao = new CheerBadgeRelationDao(cheerBadgeRelationDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/social/RankedUser, rankedUserDao);
        registerDao(com/fitbit/data/repo/greendao/social/Friendship, friendshipDao);
        registerDao(com/fitbit/data/repo/greendao/social/Badge, badgeDao);
        registerDao(com/fitbit/data/repo/greendao/social/CheerBadgeRelation, cheerBadgeRelationDao);
    }

    public void clear()
    {
        rankedUserDaoConfig.getIdentityScope().clear();
        friendshipDaoConfig.getIdentityScope().clear();
        badgeDaoConfig.getIdentityScope().clear();
        cheerBadgeRelationDaoConfig.getIdentityScope().clear();
    }

    public BadgeDao getBadgeDao()
    {
        return badgeDao;
    }

    public CheerBadgeRelationDao getCheerBadgeRelationDao()
    {
        return cheerBadgeRelationDao;
    }

    public FriendshipDao getFriendshipDao()
    {
        return friendshipDao;
    }

    public RankedUserDao getRankedUserDao()
    {
        return rankedUserDao;
    }
}
