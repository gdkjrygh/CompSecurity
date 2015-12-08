// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Q;
import rx.X;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            g, cS

public final class cR
    implements rx.b.g
{
    private static final class a
    {

        public static final cR a = new cR((byte)0);

    }

    private static final class b extends X
    {

        private final int a;
        private final rx.internal.b.a b;
        private final c c;

        public final void onCompleted()
        {
label0:
            {
                obj1 = c;
                int i = a;
                synchronized (((c) (obj1)).c)
                {
                    if (i == ((c) (obj1)).f)
                    {
                        break label0;
                    }
                }
                return;
            }
            obj1.g = false;
            if (((c) (obj1)).h)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            obj;
            JVM INSTR monitorexit ;
            return;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            if (!((c) (obj1)).j)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            if (((c) (obj1)).i == null)
            {
                obj1.i = new ArrayList();
            }
            ((c) (obj1)).i.add(g.b());
            obj;
            JVM INSTR monitorexit ;
            return;
            List list;
            list = ((c) (obj1)).i;
            obj1.i = null;
            obj1.j = true;
            obj;
            JVM INSTR monitorexit ;
            ((c) (obj1)).a(list);
            ((c) (obj1)).a.onCompleted();
            ((c) (obj1)).unsubscribe();
            return;
        }

        public final void onError(Throwable throwable)
        {
            c c1;
label0:
            {
                c1 = c;
                int i = a;
                synchronized (c1.c)
                {
                    if (i == c1.f)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!c1.j)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            if (c1.i == null)
            {
                c1.i = new ArrayList();
            }
            c1.i.add(g.a(throwable));
            obj;
            JVM INSTR monitorexit ;
            return;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
            List list;
            list = c1.i;
            c1.i = null;
            c1.j = true;
            obj;
            JVM INSTR monitorexit ;
            c1.a(list);
            c1.a.onError(throwable);
            c1.unsubscribe();
            return;
        }

        public final void onNext(Object obj)
        {
            c c1;
            boolean flag2;
            boolean flag3;
            boolean flag4;
label0:
            {
                flag4 = true;
                flag2 = true;
                flag3 = false;
                c1 = c;
                int i = a;
                synchronized (c1.c)
                {
                    if (i == c1.f)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!c1.j)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            if (c1.i == null)
            {
                c1.i = new ArrayList();
            }
            c1.i.add(obj);
            obj2;
            JVM INSTR monitorexit ;
            return;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            List list;
            list = c1.i;
            c1.i = null;
            c1.j = true;
            obj2;
            JVM INSTR monitorexit ;
            boolean flag = true;
_L4:
            c1.a(list);
            boolean flag1;
            flag1 = flag;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            c1.a.onNext(obj);
            c1.e.a();
            flag1 = false;
            Object obj3 = c1.c;
            obj3;
            JVM INSTR monitorenter ;
            list = c1.i;
            c1.i = null;
            if (list != null) goto _L2; else goto _L1
_L1:
            c1.j = false;
            flag1 = flag4;
            obj3;
            JVM INSTR monitorexit ;
            flag = flag2;
_L5:
            boolean flag5;
            if (!flag)
            {
                synchronized (c1.c)
                {
                    c1.j = false;
                }
                return;
            } else
            {
                return;
            }
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
_L2:
            obj3;
            JVM INSTR monitorexit ;
            flag5 = c1.a.isUnsubscribed();
            flag = flag1;
            if (!flag5) goto _L4; else goto _L3
_L3:
            flag = false;
              goto _L5
            obj;
            flag = false;
_L9:
            flag1 = flag;
            obj3;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
_L7:
            if (!flag)
            {
                synchronized (c1.c)
                {
                    c1.j = false;
                }
            }
            throw obj;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            flag = flag3;
            if (true) goto _L7; else goto _L6
_L6:
            obj;
            flag = flag1;
            if (true) goto _L9; else goto _L8
_L8:
        }

        public final void setProducer(Q q)
        {
            b.a(q);
        }

        b(int i, rx.internal.b.a a1, c c1)
        {
            a = i;
            b = a1;
            c = c1;
        }
    }

    private static final class c extends X
    {

        final e a;
        final rx.h.e b = new rx.h.e();
        final Object c = new Object();
        final g d = rx.internal.a.g.a();
        final rx.internal.b.a e = new rx.internal.b.a();
        int f;
        boolean g;
        boolean h;
        List i;
        boolean j;
        b k;

        final void a(List list)
        {
            if (list != null)
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    Object obj = list.next();
                    if (rx.internal.a.g.b(obj))
                    {
                        a.onCompleted();
                        return;
                    }
                    if (rx.internal.a.g.c(obj))
                    {
                        a.onError(rx.internal.a.g.f(obj));
                        return;
                    }
                    a.onNext(obj);
                    e.a();
                }
            }
        }

        public final void onCompleted()
        {
label0:
            {
                synchronized (c)
                {
                    h = true;
                    if (!g)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!j)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            if (i == null)
            {
                i = new ArrayList();
            }
            i.add(rx.internal.a.g.b());
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            List list;
            list = i;
            i = null;
            j = true;
            obj;
            JVM INSTR monitorexit ;
            a(list);
            a.onCompleted();
            unsubscribe();
            return;
        }

        public final void onError(Throwable throwable)
        {
            a.onError(throwable);
            unsubscribe();
        }

        public final void onNext(Object obj)
        {
            rx.b b1 = (rx.b)obj;
            synchronized (c)
            {
                int l = f + 1;
                f = l;
                g = true;
                k = new b(l, e, this);
            }
            b.a(k);
            b1.unsafeSubscribe(k);
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        c(X x)
        {
            a = new e(x);
            x.add(b);
            x.setProducer(new cS(this));
        }
    }


    private cR()
    {
    }

    cR(byte byte0)
    {
        this();
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        c c1 = new c(((X) (obj)));
        ((X) (obj)).add(c1);
        return c1;
    }
}
