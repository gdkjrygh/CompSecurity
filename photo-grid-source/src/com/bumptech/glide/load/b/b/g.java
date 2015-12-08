// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import java.util.ArrayDeque;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            f

final class g
{

    private final Queue a;

    private g()
    {
        a = new ArrayDeque();
    }

    g(byte byte0)
    {
        this();
    }

    final f a()
    {
        f f1;
        synchronized (a)
        {
            f1 = (f)a.poll();
        }
        obj = f1;
        if (f1 == null)
        {
            obj = new f((byte)0);
        }
        return ((f) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(f f1)
    {
        synchronized (a)
        {
            if (a.size() < 10)
            {
                a.offer(f1);
            }
        }
        return;
        f1;
        queue;
        JVM INSTR monitorexit ;
        throw f1;
    }
}
