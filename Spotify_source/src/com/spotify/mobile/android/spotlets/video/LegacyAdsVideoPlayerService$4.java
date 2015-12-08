// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.media.MediaPlayer;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            LegacyAdsVideoPlayerService

final class a
    implements Runnable
{

    private LegacyAdsVideoPlayerService a;

    public final void run()
    {
        LegacyAdsVideoPlayerService legacyadsvideoplayerservice = a;
        long l = a.g();
        if (legacyadsvideoplayerservice.o())
        {
            legacyadsvideoplayerservice.e.seekTo((int)l);
        }
    }

    (LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        a = legacyadsvideoplayerservice;
        super();
    }
}
