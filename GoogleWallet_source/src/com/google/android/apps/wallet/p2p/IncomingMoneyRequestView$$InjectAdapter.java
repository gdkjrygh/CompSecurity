// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestView

public final class  extends Binding
    implements MembersInjector
{

    private Binding actionExecutor;
    private Binding analyticsUtil;
    private Binding contactsUtil;
    private Binding featureManager;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        contactsUtil = linker.requestBinding("com.google.android.apps.wallet.p2p.people.ContactsUtil", com/google/android/apps/wallet/p2p/IncomingMoneyRequestView, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/p2p/IncomingMoneyRequestView, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/p2p/IncomingMoneyRequestView, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/p2p/IncomingMoneyRequestView, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/p2p/IncomingMoneyRequestView, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(contactsUtil);
        set1.add(actionExecutor);
        set1.add(analyticsUtil);
        set1.add(uriRegistry);
        set1.add(featureManager);
    }

    public final void injectMembers(IncomingMoneyRequestView incomingmoneyrequestview)
    {
        incomingmoneyrequestview.contactsUtil = (ContactsUtil)contactsUtil.get();
        incomingmoneyrequestview.actionExecutor = (ActionExecutor)actionExecutor.get();
        incomingmoneyrequestview.analyticsUtil = (AnalyticsUtil)analyticsUtil.get();
        incomingmoneyrequestview.uriRegistry = (UriRegistry)uriRegistry.get();
        incomingmoneyrequestview.featureManager = (FeatureManager)featureManager.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((IncomingMoneyRequestView)obj);
    }

    public ()
    {
        super(null, "members/com.google.android.apps.wallet.p2p.IncomingMoneyRequestView", false, com/google/android/apps/wallet/p2p/IncomingMoneyRequestView);
    }
}
