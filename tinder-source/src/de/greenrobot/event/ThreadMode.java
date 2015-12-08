// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


public final class ThreadMode extends Enum
{

    public static final ThreadMode a;
    public static final ThreadMode b;
    public static final ThreadMode c;
    public static final ThreadMode d;
    private static final ThreadMode e[];

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
        return (ThreadMode[])e.clone();
    }

    static 
    {
        a = new ThreadMode("PostThread", 0);
        b = new ThreadMode("MainThread", 1);
        c = new ThreadMode("BackgroundThread", 2);
        d = new ThreadMode("Async", 3);
        e = (new ThreadMode[] {
            a, b, c, d
        });
    }
}
