// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;


public final class al extends Enum
{

    private static final al $VALUES[];
    public static final al CORE;
    public static final al CORE_AND_SAMPLED;
    public static final al NONE;
    public static final al UNSET;

    private al(String s, int i)
    {
        super(s, i);
    }

    public static al valueOf(String s)
    {
        return (al)Enum.valueOf(com/facebook/analytics/al, s);
    }

    public static al[] values()
    {
        return (al[])$VALUES.clone();
    }

    static 
    {
        NONE = new al("NONE", 0);
        CORE = new al("CORE", 1);
        CORE_AND_SAMPLED = new al("CORE_AND_SAMPLED", 2);
        UNSET = new al("UNSET", 3);
        $VALUES = (new al[] {
            NONE, CORE, CORE_AND_SAMPLED, UNSET
        });
    }
}
