// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.platforms;

import java.util.TimerTask;

public interface PlatformApi
{

    public abstract void cleanup();

    public abstract void createPollTask(TimerTask timertask, int i);

    public abstract void createTimer(TimerTask timertask, int i, int j, String s);
}
