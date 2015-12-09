// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;


// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryManager

public static final class  extends Enum
{

    private static final ON $VALUES[];
    public static final ON OFF;
    public static final ON ON;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/connectsdk/discovery/DiscoveryManager$PairingLevel, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OFF = new <init>("OFF", 0);
        ON = new <init>("ON", 1);
        $VALUES = (new .VALUES[] {
            OFF, ON
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
