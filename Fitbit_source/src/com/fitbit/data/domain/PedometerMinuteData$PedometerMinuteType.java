// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            PedometerMinuteData

public static final class code extends Enum
{

    private static final RUNNING $VALUES[];
    public static final RUNNING RUNNING;
    public static final RUNNING WALKING;
    private final int code;

    public static code valueOf(int i)
    {
        code acode[] = values();
        int k = acode.length;
        for (int j = 0; j < k; j++)
        {
            code code1 = acode[j];
            if (code1.getCode() == i)
            {
                return code1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static getCode valueOf(String s)
    {
        return (getCode)Enum.valueOf(com/fitbit/data/domain/PedometerMinuteData$PedometerMinuteType, s);
    }

    public static getCode[] values()
    {
        return (getCode[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    static 
    {
        WALKING = new <init>("WALKING", 0, 0);
        RUNNING = new <init>("RUNNING", 1, 1);
        $VALUES = (new .VALUES[] {
            WALKING, RUNNING
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
