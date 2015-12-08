// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// Referenced classes of package rx.internal.util:
//            FrontPadding

abstract class PaddedAtomicIntegerBase extends FrontPadding
{

    private static final long serialVersionUID = 0x5a6354c9ad4891feL;
    private static final AtomicIntegerFieldUpdater updater = AtomicIntegerFieldUpdater.newUpdater(rx/internal/util/PaddedAtomicIntegerBase, "value");
    private volatile int value;

    PaddedAtomicIntegerBase()
    {
    }

    public final int addAndGet(int i)
    {
        return updater.addAndGet(this, i);
    }

    public final boolean compareAndSet(int i, int j)
    {
        return updater.compareAndSet(this, i, j);
    }

    public final int decrementAndGet()
    {
        return updater.decrementAndGet(this);
    }

    public final int get()
    {
        return value;
    }

    public final int getAndAdd(int i)
    {
        return updater.getAndAdd(this, i);
    }

    public final int getAndDecrement()
    {
        return updater.getAndDecrement(this);
    }

    public final int getAndIncrement()
    {
        return updater.getAndIncrement(this);
    }

    public final int getAndSet(int i)
    {
        return updater.getAndSet(this, value);
    }

    public final int incrementAndGet()
    {
        return updater.incrementAndGet(this);
    }

    public final void lazySet(int i)
    {
        updater.lazySet(this, i);
    }

    public final void set(int i)
    {
        value = i;
    }

    public String toString()
    {
        return String.valueOf(get());
    }

    public final boolean weakCompareAndSet(int i, int j)
    {
        return updater.weakCompareAndSet(this, i, j);
    }

}
