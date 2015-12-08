// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;


// Referenced classes of package com.urbanairship.analytics:
//            ActivityMonitor

static final class  extends Enum
{

    private static final AUTO_INSTRUMENTATION $VALUES[];
    public static final AUTO_INSTRUMENTATION AUTO_INSTRUMENTATION;
    public static final AUTO_INSTRUMENTATION MANUAL_INSTRUMENTATION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/urbanairship/analytics/ActivityMonitor$Source, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MANUAL_INSTRUMENTATION = new <init>("MANUAL_INSTRUMENTATION", 0);
        AUTO_INSTRUMENTATION = new <init>("AUTO_INSTRUMENTATION", 1);
        $VALUES = (new .VALUES[] {
            MANUAL_INSTRUMENTATION, AUTO_INSTRUMENTATION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
