// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;


// Referenced classes of package com.urbanairship.analytics:
//            LocationEvent

public static final class _cls9 extends Enum
{

    private static final SINGLE $VALUES[];
    public static final SINGLE CONTINUOUS;
    public static final SINGLE SINGLE;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/urbanairship/analytics/LocationEvent$UpdateType, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        CONTINUOUS = new <init>("CONTINUOUS", 0);
        SINGLE = new <init>("SINGLE", 1);
        $VALUES = (new .VALUES[] {
            CONTINUOUS, SINGLE
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
