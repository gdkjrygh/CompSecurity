// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Iterator;
import rx.X;
import rx.b.g;

// Referenced classes of package rx.internal.a:
//            ej

final class ek extends X
{

    boolean a;
    final X b;
    final Iterator c;
    final ej d;

    ek(ej ej1, X x, X x1, Iterator iterator)
    {
        d = ej1;
        b = x1;
        c = iterator;
        super(x);
    }

    public final void onCompleted()
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            b.onCompleted();
            return;
        }
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        try
        {
            b.onNext(d.b.call(obj, c.next()));
            if (!c.hasNext())
            {
                onCompleted();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
        }
    }
}
