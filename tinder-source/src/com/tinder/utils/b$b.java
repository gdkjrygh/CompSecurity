// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.tinder.utils:
//            b

public static final class a
{

    l a;
    private boolean b;
    private Timer c;
    private TimerTask d;

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            c = new Timer();
            d = new TimerTask() {

                final b.b a;

                public final void run()
                {
                    a.a.a();
                }

            
            {
                a = b.b.this;
                super();
            }
            };
            c.schedule(d, 600L);
            b = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        if (c != null && d != null)
        {
            d.cancel();
            c.cancel();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public init>(init> init>)
    {
        b = false;
        a = init>;
    }
}
