// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.FriendshipMapper;
import com.fitbit.data.repo.y;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            DaoSession, Friendship

public class FriendshipGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements y
{

    public FriendshipGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getSocialSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new FriendshipMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getFriendshipDao();
    }

    public List getFriendships(long l)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        return fromDbEntities(querybuilder.where(querybuilder.or(FriendshipDao.Properties.LeftId.eq(Long.valueOf(l)), FriendshipDao.Properties.RightId.eq(Long.valueOf(l)), new WhereCondition[0]), new WhereCondition[0]).build().list());
    }

    protected Long getPkFrom(Friendship friendship)
    {
        return friendship.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((Friendship)obj);
    }
}
