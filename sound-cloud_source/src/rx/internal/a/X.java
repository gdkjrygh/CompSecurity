// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b.f;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.b.c;

// Referenced classes of package rx.internal.a:
//            W

final class X extends rx.X
{

    boolean a;
    boolean b;
    final c c;
    final rx.X d;
    final W e;

    X(W w, c c1, rx.X x)
    {
        e = w;
        c = c1;
        d = x;
        super();
    }

    public final void onCompleted()
    {
label0:
        {
            if (!b)
            {
                b = true;
                if (!a)
                {
                    break label0;
                }
                c.a(Boolean.valueOf(false));
            }
            return;
        }
        c.a(Boolean.valueOf(e.b));
    }

    public final void onError(Throwable throwable)
    {
        d.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        a = true;
        boolean flag;
        try
        {
            flag = ((Boolean)e.a.call(obj)).booleanValue();
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
        if (flag && !b)
        {
            b = true;
            obj = c;
            boolean flag1;
            if (!e.b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((c) (obj)).a(Boolean.valueOf(flag1));
            unsubscribe();
        }
    }
}
