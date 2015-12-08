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
import rx.d.e;
import rx.h.f;

// Referenced classes of package rx.internal.a:
//            ea, eb, b, g

final class nit> extends X
{

    final X a;
    final rx.nal.a.ea.b.request b;
    final Object c = new Object();
    List d;
    boolean e;
    volatile nit> f;
    final ea g;

    private void a(Throwable throwable)
    {
        P p = f.a;
          = f;
        f = a();
        if (p != null)
        {
            p.onError(throwable);
        }
        a.onError(throwable);
        unsubscribe();
    }

    private boolean a(Object obj)
    {
        unsubscribe unsubscribe1 = f;
        unsubscribe unsubscribe = unsubscribe1;
        if (unsubscribe1.a == null)
        {
            if (!a())
            {
                return false;
            }
            unsubscribe = f;
        }
        unsubscribe.a.onNext(obj);
        if (unsubscribe.c == g.e - 1)
        {
            unsubscribe.a.onCompleted();
            obj = a();
        } else
        {
            obj = new <init>(unsubscribe.a, unsubscribe.b, unsubscribe.c + 1);
        }
        f = ((f) (obj));
        return true;
    }

    private void b()
    {
        P p = f.a;
        f f1 = f;
        f = a();
        if (p != null)
        {
            p.onCompleted();
        }
        a.onCompleted();
        unsubscribe();
    }

    final boolean a()
    {
        P p = f.a;
        if (p != null)
        {
            p.onCompleted();
        }
        if (a.isUnsubscribed())
        {
            unsubscribe unsubscribe = f;
            f = a();
            unsubscribe();
            return false;
        } else
        {
            b b1 = rx.internal.a.b.a();
            unsubscribe unsubscribe1 = f;
            f = a(b1, b1);
            a.onNext(b1);
            return true;
        }
    }

    final boolean a(List list)
    {
        if (list != null)
        {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                list = ((List) (iterator.next()));
                if (list == rx.internal.a.ea.f)
                {
                    if (!a())
                    {
                        return false;
                    }
                } else
                {
                    g g2 = ea.g;
                    if (rx.internal.a.g.c(list))
                    {
                        g g1 = ea.g;
                        a(rx.internal.a.g.f(list));
                        return true;
                    }
                    g2 = ea.g;
                    if (rx.internal.a.g.b(list))
                    {
                        b();
                        return true;
                    }
                    if (!a(list))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void onCompleted()
    {
label0:
        {
            synchronized (c)
            {
                if (!e)
                {
                    break label0;
                }
                if (d == null)
                {
                    d = new ArrayList();
                }
                List list = d;
                g g1 = ea.g;
                list.add(rx.internal.a.g.b());
            }
            return;
        }
        List list1;
        list1 = d;
        d = null;
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
        b();
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
            synchronized (c)
            {
                if (!e)
                {
                    break label0;
                }
                g g1 = ea.g;
                d = Collections.singletonList(rx.internal.a.g.a(throwable));
            }
            return;
        }
        d = null;
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
        boolean flag;
        boolean flag1;
label0:
        {
            flag1 = true;
            flag = false;
            synchronized (c)
            {
                if (!e)
                {
                    break label0;
                }
                if (d == null)
                {
                    d = new ArrayList();
                }
                d.add(obj);
            }
            return;
        }
        e = true;
        obj1;
        JVM INSTR monitorexit ;
        boolean flag2 = a(obj);
        if (!flag2)
        {
            synchronized (c)
            {
                e = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_95;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        obj2 = c;
        obj2;
        JVM INSTR monitorenter ;
        obj = d;
        if (obj != null) goto _L2; else goto _L1
_L1:
        e = false;
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
            synchronized (c)
            {
                e = false;
            }
        }
        throw obj;
_L2:
        d = null;
        obj2;
        JVM INSTR monitorexit ;
        flag2 = a(((List) (obj)));
        if (flag2) goto _L4; else goto _L3
_L3:
        synchronized (c)
        {
            e = false;
        }
        return;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
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

    public (ea ea1, X x, rx..ea ea2)
    {
        g = ea1;
        super();
        a = new e(x);
        b = ea2;
        f = b();
        x.add(rx.h.f.a(new eb(this, ea1)));
    }
}
