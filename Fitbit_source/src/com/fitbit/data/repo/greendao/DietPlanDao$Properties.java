// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DietPlanDao

public static class 
{

    public static final Property CaloriesDeficitPerDay = new Property(4, java/lang/Integer, "caloriesDeficitPerDay", false, "CALORIES_DEFICIT_PER_DAY");
    public static final Property EntityStatus = new Property(7, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property EstimateDate = new Property(3, java/util/Date, "estimateDate", false, "ESTIMATE_DATE");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property Personalized = new Property(8, java/lang/Boolean, "personalized", false, "PERSONALIZED");
    public static final Property PlanIntensity = new Property(5, java/lang/String, "planIntensity", false, "PLAN_INTENSITY");
    public static final Property WeightObjective = new Property(6, java/lang/String, "weightObjective", false, "WEIGHT_OBJECTIVE");
    public static final Property WeightPerWeek = new Property(2, java/lang/Double, "weightPerWeek", false, "WEIGHT_PER_WEEK");
    public static final Property WeightPerWeekUnits = new Property(1, java/lang/String, "weightPerWeekUnits", false, "WEIGHT_PER_WEEK_UNITS");


    public ()
    {
    }
}
