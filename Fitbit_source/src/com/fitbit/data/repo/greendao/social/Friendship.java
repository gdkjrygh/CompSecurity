// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import de.greenrobot.dao.DaoException;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            DaoSession, FriendshipDao, RankedUserDao, RankedUser

public class Friendship
{

    private transient DaoSession daoSession;
    private Long id;
    private Long leftId;
    private transient FriendshipDao myDao;
    private RankedUser person;
    private Long person__resolvedKey;
    private Long rightId;

    public Friendship()
    {
    }

    public Friendship(Long long1)
    {
        id = long1;
    }

    public Friendship(Long long1, Long long2, Long long3)
    {
        id = long1;
        leftId = long2;
        rightId = long3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getFriendshipDao();
        } else
        {
            daosession = null;
        }
        myDao = daosession;
    }

    public void delete()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.delete(this);
            return;
        }
    }

    public Long getId()
    {
        return id;
    }

    public Long getLeftId()
    {
        return leftId;
    }

    public RankedUser getPerson()
    {
        Long long1 = rightId;
        if (person__resolvedKey != null && person__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        RankedUser rankeduser = (RankedUser)daoSession.getRankedUserDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        person = rankeduser;
        person__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return person;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getRightId()
    {
        return rightId;
    }

    public void refresh()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.refresh(this);
            return;
        }
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLeftId(Long long1)
    {
        leftId = long1;
    }

    public void setPerson(RankedUser rankeduser)
    {
        this;
        JVM INSTR monitorenter ;
        person = rankeduser;
        if (rankeduser != null) goto _L2; else goto _L1
_L1:
        rankeduser = null;
_L4:
        rightId = rankeduser;
        person__resolvedKey = rightId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rankeduser = rankeduser.getId();
        if (true) goto _L4; else goto _L3
_L3:
        rankeduser;
        this;
        JVM INSTR monitorexit ;
        throw rankeduser;
    }

    public void setRightId(Long long1)
    {
        rightId = long1;
    }

    public void update()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.update(this);
            return;
        }
    }
}
