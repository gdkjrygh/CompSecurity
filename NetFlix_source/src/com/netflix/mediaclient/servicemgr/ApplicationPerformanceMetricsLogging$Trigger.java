// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ApplicationPerformanceMetricsLogging

public static final class  extends Enum
{

    private static final resumeFromBackground $VALUES[];
    public static final resumeFromBackground appStart;
    public static final resumeFromBackground inputEvent;
    public static final resumeFromBackground resumeFromBackground;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$Trigger, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        appStart = new <init>("appStart", 0);
        inputEvent = new <init>("inputEvent", 1);
        resumeFromBackground = new <init>("resumeFromBackground", 2);
        $VALUES = (new .VALUES[] {
            appStart, inputEvent, resumeFromBackground
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
