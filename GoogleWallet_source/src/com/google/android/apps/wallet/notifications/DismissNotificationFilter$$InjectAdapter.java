// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Activity;
import android.app.NotificationManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            DismissNotificationFilter

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding mNotificationManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/notifications/DismissNotificationFilter, getClass().getClassLoader());
        mNotificationManager = linker.requestBinding("android.app.NotificationManager", com/google/android/apps/wallet/notifications/DismissNotificationFilter, getClass().getClassLoader());
    }

    public final DismissNotificationFilter get()
    {
        return new DismissNotificationFilter((Activity)activity.get(), (NotificationManager)mNotificationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(mNotificationManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.notifications.DismissNotificationFilter", "members/com.google.android.apps.wallet.notifications.DismissNotificationFilter", false, com/google/android/apps/wallet/notifications/DismissNotificationFilter);
    }
}
