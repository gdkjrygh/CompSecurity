// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.repo.an;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.RankedUserMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            RankedUser, Friendship, DaoSession

public class RankedUserGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements an
{

    public RankedUserGreenDaoRepository()
    {
    }

    private List getUserFriends(com.fitbit.data.repo.greendao.social.RankedUser rankeduser)
    {
        LinkedList linkedlist = new LinkedList();
        EntityMapper entitymapper = getMapper();
        if (rankeduser != null)
        {
            for (rankeduser = rankeduser.getFriendships().iterator(); rankeduser.hasNext(); linkedlist.add(entitymapper.fromDbEntity(((Friendship)rankeduser.next()).getPerson()))) { }
        }
        return linkedlist;
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getSocialSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new RankedUserMapper((DaoSession)abstractdaosession, DaoFactory.getInstance().getSocialSession().getBadgeDao());
    }

    public List getAllFitbitUsers()
    {
        return getEntitiesWhereAnd(RankedUserDao.Properties.EncodedId.isNotNull(), new WhereCondition[0]);
    }

    public RankedUser getByEncodedId(String s)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        return (RankedUser)getMapper().fromDbEntity(querybuilder.where(RankedUserDao.Properties.EncodedId.eq(s), new WhereCondition[0]).unique());
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getRankedUserDao();
    }

    public List getInvites()
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(RankedUserDao.Properties.FriendshipStatus.eq(Integer.valueOf(com.fitbit.data.domain.RankedUser.Relation.REQUEST_RECEIVE.ordinal())), new WhereCondition[0]).orderDesc(new Property[] {
            RankedUserDao.Properties.InviteDate
        }).build().list());
    }

    public List getLeaderboard(String s)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        return fromDbEntities(querybuilder.where(querybuilder.or(RankedUserDao.Properties.FriendshipStatus.eq(Integer.valueOf(com.fitbit.data.domain.RankedUser.Relation.FRIEND.ordinal())), RankedUserDao.Properties.EncodedId.eq(s), new WhereCondition[0]), new WhereCondition[0]).orderDesc(new Property[] {
            RankedUserDao.Properties.StepsSummary
        }).build().list());
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.social.RankedUser rankeduser)
    {
        return rankeduser.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.social.RankedUser)obj);
    }

    public List getUnreadInvites()
    {
        return getEntitiesWhereAnd(RankedUserDao.Properties.IsNewInvite.eq(Boolean.valueOf(true)), new WhereCondition[0]);
    }

    public RankedUser getUserByInviteId(long l)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        return (RankedUser)getMapper().fromDbEntity(querybuilder.where(RankedUserDao.Properties.InviteId.eq(Long.valueOf(l)), new WhereCondition[0]).unique());
    }

    public List getUserFriends(String s)
    {
        return getUserFriends((com.fitbit.data.repo.greendao.social.RankedUser)getEntityDao().queryBuilder().where(RankedUserDao.Properties.EncodedId.eq(s), new WhereCondition[0]).unique());
    }

    public List getUserFriendsByInviteId(long l)
    {
        return getUserFriends((com.fitbit.data.repo.greendao.social.RankedUser)getEntityDao().queryBuilder().where(RankedUserDao.Properties.InviteId.eq(Long.valueOf(l)), new WhereCondition[0]).unique());
    }

    public List getUsersOnFitbit()
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        return fromDbEntities(querybuilder.where(RankedUserDao.Properties.EncodedId.isNotNull(), new WhereCondition[] {
            RankedUserDao.Properties.FriendshipStatus.notEq(Integer.valueOf(com.fitbit.data.domain.RankedUser.Relation.FRIEND.ordinal())), RankedUserDao.Properties.FriendshipStatus.notEq(Integer.valueOf(com.fitbit.data.domain.RankedUser.Relation.REQUEST_RECEIVE.ordinal())), querybuilder.or(RankedUserDao.Properties.FriendshipStatus.eq(Integer.valueOf(com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT.ordinal())), RankedUserDao.Properties.IsFromContactBook.eq(Boolean.valueOf(true)), new WhereCondition[] {
                RankedUserDao.Properties.IsFromFacebook.eq(Boolean.valueOf(true))
            })
        }).build().list());
    }

    public List getUsersOutOfFitbit()
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(RankedUserDao.Properties.EncodedId.isNull(), new WhereCondition[] {
            RankedUserDao.Properties.FriendshipStatus.notEq(Integer.valueOf(com.fitbit.data.domain.RankedUser.Relation.FRIEND.ordinal())), RankedUserDao.Properties.FriendshipStatus.notEq(Integer.valueOf(com.fitbit.data.domain.RankedUser.Relation.REQUEST_RECEIVE.ordinal()))
        }).build().list());
    }

    public boolean hasNewInvites()
    {
        return getEntitiesWhereAnd(RankedUserDao.Properties.IsNewInvite.eq(Boolean.valueOf(true)), new WhereCondition[0]).size() > 0;
    }
}
