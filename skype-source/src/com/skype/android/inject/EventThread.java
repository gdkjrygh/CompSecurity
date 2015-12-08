// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.os.HandlerThread;
import android.os.Looper;

public final class EventThread extends Enum
{

    private static final EventThread $VALUES[];
    public static final EventThread BACKGROUND;
    public static final EventThread MAIN;
    private Looper looper;
    private Thread thread;

    private EventThread(String s, int i)
    {
        super(s, i);
    }

    public static EventThread valueOf(String s)
    {
        return (EventThread)Enum.valueOf(com/skype/android/inject/EventThread, s);
    }

    public static EventThread[] values()
    {
        return (EventThread[])$VALUES.clone();
    }

    public final Looper getLooper()
    {
        if (this != MAIN) goto _L2; else goto _L1
_L1:
        looper = Looper.getMainLooper();
        thread = looper.getThread();
_L4:
        return looper;
_L2:
        if (this == BACKGROUND)
        {
            looper = ((HandlerThread)thread).getLooper();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Thread getThread()
    {
        getLooper();
        return thread;
    }

    static 
    {
        MAIN = new EventThread("MAIN", 0);
        BACKGROUND = new EventThread("BACKGROUND", 1);
        $VALUES = (new EventThread[] {
            MAIN, BACKGROUND
        });
        BACKGROUND.thread = new HandlerThread("events");
        BACKGROUND.thread.start();
    }
}
