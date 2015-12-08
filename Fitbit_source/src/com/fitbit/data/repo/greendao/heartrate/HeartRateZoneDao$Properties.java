// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.heartrate;

import de.greenrobot.dao.Property;

// Referenced classes of package com.fitbit.data.repo.greendao.heartrate:
//            HeartRateZoneDao

public static class I
{

    public static final Property CaloriesOut = new Property(6, java/lang/Double, "caloriesOut", false, "CALORIES_OUT");
    public static final Property HighValue = new Property(1, java/lang/Integer, "highValue", false, "HIGH_VALUE");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property LowValue = new Property(2, java/lang/Integer, "lowValue", false, "LOW_VALUE");
    public static final Property Name = new Property(3, java/lang/String, "name", false, "NAME");
    public static final Property SummaryId = new Property(7, java/lang/Long, "summaryId", false, "SUMMARY_ID");
    public static final Property TimeInZone = new Property(4, java/lang/Integer, "timeInZone", false, "TIME_IN_ZONE");
    public static final Property Type = new Property(5, java/lang/String, "type", false, "TYPE");


    public I()
    {
    }
}
