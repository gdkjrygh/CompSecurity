// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.Executor;
import rx.Scheduler;
import rx.internal.schedulers.EventLoopsScheduler;
import rx.plugins.RxJavaPlugins;
import rx.plugins.RxJavaSchedulersHook;

// Referenced classes of package rx.schedulers:
//            CachedThreadScheduler, NewThreadScheduler, ExecutorScheduler, ImmediateScheduler, 
//            TestScheduler, TrampolineScheduler

public final class Schedulers
{

    private static final Schedulers INSTANCE = new Schedulers();
    private final Scheduler computationScheduler;
    private final Scheduler ioScheduler;
    private final Scheduler newThreadScheduler;

    private Schedulers()
    {
        Scheduler scheduler = RxJavaPlugins.getInstance().getSchedulersHook().getComputationScheduler();
        if (scheduler != null)
        {
            computationScheduler = scheduler;
        } else
        {
            computationScheduler = new EventLoopsScheduler();
        }
        scheduler = RxJavaPlugins.getInstance().getSchedulersHook().getIOScheduler();
        if (scheduler != null)
        {
            ioScheduler = scheduler;
        } else
        {
            ioScheduler = new CachedThreadScheduler();
        }
        scheduler = RxJavaPlugins.getInstance().getSchedulersHook().getNewThreadScheduler();
        if (scheduler != null)
        {
            newThreadScheduler = scheduler;
            return;
        } else
        {
            newThreadScheduler = NewThreadScheduler.instance();
            return;
        }
    }

    public static Scheduler computation()
    {
        return INSTANCE.computationScheduler;
    }

    public static Scheduler from(Executor executor)
    {
        return new ExecutorScheduler(executor);
    }

    public static Scheduler immediate()
    {
        return ImmediateScheduler.instance();
    }

    public static Scheduler io()
    {
        return INSTANCE.ioScheduler;
    }

    public static Scheduler newThread()
    {
        return INSTANCE.newThreadScheduler;
    }

    public static TestScheduler test()
    {
        return new TestScheduler();
    }

    public static Scheduler trampoline()
    {
        return TrampolineScheduler.instance();
    }

}
