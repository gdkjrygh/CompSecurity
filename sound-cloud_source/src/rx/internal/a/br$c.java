// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Queue;
import rx.X;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.g;

// Referenced classes of package rx.internal.a:
//            br, g

static final class b extends X
{

    static final int f;
    final c a;
    final long b;
    volatile boolean c;
    volatile g d;
    int e;

    public final void a(long l)
    {
        int i = e - (int)l;
        if (i > f)
        {
            e = i;
        } else
        {
            e = g.c;
            i = g.c - i;
            if (i > 0)
            {
                request(i);
                return;
            }
        }
    }

    public final void onCompleted()
    {
        c = true;
        a.b();
    }

    public final void onError(Throwable throwable)
    {
        c = true;
        a.a().offer(throwable);
        a.b();
    }

    public final void onNext(Object obj)
    {
         ;
        boolean flag1;
        flag1 = false;
         = a;
        if (.d.get() == 0L)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        ;
        JVM INSTR monitorenter ;
        long l = .d.get();
        if (.j || l == 0L) goto _L2; else goto _L1
_L1:
        .j = true;
        boolean flag = true;
_L15:
        ;
        JVM INSTR monitorexit ;
_L16:
        if (!flag) goto _L4; else goto _L3
_L3:
        .a.onNext(obj);
_L11:
        if (l == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        .d.addAndGet(-1L);
        a(1L);
        ;
        JVM INSTR monitorenter ;
        if (.k) goto _L6; else goto _L5
_L5:
        .j = false;
        ;
        JVM INSTR monitorexit ;
_L14:
        return;
        obj;
        ;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (.b) goto _L8; else goto _L7
_L7:
        Exceptions.throwIfFatal(((Throwable) (obj)));
        unsubscribe();
        onError(((Throwable) (obj)));
        return;
        obj;
        flag = true;
_L12:
        if (flag) goto _L10; else goto _L9
_L9:
        ;
        JVM INSTR monitorenter ;
        .j = false;
        ;
        JVM INSTR monitorexit ;
_L10:
        throw obj;
_L8:
        .a().offer(obj);
          goto _L11
        obj;
        flag = flag1;
          goto _L12
_L6:
        .k = false;
        ;
        JVM INSTR monitorexit ;
        .c();
        return;
        obj;
        ;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        ;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        g g1;
        g g2 = d;
        g1 = g2;
        if (g2 == null)
        {
            g1 = g.a();
            add(g1);
            d = g1;
        }
        g1.a(g.a(obj));
        .b();
        return;
        obj;
        unsubscribe();
        onError(((Throwable) (obj)));
        return;
        obj;
        if (isUnsubscribed()) goto _L14; else goto _L13
_L13:
        unsubscribe();
        onError(((Throwable) (obj)));
        return;
_L2:
        flag = false;
          goto _L15
        l = 0L;
        flag = false;
          goto _L16
    }

    public final void onStart()
    {
        e = g.c;
        request(g.c);
    }

    static 
    {
        f = g.c / 4;
    }

    public ateException(ateException ateexception, long l)
    {
        a = ateexception;
        b = l;
    }
}
