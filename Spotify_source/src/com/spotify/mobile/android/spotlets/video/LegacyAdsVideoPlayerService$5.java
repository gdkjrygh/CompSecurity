// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.media.MediaPlayer;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            LegacyAdsVideoPlayerService

final class a
    implements Runnable
{

    private int a;
    private LegacyAdsVideoPlayerService b;

    public final void run()
    {
        synchronized (b.b)
        {
            b.c.clear();
        }
        if (LegacyAdsVideoPlayerService.c(b) != null)
        {
            if (b.o())
            {
                LegacyAdsVideoPlayerService.c(b).stop();
                LegacyAdsVideoPlayerService.a(b, ayerState.h);
            }
            b.m();
        }
        LegacyAdsVideoPlayerService.a(b, a);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ayerState(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, int i)
    {
        b = legacyadsvideoplayerservice;
        a = i;
        super();
    }
}
