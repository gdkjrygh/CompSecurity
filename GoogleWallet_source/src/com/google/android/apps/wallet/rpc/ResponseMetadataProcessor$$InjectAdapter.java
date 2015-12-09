// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            ResponseMetadataProcessor

public final class Q extends Binding
    implements Provider
{

    private Binding appControl;
    private Binding eventBus;
    private Binding handler;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/rpc/ResponseMetadataProcessor, getClass().getClassLoader());
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/rpc/ResponseMetadataProcessor, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/rpc/ResponseMetadataProcessor, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/rpc/ResponseMetadataProcessor, getClass().getClassLoader());
    }

    public final ResponseMetadataProcessor get()
    {
        return new ResponseMetadataProcessor((AppControl)appControl.get(), (Handler)handler.get(), (EventBus)eventBus.get(), (SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appControl);
        set.add(handler);
        set.add(eventBus);
        set.add(sharedPreferences);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.rpc.ResponseMetadataProcessor", "members/com.google.android.apps.wallet.rpc.ResponseMetadataProcessor", true, com/google/android/apps/wallet/rpc/ResponseMetadataProcessor);
    }
}
