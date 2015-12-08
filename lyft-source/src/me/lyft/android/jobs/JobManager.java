// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.ObjectGraph;
import me.lyft.android.LyftApplication;
import me.lyft.android.logging.L;
import rx.Scheduler;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class JobManager
{

    private final ObjectGraph applicationGraph;

    public JobManager(LyftApplication lyftapplication)
    {
        applicationGraph = lyftapplication.getApplicationGraph().plus(new Object[] {
            new JobModule()
        });
    }

    private void executeJob(Job job)
    {
        try
        {
            applicationGraph.inject(job);
            job.execute();
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, (new StringBuilder()).append("failed to execute job:").append(job.getClass().getSimpleName()).toString(), new Object[0]);
        }
    }

    private void queueJob(final Job job, final Scheduler worker)
    {
        worker = worker.createWorker();
        worker.schedule(new Action0() {

            final JobManager this$0;
            final Job val$job;
            final rx.Scheduler.Worker val$worker;

            public void call()
            {
                executeJob(job);
                worker.unsubscribe();
            }

            
            {
                this$0 = JobManager.this;
                job = job1;
                worker = worker1;
                super();
            }
        });
    }

    public void queueBackgroundJob(Job job)
    {
        queueJob(job, Schedulers.newThread());
    }

    public void queueImmediateJob(Job job)
    {
        executeJob(job);
    }


    private class JobModule
    {

        final JobManager this$0;

        public JobModule()
        {
            this$0 = JobManager.this;
            super();
        }
    }

}
