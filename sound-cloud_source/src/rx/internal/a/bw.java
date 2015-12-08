// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import rx.X;

// Referenced classes of package rx.internal.a:
//            g

public final class bw
    implements rx.b.g
{
    static final class a extends X
        implements rx.internal.util.a.a
    {

        final g a = g.a();
        final BlockingQueue b;
        final X c;
        final rx.internal.util.a d = new rx.internal.util.a(this);

        public final Object a()
        {
            return b.peek();
        }

        public final void a(Throwable throwable)
        {
            if (throwable != null)
            {
                c.onError(throwable);
                return;
            } else
            {
                c.onCompleted();
                return;
            }
        }

        public final boolean a(Object obj)
        {
            return g.a(c, obj);
        }

        public final Object b()
        {
            return b.poll();
        }

        public final void onCompleted()
        {
            d.a();
        }

        public final void onError(Throwable throwable)
        {
            d.a(throwable);
        }

        public final void onNext(Object obj)
        {
            b.put(g.a(obj));
            d.b();
_L1:
            return;
            obj;
            if (!isUnsubscribed())
            {
                onError(((Throwable) (obj)));
                return;
            }
              goto _L1
        }

        public a(int i, X x)
        {
            b = new ArrayBlockingQueue(i);
            c = x;
        }
    }


    final int a;

    public bw(int i)
    {
        a = i;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        obj = new a(a, ((X) (obj)));
        ((a) (obj)).c.add(((rx.Y) (obj)));
        ((a) (obj)).c.setProducer(((a) (obj)).d);
        return obj;
    }
}
