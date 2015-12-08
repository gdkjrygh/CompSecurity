// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.flows;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.flows:
//            ProfileFlow

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding appFlow;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/flows/ProfileFlow, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/flows/ProfileFlow, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ProfileFlow get()
    {
        ProfileFlow profileflow = new ProfileFlow();
        injectMembers(profileflow);
        return profileflow;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(userProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ProfileFlow)obj);
    }

    public void injectMembers(ProfileFlow profileflow)
    {
        profileflow.appFlow = (AppFlow)appFlow.get();
        profileflow.userProvider = (IUserProvider)userProvider.get();
    }

    public ()
    {
        super("me.lyft.android.flows.ProfileFlow", "members/me.lyft.android.flows.ProfileFlow", false, me/lyft/android/flows/ProfileFlow);
    }
}
