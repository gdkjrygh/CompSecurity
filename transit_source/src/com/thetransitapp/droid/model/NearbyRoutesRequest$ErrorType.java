// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


// Referenced classes of package com.thetransitapp.droid.model:
//            NearbyRoutesRequest

public static final class A extends Enum
{

    private static final TIME_DELTA_OUT ENUM$VALUES[];
    public static final TIME_DELTA_OUT LINES_INACTIVE;
    public static final TIME_DELTA_OUT MESSAGE;
    public static final TIME_DELTA_OUT NO_INTERNET;
    public static final TIME_DELTA_OUT NO_NEARBY_STOPS;
    public static final TIME_DELTA_OUT OUT_OF_SERVICE;
    public static final TIME_DELTA_OUT REGION_IN_MAINTENANCE;
    public static final TIME_DELTA_OUT REGION_UNSUPPORTED;
    public static final TIME_DELTA_OUT TIMEOUT;
    public static final TIME_DELTA_OUT TIME_DELTA_OUT;
    public static final TIME_DELTA_OUT UNAUTHORIZED;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType, s);
    }

    public static A[] values()
    {
        A aa[] = ENUM$VALUES;
        int i = aa.length;
        A aa1[] = new ENUM.VALUES[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    static 
    {
        REGION_UNSUPPORTED = new <init>("REGION_UNSUPPORTED", 0);
        NO_NEARBY_STOPS = new <init>("NO_NEARBY_STOPS", 1);
        LINES_INACTIVE = new <init>("LINES_INACTIVE", 2);
        REGION_IN_MAINTENANCE = new <init>("REGION_IN_MAINTENANCE", 3);
        OUT_OF_SERVICE = new <init>("OUT_OF_SERVICE", 4);
        UNAUTHORIZED = new <init>("UNAUTHORIZED", 5);
        MESSAGE = new <init>("MESSAGE", 6);
        TIMEOUT = new <init>("TIMEOUT", 7);
        NO_INTERNET = new <init>("NO_INTERNET", 8);
        TIME_DELTA_OUT = new <init>("TIME_DELTA_OUT", 9);
        ENUM$VALUES = (new ENUM.VALUES[] {
            REGION_UNSUPPORTED, NO_NEARBY_STOPS, LINES_INACTIVE, REGION_IN_MAINTENANCE, OUT_OF_SERVICE, UNAUTHORIZED, MESSAGE, TIMEOUT, NO_INTERNET, TIME_DELTA_OUT
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
