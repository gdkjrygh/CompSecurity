// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import android.os.Handler;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            EventBus

public final class  extends Binding
    implements Provider
{

    private Binding handler;

    public final void attach(Linker linker)
    {
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/eventbus/EventBus, getClass().getClassLoader());
    }

    public final EventBus get()
    {
        return new EventBus((Handler)handler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(handler);
    }

    public ()
    {
        super("com.google.android.apps.wallet.eventbus.EventBus", "members/com.google.android.apps.wallet.eventbus.EventBus", true, com/google/android/apps/wallet/eventbus/EventBus);
    }
}
