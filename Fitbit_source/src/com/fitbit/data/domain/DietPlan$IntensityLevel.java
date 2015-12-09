// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.data.domain:
//            s, DietPlan

public static final class apiName extends Enum
    implements s
{

    private static final HARDER $VALUES[];
    public static final HARDER EASIER;
    public static final HARDER HARDER;
    public static final HARDER KINDA_HARD;
    public static final HARDER MAINTENANCE;
    public static final HARDER MEDIUM;
    private final String apiName;
    private final int nameResId;
    private final String serializableName;

    public static apiName parseByApiName(String s1)
    {
        apiName aapiname[] = values();
        int j = aapiname.length;
        for (int i = 0; i < j; i++)
        {
            apiName apiname = aapiname[i];
            if (apiname.getApiName().equals(s1))
            {
                return apiname;
            }
        }

        return null;
    }

    public static getApiName valueOf(String s1)
    {
        return (getApiName)Enum.valueOf(com/fitbit/data/domain/DietPlan$IntensityLevel, s1);
    }

    public static getApiName[] values()
    {
        return (getApiName[])$VALUES.clone();
    }

    public String getApiName()
    {
        return apiName;
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    public String toString()
    {
        return FitBitApplication.a().getString(nameResId);
    }

    static 
    {
        MAINTENANCE = new <init>("MAINTENANCE", 0, 0x7f08028d, "Maintenance", "MAINTENANCE");
        EASIER = new <init>("EASIER", 1, 0x7f080287, "Low", "EASIER");
        MEDIUM = new <init>("MEDIUM", 2, 0x7f08028e, "Medium", "MEDIUM");
        KINDA_HARD = new <init>("KINDA_HARD", 3, 0x7f080289, "High", "KINDAHARD");
        HARDER = new <init>("HARDER", 4, 0x7f080288, "Extreme", "HARDER");
        $VALUES = (new .VALUES[] {
            MAINTENANCE, EASIER, MEDIUM, KINDA_HARD, HARDER
        });
    }

    private (String s1, int i, int j, String s2, String s3)
    {
        super(s1, i);
        nameResId = j;
        serializableName = s2;
        apiName = s3;
    }
}
