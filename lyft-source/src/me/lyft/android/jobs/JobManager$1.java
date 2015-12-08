// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import rx.functions.Action0;

// Referenced classes of package me.lyft.android.jobs:
//            JobManager, Job

class val.worker
    implements Action0
{

    final JobManager this$0;
    final Job val$job;
    final rx.ker val$worker;

    public void call()
    {
        JobManager.access$000(JobManager.this, val$job);
        val$worker.unsubscribe();
    }

    ()
    {
        this$0 = final_jobmanager;
        val$job = job1;
        val$worker = rx.ker.this;
        super();
    }
}
