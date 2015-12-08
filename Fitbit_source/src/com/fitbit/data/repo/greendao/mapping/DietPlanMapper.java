// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.DietPlan;
import com.fitbit.util.w;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class DietPlanMapper
    implements EntityMapper
{

    public DietPlanMapper()
    {
    }

    public DietPlan fromDbEntity(com.fitbit.data.repo.greendao.DietPlan dietplan)
    {
        if (dietplan == null)
        {
            return null;
        } else
        {
            DietPlan dietplan1 = new DietPlan();
            dietplan1.setEntityId(dietplan.getId());
            dietplan1.a(dietplan.getCaloriesDeficitPerDay().intValue());
            dietplan1.a(dietplan.getEstimateDate());
            dietplan1.a((com.fitbit.data.domain.DietPlan.IntensityLevel)w.a(dietplan.getPlanIntensity(), com/fitbit/data/domain/DietPlan$IntensityLevel));
            com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits = (com.fitbit.data.domain.WeightLogEntry.WeightUnits)w.a(dietplan.getWeightPerWeekUnits(), com/fitbit/data/domain/WeightLogEntry$WeightUnits);
            dietplan1.a((new Weight(dietplan.getWeightPerWeek().doubleValue(), com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG)).a(weightunits));
            dietplan1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(dietplan.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            dietplan1.a(dietplan.getPersonalized().booleanValue());
            return dietplan1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.DietPlan)obj);
    }

    public com.fitbit.data.repo.greendao.DietPlan toDbEntity(DietPlan dietplan)
    {
        return toDbEntity(dietplan, new com.fitbit.data.repo.greendao.DietPlan());
    }

    public com.fitbit.data.repo.greendao.DietPlan toDbEntity(DietPlan dietplan, com.fitbit.data.repo.greendao.DietPlan dietplan1)
    {
        if (dietplan == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.DietPlan dietplan2 = dietplan1;
        if (dietplan1 == null)
        {
            dietplan2 = new com.fitbit.data.repo.greendao.DietPlan();
        }
        if (dietplan2.getId() == null)
        {
            dietplan2.setId(dietplan.getEntityId());
        }
        dietplan2.setCaloriesDeficitPerDay(Integer.valueOf(dietplan.c()));
        dietplan2.setEstimateDate(dietplan.b());
        dietplan2.setPlanIntensity(dietplan.d().getSerializableName());
        dietplan2.setWeightObjective(dietplan.e().getSerializableName());
        dietplan2.setWeightPerWeek(Double.valueOf(dietplan.a().a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b()));
        dietplan2.setWeightPerWeekUnits(((com.fitbit.data.domain.WeightLogEntry.WeightUnits)dietplan.a().a()).getSerializableName());
        dietplan2.setEntityStatus(Integer.valueOf(dietplan.getEntityStatus().getCode()));
        dietplan2.setPersonalized(Boolean.valueOf(dietplan.g()));
        return dietplan2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((DietPlan)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((DietPlan)obj, (com.fitbit.data.repo.greendao.DietPlan)obj1);
    }
}
