// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


public final class ThreadMode extends Enum
{

    private static final ThreadMode $VALUES[];
    public static final ThreadMode Async;
    public static final ThreadMode BackgroundThread;
    public static final ThreadMode MainThread;
    public static final ThreadMode PostThread;

    private ThreadMode(String s, int i)
    {
        super(s, i);
    }

    public static ThreadMode valueOf(String s)
    {
        return (ThreadMode)Enum.valueOf(de/greenrobot/event/ThreadMode, s);
    }

    public static ThreadMode[] values()
    {
        return (ThreadMode[])$VALUES.clone();
    }

    static 
    {
        PostThread = new ThreadMode("PostThread", 0);
        MainThread = new ThreadMode("MainThread", 1);
        BackgroundThread = new ThreadMode("BackgroundThread", 2);
        Async = new ThreadMode("Async", 3);
        $VALUES = (new ThreadMode[] {
            PostThread, MainThread, BackgroundThread, Async
        });
    }
}
