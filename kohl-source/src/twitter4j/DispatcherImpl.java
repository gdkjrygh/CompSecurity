// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            Dispatcher

final class DispatcherImpl
    implements Dispatcher
{

    private final ExecutorService executorService;

    public DispatcherImpl(final Configuration conf)
    {
        executorService = Executors.newFixedThreadPool(conf.getAsyncNumThreads(), new ThreadFactory() {

            int count;
            final DispatcherImpl this$0;
            final Configuration val$conf;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                int i = count;
                count = i + 1;
                runnable.setName(String.format("Twitter4J Async Dispatcher[%d]", new Object[] {
                    Integer.valueOf(i)
                }));
                runnable.setDaemon(conf.isDaemonEnabled());
                return runnable;
            }

            
            {
                this$0 = DispatcherImpl.this;
                conf = configuration;
                super();
                count = 0;
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread() {

            final DispatcherImpl this$0;

            public void run()
            {
                executorService.shutdown();
            }

            
            {
                this$0 = DispatcherImpl.this;
                super();
            }
        });
    }

    public void invokeLater(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        executorService.execute(runnable);
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    public void shutdown()
    {
        this;
        JVM INSTR monitorenter ;
        executorService.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
