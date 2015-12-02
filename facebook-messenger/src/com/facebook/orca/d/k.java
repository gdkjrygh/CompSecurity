// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;


public final class k extends Enum
{

    private static final k $VALUES[];
    public static final k PLAYBACK_COMPLETED;
    public static final k PLAYBACK_ERROR;
    public static final k PLAYBACK_POSITION_UPDATED;
    public static final k PLAYBACK_STARTED;
    public static final k PLAYBACK_STOPPED;

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/facebook/orca/d/k, s);
    }

    public static k[] values()
    {
        return (k[])$VALUES.clone();
    }

    static 
    {
        PLAYBACK_STARTED = new k("PLAYBACK_STARTED", 0);
        PLAYBACK_ERROR = new k("PLAYBACK_ERROR", 1);
        PLAYBACK_STOPPED = new k("PLAYBACK_STOPPED", 2);
        PLAYBACK_COMPLETED = new k("PLAYBACK_COMPLETED", 3);
        PLAYBACK_POSITION_UPDATED = new k("PLAYBACK_POSITION_UPDATED", 4);
        $VALUES = (new k[] {
            PLAYBACK_STARTED, PLAYBACK_ERROR, PLAYBACK_STOPPED, PLAYBACK_COMPLETED, PLAYBACK_POSITION_UPDATED
        });
    }
}
