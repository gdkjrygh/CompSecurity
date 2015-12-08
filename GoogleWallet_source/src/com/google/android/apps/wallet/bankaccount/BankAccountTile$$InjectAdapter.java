// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.app.Activity;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            BankAccountTile

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding eventBus;
    private Binding networkAccessChecker;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/bankaccount/BankAccountTile, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/bankaccount/BankAccountTile, getClass().getClassLoader());
        networkAccessChecker = linker.requestBinding("com.google.android.apps.wallet.network.ui.NetworkAccessChecker", com/google/android/apps/wallet/bankaccount/BankAccountTile, getClass().getClassLoader());
    }

    public final BankAccountTile get()
    {
        return new BankAccountTile((Activity)activity.get(), (EventBus)eventBus.get(), (NetworkAccessChecker)networkAccessChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(networkAccessChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.bankaccount.BankAccountTile", "members/com.google.android.apps.wallet.bankaccount.BankAccountTile", false, com/google/android/apps/wallet/bankaccount/BankAccountTile);
    }
}
