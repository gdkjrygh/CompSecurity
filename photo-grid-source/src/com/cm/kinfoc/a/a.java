// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc.a;

import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.cm.kinfoc.a:
//            c, b, d

public final class a
{

    private Thread a;
    private final int b;
    private final d c;
    private final Queue d;

    private a(c c1)
    {
        a = null;
        d = new LinkedList();
        b = com.cm.kinfoc.a.c.a(c1);
        c = com.cm.kinfoc.a.c.b(c1);
    }

    a(c c1, byte byte0)
    {
        this(c1);
    }

    static Queue a(a a1)
    {
        return a1.d;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    static Thread c(a a1)
    {
        a1.a = null;
        return null;
    }

    static d d(a a1)
    {
        return a1.c;
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            return;
        }
        synchronized (d)
        {
            d.offer(obj);
            if (a == null)
            {
                a = new b(this);
                a.start();
            }
            d.notify();
        }
        return;
        obj;
        queue;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
