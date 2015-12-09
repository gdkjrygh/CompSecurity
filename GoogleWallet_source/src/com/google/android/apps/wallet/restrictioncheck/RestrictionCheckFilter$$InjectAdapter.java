// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.app.Activity;
import com.google.android.apps.wallet.user.UserInfoManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.restrictioncheck:
//            RestrictionCheckFilter, WalletRestrictionChecker

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding userInfoManager;
    private Binding walletRestrictionChecker;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/restrictioncheck/RestrictionCheckFilter, getClass().getClassLoader());
        walletRestrictionChecker = linker.requestBinding("com.google.android.apps.wallet.restrictioncheck.WalletRestrictionChecker", com/google/android/apps/wallet/restrictioncheck/RestrictionCheckFilter, getClass().getClassLoader());
        userInfoManager = linker.requestBinding("com.google.android.apps.wallet.user.UserInfoManager", com/google/android/apps/wallet/restrictioncheck/RestrictionCheckFilter, getClass().getClassLoader());
    }

    public final RestrictionCheckFilter get()
    {
        return new RestrictionCheckFilter((Activity)activity.get(), (WalletRestrictionChecker)walletRestrictionChecker.get(), (UserInfoManager)userInfoManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(walletRestrictionChecker);
        set.add(userInfoManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter", "members/com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter", false, com/google/android/apps/wallet/restrictioncheck/RestrictionCheckFilter);
    }
}
