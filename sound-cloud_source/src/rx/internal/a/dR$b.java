// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.P;
import rx.X;
import rx.b;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            dR, g, b

static final class g extends X
{

    final X a;
    final Object b = new Object();
    P c;
    b d;
    boolean e;
    List f;
    final rx.h.e g = new rx.h.e();
    final rx.b.e h;

    private void a(Object obj)
    {
        P p = c;
        if (p != null)
        {
            p.onNext(obj);
        }
    }

    private void a(Throwable throwable)
    {
        P p = c;
        c = null;
        d = null;
        if (p != null)
        {
            p.onError(throwable);
        }
        a.onError(throwable);
        unsubscribe();
    }

    private void a(List list)
    {
        if (list != null)
        {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                list = ((List) (iterator.next()));
                if (list == rx.internal.a.dR.b)
                {
                    b();
                } else
                {
                    g g2 = dR.c;
                    if (rx.internal.a.g.c(list))
                    {
                        g g1 = dR.c;
                        a(rx.internal.a.g.f(list));
                        return;
                    }
                    g2 = dR.c;
                    if (rx.internal.a.g.b(list))
                    {
                        c();
                        return;
                    }
                    a(list);
                }
            }
        }
    }

    private void b()
    {
        Object obj = c;
        if (obj != null)
        {
            ((P) (obj)).onCompleted();
        }
        obj = rx.internal.a.b.a();
        c = ((P) (obj));
        d = ((b) (obj));
        b b1 = (b)h.call();
          = new <init>(this);
        g.a();
        b1.unsafeSubscribe();
_L2:
        a.onNext(d);
        return;
        Throwable throwable;
        throwable;
        a.onError(throwable);
        unsubscribe();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void c()
    {
        P p = c;
        c = null;
        d = null;
        if (p != null)
        {
            p.onCompleted();
        }
        a.onCompleted();
        unsubscribe();
    }

    final void a()
    {
        boolean flag2;
        boolean flag3;
label0:
        {
            flag2 = true;
            flag3 = false;
            synchronized (b)
            {
                if (!e)
                {
                    break label0;
                }
                if (f == null)
                {
                    f = new ArrayList();
                }
                f.add(rx.internal.a.dR.b);
            }
            return;
        }
        Object obj;
        obj = f;
        f = null;
        e = true;
        obj1;
        JVM INSTR monitorexit ;
        boolean flag = true;
_L4:
        a(((List) (obj)));
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        b();
        flag1 = false;
        obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        obj = f;
        f = null;
        if (obj != null) goto _L2; else goto _L1
_L1:
        e = false;
        flag1 = flag2;
        obj1;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
_L5:
        if (!flag)
        {
            synchronized (b)
            {
                e = false;
            }
        }
        throw exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        boolean flag4 = a.isUnsubscribed();
        flag = flag1;
        if (!flag4) goto _L4; else goto _L3
_L3:
        synchronized (b)
        {
            e = false;
        }
        return;
        obj1;
        exception;
        JVM INSTR monitorexit ;
        throw obj1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        flag = flag3;
          goto _L5
        exception;
        flag = false;
          goto _L6
        exception;
        flag = flag1;
          goto _L6
    }

    public final void onCompleted()
    {
label0:
        {
            synchronized (b)
            {
                if (!e)
                {
                    break label0;
                }
                if (f == null)
                {
                    f = new ArrayList();
                }
                List list = f;
                g g1 = dR.c;
                list.add(rx.internal.a.g.b());
            }
            return;
        }
        List list1;
        list1 = f;
        f = null;
        e = true;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            a(list1);
        }
        catch (Throwable throwable)
        {
            a(throwable);
            return;
        }
        c();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onError(Throwable throwable)
    {
label0:
        {
            synchronized (b)
            {
                if (!e)
                {
                    break label0;
                }
                g g1 = dR.c;
                f = Collections.singletonList(rx.internal.a.g.a(throwable));
            }
            return;
        }
        f = null;
        e = true;
        obj;
        JVM INSTR monitorexit ;
        a(throwable);
        return;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public final void onNext(Object obj)
    {
        boolean flag2;
        boolean flag3;
label0:
        {
            flag2 = true;
            flag3 = false;
            synchronized (b)
            {
                if (!e)
                {
                    break label0;
                }
                if (f == null)
                {
                    f = new ArrayList();
                }
                f.add(obj);
            }
            return;
        }
        List list;
        list = f;
        f = null;
        e = true;
        obj2;
        JVM INSTR monitorexit ;
        boolean flag = true;
_L4:
        a(list);
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a(obj);
        flag1 = false;
        obj2 = b;
        obj2;
        JVM INSTR monitorenter ;
        list = f;
        f = null;
        if (list != null) goto _L2; else goto _L1
_L1:
        e = false;
        flag1 = flag2;
        obj2;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
_L5:
        if (!flag)
        {
            synchronized (b)
            {
                e = false;
            }
        }
        throw obj;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj2;
        JVM INSTR monitorexit ;
        boolean flag4 = a.isUnsubscribed();
        flag = flag1;
        if (!flag4) goto _L4; else goto _L3
_L3:
        synchronized (b)
        {
            e = false;
        }
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        flag = flag3;
          goto _L5
        obj;
        flag = false;
          goto _L6
        obj;
        flag = flag1;
          goto _L6
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    public (X x, rx.b.e e1)
    {
        a = new e(x);
        h = e1;
        add(g);
    }
}
