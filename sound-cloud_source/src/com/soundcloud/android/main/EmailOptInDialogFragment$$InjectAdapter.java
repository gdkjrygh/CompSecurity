// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.onboarding.OnboardingOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            EmailOptInDialogFragment

public final class I extends b
    implements a, Provider
{

    private b eventBus;
    private b onboardingOperations;

    public final void attach(l l1)
    {
        onboardingOperations = l1.a("com.soundcloud.android.onboarding.OnboardingOperations", com/soundcloud/android/main/EmailOptInDialogFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/main/EmailOptInDialogFragment, getClass().getClassLoader());
    }

    public final EmailOptInDialogFragment get()
    {
        EmailOptInDialogFragment emailoptindialogfragment = new EmailOptInDialogFragment();
        injectMembers(emailoptindialogfragment);
        return emailoptindialogfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(onboardingOperations);
        set1.add(eventBus);
    }

    public final void injectMembers(EmailOptInDialogFragment emailoptindialogfragment)
    {
        emailoptindialogfragment.onboardingOperations = (OnboardingOperations)onboardingOperations.get();
        emailoptindialogfragment.eventBus = (EventBus)eventBus.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((EmailOptInDialogFragment)obj);
    }

    public I()
    {
        super("com.soundcloud.android.main.EmailOptInDialogFragment", "members/com.soundcloud.android.main.EmailOptInDialogFragment", false, com/soundcloud/android/main/EmailOptInDialogFragment);
    }
}
