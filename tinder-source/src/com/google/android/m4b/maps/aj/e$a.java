// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.y.j;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            a, e, b, f, 
//            l, i

static final class <init> extends a
    implements Runnable
{

    private b b;
    private f c;
    private volatile f d;
    private final CountDownLatch e;

    static f a(<init> <init>1)
    {
        <init>1.d = null;
        return null;
    }

    private static void a(Future future, boolean flag)
    {
        if (future != null)
        {
            future.cancel(flag);
        }
    }

    public final boolean cancel(boolean flag)
    {
        if (super.cancel(flag))
        {
            a(c, flag);
            a(d, flag);
            return true;
        } else
        {
            return false;
        }
    }

    public final void run()
    {
        Object obj = l.a(c);
        obj = (f)j.a(b.a(obj), "AsyncFunction may not return null.");
        d = ((f) (obj));
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_129;
        }
        ((f) (obj)).cancel(super.a.d());
        d = null;
        b = null;
        c = null;
        e.countDown();
        return;
        obj;
        cancel(false);
        b = null;
        c = null;
        e.countDown();
        return;
        obj;
        a(((ExecutionException) (obj)).getCause());
        b = null;
        c = null;
        e.countDown();
        return;
        ((f) (obj)).a(new Runnable(((f) (obj))) {

            private f a;
            private e.a b;

            public final void run()
            {
                b.a(l.a(a));
                e.a.a(b);
                return;
                Object obj2;
                obj2;
                b.cancel(false);
                e.a.a(b);
                return;
                obj2;
                b.a(((ExecutionException) (obj2)).getCause());
                e.a.a(b);
                return;
                obj2;
                e.a.a(b);
                throw obj2;
            }

            
            {
                b = e.a.this;
                a = f1;
                super();
            }
        }, i.a());
        b = null;
        c = null;
        e.countDown();
        return;
        Object obj1;
        obj1;
        a(((UndeclaredThrowableException) (obj1)).getCause());
        b = null;
        c = null;
        e.countDown();
        return;
        obj1;
        a(((Throwable) (obj1)));
        b = null;
        c = null;
        e.countDown();
        return;
        obj1;
        b = null;
        c = null;
        e.countDown();
        throw obj1;
    }

    private _cls1.a(b b1, f f1)
    {
        e = new CountDownLatch(1);
        b = (b)j.a(b1);
        c = (f)j.a(f1);
    }

    c(b b1, f f1, byte byte0)
    {
        this(b1, f1);
    }
}
