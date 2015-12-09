// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            LegacyAdsVideoPlayerService

final class a
    implements Runnable
{

    private LegacyAdsVideoPlayerService a;

    public final void run()
    {
        Logger.c("video player buffering timeout url=%s", new Object[] {
            LegacyAdsVideoPlayerService.a(a)
        });
        LegacyAdsVideoPlayerService.b(a);
    }

    (LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        a = legacyadsvideoplayerservice;
        super();
    }
}
