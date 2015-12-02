// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import com.facebook.exoplayer.ipc.VideoPlayerServiceListener;
import com.facebook.exoplayer.ipc.VideoPlayerSession;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.ExoPlayer;
import java.util.HashMap;

// Referenced classes of package com.facebook.exoplayer:
//            VideoPlayerService

class b
    implements com.google.android.exoplayer.
{

    final VideoPlayerService a;
    private final VideoPlayerSession b;

    public final void a(ExoPlaybackException exoplaybackexception)
    {
        VideoPlayerService.a(a, "ERROR_IO", exoplaybackexception, b);
    }

    public final void a(boolean flag, int i)
    {
        VideoPlayerService.a(a, (new StringBuilder("MSG_STATE_CHANGED to ")).append(i).append(" and playWhenReady is ").append(flag).toString(), b);
        HashMap hashmap = VideoPlayerService.a(a);
        hashmap;
        JVM INSTR monitorenter ;
        Object obj = (VideoPlayerServiceListener)VideoPlayerService.c(a).get(b);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return;
        ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(b);
        ((VideoPlayerServiceListener) (obj)).a(flag, i, exoplayer.h());
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception;
        exception;
        VideoPlayerService.a((new StringBuilder("error forward player state change to listener ")).append(obj).append("; caused by ").append(exception.getCause()).toString(), b);
          goto _L1
    }

    (VideoPlayerService videoplayerservice, VideoPlayerSession videoplayersession)
    {
        a = videoplayerservice;
        super();
        b = videoplayersession;
    }
}
