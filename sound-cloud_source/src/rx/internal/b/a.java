// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.b;

import rx.Q;

// Referenced classes of package rx.internal.b:
//            b

public final class a
    implements Q
{

    static final Q g = new b();
    long a;
    Q b;
    boolean c;
    long d;
    long e;
    Q f;

    public a()
    {
    }

    private void b()
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        Object obj;
        long l2;
        long l3;
        l2 = d;
        l3 = e;
        obj = f;
        if (l2 != 0L || l3 != 0L || obj != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        return;
        d = 0L;
        e = 0L;
        f = null;
        this;
        JVM INSTR monitorexit ;
        long l1 = a;
        long l = l1;
        if (l1 != 0x7fffffffffffffffL)
        {
            l = l1 + l2;
            if (l < 0L || l == 0x7fffffffffffffffL)
            {
                a = 0x7fffffffffffffffL;
                l = 0x7fffffffffffffffL;
            } else
            {
                l -= l3;
                if (l < 0L)
                {
                    throw new IllegalStateException("more produced than requested");
                }
                a = l;
            }
        }
        if (obj != null)
        {
            if (obj == g)
            {
                b = null;
            } else
            {
                b = ((Q) (obj));
                ((Q) (obj)).a(l);
            }
        } else
        {
            Q q = b;
            if (q != null && l2 != 0L)
            {
                q.a(l2);
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        if (1L <= 0L)
        {
            throw new IllegalArgumentException("n > 0 required");
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        e = e + 1L;
        this;
        JVM INSTR monitorexit ;
        return;
        c = true;
        this;
        JVM INSTR monitorexit ;
        long l = a;
        if (l == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        l--;
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        throw new IllegalStateException("more items arrived than were requested");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a = l;
        b();
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (l == 0L)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        d = d + l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c = true;
        this;
        JVM INSTR monitorexit ;
        long l2 = a + l;
        long l1;
        l1 = l2;
        if (l2 < 0L)
        {
            l1 = 0x7fffffffffffffffL;
        }
        Q q;
        a = l1;
        q = b;
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        q.a(l);
        b();
        return;
        q;
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
        throw q;
        q;
        this;
        JVM INSTR monitorexit ;
        throw q;
    }

    public final void a(Q q)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        Q q1;
        q1 = q;
        if (q != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        q1 = g;
        f = q1;
        this;
        JVM INSTR monitorexit ;
        return;
        c = true;
        this;
        JVM INSTR monitorexit ;
        b = q;
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        q.a(a);
        b();
        return;
        q;
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
        throw q;
        q;
        this;
        JVM INSTR monitorexit ;
        throw q;
        q;
        this;
        JVM INSTR monitorexit ;
        throw q;
    }

}
