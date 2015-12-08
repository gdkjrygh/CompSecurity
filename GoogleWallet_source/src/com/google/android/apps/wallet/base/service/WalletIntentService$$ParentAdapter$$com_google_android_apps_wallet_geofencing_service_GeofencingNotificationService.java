// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.service;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.restrictioncheck.WalletRestrictionChecker;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.base.service:
//            WalletIntentService

public final class 
    implements MembersInjector
{

    private Binding restrictionChecker;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        restrictionChecker = linker.requestBinding("com.google.android.apps.wallet.restrictioncheck.WalletRestrictionChecker", com/google/android/apps/wallet/base/service/WalletIntentService, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/base/service/WalletIntentService, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(restrictionChecker);
        set1.add(sharedPreferences);
    }

    public final void injectMembers(WalletIntentService walletintentservice)
    {
        walletintentservice.restrictionChecker = (WalletRestrictionChecker)restrictionChecker.get();
        walletintentservice.sharedPreferences = (SharedPreferences)sharedPreferences.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WalletIntentService)obj);
    }

    public ()
    {
    }
}
