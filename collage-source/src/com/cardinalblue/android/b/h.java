// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;


// Referenced classes of package com.cardinalblue.android.b:
//            b

public abstract class h
{

    private long a;
    private long b;
    private long c;
    private boolean d;
    private b e;

    public h(long l, long l1)
    {
        a = 0L;
        b = 0L;
        c = 0L;
        d = true;
        e = null;
        a = l;
        b = l1;
        c = a;
    }

    static long a(h h1, long l)
    {
        h1.c = l;
        return l;
    }

    static boolean a(h h1)
    {
        return h1.d;
    }

    private void b()
    {
        if (e == null)
        {
            e = new b(c, b) {

                final h a;

                public void a(long l)
                {
                    if (a.a(l))
                    {
                        h.a(a, l);
                    }
                }

                public void c()
                {
                    if (!h.a(a))
                    {
                        a.a();
                    }
                }

            
            {
                a = h.this;
                super(l, l1);
            }
            };
        }
    }

    public abstract void a();

    public abstract boolean a(long l);

    public final h d()
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            b();
            e.b();
            d = false;
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
        throws IllegalStateException
    {
        if (!d)
        {
            e.a();
            d = true;
            return;
        } else
        {
            throw new IllegalStateException("The timer has already been paused");
        }
    }

    public boolean f()
    {
        return d;
    }
}
