// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.playback.mediaplayer.MediaPlayerAdapter;
import com.soundcloud.android.playback.skippy.SkippyAdapter;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            StreamPlayer

public final class er extends b
    implements Provider
{

    private b context;
    private b mediaPlayerAdapter;
    private b networkConnectionHelper;
    private b skippyAdapter;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/StreamPlayer, getClass().getClassLoader());
        mediaPlayerAdapter = l1.a("com.soundcloud.android.playback.mediaplayer.MediaPlayerAdapter", com/soundcloud/android/playback/StreamPlayer, getClass().getClassLoader());
        skippyAdapter = l1.a("com.soundcloud.android.playback.skippy.SkippyAdapter", com/soundcloud/android/playback/StreamPlayer, getClass().getClassLoader());
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/playback/StreamPlayer, getClass().getClassLoader());
    }

    public final StreamPlayer get()
    {
        return new StreamPlayer((Context)context.get(), (MediaPlayerAdapter)mediaPlayerAdapter.get(), (SkippyAdapter)skippyAdapter.get(), (NetworkConnectionHelper)networkConnectionHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(mediaPlayerAdapter);
        set.add(skippyAdapter);
        set.add(networkConnectionHelper);
    }

    public er()
    {
        super("com.soundcloud.android.playback.StreamPlayer", "members/com.soundcloud.android.playback.StreamPlayer", false, com/soundcloud/android/playback/StreamPlayer);
    }
}
