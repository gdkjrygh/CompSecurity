// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi;


// Referenced classes of package com.worklight.location.api.wifi:
//            WLWifiError

public static final class  extends Enum
{

    private static final FAILED_START_SCAN $VALUES[];
    public static final FAILED_START_SCAN DISABLED;
    public static final FAILED_START_SCAN FAILED_START_SCAN;
    public static final FAILED_START_SCAN PERMISSION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/worklight/location/api/wifi/WLWifiError$WLWifiErrorCodes, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PERMISSION = new <init>("PERMISSION", 0);
        DISABLED = new <init>("DISABLED", 1);
        FAILED_START_SCAN = new <init>("FAILED_START_SCAN", 2);
        $VALUES = (new .VALUES[] {
            PERMISSION, DISABLED, FAILED_START_SCAN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
