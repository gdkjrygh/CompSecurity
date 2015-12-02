// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import android.os.RemoteException;
import android.view.Surface;
import com.facebook.exoplayer.ipc.VideoPlayerServiceListener;
import com.facebook.exoplayer.ipc.VideoPlayerSession;
import com.facebook.exoplayer.ipc.VideoPlayerStreamFormat;
import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.chunk.Format;
import java.util.HashMap;

// Referenced classes of package com.facebook.exoplayer:
//            VideoPlayerService

class b
    implements com.google.android.exoplayer.ception, com.google.android.exoplayer.ception, com.google.android.exoplayer.chunk.n
{

    final VideoPlayerService a;
    private VideoPlayerSession b;

    public final void a(int i, int j, float f)
    {
        VideoPlayerService.a(a, (new StringBuilder("onVideoSizeChanged w=")).append(i).append(" h=").append(j).append(" pixelWHRatio=").append(f).toString(), b);
        HashMap hashmap = VideoPlayerService.a(a);
        hashmap;
        JVM INSTR monitorenter ;
        Object obj = (VideoPlayerServiceListener)VideoPlayerService.c(a).get(b);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return;
        ((VideoPlayerServiceListener) (obj)).a(i, j, f);
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        throw obj;
        RemoteException remoteexception;
        remoteexception;
        VideoPlayerService.a((new StringBuilder("error onVideoSizeChanged for listener ")).append(obj).append("; caused by: ").append(remoteexception.getCause()).toString(), b);
          goto _L1
    }

    public final void a(int i, long l)
    {
    }

    public final void a(int i, Format format, int j, int k)
    {
        if (format != null && format.b != null)
        {
            VideoPlayerService.a(a, (new StringBuilder("Format: ")).append(format.b).append(", bitrate: ").append(format.c / 1000).append("kbps, w: ").append(format.d).append(", h:").append(format.e).toString(), b);
        }
        HashMap hashmap = VideoPlayerService.a(a);
        hashmap;
        JVM INSTR monitorenter ;
        VideoPlayerServiceListener videoplayerservicelistener = (VideoPlayerServiceListener)VideoPlayerService.c(a).get(b);
        if (videoplayerservicelistener != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return;
        ExoPlayer exoplayer = (ExoPlayer)VideoPlayerService.a(a).get(b);
        if (format != null) goto _L2; else goto _L1
_L1:
        format = null;
_L3:
        videoplayerservicelistener.a(i, format, j, k, exoplayer.f());
_L4:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        format;
        hashmap;
        JVM INSTR monitorexit ;
        throw format;
_L2:
        format = new VideoPlayerStreamFormat(format);
          goto _L3
        format;
        VideoPlayerService.a((new StringBuilder("error onDownstreamFormatChanged for listener ")).append(videoplayerservicelistener).append("; caused by: ").append(format.getCause()).toString(), b);
          goto _L4
    }

    public final void a(android.media.Listener listener)
    {
    }

    public final void a(Surface surface)
    {
    }

    public final void a(com.google.android.exoplayer.ception ception)
    {
        VideoPlayerService.a(a, "MALFORMED", ception, b);
    }

    public final void a(com.google.android.exoplayer.audio.n n)
    {
        VideoPlayerService.a(a, "MALFORMED", n, b);
    }

    public final void a(com.google.android.exoplayer.audio.n n)
    {
    }

    public final void a(String s, long l, long l1)
    {
    }

    public tionException(VideoPlayerService videoplayerservice, VideoPlayerSession videoplayersession)
    {
        a = videoplayerservice;
        super();
        b = videoplayersession;
    }
}
