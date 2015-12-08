// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.fragment;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.base.fragment:
//            WalletFragment

public final class _91_
    implements MembersInjector
{

    private Binding activityActionExecutor;
    private Binding analyticsUtil;
    private Binding fieldsInjected;

    public final void attach(Linker linker)
    {
        fieldsInjected = linker.requestBinding("@com.google.android.apps.wallet.base.fragment.BindingAnnotations$FieldsInjected()/java.lang.Boolean", com/google/android/apps/wallet/base/fragment/WalletFragment, getClass().getClassLoader());
        activityActionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor", com/google/android/apps/wallet/base/fragment/WalletFragment, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/base/fragment/WalletFragment, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(fieldsInjected);
        set1.add(activityActionExecutor);
        set1.add(analyticsUtil);
    }

    public final void injectMembers(WalletFragment walletfragment)
    {
        walletfragment.fieldsInjected = ((Boolean)fieldsInjected.get()).booleanValue();
        walletfragment.activityActionExecutor = (WalletActivityActionExecutor)activityActionExecutor.get();
        walletfragment.analyticsUtil = (AnalyticsUtil)analyticsUtil.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WalletFragment)obj);
    }

    public _91_()
    {
    }
}
