// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments.googleplay:
//            BillingService, BillingServiceBinder, ResponseProcessor

public final class  extends b
    implements Provider
{

    private b binder;
    private b deviceHelper;
    private b eventBus;
    private b flags;
    private b processor;

    public final void attach(l l1)
    {
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/payments/googleplay/BillingService, getClass().getClassLoader());
        binder = l1.a("com.soundcloud.android.payments.googleplay.BillingServiceBinder", com/soundcloud/android/payments/googleplay/BillingService, getClass().getClassLoader());
        processor = l1.a("com.soundcloud.android.payments.googleplay.ResponseProcessor", com/soundcloud/android/payments/googleplay/BillingService, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/payments/googleplay/BillingService, getClass().getClassLoader());
        flags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/payments/googleplay/BillingService, getClass().getClassLoader());
    }

    public final BillingService get()
    {
        return new BillingService((DeviceHelper)deviceHelper.get(), (BillingServiceBinder)binder.get(), (ResponseProcessor)processor.get(), (EventBus)eventBus.get(), (FeatureFlags)flags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(deviceHelper);
        set.add(binder);
        set.add(processor);
        set.add(eventBus);
        set.add(flags);
    }

    public ()
    {
        super("com.soundcloud.android.payments.googleplay.BillingService", "members/com.soundcloud.android.payments.googleplay.BillingService", false, com/soundcloud/android/payments/googleplay/BillingService);
    }
}
