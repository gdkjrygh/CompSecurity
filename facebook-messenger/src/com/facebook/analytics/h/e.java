// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.h;


public final class e extends Enum
{

    private static final e $VALUES[];
    public static final e BACKGROUNDED;
    public static final e CLOCK_CHANGE;
    public static final e FOREGROUNDED;
    public static final e IGNORE;
    public static final e USER_ACTION;

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/analytics/h/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    static 
    {
        FOREGROUNDED = new e("FOREGROUNDED", 0);
        USER_ACTION = new e("USER_ACTION", 1);
        BACKGROUNDED = new e("BACKGROUNDED", 2);
        CLOCK_CHANGE = new e("CLOCK_CHANGE", 3);
        IGNORE = new e("IGNORE", 4);
        $VALUES = (new e[] {
            FOREGROUNDED, USER_ACTION, BACKGROUNDED, CLOCK_CHANGE, IGNORE
        });
    }
}
