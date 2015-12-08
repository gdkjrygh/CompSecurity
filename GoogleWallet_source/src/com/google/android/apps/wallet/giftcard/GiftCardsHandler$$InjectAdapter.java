// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsHandler, GiftCardsClient

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;
    private Binding appControl;
    private Binding giftCardsClient;
    private Binding packageManager;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/giftcard/GiftCardsHandler, getClass().getClassLoader());
        giftCardsClient = linker.requestBinding("com.google.android.apps.wallet.giftcard.GiftCardsClient", com/google/android/apps/wallet/giftcard/GiftCardsHandler, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/giftcard/GiftCardsHandler, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/giftcard/GiftCardsHandler, getClass().getClassLoader());
        packageManager = linker.requestBinding("android.content.pm.PackageManager", com/google/android/apps/wallet/giftcard/GiftCardsHandler, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/giftcard/GiftCardsHandler, getClass().getClassLoader());
    }

    public final GiftCardsHandler get()
    {
        return new GiftCardsHandler((FragmentActivity)activity.get(), (GiftCardsClient)giftCardsClient.get(), (SharedPreferences)sharedPreferences.get(), (AppControl)appControl.get(), (PackageManager)packageManager.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(giftCardsClient);
        set.add(sharedPreferences);
        set.add(appControl);
        set.add(packageManager);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.giftcard.GiftCardsHandler", "members/com.google.android.apps.wallet.giftcard.GiftCardsHandler", false, com/google/android/apps/wallet/giftcard/GiftCardsHandler);
    }
}
