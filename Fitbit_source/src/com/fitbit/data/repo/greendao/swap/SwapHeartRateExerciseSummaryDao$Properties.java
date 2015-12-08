// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            SwapHeartRateExerciseSummaryDao

public static class 
{

    public static final Property AverageHeartRate = new Property(2, java/lang/Integer, "averageHeartRate", false, "AVERAGE_HEART_RATE");
    public static final Property DateTime = new Property(1, java/util/Date, "dateTime", false, "DATE_TIME");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property RestingHeartRate = new Property(3, java/lang/Integer, "restingHeartRate", false, "RESTING_HEART_RATE");


    public ()
    {
    }
}
