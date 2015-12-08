// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.storage.TrackStorage;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackInitiator, PlayQueueManager, PlayQueueOperations, PlaySessionController

public final class  extends b
    implements Provider
{

    private b playQueueManager;
    private b playQueueOperations;
    private b playSessionController;
    private b trackStorage;

    public final void attach(l l1)
    {
        trackStorage = l1.a("com.soundcloud.android.storage.TrackStorage", com/soundcloud/android/playback/PlaybackInitiator, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/PlaybackInitiator, getClass().getClassLoader());
        playQueueOperations = l1.a("com.soundcloud.android.playback.PlayQueueOperations", com/soundcloud/android/playback/PlaybackInitiator, getClass().getClassLoader());
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/playback/PlaybackInitiator, getClass().getClassLoader());
    }

    public final PlaybackInitiator get()
    {
        return new PlaybackInitiator((TrackStorage)trackStorage.get(), (PlayQueueManager)playQueueManager.get(), (PlayQueueOperations)playQueueOperations.get(), (PlaySessionController)playSessionController.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackStorage);
        set.add(playQueueManager);
        set.add(playQueueOperations);
        set.add(playSessionController);
    }

    public ()
    {
        super("com.soundcloud.android.playback.PlaybackInitiator", "members/com.soundcloud.android.playback.PlaybackInitiator", false, com/soundcloud/android/playback/PlaybackInitiator);
    }
}
