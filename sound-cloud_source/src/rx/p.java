// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.e.b;
import rx.exceptions.OnErrorNotImplementedException;

// Referenced classes of package rx:
//            X, b

final class p
    implements b.f
{

    final b.g a;
    final rx.b b;

    p(rx.b b1, b.g g)
    {
        b = b1;
        a = g;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        Object obj1;
        Throwable throwable;
        try
        {
            b.access$100();
            obj1 = (X)rx.e.b.a(a).call(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (obj1 instanceof OnErrorNotImplementedException)
            {
                throw (OnErrorNotImplementedException)obj1;
            } else
            {
                ((X) (obj)).onError(((Throwable) (obj1)));
                return;
            }
        }
        ((X) (obj1)).onStart();
        b.onSubscribe.call(obj1);
        return;
        throwable;
        if (throwable instanceof OnErrorNotImplementedException)
        {
            throw (OnErrorNotImplementedException)throwable;
        }
        ((X) (obj1)).onError(throwable);
        return;
    }
}
