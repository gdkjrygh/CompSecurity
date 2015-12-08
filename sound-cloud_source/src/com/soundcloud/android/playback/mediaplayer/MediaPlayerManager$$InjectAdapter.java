// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.mediaplayer:
//            MediaPlayerManager

public final class  extends b
    implements Provider
{

    public final MediaPlayerManager get()
    {
        return new MediaPlayerManager();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.playback.mediaplayer.MediaPlayerManager", "members/com.soundcloud.android.playback.mediaplayer.MediaPlayerManager", false, com/soundcloud/android/playback/mediaplayer/MediaPlayerManager);
    }
}
