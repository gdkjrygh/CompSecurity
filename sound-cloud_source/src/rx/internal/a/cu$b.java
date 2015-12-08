// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.NoSuchElementException;
import rx.X;

// Referenced classes of package rx.internal.a:
//            cu

private static final class c extends X
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

    (X x, boolean flag, Object obj)
    {
        e = false;
        f = false;
        a = x;
        b = flag;
        c = obj;
    }
}
