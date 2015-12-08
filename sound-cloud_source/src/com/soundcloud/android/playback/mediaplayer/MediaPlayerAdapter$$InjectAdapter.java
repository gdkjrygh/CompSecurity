// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.playback.BufferUnderrunListener;
import com.soundcloud.android.playback.StreamUrlBuilder;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.mediaplayer:
//            MediaPlayerAdapter, MediaPlayerManager

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b bufferUnderrunListener;
    private b context;
    private b dateProvider;
    private b eventBus;
    private b mediaPlayerManager;
    private b networkConnectionHelper;
    private b playerHandler;
    private b urlBuilder;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        mediaPlayerManager = l1.a("com.soundcloud.android.playback.mediaplayer.MediaPlayerManager", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        playerHandler = l1.a("com.soundcloud.android.playback.mediaplayer.MediaPlayerAdapter$PlayerHandler", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        bufferUnderrunListener = l1.a("com.soundcloud.android.playback.BufferUnderrunListener", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        urlBuilder = l1.a("com.soundcloud.android.playback.StreamUrlBuilder", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter, getClass().getClassLoader());
    }

    public final MediaPlayerAdapter get()
    {
        return new MediaPlayerAdapter((Context)context.get(), (MediaPlayerManager)mediaPlayerManager.get(), (mediaPlayerManager)playerHandler.get(), (EventBus)eventBus.get(), (NetworkConnectionHelper)networkConnectionHelper.get(), (AccountOperations)accountOperations.get(), (BufferUnderrunListener)bufferUnderrunListener.get(), (StreamUrlBuilder)urlBuilder.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(mediaPlayerManager);
        set.add(playerHandler);
        set.add(eventBus);
        set.add(networkConnectionHelper);
        set.add(accountOperations);
        set.add(bufferUnderrunListener);
        set.add(urlBuilder);
        set.add(dateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.playback.mediaplayer.MediaPlayerAdapter", "members/com.soundcloud.android.playback.mediaplayer.MediaPlayerAdapter", false, com/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter);
    }
}
