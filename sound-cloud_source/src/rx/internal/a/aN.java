// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.P;
import rx.X;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.a:
//            aM

final class aN extends X
{

    final X a;
    final aM b;
    private boolean c;

    aN(aM am, X x, X x1)
    {
        b = am;
        a = x1;
        super(x);
        c = false;
    }

    public final void onCompleted()
    {
        if (c)
        {
            return;
        }
        try
        {
            b.a.onCompleted();
        }
        catch (Throwable throwable)
        {
            onError(throwable);
            return;
        }
        c = true;
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        Exceptions.throwIfFatal(throwable);
        if (c)
        {
            return;
        }
        c = true;
        try
        {
            b.a.onError(throwable);
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            a.onError(throwable);
            return;
        }
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        if (c)
        {
            return;
        }
        try
        {
            b.a.onNext(obj);
        }
        catch (Throwable throwable)
        {
            onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
        a.onNext(obj);
    }
}
