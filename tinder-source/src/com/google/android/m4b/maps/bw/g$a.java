// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.ay.v;

// Referenced classes of package com.google.android.m4b.maps.bw:
//            g

final class b
    implements v
{

    private final m a;
    private final Runnable b;
    private g c;

    private void a()
    {
        if (g.a(c) == null)
        {
            a.b(this);
            if (b != null)
            {
                b.run();
            }
            synchronized (c)
            {
                g.b(c);
                c.notifyAll();
            }
            return;
        } else
        {
            return;
        }
        exception;
        g1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i, String s)
    {
        if (i != 3)
        {
            a();
        }
    }

    public final void a(t t1)
    {
        if (t1 instanceof a)
        {
            a.b(this);
        }
    }

    public final void b(t t1)
    {
        if (t1.g() == 75)
        {
            a();
        }
    }

    public (g g1, m m1, Runnable runnable)
    {
        c = g1;
        super();
        a = m1;
        b = runnable;
    }
}
