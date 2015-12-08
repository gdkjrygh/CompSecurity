// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.likes:
//            LikeOperations, UpdateLikeCommand

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b scheduler;
    private b storeLikeCommand;
    private b syncInitiator;

    public final void attach(l l1)
    {
        storeLikeCommand = l1.a("com.soundcloud.android.likes.UpdateLikeCommand", com/soundcloud/android/likes/LikeOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/likes/LikeOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/likes/LikeOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/likes/LikeOperations, getClass().getClassLoader());
    }

    public final LikeOperations get()
    {
        return new LikeOperations((UpdateLikeCommand)storeLikeCommand.get(), (SyncInitiator)syncInitiator.get(), (EventBus)eventBus.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storeLikeCommand);
        set.add(syncInitiator);
        set.add(eventBus);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.likes.LikeOperations", "members/com.soundcloud.android.likes.LikeOperations", false, com/soundcloud/android/likes/LikeOperations);
    }
}
