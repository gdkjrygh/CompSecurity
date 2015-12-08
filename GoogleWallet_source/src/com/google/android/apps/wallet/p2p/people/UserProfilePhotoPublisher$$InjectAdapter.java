// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.people;

import android.accounts.Account;
import android.app.Application;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.gms.common.api.GoogleApiClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.p2p.people:
//            UserProfilePhotoPublisher

public final class  extends Binding
    implements Provider
{

    private Binding account;
    private Binding application;
    private Binding eventBus;
    private Binding executor;
    private Binding peopleClient;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        account = linker.requestBinding("@com.google.android.apps.wallet.account.api.BindingAnnotations$WalletGaiaAccount()/android.accounts.Account", com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher, getClass().getClassLoader());
        executor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher, getClass().getClassLoader());
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher, getClass().getClassLoader());
        peopleClient = linker.requestBinding("@com.google.android.apps.wallet.gms.BindingAnnotations$PeopleClient()/com.google.android.gms.common.api.GoogleApiClient", com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher, getClass().getClassLoader());
    }

    public final UserProfilePhotoPublisher get()
    {
        return new UserProfilePhotoPublisher((Account)account.get(), (EventBus)eventBus.get(), (ActionExecutor)executor.get(), (Application)application.get(), (ThreadChecker)threadChecker.get(), (GoogleApiClient)peopleClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(account);
        set.add(eventBus);
        set.add(executor);
        set.add(application);
        set.add(threadChecker);
        set.add(peopleClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.p2p.people.UserProfilePhotoPublisher", "members/com.google.android.apps.wallet.p2p.people.UserProfilePhotoPublisher", true, com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher);
    }
}
