// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.g;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.a:
//            dj

final class dl extends X
{

    final X a;
    final dj b;
    private int c;
    private boolean d;

    dl(dj dj1, X x, X x1)
    {
        b = dj1;
        a = x1;
        super(x, false);
        c = 0;
        d = false;
    }

    public final void onCompleted()
    {
        if (!d)
        {
            a.onCompleted();
        }
    }

    public final void onError(Throwable throwable)
    {
        if (!d)
        {
            a.onError(throwable);
        }
    }

    public final void onNext(Object obj)
    {
        boolean flag;
        try
        {
            g g1 = b.a;
            int i = c;
            c = i + 1;
            flag = ((Boolean)g1.call(obj, Integer.valueOf(i))).booleanValue();
        }
        catch (Throwable throwable)
        {
            d = true;
            Exceptions.throwIfFatal(throwable);
            a.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            unsubscribe();
            return;
        }
        if (flag)
        {
            a.onNext(obj);
            return;
        } else
        {
            d = true;
            a.onCompleted();
            unsubscribe();
            return;
        }
    }
}
