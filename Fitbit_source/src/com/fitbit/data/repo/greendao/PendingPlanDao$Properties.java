// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.Property;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            PendingPlanDao

public static class 
{

    public static final Property Current = new Property(2, java/lang/Double, "current", false, "CURRENT");
    public static final Property CurrentWeightChanged = new Property(5, java/lang/Boolean, "currentWeightChanged", false, "CURRENT_WEIGHT_CHANGED");
    public static final Property Desired = new Property(3, java/lang/Double, "desired", false, "DESIRED");
    public static final Property DietPlanId = new Property(7, java/lang/Long, "dietPlanId", false, "DIET_PLAN_ID");
    public static final Property GoalChanged = new Property(6, java/lang/Boolean, "goalChanged", false, "GOAL_CHANGED");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property StartingWeight = new Property(4, java/lang/Double, "startingWeight", false, "STARTING_WEIGHT");
    public static final Property Units = new Property(1, java/lang/String, "units", false, "UNITS");


    public ()
    {
    }
}
