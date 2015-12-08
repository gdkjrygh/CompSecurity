// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.P;
import rx.R;
import rx.X;
import rx.d.e;
import rx.h.f;

// Referenced classes of package rx.internal.a:
//            g, ec, ed, eb, 
//            b, ee

public final class ea
    implements rx.b.g
{
    static final class a
    {

        final P a;
        final rx.b b;
        int c;

        public a(P p, rx.b b1)
        {
            a = new rx.d.d(p);
            b = b1;
        }
    }

    final class b extends X
    {

        final X a;
        final rx.R.a b;
        final Object c = new Object();
        List d;
        boolean e;
        volatile d f;
        final ea g;

        private void a(Throwable throwable)
        {
            P p = f.a;
            d d1 = f;
            f = d.a();
            if (p != null)
            {
                p.onError(throwable);
            }
            a.onError(throwable);
            unsubscribe();
        }

        private boolean a(Object obj)
        {
            d d2 = f;
            d d1 = d2;
            if (d2.a == null)
            {
                if (!a())
                {
                    return false;
                }
                d1 = f;
            }
            d1.a.onNext(obj);
            if (d1.c == g.e - 1)
            {
                d1.a.onCompleted();
                obj = d.a();
            } else
            {
                obj = new d(d1.a, d1.b, d1.c + 1);
            }
            f = ((d) (obj));
            return true;
        }

        private void b()
        {
            P p = f.a;
            d d1 = f;
            f = d.a();
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
                d d1 = f;
                f = d.a();
                unsubscribe();
                return false;
            } else
            {
                rx.internal.a.b b1 = rx.internal.a.b.a();
                d d2 = f;
                f = d.a(b1, b1);
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

        public b(X x, rx.R.a a1)
        {
            g = ea.this;
            super();
            a = new e(x);
            b = a1;
            f = d.b();
            x.add(rx.h.f.a(new eb(this, ea.this)));
        }
    }

    final class c extends X
    {

        final X a;
        final rx.R.a b;
        final Object c = new Object();
        final List d = new LinkedList();
        boolean e;
        final ea f;

        final void a()
        {
            a a1;
label0:
            {
                rx.internal.a.b b1 = rx.internal.a.b.a();
                a1 = new a(b1, b1);
                synchronized (c)
                {
                    if (!e)
                    {
                        break label0;
                    }
                }
                return;
            }
            d.add(a1);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                a.onNext(a1.b);
            }
            catch (Throwable throwable)
            {
                onError(throwable);
                return;
            }
            b.a(new ee(this, a1), f.a, f.c);
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
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
                }
                return;
            }
            ArrayList arraylist;
            e = true;
            arraylist = new ArrayList(d);
            d.clear();
            obj;
            JVM INSTR monitorexit ;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a.onCompleted()) { }
            break MISSING_BLOCK_LABEL_86;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            a.onCompleted();
            return;
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
                }
                return;
            }
            ArrayList arraylist;
            e = true;
            arraylist = new ArrayList(d);
            d.clear();
            obj;
            JVM INSTR monitorexit ;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a.onError(throwable)) { }
            break MISSING_BLOCK_LABEL_87;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
            a.onError(throwable);
            return;
        }

        public final void onNext(Object obj)
        {
label0:
            {
                synchronized (c)
                {
                    if (!e)
                    {
                        break label0;
                    }
                }
                return;
            }
            ArrayList arraylist;
            arraylist = new ArrayList(d);
            Iterator iterator1 = d.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                a a2 = (a)iterator1.next();
                int i = a2.c + 1;
                a2.c = i;
                if (i == f.e)
                {
                    iterator1.remove();
                }
            } while (true);
            break MISSING_BLOCK_LABEL_105;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            obj1;
            JVM INSTR monitorexit ;
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                a1.a.onNext(obj);
                if (a1.c == f.e)
                {
                    a1.a.onCompleted();
                }
            } while (true);
            return;
        }

        public final void onStart()
        {
            request(0x7fffffffffffffffL);
        }

        public c(X x, rx.R.a a1)
        {
            f = ea.this;
            super(x);
            a = x;
            b = a1;
        }
    }

    static final class d
    {

        static final d d = new d(null, null, 0);
        final P a;
        final rx.b b;
        final int c;

        public static d a()
        {
            return d;
        }

        public static d a(P p, rx.b b1)
        {
            return new d(p, b1, 0);
        }

        public static d b()
        {
            return d;
        }


        public d(P p, rx.b b1, int i)
        {
            a = p;
            b = b1;
            c = i;
        }
    }


    static final Object f = new Object();
    static final g g = rx.internal.a.g.a();
    final long a;
    final long b;
    final TimeUnit c;
    final R d;
    final int e;

    public ea(long l, long l1, TimeUnit timeunit, int i, R r)
    {
        a = l;
        b = l1;
        c = timeunit;
        e = i;
        d = r;
    }

    private X a(X x)
    {
        rx.R.a a1 = d.a();
        if (a == b)
        {
            x = new b(x, a1);
            x.add(a1);
            ((b) (x)).b.a(new ec(x), 0L, ((b) (x)).g.a, ((b) (x)).g.c);
            return x;
        } else
        {
            x = new c(x, a1);
            x.add(a1);
            x.a();
            ((c) (x)).b.a(new ed(x), ((c) (x)).f.b, ((c) (x)).f.b, ((c) (x)).f.c);
            return x;
        }
    }

    public final Object call(Object obj)
    {
        return a((X)obj);
    }

}
