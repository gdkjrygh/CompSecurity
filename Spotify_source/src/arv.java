// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class arv
    implements aru
{

    private static boolean e;
    final Runnable a;
    boolean b;
    private arv c;
    private arv d;
    private art f;

    arv(art art1, Runnable runnable)
    {
        f = art1;
        super();
        a = runnable;
    }

    final arv a(arv arv1)
    {
        if (!e && c == null)
        {
            throw new AssertionError();
        }
        if (!e && d == null)
        {
            throw new AssertionError();
        }
        arv arv2 = arv1;
        if (arv1 == this)
        {
            if (c == this)
            {
                arv2 = null;
            } else
            {
                arv2 = c;
            }
        }
        c.d = d;
        d.c = c;
        d = null;
        c = null;
        return arv2;
    }

    final arv a(arv arv1, boolean flag)
    {
        if (!e && c != null)
        {
            throw new AssertionError();
        }
        if (!e && d != null)
        {
            throw new AssertionError();
        }
        if (arv1 == null)
        {
            d = this;
            c = this;
            arv1 = this;
        } else
        {
            c = arv1;
            d = arv1.d;
            arv arv2 = c;
            d.c = this;
            arv2.d = this;
        }
        if (flag)
        {
            return this;
        } else
        {
            return arv1;
        }
    }

    public final boolean a()
    {
        Object obj = art.a(f);
        obj;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        art.b(f, a(art.b(f)));
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (art.a(f))
        {
            if (!b)
            {
                art.b(f, a(art.b(f)));
                art.b(f, a(art.b(f), true));
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!art.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
