// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.NoSuchElementException;
import rx.W;
import rx.X;

// Referenced classes of package rx.internal.a:
//            L

final class M extends X
{

    final W a;
    final L b;
    private boolean c;
    private boolean d;
    private Object e;

    M(L l, W w)
    {
        b = l;
        a = w;
        super();
        c = false;
        d = false;
        e = null;
    }

    public final void onCompleted()
    {
label0:
        {
            if (!c)
            {
                if (!d)
                {
                    break label0;
                }
                a.a(e);
            }
            return;
        }
        a.a(new NoSuchElementException("Observable emitted no items"));
    }

    public final void onError(Throwable throwable)
    {
        a.a(throwable);
        unsubscribe();
    }

    public final void onNext(Object obj)
    {
        if (d)
        {
            c = true;
            a.a(new IllegalArgumentException("Observable emitted too many elements"));
            unsubscribe();
            return;
        } else
        {
            d = true;
            e = obj;
            return;
        }
    }

    public final void onStart()
    {
        request(2L);
    }
}
