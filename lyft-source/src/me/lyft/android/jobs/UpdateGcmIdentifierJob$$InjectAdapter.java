// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.gcm.IGcmIdService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateGcmIdentifierJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding defaultErrorHandler;
    private Binding gcmIdService;
    private Binding lyftApi;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/jobs/UpdateGcmIdentifierJob, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/jobs/UpdateGcmIdentifierJob, getClass().getClassLoader());
        gcmIdService = linker.requestBinding("me.lyft.android.infrastructure.gcm.IGcmIdService", me/lyft/android/jobs/UpdateGcmIdentifierJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftApi);
        set1.add(defaultErrorHandler);
        set1.add(gcmIdService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateGcmIdentifierJob)obj);
    }

    public void injectMembers(UpdateGcmIdentifierJob updategcmidentifierjob)
    {
        updategcmidentifierjob.lyftApi = (ILyftApi)lyftApi.get();
        updategcmidentifierjob.defaultErrorHandler = (IDefaultErrorHandler)defaultErrorHandler.get();
        updategcmidentifierjob.gcmIdService = (IGcmIdService)gcmIdService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.UpdateGcmIdentifierJob", false, me/lyft/android/jobs/UpdateGcmIdentifierJob);
    }
}
