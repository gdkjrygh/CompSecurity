// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.googlenow.GoogleNowAuthenticationApi;

// Referenced classes of package me.lyft.android.jobs:
//            GoogleNowAuthorizationJob

public final class onApi extends Binding
    implements MembersInjector
{

    private Binding apiFacade;
    private Binding application;
    private Binding authenticationApi;
    private Binding preferences;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/GoogleNowAuthorizationJob, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/GoogleNowAuthorizationJob, getClass().getClassLoader());
        apiFacade = linker.requestBinding("me.lyft.android.facades.ApiFacade", me/lyft/android/jobs/GoogleNowAuthorizationJob, getClass().getClassLoader());
        authenticationApi = linker.requestBinding("me.lyft.android.infrastructure.googlenow.GoogleNowAuthenticationApi", me/lyft/android/jobs/GoogleNowAuthorizationJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(application);
        set1.add(preferences);
        set1.add(apiFacade);
        set1.add(authenticationApi);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((GoogleNowAuthorizationJob)obj);
    }

    public void injectMembers(GoogleNowAuthorizationJob googlenowauthorizationjob)
    {
        googlenowauthorizationjob.application = (LyftApplication)application.get();
        googlenowauthorizationjob.preferences = (ILyftPreferences)preferences.get();
        googlenowauthorizationjob.apiFacade = (ApiFacade)apiFacade.get();
        googlenowauthorizationjob.authenticationApi = (GoogleNowAuthenticationApi)authenticationApi.get();
    }

    public onApi()
    {
        super(null, "members/me.lyft.android.jobs.GoogleNowAuthorizationJob", false, me/lyft/android/jobs/GoogleNowAuthorizationJob);
    }
}
