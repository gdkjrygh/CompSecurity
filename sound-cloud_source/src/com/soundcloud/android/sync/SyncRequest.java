// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import java.util.Collection;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncJob

public interface SyncRequest
{

    public abstract void finish();

    public abstract Collection getPendingJobs();

    public abstract boolean isHighPriority();

    public abstract boolean isSatisfied();

    public abstract boolean isWaitingForJob(SyncJob syncjob);

    public abstract void processJobResult(SyncJob syncjob);
}
