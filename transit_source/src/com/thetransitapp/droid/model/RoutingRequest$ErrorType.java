// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


// Referenced classes of package com.thetransitapp.droid.model:
//            RoutingRequest

public static final class  extends Enum
{

    public static final NO_INTERNET DIRECTION_UNAVAILABLE;
    private static final NO_INTERNET ENUM$VALUES[];
    public static final NO_INTERNET MESSAGE;
    public static final NO_INTERNET NO_INTERNET;
    public static final NO_INTERNET OUT_OF_SERVICE;
    public static final NO_INTERNET REGION_IN_MAINTENANCE;
    public static final NO_INTERNET REGION_UNSUPPORTED;
    public static final NO_INTERNET TIMEOUT;
    public static final NO_INTERNET UNAUTHORIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/model/RoutingRequest$ErrorType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        REGION_UNSUPPORTED = new <init>("REGION_UNSUPPORTED", 0);
        DIRECTION_UNAVAILABLE = new <init>("DIRECTION_UNAVAILABLE", 1);
        REGION_IN_MAINTENANCE = new <init>("REGION_IN_MAINTENANCE", 2);
        OUT_OF_SERVICE = new <init>("OUT_OF_SERVICE", 3);
        UNAUTHORIZED = new <init>("UNAUTHORIZED", 4);
        MESSAGE = new <init>("MESSAGE", 5);
        TIMEOUT = new <init>("TIMEOUT", 6);
        NO_INTERNET = new <init>("NO_INTERNET", 7);
        ENUM$VALUES = (new ENUM.VALUES[] {
            REGION_UNSUPPORTED, DIRECTION_UNAVAILABLE, REGION_IN_MAINTENANCE, OUT_OF_SERVICE, UNAUTHORIZED, MESSAGE, TIMEOUT, NO_INTERNET
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
