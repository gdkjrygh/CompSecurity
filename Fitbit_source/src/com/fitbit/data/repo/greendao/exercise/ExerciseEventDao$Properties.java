// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            ExerciseEventDao

public static class 
{

    public static final Property Accuracy = new Property(9, java/lang/Float, "accuracy", false, "ACCURACY");
    public static final Property Altitude = new Property(10, java/lang/Double, "altitude", false, "ALTITUDE");
    public static final Property Bearing = new Property(11, java/lang/Float, "bearing", false, "BEARING");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property Label = new Property(13, java/lang/String, "label", false, "LABEL");
    public static final Property Latitude = new Property(7, java/lang/Double, "latitude", false, "LATITUDE");
    public static final Property Longitude = new Property(8, java/lang/Double, "longitude", false, "LONGITUDE");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property SessionId = new Property(14, java/lang/String, "sessionId", false, "SESSION_ID");
    public static final Property Speed = new Property(12, java/lang/Float, "speed", false, "SPEED");
    public static final Property Time = new Property(6, java/util/Date, "time", false, "TIME");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


    public ()
    {
    }
}
