// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.P;
import rx.X;
import rx.Y;
import rx.b.f;
import rx.b.g;
import rx.h.b;
import rx.h.d;

// Referenced classes of package rx.internal.a:
//            t

final class c
    implements Y
{
    final class a extends X
    {

        final int a;
        boolean b;
        final t.a c;

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

        public a(int l)
        {
            c = t.a.this;
            super();
            b = true;
            a = l;
        }
    }

    final class b extends X
    {

        final t.a a;

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
            int l;
            synchronized (a.d)
            {
                t.a a1 = a;
                l = a1.e;
                a1.e = l + 1;
                a.g.put(Integer.valueOf(l), d1);
            }
            obj1 = rx.b.create(new t.b(((rx.b) (obj2)), a.a));
            obj2 = (rx.b)a.k.c.call(obj);
            a a2 = a. new a(l);
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

        b()
        {
            a = t.a.this;
            super();
        }
    }

    final class c extends X
    {

        final int a;
        boolean b;
        final t.a c;

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

        public c(int l)
        {
            c = t.a.this;
            super();
            b = true;
            a = l;
        }
    }

    final class d extends X
    {

        final t.a a;

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
            int l;
            synchronized (a.d)
            {
                t.a a1 = a;
                l = a1.f;
                a1.f = l + 1;
                a.h.put(Integer.valueOf(l), obj);
            }
            obj1 = (rx.b)a.k.d.call(obj);
            c c1 = a. new c(l);
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

        d()
        {
            a = t.a.this;
            super();
        }
    }


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
        b b1 = new b();
        d d1 = new d();
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

    public d.a(t t1, X x)
    {
        k = t1;
        super();
        b = x;
        a = new rx.h.d(c);
    }
}
