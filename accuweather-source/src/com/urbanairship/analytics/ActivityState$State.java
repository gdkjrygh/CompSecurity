// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;


// Referenced classes of package com.urbanairship.analytics:
//            ActivityState

private static final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE NONE;
    public static final NONE STARTED;
    public static final NONE STOPPED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/urbanairship/analytics/ActivityState$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STARTED = new <init>("STARTED", 0);
        STOPPED = new <init>("STOPPED", 1);
        NONE = new <init>("NONE", 2);
        $VALUES = (new .VALUES[] {
            STARTED, STOPPED, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
