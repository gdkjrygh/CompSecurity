// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.accounts.AccountOperations;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            NotificationSettingsFragment

public final class Q extends b
    implements a, Provider
{

    private b accountOperations;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/settings/NotificationSettingsFragment, getClass().getClassLoader());
    }

    public final NotificationSettingsFragment get()
    {
        NotificationSettingsFragment notificationsettingsfragment = new NotificationSettingsFragment();
        injectMembers(notificationsettingsfragment);
        return notificationsettingsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(accountOperations);
    }

    public final void injectMembers(NotificationSettingsFragment notificationsettingsfragment)
    {
        notificationsettingsfragment.accountOperations = (AccountOperations)accountOperations.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((NotificationSettingsFragment)obj);
    }

    public Q()
    {
        super("com.soundcloud.android.settings.NotificationSettingsFragment", "members/com.soundcloud.android.settings.NotificationSettingsFragment", false, com/soundcloud/android/settings/NotificationSettingsFragment);
    }
}
