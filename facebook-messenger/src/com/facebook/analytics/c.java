// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c ACTIVE;
    public static final c BACKGROUNDED;
    public static final c FOREGROUNDED;
    public static final c INIT;
    public static final c LAUNCH;
    public static final c RESIGN;
    private String stateName;

    private c(String s, int i, String s1)
    {
        super(s, i);
        stateName = s1;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/analytics/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    public String toString()
    {
        return stateName;
    }

    static 
    {
        INIT = new c("INIT", 0, "init");
        LAUNCH = new c("LAUNCH", 1, "launch");
        ACTIVE = new c("ACTIVE", 2, "active");
        RESIGN = new c("RESIGN", 3, "resign");
        FOREGROUNDED = new c("FOREGROUNDED", 4, "foreground");
        BACKGROUNDED = new c("BACKGROUNDED", 5, "background");
        $VALUES = (new c[] {
            INIT, LAUNCH, ACTIVE, RESIGN, FOREGROUNDED, BACKGROUNDED
        });
    }
}
