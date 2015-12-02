// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.media.MediaPlayer;
import com.facebook.common.eventbus.TypedEventBus;
import com.facebook.video.api.VideoMetadata;
import com.facebook.video.api.playersession.VideoPlayerSessionManager;
import com.facebook.video.server.VideoMimes;
import com.facebook.video.server.VideoServer;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class <init>
    implements android.media.rListener, android.media.rListener
{

    final TextureViewImplementation a;
    private final com.facebook.video.api..a b;

    private void a()
    {
        TextureViewImplementation.m(a).setOnErrorListener(null);
        TextureViewImplementation.m(a).setOnPreparedListener(null);
    }

    static void a(a a1)
    {
        a1.a();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a();
        TextureViewImplementation.f(a).a();
        TextureViewImplementation.a(a, null);
        b.b(new >(i, j));
        return false;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        a();
        TextureViewImplementation.b(a, mediaplayer.getDuration());
        mediaplayer.setOnInfoListener(TextureViewImplementation.g(a));
        mediaplayer.setOnCompletionListener(TextureViewImplementation.h(a));
        mediaplayer.setOnBufferingUpdateListener(TextureViewImplementation.i(a));
        TextureViewImplementation.j(a).a(a);
        mediaplayer = VideoMimes.a(VideoServer.d(TextureViewImplementation.k(a)));
        mediaplayer = new VideoMetadata(TextureViewImplementation.d(a), 0, 0, mediaplayer, "");
        b.b(mediaplayer);
        TextureViewImplementation.l(a).a(VideoServer.b(TextureViewImplementation.k(a)), TextureViewImplementation.d(a));
    }

    private Q(TextureViewImplementation textureviewimplementation, com.facebook.video.api. )
    {
        a = textureviewimplementation;
        super();
        b = ;
    }

    b(TextureViewImplementation textureviewimplementation, com.facebook.video.api. , byte byte0)
    {
        this(textureviewimplementation, );
    }
}
