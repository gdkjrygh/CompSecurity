// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.f;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.a:
//            di

public final class dh
    implements rx.b.g
{
    private final class a extends X
    {

        final dh a;
        private final X b;
        private boolean c;

        public final void onCompleted()
        {
            if (!c)
            {
                b.onCompleted();
            }
        }

        public final void onError(Throwable throwable)
        {
            if (!c)
            {
                b.onError(throwable);
            }
        }

        public final void onNext(Object obj)
        {
            b.onNext(obj);
            boolean flag;
            try
            {
                flag = ((Boolean)a.a.call(obj)).booleanValue();
            }
            catch (Throwable throwable)
            {
                c = true;
                Exceptions.throwIfFatal(throwable);
                b.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                unsubscribe();
                return;
            }
            if (flag)
            {
                c = true;
                b.onCompleted();
                unsubscribe();
            }
        }

        private a(X x)
        {
            a = dh.this;
            super();
            c = false;
            b = x;
        }

        a(X x, byte byte0)
        {
            this(x);
        }
    }


    final f a;

    public dh(f f)
    {
        a = f;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        a a1 = new a(((X) (obj)), (byte)0);
        ((X) (obj)).add(a1);
        ((X) (obj)).setProducer(new di(this, a1));
        return a1;
    }
}
