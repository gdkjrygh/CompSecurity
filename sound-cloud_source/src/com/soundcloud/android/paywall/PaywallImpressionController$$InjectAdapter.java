// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.paywall;

import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.paywall:
//            PaywallImpressionController

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b screenProvider;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/paywall/PaywallImpressionController, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/paywall/PaywallImpressionController, getClass().getClassLoader());
    }

    public final PaywallImpressionController get()
    {
        return new PaywallImpressionController((EventBus)eventBus.get(), (ScreenProvider)screenProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(screenProvider);
    }

    public ()
    {
        super("com.soundcloud.android.paywall.PaywallImpressionController", "members/com.soundcloud.android.paywall.PaywallImpressionController", false, com/soundcloud/android/paywall/PaywallImpressionController);
    }
}
