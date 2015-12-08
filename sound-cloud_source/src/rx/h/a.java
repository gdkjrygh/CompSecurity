// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.h;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Y;

public final class a
    implements Y
{

    static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(rx/h/a, "a");
    volatile int a;
    private final rx.b.a c;

    public a()
    {
        c = null;
    }

    private a(rx.b.a a1)
    {
        c = a1;
    }

    public static a a()
    {
        return new a();
    }

    public static a a(rx.b.a a1)
    {
        return new a(a1);
    }

    public final boolean isUnsubscribed()
    {
        return a != 0;
    }

    public final void unsubscribe()
    {
        if (b.compareAndSet(this, 0, 1) && c != null)
        {
            c.call();
        }
    }

}
