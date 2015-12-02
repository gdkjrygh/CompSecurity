// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.net.Uri;
import com.google.android.exoplayer.hls.HlsChunkSource;
import com.google.android.exoplayer.hls.HlsPlaylist;
import com.google.android.exoplayer.hls.HlsSampleSource;
import com.google.android.exoplayer.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import java.io.IOException;

// Referenced classes of package com.facebook.video.view.exo:
//            ExoPlayerHLSStreamRendererBuilder, VideoServerHLSUriDataSource

class b
    implements com.google.android.exoplayer.util.r
{

    final ExoPlayerHLSStreamRendererBuilder a;
    private a b;

    private void a(HlsPlaylist hlsplaylist)
    {
        Object obj;
        if (ExoPlayerHLSStreamRendererBuilder.a(a))
        {
            obj = new VideoServerHLSUriDataSource(new DefaultUriDataSource(a.d, "ExoPlayer_HLS"), null, ExoPlayerHLSStreamRendererBuilder.b(a));
        } else
        {
            obj = new DefaultHttpDataSource("ExoPlayer_HLS", null, ExoPlayerHLSStreamRendererBuilder.c(a));
        }
        obj = new HlsSampleSource(new HlsChunkSource(((com.google.android.exoplayer.upstream.DataSource) (obj)), a.c.toString(), hlsplaylist, ExoPlayerHLSStreamRendererBuilder.c(a), null, 1, null), ExoPlayerHLSStreamRendererBuilder.d(a), a.a * a.b);
        hlsplaylist = new enderer(((com.google.android.exoplayer.SampleSource) (obj)), 1, 0L, a.e, a.f, -1);
        obj = new enderer(((com.google.android.exoplayer.SampleSource) (obj)), a.e, a.g);
        b.b(hlsplaylist, ((com.google.android.exoplayer.MediaCodecAudioTrackRenderer) (obj)));
    }

    public final void a(IOException ioexception)
    {
        b.b(ioexception);
    }

    public final volatile void a(Object obj)
    {
        a((HlsPlaylist)obj);
    }

    public enderer(ExoPlayerHLSStreamRendererBuilder exoplayerhlsstreamrendererbuilder, enderer enderer)
    {
        a = exoplayerhlsstreamrendererbuilder;
        super();
        b = enderer;
    }
}
