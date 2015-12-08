// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.associations:
//            RepostOperations, RepostStorage

public final class I extends b
    implements Provider
{

    private b apiClientRx;
    private b eventBus;
    private b repostStorage;
    private b scheduler;

    public final void attach(l l1)
    {
        repostStorage = l1.a("com.soundcloud.android.associations.RepostStorage", com/soundcloud/android/associations/RepostOperations, getClass().getClassLoader());
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/associations/RepostOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/associations/RepostOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/associations/RepostOperations, getClass().getClassLoader());
    }

    public final RepostOperations get()
    {
        return new RepostOperations((RepostStorage)repostStorage.get(), (ApiClientRx)apiClientRx.get(), (R)scheduler.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(repostStorage);
        set.add(apiClientRx);
        set.add(scheduler);
        set.add(eventBus);
    }

    public I()
    {
        super("com.soundcloud.android.associations.RepostOperations", "members/com.soundcloud.android.associations.RepostOperations", false, com/soundcloud/android/associations/RepostOperations);
    }
}
