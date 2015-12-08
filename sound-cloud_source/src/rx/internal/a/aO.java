// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.b;

// Referenced classes of package rx.internal.a:
//            aP

public final class aO
    implements rx.b.g
{
    private static final class a extends X
    {

        private final X a;

        static void a(a a1, long l)
        {
            a1.request(l);
        }

        public final void onCompleted()
        {
            a.onCompleted();
        }

        public final void onError(Throwable throwable)
        {
            a.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            a.onNext(obj);
        }

        private a(X x)
        {
            a = x;
        }

        a(X x, byte byte0)
        {
            this(x);
        }
    }


    final b a;

    public aO(b b)
    {
        a = b;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        a a1 = new a(((X) (obj)), (byte)0);
        ((X) (obj)).setProducer(new aP(this, a1));
        ((X) (obj)).add(a1);
        return a1;
    }
}
