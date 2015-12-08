// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;


public final class  extends Enum
{

    public static final AD_REQUEST AD_REQUEST;
    private static final AD_REQUEST b[];
    private final double a = 0.10000000000000001D;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mopub/common/event/BaseEvent$SamplingRate, s);
    }

    public static [] values()
    {
        return ([])b.clone();
    }

    public final double getSamplingRate()
    {
        return a;
    }

    static 
    {
        AD_REQUEST = new <init>("AD_REQUEST");
        b = (new b[] {
            AD_REQUEST
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
