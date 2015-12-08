// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradeActivity, UpgradePresenter

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b supertype;
    private b upgradePresenter;

    public final void attach(l l1)
    {
        upgradePresenter = l1.a("com.soundcloud.android.payments.UpgradePresenter", com/soundcloud/android/payments/UpgradeActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/payments/UpgradeActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/payments/UpgradeActivity, getClass().getClassLoader(), false);
    }

    public final UpgradeActivity get()
    {
        UpgradeActivity upgradeactivity = new UpgradeActivity();
        injectMembers(upgradeactivity);
        return upgradeactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(upgradePresenter);
        set1.add(baseLayoutHelper);
        set1.add(supertype);
    }

    public final void injectMembers(UpgradeActivity upgradeactivity)
    {
        upgradeactivity.upgradePresenter = (UpgradePresenter)upgradePresenter.get();
        upgradeactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        supertype.injectMembers(upgradeactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UpgradeActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.payments.UpgradeActivity", "members/com.soundcloud.android.payments.UpgradeActivity", false, com/soundcloud/android/payments/UpgradeActivity);
    }
}
