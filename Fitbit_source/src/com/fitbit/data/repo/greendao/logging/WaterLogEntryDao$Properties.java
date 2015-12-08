// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            WaterLogEntryDao

public static class 
{

    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property LogDate = new Property(8, java/util/Date, "logDate", false, "LOG_DATE");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property TrackerType = new Property(7, java/lang/String, "trackerType", false, "TRACKER_TYPE");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
    public static final Property Value = new Property(6, java/lang/Double, "value", false, "VALUE");


    public ()
    {
    }
}
