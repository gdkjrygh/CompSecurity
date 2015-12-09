// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            NotificationPersistenceManager

public final class  extends Binding
    implements Provider
{

    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/notifications/NotificationPersistenceManager, getClass().getClassLoader());
    }

    public final NotificationPersistenceManager get()
    {
        return new NotificationPersistenceManager((SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
    }

    public ()
    {
        super("com.google.android.apps.wallet.notifications.NotificationPersistenceManager", "members/com.google.android.apps.wallet.notifications.NotificationPersistenceManager", false, com/google/android/apps/wallet/notifications/NotificationPersistenceManager);
    }
}
