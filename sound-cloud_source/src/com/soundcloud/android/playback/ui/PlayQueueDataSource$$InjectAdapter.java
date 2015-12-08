// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.playback.PlayQueueManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayQueueDataSource

public final class  extends b
    implements Provider
{

    private b playQueueManager;

    public final void attach(l l1)
    {
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/PlayQueueDataSource, getClass().getClassLoader());
    }

    public final PlayQueueDataSource get()
    {
        return new PlayQueueDataSource((PlayQueueManager)playQueueManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playQueueManager);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.PlayQueueDataSource", "members/com.soundcloud.android.playback.ui.PlayQueueDataSource", false, com/soundcloud/android/playback/ui/PlayQueueDataSource);
    }
}
