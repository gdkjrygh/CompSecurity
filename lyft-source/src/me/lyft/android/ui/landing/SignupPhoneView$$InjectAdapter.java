// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupPhoneView, LandingFlow

public final class  extends Binding
    implements MembersInjector
{

    private Binding landingFlow;

    public void attach(Linker linker)
    {
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/SignupPhoneView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(landingFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SignupPhoneView)obj);
    }

    public void injectMembers(SignupPhoneView signupphoneview)
    {
        signupphoneview.landingFlow = (LandingFlow)landingFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.SignupPhoneView", false, me/lyft/android/ui/landing/SignupPhoneView);
    }
}
