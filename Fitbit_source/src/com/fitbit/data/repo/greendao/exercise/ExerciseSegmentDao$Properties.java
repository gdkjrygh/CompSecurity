// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            ExerciseSegmentDao

public static class 
{

    public static final Property EndEventId = new Property(10, java/lang/Long, "endEventId", false, "END_EVENT_ID");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property SessionId = new Property(8, java/lang/String, "sessionId", false, "SESSION_ID");
    public static final Property StartEventId = new Property(9, java/lang/Long, "startEventId", false, "START_EVENT_ID");
    public static final Property StartTime = new Property(6, java/util/Date, "startTime", false, "START_TIME");
    public static final Property StopTime = new Property(7, java/util/Date, "stopTime", false, "STOP_TIME");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


    public ()
    {
    }
}
