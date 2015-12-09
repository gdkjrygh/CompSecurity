// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            OnBootOrUpgradeReceiver

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding globalPrefs;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/init/OnBootOrUpgradeReceiver, getClass().getClassLoader());
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/init/OnBootOrUpgradeReceiver, getClass().getClassLoader());
    }

    public final OnBootOrUpgradeReceiver get()
    {
        OnBootOrUpgradeReceiver onbootorupgradereceiver = new OnBootOrUpgradeReceiver();
        injectMembers(onbootorupgradereceiver);
        return onbootorupgradereceiver;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(globalPrefs);
        set1.add(userPrefs);
    }

    public final void injectMembers(OnBootOrUpgradeReceiver onbootorupgradereceiver)
    {
        onbootorupgradereceiver.globalPrefs = (SharedPreferences)globalPrefs.get();
        onbootorupgradereceiver.userPrefs = (SharedPreferences)userPrefs.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OnBootOrUpgradeReceiver)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.OnBootOrUpgradeReceiver", "members/com.google.android.apps.wallet.init.OnBootOrUpgradeReceiver", false, com/google/android/apps/wallet/init/OnBootOrUpgradeReceiver);
    }
}
