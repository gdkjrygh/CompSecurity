// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            RecoverActivity

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b publicApi;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/onboarding/auth/RecoverActivity, getClass().getClassLoader());
        publicApi = l1.a("com.soundcloud.android.api.legacy.PublicApi", com/soundcloud/android/onboarding/auth/RecoverActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.TrackedActivity", com/soundcloud/android/onboarding/auth/RecoverActivity, getClass().getClassLoader(), false);
    }

    public final RecoverActivity get()
    {
        RecoverActivity recoveractivity = new RecoverActivity();
        injectMembers(recoveractivity);
        return recoveractivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        set1.add(publicApi);
        set1.add(supertype);
    }

    public final void injectMembers(RecoverActivity recoveractivity)
    {
        recoveractivity.eventBus = (EventBus)eventBus.get();
        recoveractivity.publicApi = (PublicApi)publicApi.get();
        supertype.injectMembers(recoveractivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecoverActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.onboarding.auth.RecoverActivity", "members/com.soundcloud.android.onboarding.auth.RecoverActivity", false, com/soundcloud/android/onboarding/auth/RecoverActivity);
    }
}
