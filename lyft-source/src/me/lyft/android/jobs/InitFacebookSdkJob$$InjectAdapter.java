// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.jobs:
//            InitFacebookSdkJob

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding application;
    private Binding preferences;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/InitFacebookSdkJob, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/InitFacebookSdkJob, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public InitFacebookSdkJob get()
    {
        InitFacebookSdkJob initfacebooksdkjob = new InitFacebookSdkJob();
        injectMembers(initfacebooksdkjob);
        return initfacebooksdkjob;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(application);
        set1.add(preferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InitFacebookSdkJob)obj);
    }

    public void injectMembers(InitFacebookSdkJob initfacebooksdkjob)
    {
        initfacebooksdkjob.application = (LyftApplication)application.get();
        initfacebooksdkjob.preferences = (ILyftPreferences)preferences.get();
    }

    public ()
    {
        super("me.lyft.android.jobs.InitFacebookSdkJob", "members/me.lyft.android.jobs.InitFacebookSdkJob", false, me/lyft/android/jobs/InitFacebookSdkJob);
    }
}
