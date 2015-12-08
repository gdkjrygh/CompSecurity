// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;


// Referenced classes of package com.snapchat.android.api2:
//            IpRoutingErrorTask

public static final class  extends Enum
{

    private static final JSON_ERROR $VALUES[];
    public static final JSON_ERROR JSON_ERROR;
    public static final JSON_ERROR NETWORK_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/api2/IpRoutingErrorTask$ErrorType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 0);
        JSON_ERROR = new <init>("JSON_ERROR", 1);
        $VALUES = (new .VALUES[] {
            NETWORK_ERROR, JSON_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
