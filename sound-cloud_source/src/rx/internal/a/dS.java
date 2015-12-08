// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.P;
import rx.X;
import rx.h.f;

// Referenced classes of package rx.internal.a:
//            dT, dU, dV, dW, 
//            b

public final class dS
    implements rx.b.g
{
    static final class a
    {

        final P a;
        final rx.b b;
        int c;

        public a(P p, rx.b b1)
        {
            a = p;
            b = b1;
        }
    }

    final class b extends X
    {

        final X a;
        int b;
        rx.internal.a.b c;
        volatile boolean d;
        final dS e;

        public final void onCompleted()
        {
            if (c != null)
            {
                c.onCompleted();
            }
            a.onCompleted();
        }

        public final void onError(Throwable throwable)
        {
            if (c != null)
            {
                c.onError(throwable);
            }
            a.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            if (c == null)
            {
                d = false;
                c = rx.internal.a.b.a();
                a.onNext(c);
            }
            c.onNext(obj);
            int i = b + 1;
            b = i;
            if (i % e.a == 0)
            {
                c.onCompleted();
                c = null;
                d = true;
                if (a.isUnsubscribed())
                {
                    unsubscribe();
                }
            }
        }

        public b(X x)
        {
            e = dS.this;
            super();
            d = true;
            a = x;
        }
    }

    final class c extends X
    {

        final X a;
        int b;
        final List c = new LinkedList();
        volatile boolean d;
        final dS e;

        public final void onCompleted()
        {
            Object obj = new ArrayList(c);
            c.clear();
            d = true;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a.onCompleted()) { }
            a.onCompleted();
        }

        public final void onError(Throwable throwable)
        {
            Object obj = new ArrayList(c);
            c.clear();
            d = true;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a.onError(throwable)) { }
            a.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            int i = b;
            b = i + 1;
            if (i % e.b == 0 && !a.isUnsubscribed())
            {
                if (c.isEmpty())
                {
                    d = false;
                }
                Object obj1 = rx.internal.a.b.a();
                obj1 = new a(((P) (obj1)), ((rx.b) (obj1)));
                c.add(obj1);
                a.onNext(((a) (obj1)).b);
            }
            Iterator iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                a1.a.onNext(obj);
                int j = a1.c + 1;
                a1.c = j;
                if (j == e.a)
                {
                    iterator.remove();
                    a1.a.onCompleted();
                }
            } while (true);
            if (c.isEmpty())
            {
                d = true;
                if (a.isUnsubscribed())
                {
                    unsubscribe();
                }
            }
        }

        public c(X x)
        {
            e = dS.this;
            super();
            d = true;
            a = x;
        }
    }


    final int a;
    final int b;

    public dS(int i, int j)
    {
        a = i;
        b = j;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        if (b == a)
        {
            obj = new b(((X) (obj)));
            ((b) (obj)).a.add(f.a(new dT(((b) (obj)))));
            ((b) (obj)).a.setProducer(new dU(((b) (obj))));
            return obj;
        } else
        {
            obj = new c(((X) (obj)));
            ((c) (obj)).a.add(f.a(new dV(((c) (obj)))));
            ((c) (obj)).a.setProducer(new dW(((c) (obj))));
            return obj;
        }
    }
}
