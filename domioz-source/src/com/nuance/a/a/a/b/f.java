// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import com.nuance.a.a.a.a.d.a.a;
import com.nuance.a.a.a.a.d.a.c;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.p;
import java.util.Hashtable;

// Referenced classes of package com.nuance.a.a.a.b:
//            a, i, k, j, 
//            h, g

public class f
    implements a
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/b/f);
    private final com.nuance.a.a.a.b.a b = new com.nuance.a.a.a.b.a();
    private final Thread c = new Thread(new i(this));
    private final Hashtable d = new Hashtable();

    public f()
    {
        c.start();
    }

    static Hashtable a(f f1)
    {
        return f1.d;
    }

    static com.nuance.a.a.a.b.a b(f f1)
    {
        return f1.b;
    }

    static e d()
    {
        return a;
    }

    public final void a(p p, long l)
    {
        p = new k(this, p);
        if (a.b())
        {
            (new StringBuilder("TIMER _handler.postDelayed(")).append(p).append(")");
        }
        b.postDelayed(p, l);
    }

    public final void a(Object obj, c c1, Object obj1, Object obj2)
    {
        obj = new j(obj, c1);
        obj.b = (Thread)obj2;
        obj.a = (Thread)obj1;
        b.post(new h(((j) (obj))));
    }

    public final boolean a(p p)
    {
        p = (k)d.remove(p);
        if (a.b())
        {
            (new StringBuilder("TIMER cancelTask() _pendingTimerTasks.size():")).append(d.size());
        }
        if (p != null)
        {
            if (a.b())
            {
                (new StringBuilder("TIMER _handler.removeCallbacks(")).append(p).append(")");
            }
            b.removeCallbacks(p);
        }
        return p != null;
    }

    public final Object[] a()
    {
        return (new Object[] {
            Thread.currentThread()
        });
    }

    public final Object b()
    {
        return Thread.currentThread();
    }

    public final void c()
    {
        b.post(new g());
    }

}
