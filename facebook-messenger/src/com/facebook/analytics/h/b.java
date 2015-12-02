// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.h;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b CLOCK_RESET;
    public static final b FORCE;
    public static final b FORCE_RESET;
    public static final b PASSIVE;

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/analytics/h/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        FORCE = new b("FORCE", 0);
        FORCE_RESET = new b("FORCE_RESET", 1);
        PASSIVE = new b("PASSIVE", 2);
        CLOCK_RESET = new b("CLOCK_RESET", 3);
        $VALUES = (new b[] {
            FORCE, FORCE_RESET, PASSIVE, CLOCK_RESET
        });
    }
}
