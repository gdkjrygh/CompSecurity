// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.help:
//            HelpUriAction, HelpContextProvider

public final class  extends Binding
    implements Provider
{

    private Binding account;
    private Binding activity;
    private Binding analyticsUtil;
    private Binding helpContextProvider;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/help/HelpUriAction, getClass().getClassLoader());
        helpContextProvider = linker.requestBinding("com.google.android.apps.wallet.help.HelpContextProvider", com/google/android/apps/wallet/help/HelpUriAction, getClass().getClassLoader());
        account = linker.requestBinding("@com.google.android.apps.wallet.account.api.BindingAnnotations$WalletGaiaAccount()/javax.inject.Provider<android.accounts.Account>", com/google/android/apps/wallet/help/HelpUriAction, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/help/HelpUriAction, getClass().getClassLoader());
    }

    public final HelpUriAction get()
    {
        return new HelpUriAction((Activity)activity.get(), (HelpContextProvider)helpContextProvider.get(), (Provider)account.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(helpContextProvider);
        set.add(account);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.help.HelpUriAction", "members/com.google.android.apps.wallet.help.HelpUriAction", false, com/google/android/apps/wallet/help/HelpUriAction);
    }
}
