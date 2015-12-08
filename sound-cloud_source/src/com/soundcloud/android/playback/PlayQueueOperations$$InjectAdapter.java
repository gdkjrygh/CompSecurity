// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.commands.StoreTracksCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueOperations, PlayQueueStorage

public final class  extends b
    implements Provider
{

    private b apiClientRx;
    private b context;
    private b playQueueStorage;
    private b scheduler;
    private b storeTracksCommand;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/PlayQueueOperations, getClass().getClassLoader());
        playQueueStorage = l1.a("com.soundcloud.android.playback.PlayQueueStorage", com/soundcloud/android/playback/PlayQueueOperations, getClass().getClassLoader());
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/playback/PlayQueueOperations, getClass().getClassLoader());
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/playback/PlayQueueOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/playback/PlayQueueOperations, getClass().getClassLoader());
    }

    public final PlayQueueOperations get()
    {
        return new PlayQueueOperations((Context)context.get(), (PlayQueueStorage)playQueueStorage.get(), (StoreTracksCommand)storeTracksCommand.get(), (ApiClientRx)apiClientRx.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(playQueueStorage);
        set.add(storeTracksCommand);
        set.add(apiClientRx);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.playback.PlayQueueOperations", "members/com.soundcloud.android.playback.PlayQueueOperations", false, com/soundcloud/android/playback/PlayQueueOperations);
    }
}
