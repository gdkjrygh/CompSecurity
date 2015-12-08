// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;


public final class  extends Enum
{

    private static final EVENT $VALUES[];
    public static final EVENT EVENT;
    public static final EVENT VIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/analytics/AnalyticsConstants$EVENT_TYPE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VIEW = new <init>("VIEW", 0);
        EVENT = new <init>("EVENT", 1);
        $VALUES = (new .VALUES[] {
            VIEW, EVENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
