// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.api;

import android.app.Application;
import android.os.Handler;
import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.location.api:
//            GoogleLocationSettingHelper

public final class  extends Binding
    implements Provider
{

    private Binding accountName;
    private Binding application;
    private Binding eventBus;
    private Binding uiThreadHandler;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/location/api/GoogleLocationSettingHelper, getClass().getClassLoader());
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/location/api/GoogleLocationSettingHelper, getClass().getClassLoader());
        uiThreadHandler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/location/api/GoogleLocationSettingHelper, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/location/api/GoogleLocationSettingHelper, getClass().getClassLoader());
    }

    public final GoogleLocationSettingHelper get()
    {
        return new GoogleLocationSettingHelper((Application)application.get(), (String)accountName.get(), (Handler)uiThreadHandler.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(accountName);
        set.add(uiThreadHandler);
        set.add(eventBus);
    }

    public ()
    {
        super("com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper", "members/com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper", true, com/google/android/apps/wallet/location/api/GoogleLocationSettingHelper);
    }
}
