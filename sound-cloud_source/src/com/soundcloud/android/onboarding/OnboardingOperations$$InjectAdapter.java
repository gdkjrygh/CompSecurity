// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import com.soundcloud.android.api.ApiClientRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardingOperations

public final class  extends b
    implements Provider
{

    private b apiClientRx;
    private b scheduler;

    public final void attach(l l1)
    {
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/onboarding/OnboardingOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/onboarding/OnboardingOperations, getClass().getClassLoader());
    }

    public final OnboardingOperations get()
    {
        return new OnboardingOperations((ApiClientRx)apiClientRx.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClientRx);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.onboarding.OnboardingOperations", "members/com.soundcloud.android.onboarding.OnboardingOperations", false, com/soundcloud/android/onboarding/OnboardingOperations);
    }
}
