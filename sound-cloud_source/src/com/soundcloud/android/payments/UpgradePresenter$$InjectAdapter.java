// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradePresenter, PaymentOperations, PaymentErrorPresenter, UpgradeView

public final class  extends b
    implements a, Provider
{

    private b configurationManager;
    private b eventBus;
    private b paymentErrorPresenter;
    private b paymentOperations;
    private b supertype;
    private b upgradeView;

    public final void attach(l l1)
    {
        paymentOperations = l1.a("com.soundcloud.android.payments.PaymentOperations", com/soundcloud/android/payments/UpgradePresenter, getClass().getClassLoader());
        paymentErrorPresenter = l1.a("com.soundcloud.android.payments.PaymentErrorPresenter", com/soundcloud/android/payments/UpgradePresenter, getClass().getClassLoader());
        configurationManager = l1.a("com.soundcloud.android.configuration.ConfigurationManager", com/soundcloud/android/payments/UpgradePresenter, getClass().getClassLoader());
        upgradeView = l1.a("com.soundcloud.android.payments.UpgradeView", com/soundcloud/android/payments/UpgradePresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/payments/UpgradePresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/payments/UpgradePresenter, getClass().getClassLoader(), false);
    }

    public final UpgradePresenter get()
    {
        UpgradePresenter upgradepresenter = new UpgradePresenter((PaymentOperations)paymentOperations.get(), (PaymentErrorPresenter)paymentErrorPresenter.get(), (ConfigurationManager)configurationManager.get(), (UpgradeView)upgradeView.get(), (EventBus)eventBus.get());
        injectMembers(upgradepresenter);
        return upgradepresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(paymentOperations);
        set.add(paymentErrorPresenter);
        set.add(configurationManager);
        set.add(upgradeView);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(UpgradePresenter upgradepresenter)
    {
        supertype.injectMembers(upgradepresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UpgradePresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.payments.UpgradePresenter", "members/com.soundcloud.android.payments.UpgradePresenter", false, com/soundcloud/android/payments/UpgradePresenter);
    }
}
