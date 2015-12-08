// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.settings.SettingProtoManager;
import com.google.android.apps.wallet.user.UserInfoManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceOracle

public final class Q extends Binding
    implements Provider
{

    private Binding appControl;
    private Binding settingProtoManager;
    private Binding userInfoManager;

    public final void attach(Linker linker)
    {
        userInfoManager = linker.requestBinding("com.google.android.apps.wallet.user.UserInfoManager", com/google/android/apps/wallet/usersetup/TosAcceptanceOracle, getClass().getClassLoader());
        settingProtoManager = linker.requestBinding("com.google.android.apps.wallet.settings.SettingProtoManager", com/google/android/apps/wallet/usersetup/TosAcceptanceOracle, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/usersetup/TosAcceptanceOracle, getClass().getClassLoader());
    }

    public final TosAcceptanceOracle get()
    {
        return new TosAcceptanceOracle((UserInfoManager)userInfoManager.get(), (SettingProtoManager)settingProtoManager.get(), (AppControl)appControl.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userInfoManager);
        set.add(settingProtoManager);
        set.add(appControl);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.usersetup.TosAcceptanceOracle", "members/com.google.android.apps.wallet.usersetup.TosAcceptanceOracle", false, com/google/android/apps/wallet/usersetup/TosAcceptanceOracle);
    }
}
