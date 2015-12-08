// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.squareup.okhttp.OkHttpClient;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.jobs:
//            ConfigureProxyJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding lyftPreferences;
    private Binding okHttpClient;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/ConfigureProxyJob, getClass().getClassLoader());
        okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/jobs/ConfigureProxyJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftPreferences);
        set1.add(okHttpClient);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ConfigureProxyJob)obj);
    }

    public void injectMembers(ConfigureProxyJob configureproxyjob)
    {
        configureproxyjob.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        configureproxyjob.okHttpClient = (OkHttpClient)okHttpClient.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.ConfigureProxyJob", false, me/lyft/android/jobs/ConfigureProxyJob);
    }
}
