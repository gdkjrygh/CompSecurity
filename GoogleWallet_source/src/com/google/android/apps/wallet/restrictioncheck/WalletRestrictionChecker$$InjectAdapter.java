// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.app.Application;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.user.UserInfoManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.restrictioncheck:
//            WalletRestrictionChecker

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding gservicesWrapper;
    private Binding userInfoManager;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/restrictioncheck/WalletRestrictionChecker, getClass().getClassLoader());
        gservicesWrapper = linker.requestBinding("com.google.android.apps.wallet.config.gservices.GservicesWrapper", com/google/android/apps/wallet/restrictioncheck/WalletRestrictionChecker, getClass().getClassLoader());
        userInfoManager = linker.requestBinding("com.google.android.apps.wallet.user.UserInfoManager", com/google/android/apps/wallet/restrictioncheck/WalletRestrictionChecker, getClass().getClassLoader());
    }

    public final WalletRestrictionChecker get()
    {
        return new WalletRestrictionChecker((Application)application.get(), (GservicesWrapper)gservicesWrapper.get(), (UserInfoManager)userInfoManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(gservicesWrapper);
        set.add(userInfoManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.restrictioncheck.WalletRestrictionChecker", "members/com.google.android.apps.wallet.restrictioncheck.WalletRestrictionChecker", true, com/google/android/apps/wallet/restrictioncheck/WalletRestrictionChecker);
    }
}
