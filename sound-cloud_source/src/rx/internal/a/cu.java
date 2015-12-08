// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.NoSuchElementException;
import rx.X;

// Referenced classes of package rx.internal.a:
//            cv

public final class cu
    implements rx.b.g
{
    private static final class a
    {

        public static final cu a = new cu((byte)0);

    }

    private static final class b extends X
    {

        private final X a;
        private final boolean b;
        private final Object c;
        private Object d;
        private boolean e;
        private boolean f;

        public final void onCompleted()
        {
label0:
            {
                if (!f)
                {
                    if (!e)
                    {
                        break label0;
                    }
                    a.onNext(d);
                    a.onCompleted();
                }
                return;
            }
            if (b)
            {
                a.onNext(c);
                a.onCompleted();
                return;
            } else
            {
                a.onError(new NoSuchElementException("Sequence contains no elements"));
                return;
            }
        }

        public final void onError(Throwable throwable)
        {
            a.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            if (e)
            {
                f = true;
                a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
                return;
            } else
            {
                d = obj;
                e = true;
                return;
            }
        }

        b(X x, boolean flag, Object obj)
        {
            e = false;
            f = false;
            a = x;
            b = flag;
            c = obj;
        }
    }


    private final boolean a;
    private final Object b;

    private cu()
    {
        this(false, null);
    }

    cu(byte byte0)
    {
        this();
    }

    public cu(Object obj)
    {
        this(true, obj);
    }

    private cu(boolean flag, Object obj)
    {
        a = flag;
        b = obj;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        b b1 = new b(((X) (obj)), a, b);
        ((X) (obj)).setProducer(new cv(this, b1));
        ((X) (obj)).add(b1);
        return b1;
    }
}
