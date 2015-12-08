// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.landing.ILandingService;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateFacebookTokenJob

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding landingService;

    public void attach(Linker linker)
    {
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/jobs/UpdateFacebookTokenJob, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public UpdateFacebookTokenJob get()
    {
        UpdateFacebookTokenJob updatefacebooktokenjob = new UpdateFacebookTokenJob();
        injectMembers(updatefacebooktokenjob);
        return updatefacebooktokenjob;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(landingService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateFacebookTokenJob)obj);
    }

    public void injectMembers(UpdateFacebookTokenJob updatefacebooktokenjob)
    {
        updatefacebooktokenjob.landingService = (ILandingService)landingService.get();
    }

    public ()
    {
        super("me.lyft.android.jobs.UpdateFacebookTokenJob", "members/me.lyft.android.jobs.UpdateFacebookTokenJob", false, me/lyft/android/jobs/UpdateFacebookTokenJob);
    }
}
