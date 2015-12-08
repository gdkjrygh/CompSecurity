// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import com.google.android.gms.iid.InstanceIDListenerService;
import me.lyft.android.IUserSession;
import me.lyft.android.LyftApplication;
import me.lyft.android.infrastructure.gcm.IGcmIdService;
import me.lyft.android.jobs.JobManager;
import me.lyft.android.jobs.UpdateGcmIdentifierJob;

public class GcmIdListenerService extends InstanceIDListenerService
{

    IGcmIdService gcmIdService;
    JobManager jobManager;
    IUserSession userSession;

    public GcmIdListenerService()
    {
    }

    private LyftApplication getLyftApplication()
    {
        return (LyftApplication)getApplication();
    }

    public void onTokenRefresh()
    {
        getLyftApplication().inject(this);
        gcmIdService.removeStoredRegistrationId();
        jobManager.queueBackgroundJob(new UpdateGcmIdentifierJob(userSession.getUser()));
    }
}
