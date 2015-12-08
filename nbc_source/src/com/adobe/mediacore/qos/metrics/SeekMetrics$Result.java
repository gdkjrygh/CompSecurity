// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos.metrics;


// Referenced classes of package com.adobe.mediacore.qos.metrics:
//            SeekMetrics

public static final class  extends Enum
{

    private static final FAIL $VALUES[];
    public static final FAIL FAIL;
    public static final FAIL SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/qos/metrics/SeekMetrics$Result, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        FAIL = new <init>("FAIL", 1);
        $VALUES = (new .VALUES[] {
            SUCCESS, FAIL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
