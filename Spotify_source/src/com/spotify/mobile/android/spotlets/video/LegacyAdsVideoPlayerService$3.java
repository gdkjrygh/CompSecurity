// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.media.MediaPlayer;
import flb;
import flg;
import flh;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            LegacyAdsVideoPlayerService, VideoPlayerMetadata

final class d
    implements Runnable
{

    private boolean a;
    private VideoPlayerMetadata b;
    private int c;
    private flg d;
    private LegacyAdsVideoPlayerService e;

    public final void run()
    {
        LegacyAdsVideoPlayerService.a(e, ayerState.b);
        LegacyAdsVideoPlayerService.a(e, a);
        LegacyAdsVideoPlayerService.a(e, b);
        e.f = c;
        flg flg1 = d;
        Set set = flb.a;
        flh flh1 = null;
        int i = 0x7fffffff;
        Iterator iterator = flg1.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            flh flh2 = (flh)iterator.next();
            if (set.contains(flh2.c))
            {
                int j = Math.abs(640 - flh2.b);
                if (j <= i)
                {
                    flh1 = flh2;
                    i = j;
                }
            }
        } while (true);
        if (flh1 != null)
        {
            if (LegacyAdsVideoPlayerService.c(e) != null)
            {
                e.m();
            }
            LegacyAdsVideoPlayerService.a(e, flh1.a);
            LegacyAdsVideoPlayerService.a(e, LegacyAdsVideoPlayerService.n());
            LegacyAdsVideoPlayerService.a(e, ayerState.c);
            LegacyAdsVideoPlayerService.c(e).setOnErrorListener(e);
            LegacyAdsVideoPlayerService.c(e).setOnCompletionListener(e);
            LegacyAdsVideoPlayerService.c(e).setOnPreparedListener(e);
            LegacyAdsVideoPlayerService.c(e).setOnInfoListener(e);
            try
            {
                LegacyAdsVideoPlayerService.c(e).setDataSource(LegacyAdsVideoPlayerService.a(e));
            }
            catch (IOException ioexception)
            {
                e.onError(LegacyAdsVideoPlayerService.c(e), 0, 0);
            }
            LegacyAdsVideoPlayerService.a(e, ayerState.d);
            LegacyAdsVideoPlayerService.a(e);
            LegacyAdsVideoPlayerService.c(e).prepareAsync();
            LegacyAdsVideoPlayerService.c(e).setWakeMode(e.getApplicationContext(), 1);
        }
    }

    ayerState(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, boolean flag, VideoPlayerMetadata videoplayermetadata, int i, flg flg1)
    {
        e = legacyadsvideoplayerservice;
        a = flag;
        b = videoplayermetadata;
        c = i;
        d = flg1;
        super();
    }
}
