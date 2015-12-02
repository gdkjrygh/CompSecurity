// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;


final class y extends Enum
{

    private static final y $VALUES[];
    public static final y FINISHED_ERROR;
    public static final y FINISHED_SUCCESS;
    public static final y IN_PROGRESS;
    public static final y NOT_STARTED;

    private y(String s, int i)
    {
        super(s, i);
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/facebook/orca/prefs/y, s);
    }

    public static y[] values()
    {
        return (y[])$VALUES.clone();
    }

    static 
    {
        NOT_STARTED = new y("NOT_STARTED", 0);
        IN_PROGRESS = new y("IN_PROGRESS", 1);
        FINISHED_SUCCESS = new y("FINISHED_SUCCESS", 2);
        FINISHED_ERROR = new y("FINISHED_ERROR", 3);
        $VALUES = (new y[] {
            NOT_STARTED, IN_PROGRESS, FINISHED_SUCCESS, FINISHED_ERROR
        });
    }
}
