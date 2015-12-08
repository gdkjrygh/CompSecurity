// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import java.util.Timer;
import java.util.TimerTask;

public final class m
{
    public final class a extends TimerTask
    {

        final m a;
        private TimerTask b;

        public final void run()
        {
            b.run();
        }

        public a(TimerTask timertask)
        {
            a = m.this;
            super();
            b = timertask;
        }
    }


    private static m a = new m();
    private Timer b;

    public m()
    {
        b = new Timer();
    }

    public static m a()
    {
        return a;
    }

    public final a a(TimerTask timertask)
    {
        timertask = new a(timertask);
        b.schedule(timertask, 15000L);
        return timertask;
    }

}
