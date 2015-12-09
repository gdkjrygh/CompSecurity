// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyTile

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;
    private Binding contactsUtil;
    private Binding eventBus;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/p2p/ClaimMoneyTile, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/p2p/ClaimMoneyTile, getClass().getClassLoader());
        contactsUtil = linker.requestBinding("com.google.android.apps.wallet.p2p.people.ContactsUtil", com/google/android/apps/wallet/p2p/ClaimMoneyTile, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/p2p/ClaimMoneyTile, getClass().getClassLoader());
    }

    public final ClaimMoneyTile get()
    {
        return new ClaimMoneyTile((Activity)activity.get(), (EventBus)eventBus.get(), (ContactsUtil)contactsUtil.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(contactsUtil);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.p2p.ClaimMoneyTile", "members/com.google.android.apps.wallet.p2p.ClaimMoneyTile", false, com/google/android/apps/wallet/p2p/ClaimMoneyTile);
    }
}
