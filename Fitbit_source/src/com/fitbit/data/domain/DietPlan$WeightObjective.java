// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            s, DietPlan

public static final class serializableName extends Enum
    implements s
{

    private static final GAIN $VALUES[];
    public static final GAIN GAIN;
    public static final GAIN LOSE;
    public static final GAIN MAINTAIN;
    private final String serializableName;

    public static serializableName valueOf(String s1)
    {
        return (serializableName)Enum.valueOf(com/fitbit/data/domain/DietPlan$WeightObjective, s1);
    }

    public static serializableName[] values()
    {
        return (serializableName[])$VALUES.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        LOSE = new <init>("LOSE", 0, "LOSE");
        MAINTAIN = new <init>("MAINTAIN", 1, "MAINTAIN");
        GAIN = new <init>("GAIN", 2, "GAIN");
        $VALUES = (new .VALUES[] {
            LOSE, MAINTAIN, GAIN
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
