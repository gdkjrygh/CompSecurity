// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ApplicationPerformanceMetricsLogging

public static final class  extends Enum
{

    private static final appClose $VALUES[];
    public static final appClose appClose;
    public static final appClose timeout;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$EndReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        timeout = new <init>("timeout", 0);
        appClose = new <init>("appClose", 1);
        $VALUES = (new .VALUES[] {
            timeout, appClose
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
