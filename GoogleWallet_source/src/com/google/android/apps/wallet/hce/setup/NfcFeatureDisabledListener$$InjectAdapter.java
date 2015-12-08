// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.app.Application;
import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            NfcFeatureDisabledListener

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding eventBus;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/hce/setup/NfcFeatureDisabledListener, getClass().getClassLoader());
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/hce/setup/NfcFeatureDisabledListener, getClass().getClassLoader());
    }

    public final NfcFeatureDisabledListener get()
    {
        return new NfcFeatureDisabledListener((EventBus)eventBus.get(), (Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(application);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.setup.NfcFeatureDisabledListener", "members/com.google.android.apps.wallet.hce.setup.NfcFeatureDisabledListener", true, com/google/android/apps/wallet/hce/setup/NfcFeatureDisabledListener);
    }
}
