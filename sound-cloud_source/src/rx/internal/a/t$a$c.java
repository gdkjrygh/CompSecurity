// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Map;
import rx.X;
import rx.h.b;

// Referenced classes of package rx.internal.a:
//            t

final class a extends X
{

    final int a;
    boolean b;
    final onCompleted c;

    public final void onCompleted()
    {
        if (b)
        {
            b = false;
            synchronized (c.c)
            {
                c.c.remove(Integer.valueOf(a));
            }
            c.c.b(this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onError(Throwable throwable)
    {
        c.c(throwable);
    }

    public final void onNext(Object obj)
    {
        onCompleted();
    }

    public ( , int i)
    {
        c = ;
        super();
        b = true;
        a = i;
    }
}
