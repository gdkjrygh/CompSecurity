// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;


// Referenced classes of package com.urbanairship:
//            AirshipConfigOptions

public static final class _cls9 extends Enum
{

    private static final HYBRID $VALUES[];
    public static final HYBRID GCM;
    public static final HYBRID HELIUM;
    public static final HYBRID HYBRID;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/urbanairship/AirshipConfigOptions$TransportType, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        HELIUM = new <init>("HELIUM", 0);
        GCM = new <init>("GCM", 1);
        HYBRID = new <init>("HYBRID", 2);
        $VALUES = (new .VALUES[] {
            HELIUM, GCM, HYBRID
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
