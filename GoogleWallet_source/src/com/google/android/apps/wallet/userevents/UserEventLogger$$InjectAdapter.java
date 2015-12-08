// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userevents;

import com.google.android.apps.wallet.log.WalletEventLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.userevents:
//            UserEventLogger

public final class  extends Binding
    implements Provider
{

    private Binding eventLogger;

    public final void attach(Linker linker)
    {
        eventLogger = linker.requestBinding("com.google.android.apps.wallet.log.WalletEventLogger", com/google/android/apps/wallet/userevents/UserEventLogger, getClass().getClassLoader());
    }

    public final UserEventLogger get()
    {
        return new UserEventLogger((WalletEventLogger)eventLogger.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventLogger);
    }

    public ()
    {
        super("com.google.android.apps.wallet.userevents.UserEventLogger", "members/com.google.android.apps.wallet.userevents.UserEventLogger", false, com/google/android/apps/wallet/userevents/UserEventLogger);
    }
}
