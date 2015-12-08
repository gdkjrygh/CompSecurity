// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            MostRecentActivityDao

public static class 
{

    public static final Property Calories = new Property(6, java/lang/Integer, "calories", false, "CALORIES");
    public static final Property Date = new Property(12, java/util/Date, "date", false, "DATE");
    public static final Property Description = new Property(7, java/lang/String, "description", false, "DESCRIPTION");
    public static final Property Distance = new Property(8, java/lang/Double, "distance", false, "DISTANCE");
    public static final Property Duration = new Property(9, java/lang/Integer, "duration", false, "DURATION");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property Group = new Property(11, java/lang/String, "group", false, "GROUP");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property Name = new Property(10, java/lang/String, "name", false, "NAME");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


    public ()
    {
    }
}
