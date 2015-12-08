// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.PendingPlan;
import com.fitbit.data.repo.al;
import com.fitbit.data.repo.greendao.mapping.DietPlanMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.PendingPlanMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            EntityWithDietPlanGreenDaoRepository, DaoSession, PendingPlan

public class PendingPlanGreenDaoRepository extends EntityWithDietPlanGreenDaoRepository
    implements al
{

    public PendingPlanGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        setDietPlanMapper(new DietPlanMapper());
        return new PendingPlanMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        abstractdaosession = (DaoSession)abstractdaosession;
        setDietPlanDao(abstractdaosession.getDietPlanDao());
        return abstractdaosession.getPendingPlanDao();
    }

    public PendingPlan getPendingPlan()
    {
        List list = getAll();
        if (list.isEmpty())
        {
            return null;
        }
        if (list.size() == 1)
        {
            return (PendingPlan)list.get(0);
        } else
        {
            throw new IllegalStateException("There are multiple pending plans at the repository");
        }
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.PendingPlan pendingplan)
    {
        return pendingplan.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.PendingPlan)obj);
    }

    public void resetPendingPlan()
    {
        PendingPlan pendingplan = getPendingPlan();
        if (pendingplan != null)
        {
            delete(pendingplan);
        }
    }

    public void setPendingPlan(PendingPlan pendingplan)
    {
        PendingPlan pendingplan1 = getPendingPlan();
        if (pendingplan1 != null)
        {
            pendingplan.setEntityId(pendingplan1.getEntityId());
            save(pendingplan);
            return;
        } else
        {
            add(pendingplan);
            return;
        }
    }
}
