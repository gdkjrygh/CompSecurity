// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import android.app.Application;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.locale:
//            LocaleChangedEventPublisher

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding eventBus;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/locale/LocaleChangedEventPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/locale/LocaleChangedEventPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/locale/LocaleChangedEventPublisher, getClass().getClassLoader());
    }

    public final LocaleChangedEventPublisher get()
    {
        return new LocaleChangedEventPublisher((Application)application.get(), (EventBus)eventBus.get(), (ThreadChecker)threadChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(eventBus);
        set.add(threadChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.locale.LocaleChangedEventPublisher", "members/com.google.android.apps.wallet.locale.LocaleChangedEventPublisher", true, com/google/android/apps/wallet/locale/LocaleChangedEventPublisher);
    }
}
