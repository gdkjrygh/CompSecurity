// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


public final class ApplicationState extends Enum
{

    public static final ApplicationState BACKGROUND_UX_ACTIVE;
    public static final ApplicationState FOREGROUND;
    public static final ApplicationState INACTIVE;
    private static final ApplicationState a[];

    private ApplicationState(String s, int i)
    {
        super(s, i);
    }

    public static ApplicationState valueOf(String s)
    {
        return (ApplicationState)Enum.valueOf(com/comscore/analytics/ApplicationState, s);
    }

    public static ApplicationState[] values()
    {
        return (ApplicationState[])a.clone();
    }

    static 
    {
        INACTIVE = new ApplicationState("INACTIVE", 0);
        BACKGROUND_UX_ACTIVE = new ApplicationState("BACKGROUND_UX_ACTIVE", 1);
        FOREGROUND = new ApplicationState("FOREGROUND", 2);
        a = (new ApplicationState[] {
            INACTIVE, BACKGROUND_UX_ACTIVE, FOREGROUND
        });
    }
}
