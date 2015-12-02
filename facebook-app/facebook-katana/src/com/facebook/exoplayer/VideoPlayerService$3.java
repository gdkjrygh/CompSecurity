// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import com.facebook.exoplayer.ipc.VideoPlayerSession;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.facebook.exoplayer:
//            VideoPlayerService

class a extends TimerTask
{

    final VideoPlayerService a;

    public void run()
    {
        java.util.HashMap hashmap = VideoPlayerService.a(a);
        hashmap;
        JVM INSTR monitorenter ;
        VideoPlayerSession videoplayersession;
        for (Iterator iterator = VideoPlayerService.b(a).iterator(); iterator.hasNext(); VideoPlayerService.a(a, videoplayersession))
        {
            videoplayersession = (VideoPlayerSession)iterator.next();
        }

        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        VideoPlayerService.b(a).clear();
        hashmap;
        JVM INSTR monitorexit ;
    }

    n(VideoPlayerService videoplayerservice)
    {
        a = videoplayerservice;
        super();
    }
}
