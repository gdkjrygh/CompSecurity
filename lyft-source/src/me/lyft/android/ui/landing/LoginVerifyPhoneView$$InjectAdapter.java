// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.landing:
//            LoginVerifyPhoneView, LandingFlow

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding landingFlow;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/landing/LoginVerifyPhoneView, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/LoginVerifyPhoneView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/landing/LoginVerifyPhoneView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(landingFlow);
        set1.add(userProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((LoginVerifyPhoneView)obj);
    }

    public void injectMembers(LoginVerifyPhoneView loginverifyphoneview)
    {
        loginverifyphoneview.appFlow = (AppFlow)appFlow.get();
        loginverifyphoneview.landingFlow = (LandingFlow)landingFlow.get();
        loginverifyphoneview.userProvider = (IUserProvider)userProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.LoginVerifyPhoneView", false, me/lyft/android/ui/landing/LoginVerifyPhoneView);
    }
}
