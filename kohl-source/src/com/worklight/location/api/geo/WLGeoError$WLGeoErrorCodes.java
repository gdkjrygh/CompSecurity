// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;


// Referenced classes of package com.worklight.location.api.geo:
//            WLGeoError

public static final class  extends Enum
{

    private static final TIMEOUT $VALUES[];
    public static final TIMEOUT PERMISSION_DENIED;
    public static final TIMEOUT POSITION_UNAVAILABLE;
    public static final TIMEOUT TIMEOUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/worklight/location/api/geo/WLGeoError$WLGeoErrorCodes, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PERMISSION_DENIED = new <init>("PERMISSION_DENIED", 0);
        POSITION_UNAVAILABLE = new <init>("POSITION_UNAVAILABLE", 1);
        TIMEOUT = new <init>("TIMEOUT", 2);
        $VALUES = (new .VALUES[] {
            PERMISSION_DENIED, POSITION_UNAVAILABLE, TIMEOUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
