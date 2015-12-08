// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.P;
import rx.X;
import rx.Y;
import rx.b;
import rx.b.f;
import rx.b.g;
import rx.d.e;

public final class t
    implements rx.b.f
{
    final class a
        implements Y
    {

        final rx.h.d a;
        final X b;
        final rx.h.b c = new rx.h.b();
        final Object d = new Object();
        int e;
        int f;
        final Map g = new HashMap();
        final Map h = new HashMap();
        boolean i;
        boolean j;
        final t k;

        public final void a()
        {
            b b1 = new b(this);
            d d1 = new d(this);
            c.a(b1);
            c.a(d1);
            k.a.unsafeSubscribe(b1);
            k.b.unsafeSubscribe(d1);
        }

        final void a(Throwable throwable)
        {
            ArrayList arraylist;
            synchronized (d)
            {
                arraylist = new ArrayList(g.values());
                g.clear();
                h.clear();
            }
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((P)((Iterator) (obj)).next()).onError(throwable)) { }
            break MISSING_BLOCK_LABEL_83;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
            b.onError(throwable);
            a.unsubscribe();
            return;
        }

        final void a(List list)
        {
            if (list != null)
            {
                for (list = list.iterator(); list.hasNext(); ((P)list.next()).onCompleted()) { }
                b.onCompleted();
                a.unsubscribe();
            }
        }

        final void b(Throwable throwable)
        {
            synchronized (d)
            {
                g.clear();
                h.clear();
            }
            b.onError(throwable);
            a.unsubscribe();
            return;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        public final boolean isUnsubscribed()
        {
            return a.isUnsubscribed();
        }

        public final void unsubscribe()
        {
            a.unsubscribe();
        }

        public a(X x)
        {
            k = t.this;
            super();
            b = x;
            a = new rx.h.d(c);
        }
    }

    final class a.a extends X
    {

        final int a;
        boolean b;
        final a c;

        public final void onCompleted()
        {
            if (b)
            {
                b = false;
                P p;
                synchronized (c.d)
                {
                    p = (P)c.g.remove(Integer.valueOf(a));
                }
                if (p != null)
                {
                    p.onCompleted();
                }
                c.c.b(this);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void onError(Throwable throwable)
        {
            c.b(throwable);
        }

        public final void onNext(Object obj)
        {
            onCompleted();
        }

        public a.a(a a1, int i)
        {
            c = a1;
            super();
            b = true;
            a = i;
        }
    }

    final class a.b extends X
    {

        final a a;

        public final void onCompleted()
        {
            ArrayList arraylist = null;
            synchronized (a.d)
            {
                a.i = true;
                if (a.j)
                {
                    arraylist = new ArrayList(a.g.values());
                    a.g.clear();
                    a.h.clear();
                }
            }
            a.a(arraylist);
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void onError(Throwable throwable)
        {
            a.a(throwable);
        }

        public final void onNext(Object obj)
        {
            rx.d.d d1;
            Object obj2;
            obj2 = rx.g.c.a();
            d1 = new rx.d.d(((P) (obj2)));
            int i;
            synchronized (a.d)
            {
                a a1 = a;
                i = a1.e;
                a1.e = i + 1;
                a.g.put(Integer.valueOf(i), d1);
            }
            obj1 = rx.b.create(new b(((rx.b) (obj2)), a.a));
            obj2 = (rx.b)a.k.c.call(obj);
            a.a a2 = new a.a(a, i);
            a.c.a(a2);
            ((rx.b) (obj2)).unsafeSubscribe(a2);
            obj1 = a.k.e.call(obj, obj1);
            ArrayList arraylist;
            synchronized (a.d)
            {
                arraylist = new ArrayList(a.h.values());
            }
            try
            {
                a.b.onNext(obj1);
                for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); d1.onNext(((Iterator) (obj)).next())) { }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                onError(((Throwable) (obj)));
            }
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        a.b(a a1)
        {
            a = a1;
            super();
        }
    }

    final class a.c extends X
    {

        final int a;
        boolean b;
        final a c;

        public final void onCompleted()
        {
            if (b)
            {
                b = false;
                synchronized (c.d)
                {
                    c.h.remove(Integer.valueOf(a));
                }
                c.c.b(this);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void onError(Throwable throwable)
        {
            c.b(throwable);
        }

        public final void onNext(Object obj)
        {
            onCompleted();
        }

        public a.c(a a1, int i)
        {
            c = a1;
            super();
            b = true;
            a = i;
        }
    }

    final class a.d extends X
    {

        final a a;

        public final void onCompleted()
        {
            ArrayList arraylist = null;
            synchronized (a.d)
            {
                a.j = true;
                if (a.i)
                {
                    arraylist = new ArrayList(a.g.values());
                    a.g.clear();
                    a.h.clear();
                }
            }
            a.a(arraylist);
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void onError(Throwable throwable)
        {
            a.a(throwable);
        }

        public final void onNext(Object obj)
        {
            int i;
            synchronized (a.d)
            {
                a a1 = a;
                i = a1.f;
                a1.f = i + 1;
                a.h.put(Integer.valueOf(i), obj);
            }
            obj1 = (rx.b)a.k.d.call(obj);
            a.c c1 = new a.c(a, i);
            a.c.a(c1);
            ((rx.b) (obj1)).unsafeSubscribe(c1);
            ArrayList arraylist;
            synchronized (a.d)
            {
                arraylist = new ArrayList(a.g.values());
            }
            try
            {
                for (obj1 = arraylist.iterator(); ((Iterator) (obj1)).hasNext(); ((P)((Iterator) (obj1)).next()).onNext(obj)) { }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                onError(((Throwable) (obj)));
            }
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        a.d(a a1)
        {
            a = a1;
            super();
        }
    }

    static final class b
        implements rx.b.f
    {

        final rx.h.d a;
        final rx.b b;

        public final void call(Object obj)
        {
            Object obj1;
            obj1 = (X)obj;
            obj = a;
_L2:
            rx.h.d.b b1 = ((rx.h.d) (obj)).b;
            if (b1.a)
            {
                obj = rx.h.f.b();
            } else
            {
                rx.h.d.b b2 = new rx.h.d.b(b1.a, b1.b + 1);
                if (!rx.h.d.c.compareAndSet(obj, b1, b2))
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj = new rx.h.d.a(((rx.h.d) (obj)));
            }
            obj1 = new a(this, ((X) (obj1)), ((Y) (obj)));
            ((a) (obj1)).add(((Y) (obj)));
            b.unsafeSubscribe(((X) (obj1)));
            return;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public b(rx.b b1, rx.h.d d1)
        {
            a = d1;
            b = b1;
        }
    }

    final class b.a extends X
    {

        final X a;
        final b b;
        private final Y c;

        public final void onCompleted()
        {
            a.onCompleted();
            c.unsubscribe();
        }

        public final void onError(Throwable throwable)
        {
            a.onError(throwable);
            c.unsubscribe();
        }

        public final void onNext(Object obj)
        {
            a.onNext(obj);
        }

        public b.a(b b1, X x, Y y)
        {
            b = b1;
            super(x);
            a = x;
            c = y;
        }
    }


    protected final rx.b a;
    protected final rx.b b;
    protected final f c;
    protected final f d;
    protected final g e;

    public t(rx.b b1, rx.b b2, f f, f f1, g g)
    {
        a = b1;
        b = b2;
        c = f;
        d = f1;
        e = g;
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        a a1 = new a(new e(((X) (obj))));
        ((X) (obj)).add(a1);
        a1.a();
    }
}
