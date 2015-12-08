// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.jobs.JobManager;
import me.lyft.android.managers.DeepLinkManager;

// Referenced classes of package me.lyft.android:
//            AppModule, IUserSession

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding jobManager;
    private final AppModule module;
    private Binding profileFlow;
    private Binding userSession;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/AppModule, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/AppModule, getClass().getClassLoader());
        jobManager = linker.requestBinding("me.lyft.android.jobs.JobManager", me/lyft/android/AppModule, getClass().getClassLoader());
        profileFlow = linker.requestBinding("me.lyft.android.flows.ProfileFlow", me/lyft/android/AppModule, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public DeepLinkManager get()
    {
        return module.provideDeepLinkManager((AppFlow)appFlow.get(), (IUserSession)userSession.get(), (JobManager)jobManager.get(), (ProfileFlow)profileFlow.get(), (DialogFlow)dialogFlow.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(appFlow);
        set.add(userSession);
        set.add(jobManager);
        set.add(profileFlow);
        set.add(dialogFlow);
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.managers.DeepLinkManager", true, "me.lyft.android.AppModule", "provideDeepLinkManager");
        module = appmodule;
        setLibrary(true);
    }
}
