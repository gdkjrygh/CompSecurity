// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.policies.PolicyOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueManager, PlayQueueOperations

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b playQueueOperations;
    private b policyOperations;

    public final void attach(l l1)
    {
        playQueueOperations = l1.a("com.soundcloud.android.playback.PlayQueueOperations", com/soundcloud/android/playback/PlayQueueManager, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/PlayQueueManager, getClass().getClassLoader());
        policyOperations = l1.a("com.soundcloud.android.policies.PolicyOperations", com/soundcloud/android/playback/PlayQueueManager, getClass().getClassLoader());
    }

    public final PlayQueueManager get()
    {
        return new PlayQueueManager((PlayQueueOperations)playQueueOperations.get(), (EventBus)eventBus.get(), (PolicyOperations)policyOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playQueueOperations);
        set.add(eventBus);
        set.add(policyOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playback.PlayQueueManager", "members/com.soundcloud.android.playback.PlayQueueManager", true, com/soundcloud/android/playback/PlayQueueManager);
    }
}
