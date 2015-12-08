// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.persistence.landing.ISignUpUserRepository;

// Referenced classes of package me.lyft.android.ui.landing:
//            TermsOfServiceView, LandingFlow

public final class  extends Binding
    implements MembersInjector
{

    private Binding landingFlow;
    private Binding landingService;
    private Binding signUpUserRepository;

    public void attach(Linker linker)
    {
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/TermsOfServiceView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/ui/landing/TermsOfServiceView, getClass().getClassLoader());
        signUpUserRepository = linker.requestBinding("me.lyft.android.persistence.landing.ISignUpUserRepository", me/lyft/android/ui/landing/TermsOfServiceView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(landingFlow);
        set1.add(landingService);
        set1.add(signUpUserRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TermsOfServiceView)obj);
    }

    public void injectMembers(TermsOfServiceView termsofserviceview)
    {
        termsofserviceview.landingFlow = (LandingFlow)landingFlow.get();
        termsofserviceview.landingService = (ILandingService)landingService.get();
        termsofserviceview.signUpUserRepository = (ISignUpUserRepository)signUpUserRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.TermsOfServiceView", false, me/lyft/android/ui/landing/TermsOfServiceView);
    }
}
