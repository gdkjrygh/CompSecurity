// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.X;

// Referenced classes of package rx.internal.a:
//            j

private static final class <init> extends X
{

    private final X a;
    private final a b;
    private boolean c;

    static void a(<init> <init>1, long l)
    {
        <init>1.request(l);
    }

    private boolean a()
    {
        if (c)
        {
            return true;
        }
        if (b.a.get() == this)
        {
            c = true;
            return true;
        }
        if (b.a.compareAndSet(null, this))
        {
            b.a(this);
            c = true;
            return true;
        }
        request request = b;
        request request1 = (b)request.a.get();
        if (request1 != null)
        {
            request.a(request1);
        }
        return false;
    }

    public final void onCompleted()
    {
        if (!a())
        {
            return;
        } else
        {
            a.onCompleted();
            return;
        }
    }

    public final void onError(Throwable throwable)
    {
        if (!a())
        {
            return;
        } else
        {
            a.onError(throwable);
            return;
        }
    }

    public final void onNext(Object obj)
    {
        if (!a())
        {
            return;
        } else
        {
            a.onNext(obj);
            return;
        }
    }

    private e(X x, e e)
    {
        a = x;
        b = e;
        request(0L);
    }

    request(X x, request request, byte byte0)
    {
        this(x, request);
    }
}
