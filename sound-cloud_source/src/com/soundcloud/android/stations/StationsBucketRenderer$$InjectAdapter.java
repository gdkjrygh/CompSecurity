// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.playback.PlayQueueManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsBucketRenderer, StationRenderer

public final class  extends b
    implements Provider
{

    private b navigator;
    private b playQueueManager;
    private b stationRenderer;

    public final void attach(l l1)
    {
        stationRenderer = l1.a("com.soundcloud.android.stations.StationRenderer", com/soundcloud/android/stations/StationsBucketRenderer, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/stations/StationsBucketRenderer, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/stations/StationsBucketRenderer, getClass().getClassLoader());
    }

    public final StationsBucketRenderer get()
    {
        return new StationsBucketRenderer((StationRenderer)stationRenderer.get(), (Navigator)navigator.get(), (PlayQueueManager)playQueueManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(stationRenderer);
        set.add(navigator);
        set.add(playQueueManager);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsBucketRenderer", "members/com.soundcloud.android.stations.StationsBucketRenderer", false, com/soundcloud/android/stations/StationsBucketRenderer);
    }
}
