// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;
import rx.b;
import rx.h.e;
import rx.internal.b.a;

public final class cT
    implements rx.b.g
{
    private static final class a extends X
    {

        private final rx.internal.b.a a;
        private final X b;

        public final void onCompleted()
        {
            b.onCompleted();
        }

        public final void onError(Throwable throwable)
        {
            b.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            b.onNext(obj);
            a.a();
        }

        public final void setProducer(Q q)
        {
            a.a(q);
        }

        a(X x, rx.internal.b.a a1)
        {
            b = x;
            a = a1;
        }
    }

    private static final class b extends X
    {

        private boolean a;
        private final X b;
        private final e c;
        private final rx.internal.b.a d;
        private final rx.b e;

        public final void onCompleted()
        {
            if (!a)
            {
                b.onCompleted();
            } else
            if (!b.isUnsubscribed())
            {
                a a1 = new a(b, d);
                c.a(a1);
                e.unsafeSubscribe(a1);
                return;
            }
        }

        public final void onError(Throwable throwable)
        {
            b.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            a = false;
            b.onNext(obj);
            d.a();
        }

        public final void setProducer(Q q)
        {
            d.a(q);
        }

        b(X x, e e1, rx.internal.b.a a1, rx.b b1)
        {
            a = true;
            b = x;
            c = e1;
            d = a1;
            e = b1;
        }
    }


    private final rx.b a;

    public cT(rx.b b1)
    {
        a = b1;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        e e1 = new e();
        rx.internal.b.a a1 = new rx.internal.b.a();
        b b1 = new b(((X) (obj)), e1, a1, a);
        e1.a(b1);
        ((X) (obj)).add(e1);
        ((X) (obj)).setProducer(a1);
        return b1;
    }
}
