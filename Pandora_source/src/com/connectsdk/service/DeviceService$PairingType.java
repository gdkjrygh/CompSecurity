// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;


// Referenced classes of package com.connectsdk.service:
//            DeviceService

public static final class  extends Enum
{

    private static final PIN_CODE $VALUES[];
    public static final PIN_CODE FIRST_SCREEN;
    public static final PIN_CODE NONE;
    public static final PIN_CODE PIN_CODE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/connectsdk/service/DeviceService$PairingType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        FIRST_SCREEN = new <init>("FIRST_SCREEN", 1);
        PIN_CODE = new <init>("PIN_CODE", 2);
        $VALUES = (new .VALUES[] {
            NONE, FIRST_SCREEN, PIN_CODE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
