// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.PendingPlan;
import com.fitbit.util.w;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, DietPlanMapper

public class PendingPlanMapper
    implements EntityMapper
{

    private final DietPlanMapper dietPlanMapper = new DietPlanMapper();

    public PendingPlanMapper()
    {
    }

    private Weight convertDoubleToWeight(Double double1, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        if (double1 == null)
        {
            return null;
        } else
        {
            return (new Weight(double1.doubleValue(), com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG)).a(weightunits);
        }
    }

    private Double convertWeightToDouble(Weight weight)
    {
        if (weight == null)
        {
            return null;
        } else
        {
            return Double.valueOf(weight.a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b());
        }
    }

    public PendingPlan fromDbEntity(com.fitbit.data.repo.greendao.PendingPlan pendingplan)
    {
        if (pendingplan == null)
        {
            return null;
        } else
        {
            PendingPlan pendingplan1 = new PendingPlan();
            pendingplan1.setEntityId(pendingplan.getId());
            pendingplan1.a((com.fitbit.data.domain.WeightLogEntry.WeightUnits)w.a(pendingplan.getUnits(), com/fitbit/data/domain/WeightLogEntry$WeightUnits));
            pendingplan1.a(convertDoubleToWeight(pendingplan.getCurrent(), pendingplan1.c()));
            pendingplan1.b(convertDoubleToWeight(pendingplan.getDesired(), pendingplan1.c()));
            pendingplan1.c(convertDoubleToWeight(pendingplan.getStartingWeight(), pendingplan1.c()));
            pendingplan1.a(dietPlanMapper.fromDbEntity(pendingplan.getDietPlan()));
            pendingplan1.b(pendingplan.getGoalChanged().booleanValue());
            pendingplan1.a(pendingplan.getCurrentWeightChanged().booleanValue());
            return pendingplan1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.PendingPlan)obj);
    }

    public com.fitbit.data.repo.greendao.PendingPlan toDbEntity(PendingPlan pendingplan)
    {
        return toDbEntity(pendingplan, new com.fitbit.data.repo.greendao.PendingPlan());
    }

    public com.fitbit.data.repo.greendao.PendingPlan toDbEntity(PendingPlan pendingplan, com.fitbit.data.repo.greendao.PendingPlan pendingplan1)
    {
        if (pendingplan == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.PendingPlan pendingplan2 = pendingplan1;
        if (pendingplan1 == null)
        {
            pendingplan2 = new com.fitbit.data.repo.greendao.PendingPlan();
        }
        if (pendingplan2.getId() == null)
        {
            pendingplan2.setId(pendingplan.getEntityId());
        }
        pendingplan2.setCurrent(convertWeightToDouble(pendingplan.o()));
        pendingplan2.setDesired(convertWeightToDouble(pendingplan.p()));
        pendingplan2.setStartingWeight(convertWeightToDouble(pendingplan.q()));
        pendingplan2.setDietPlanId(pendingplan.a().getEntityId());
        pendingplan2.setUnits(pendingplan.c().getSerializableName());
        pendingplan2.setCurrentWeightChanged(Boolean.valueOf(pendingplan.d()));
        pendingplan2.setGoalChanged(Boolean.valueOf(pendingplan.e()));
        return pendingplan2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((PendingPlan)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((PendingPlan)obj, (com.fitbit.data.repo.greendao.PendingPlan)obj1);
    }
}
