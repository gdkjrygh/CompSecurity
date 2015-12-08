// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.BitSet;
import java.util.concurrent.atomic.AtomicLong;
import rx.X;
import rx.internal.util.g;

// Referenced classes of package rx.internal.a:
//            m

static final class request extends X
{

    final request a;
    final int b;
    final AtomicLong c = new AtomicLong();
    boolean d;

    public final void onCompleted()
    {
        request request;
        boolean flag1;
        int i;
        flag1 = false;
        request = a;
        i = b;
        if (d) goto _L2; else goto _L1
_L1:
        request.a.onCompleted();
_L4:
        return;
_L2:
        request;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (request.d.get(i))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        request.d.set(i);
        request.e = request.e + 1;
        flag = flag1;
        if (request.e == request.c.length)
        {
            flag = true;
        }
        request;
        JVM INSTR monitorexit ;
        if (!flag) goto _L4; else goto _L3
_L3:
        request.b.d();
        request.a();
        return;
        Exception exception;
        exception;
        request;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onError(Throwable throwable)
    {
        a.a(throwable);
    }

    public final void onNext(Object obj)
    {
        d = true;
        c.incrementAndGet();
        if (!a.a(b, obj))
        {
            request(1L);
        }
    }

    public e(int i, int j, X x, e e)
    {
        super(x);
        d = false;
        b = i;
        a = e;
        request(j);
    }
}
