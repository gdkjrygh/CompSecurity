// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.AppFlow;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.persistence.landing.ISignUpUserRepository;

// Referenced classes of package me.lyft.android.ui.landing:
//            IntroductionView, LandingFlow

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding developerTools;
    private Binding landingFlow;
    private Binding lyftPreferences;
    private Binding signUpUserRepository;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/landing/IntroductionView, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/IntroductionView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/landing/IntroductionView, getClass().getClassLoader());
        developerTools = linker.requestBinding("me.lyft.android.development.DeveloperTools", me/lyft/android/ui/landing/IntroductionView, getClass().getClassLoader());
        signUpUserRepository = linker.requestBinding("me.lyft.android.persistence.landing.ISignUpUserRepository", me/lyft/android/ui/landing/IntroductionView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(landingFlow);
        set1.add(lyftPreferences);
        set1.add(developerTools);
        set1.add(signUpUserRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((IntroductionView)obj);
    }

    public void injectMembers(IntroductionView introductionview)
    {
        introductionview.appFlow = (AppFlow)appFlow.get();
        introductionview.landingFlow = (LandingFlow)landingFlow.get();
        introductionview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        introductionview.developerTools = (DeveloperTools)developerTools.get();
        introductionview.signUpUserRepository = (ISignUpUserRepository)signUpUserRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.IntroductionView", false, me/lyft/android/ui/landing/IntroductionView);
    }
}
