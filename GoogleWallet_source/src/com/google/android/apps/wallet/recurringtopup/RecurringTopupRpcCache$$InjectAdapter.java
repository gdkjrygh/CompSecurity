// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupRpcCache, TopupScheduleClient

public final class Y extends Binding
    implements Provider
{

    private Binding topupScheduleClient;

    public final void attach(Linker linker)
    {
        topupScheduleClient = linker.requestBinding("com.google.android.apps.wallet.recurringtopup.TopupScheduleClient", com/google/android/apps/wallet/recurringtopup/RecurringTopupRpcCache, getClass().getClassLoader());
    }

    public final RecurringTopupRpcCache get()
    {
        return new RecurringTopupRpcCache((TopupScheduleClient)topupScheduleClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(topupScheduleClient);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.recurringtopup.RecurringTopupRpcCache", "members/com.google.android.apps.wallet.recurringtopup.RecurringTopupRpcCache", false, com/google/android/apps/wallet/recurringtopup/RecurringTopupRpcCache);
    }
}
