// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import fli;
import flj;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            LegacyAdsVideoPlayerService, VideoPlayerEvent

final class a
    implements Runnable
{

    private LegacyAdsVideoPlayerService a;

    public final void run()
    {
        LegacyAdsVideoPlayerService.a(a, ayerState.j);
        if (LegacyAdsVideoPlayerService.c(a) != null)
        {
            a.m();
        }
        LegacyAdsVideoPlayerService.g(a).a(VideoPlayerEvent.c, LegacyAdsVideoPlayerService.f(a));
        Object obj = a.b;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.c.iterator(); iterator.hasNext(); ((fli)iterator.next()).b(Collections.emptyMap())) { }
        break MISSING_BLOCK_LABEL_105;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    ayerState(LegacyAdsVideoPlayerService legacyadsvideoplayerservice)
    {
        a = legacyadsvideoplayerservice;
        super();
    }
}
