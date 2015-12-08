// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            GoalDao

public static class 
{

    public static final Property DueDate = new Property(16, java/util/Date, "dueDate", false, "DUE_DATE");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property Frequency = new Property(14, java/lang/String, "frequency", false, "FREQUENCY");
    public static final Property GoalJson = new Property(13, java/lang/String, "goalJson", false, "GOAL_JSON");
    public static final Property GoalType = new Property(19, java/lang/String, "goalType", false, "GOAL_TYPE");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property IsActive = new Property(17, java/lang/Boolean, "isActive", false, "IS_ACTIVE");
    public static final Property Result = new Property(10, java/lang/Double, "result", false, "RESULT");
    public static final Property ResultMeasurement = new Property(9, java/lang/String, "resultMeasurement", false, "RESULT_MEASUREMENT");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property Start = new Property(12, java/lang/Double, "start", false, "START");
    public static final Property StartDate = new Property(15, java/util/Date, "startDate", false, "START_DATE");
    public static final Property StartMeasurement = new Property(11, java/lang/String, "startMeasurement", false, "START_MEASUREMENT");
    public static final Property Status = new Property(6, java/lang/Integer, "status", false, "STATUS");
    public static final Property Target = new Property(8, java/lang/Double, "target", false, "TARGET");
    public static final Property TargetMeasurement = new Property(7, java/lang/String, "targetMeasurement", false, "TARGET_MEASUREMENT");
    public static final Property TargetTimeUpdated = new Property(18, java/util/Date, "targetTimeUpdated", false, "TARGET_TIME_UPDATED");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


    public ()
    {
    }
}
