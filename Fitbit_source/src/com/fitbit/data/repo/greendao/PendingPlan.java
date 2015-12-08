// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.DaoException;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoSession, PendingPlanDao, DietPlanDao, DietPlan

public class PendingPlan
{

    private Double current;
    private Boolean currentWeightChanged;
    private transient DaoSession daoSession;
    private Double desired;
    private DietPlan dietPlan;
    private Long dietPlanId;
    private Long dietPlan__resolvedKey;
    private Boolean goalChanged;
    private Long id;
    private transient PendingPlanDao myDao;
    private Double startingWeight;
    private String units;

    public PendingPlan()
    {
    }

    public PendingPlan(Long long1)
    {
        id = long1;
    }

    public PendingPlan(Long long1, String s, Double double1, Double double2, Double double3, Boolean boolean1, Boolean boolean2, 
            Long long2)
    {
        id = long1;
        units = s;
        current = double1;
        desired = double2;
        startingWeight = double3;
        currentWeightChanged = boolean1;
        goalChanged = boolean2;
        dietPlanId = long2;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getPendingPlanDao();
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

    public Double getCurrent()
    {
        return current;
    }

    public Boolean getCurrentWeightChanged()
    {
        return currentWeightChanged;
    }

    public Double getDesired()
    {
        return desired;
    }

    public DietPlan getDietPlan()
    {
        Long long1 = dietPlanId;
        if (dietPlan__resolvedKey != null && dietPlan__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        DietPlan dietplan = (DietPlan)daoSession.getDietPlanDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        dietPlan = dietplan;
        dietPlan__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return dietPlan;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getDietPlanId()
    {
        return dietPlanId;
    }

    public Boolean getGoalChanged()
    {
        return goalChanged;
    }

    public Long getId()
    {
        return id;
    }

    public Double getStartingWeight()
    {
        return startingWeight;
    }

    public String getUnits()
    {
        return units;
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

    public void setCurrent(Double double1)
    {
        current = double1;
    }

    public void setCurrentWeightChanged(Boolean boolean1)
    {
        currentWeightChanged = boolean1;
    }

    public void setDesired(Double double1)
    {
        desired = double1;
    }

    public void setDietPlan(DietPlan dietplan)
    {
        this;
        JVM INSTR monitorenter ;
        dietPlan = dietplan;
        if (dietplan != null) goto _L2; else goto _L1
_L1:
        dietplan = null;
_L4:
        dietPlanId = dietplan;
        dietPlan__resolvedKey = dietPlanId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        dietplan = dietplan.getId();
        if (true) goto _L4; else goto _L3
_L3:
        dietplan;
        this;
        JVM INSTR monitorexit ;
        throw dietplan;
    }

    public void setDietPlanId(Long long1)
    {
        dietPlanId = long1;
    }

    public void setGoalChanged(Boolean boolean1)
    {
        goalChanged = boolean1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setStartingWeight(Double double1)
    {
        startingWeight = double1;
    }

    public void setUnits(String s)
    {
        units = s;
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
