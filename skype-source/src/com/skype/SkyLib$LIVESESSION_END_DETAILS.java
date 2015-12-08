// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            SkyLib

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY;
    public static final RY LED_HOST_WENT_OFFLINE;
    public static final RY LED_LOCAL_USER_TERMINATED_DURING_RECOVERY;
    public static final  LED_NO_LOCAL_CONNECTIVITY;
    public static final  LED_NO_REMOTE_CONNECTIVITY;
    public static final  LED_RECOVERY_UNSUCCESSFUL;
    public static final  LED_REMOTE_USER_TERMINATED_DURING_RECOVERY;
    public static final Y WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$LIVESESSION_END_DETAILS, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        LED_NO_LOCAL_CONNECTIVITY = new <init>("LED_NO_LOCAL_CONNECTIVITY", 0, 1);
        LED_NO_REMOTE_CONNECTIVITY = new <init>("LED_NO_REMOTE_CONNECTIVITY", 1, 2);
        LED_RECOVERY_UNSUCCESSFUL = new <init>("LED_RECOVERY_UNSUCCESSFUL", 2, 4);
        LED_LOCAL_USER_TERMINATED_DURING_RECOVERY = new <init>("LED_LOCAL_USER_TERMINATED_DURING_RECOVERY", 3, 8);
        LED_REMOTE_USER_TERMINATED_DURING_RECOVERY = new <init>("LED_REMOTE_USER_TERMINATED_DURING_RECOVERY", 4, 16);
        LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY = new <init>("LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY", 5, 32);
        LED_HOST_WENT_OFFLINE = new <init>("LED_HOST_WENT_OFFLINE", 6, 64);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            LED_NO_LOCAL_CONNECTIVITY, LED_NO_REMOTE_CONNECTIVITY, LED_RECOVERY_UNSUCCESSFUL, LED_LOCAL_USER_TERMINATED_DURING_RECOVERY, LED_REMOTE_USER_TERMINATED_DURING_RECOVERY, LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY, LED_HOST_WENT_OFFLINE, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
