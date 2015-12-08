// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.android.plugins;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package rx.android.plugins:
//            RxAndroidSchedulersHook

public final class RxAndroidPlugins
{

    private static final RxAndroidPlugins INSTANCE = new RxAndroidPlugins();
    private final AtomicReference schedulersHook = new AtomicReference();

    RxAndroidPlugins()
    {
    }

    public static RxAndroidPlugins getInstance()
    {
        return INSTANCE;
    }

    public RxAndroidSchedulersHook getSchedulersHook()
    {
        if (schedulersHook.get() == null)
        {
            schedulersHook.compareAndSet(null, RxAndroidSchedulersHook.getDefaultInstance());
        }
        return (RxAndroidSchedulersHook)schedulersHook.get();
    }

    public void registerSchedulersHook(RxAndroidSchedulersHook rxandroidschedulershook)
    {
        if (!schedulersHook.compareAndSet(null, rxandroidschedulershook))
        {
            throw new IllegalStateException((new StringBuilder()).append("Another strategy was already registered: ").append(schedulersHook.get()).toString());
        } else
        {
            return;
        }
    }

    public void reset()
    {
        schedulersHook.set(null);
    }

}
