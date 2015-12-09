// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.Map;
import java.util.TimerTask;

// Referenced classes of package com.nielsen.app.sdk:
//            AppScheduler

public abstract class a extends TimerTask
{

    private boolean a;
    private Object b;
    final AppScheduler f;

    private void a(String s, long l, long l1)
    {
        if (s == null || s.isEmpty())
        {
            throw new Exception("Cannot add task. Invalid name");
        }
        if (l < 0L || l1 < 0L)
        {
            throw new Exception((new StringBuilder("Cannot add task (")).append(s).append("). Period/Delay invalid. Period = ").append(l1).append(" Delay = ").append(l).toString());
        } else
        {
            f.b(s);
            AppScheduler.a(f).put(s, this);
            AppScheduler.d().schedule(this, l, l1);
            return;
        }
    }

    static boolean a( )
    {
        return .a;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.a = flag;
        return flag;
    }

    static Object b(a a1)
    {
        return a1.b;
    }

    public abstract boolean execute();

    public void run()
    {
        synchronized (b)
        {
            if (a && !execute())
            {
                a = false;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (AppScheduler appscheduler, String s, long l)
    {
        f = appscheduler;
        super();
        a = false;
        b = new Object();
        a(s, l, l);
    }

    public a(AppScheduler appscheduler, String s, long l, long l1)
    {
        f = appscheduler;
        super();
        a = false;
        b = new Object();
        a(s, l, l1);
    }
}
