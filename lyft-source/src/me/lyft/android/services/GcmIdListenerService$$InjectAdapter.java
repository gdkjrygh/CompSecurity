// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.gcm.IGcmIdService;
import me.lyft.android.jobs.JobManager;

// Referenced classes of package me.lyft.android.services:
//            GcmIdListenerService

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding gcmIdService;
    private Binding jobManager;
    private Binding supertype;
    private Binding userSession;

    public void attach(Linker linker)
    {
        jobManager = linker.requestBinding("me.lyft.android.jobs.JobManager", me/lyft/android/services/GcmIdListenerService, getClass().getClassLoader());
        gcmIdService = linker.requestBinding("me.lyft.android.infrastructure.gcm.IGcmIdService", me/lyft/android/services/GcmIdListenerService, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/services/GcmIdListenerService, getClass().getClassLoader());
        supertype = linker.requestBinding("members/com.google.android.gms.iid.InstanceIDListenerService", me/lyft/android/services/GcmIdListenerService, getClass().getClassLoader(), false, true);
    }

    public volatile Object get()
    {
        return get();
    }

    public GcmIdListenerService get()
    {
        GcmIdListenerService gcmidlistenerservice = new GcmIdListenerService();
        injectMembers(gcmidlistenerservice);
        return gcmidlistenerservice;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(jobManager);
        set1.add(gcmIdService);
        set1.add(userSession);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((GcmIdListenerService)obj);
    }

    public void injectMembers(GcmIdListenerService gcmidlistenerservice)
    {
        gcmidlistenerservice.jobManager = (JobManager)jobManager.get();
        gcmidlistenerservice.gcmIdService = (IGcmIdService)gcmIdService.get();
        gcmidlistenerservice.userSession = (IUserSession)userSession.get();
        supertype.injectMembers(gcmidlistenerservice);
    }

    public ()
    {
        super("me.lyft.android.services.GcmIdListenerService", "members/me.lyft.android.services.GcmIdListenerService", false, me/lyft/android/services/GcmIdListenerService);
    }
}
