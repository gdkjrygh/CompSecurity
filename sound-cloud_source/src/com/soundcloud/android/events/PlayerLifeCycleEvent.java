// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


public final class PlayerLifeCycleEvent
{

    public static final int STATE_CREATED = 2;
    public static final int STATE_DESTROYED = 1;
    public static final int STATE_STARTED = 3;
    public static final int STATE_STOPPED = 0;
    private final int kind;

    private PlayerLifeCycleEvent(int i)
    {
        kind = i;
    }

    public static PlayerLifeCycleEvent forCreated()
    {
        return new PlayerLifeCycleEvent(2);
    }

    public static PlayerLifeCycleEvent forDestroyed()
    {
        return new PlayerLifeCycleEvent(1);
    }

    public static PlayerLifeCycleEvent forStarted()
    {
        return new PlayerLifeCycleEvent(3);
    }

    public static PlayerLifeCycleEvent forStopped()
    {
        return new PlayerLifeCycleEvent(0);
    }

    public final int getKind()
    {
        return kind;
    }

    public final boolean isServiceRunning()
    {
        return kind == 2 || kind == 3;
    }
}
