// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.gcm.GcmStorage;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayPublisher

public final class  extends b
    implements Provider
{

    private b apiClient;
    private b dateProvider;
    private b eventBus;
    private b gcmStorage;
    private b resources;
    private b scheduler;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/PlayPublisher, getClass().getClassLoader());
        gcmStorage = l1.a("com.soundcloud.android.gcm.GcmStorage", com/soundcloud/android/playback/PlayPublisher, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/playback/PlayPublisher, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/PlayPublisher, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/playback/PlayPublisher, getClass().getClassLoader());
        apiClient = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/playback/PlayPublisher, getClass().getClassLoader());
    }

    public final PlayPublisher get()
    {
        return new PlayPublisher((Resources)resources.get(), (GcmStorage)gcmStorage.get(), (CurrentDateProvider)dateProvider.get(), (EventBus)eventBus.get(), (R)scheduler.get(), (ApiClientRx)apiClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(gcmStorage);
        set.add(dateProvider);
        set.add(eventBus);
        set.add(scheduler);
        set.add(apiClient);
    }

    public ()
    {
        super("com.soundcloud.android.playback.PlayPublisher", "members/com.soundcloud.android.playback.PlayPublisher", false, com/soundcloud/android/playback/PlayPublisher);
    }
}
