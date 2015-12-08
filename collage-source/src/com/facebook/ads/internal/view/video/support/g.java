// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video.support;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.VideoView;

// Referenced classes of package com.facebook.ads.internal.view.video.support:
//            e, c, b

public class g extends VideoView
    implements android.media.MediaPlayer.OnPreparedListener, e
{

    private View a;
    private Uri b;
    private b c;

    public g(Context context)
    {
        super(context);
    }

    public void a(View view, Uri uri)
    {
        a = view;
        b = uri;
        setOnPreparedListener(this);
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        mediaplayer.setLooping(true);
        mediaplayer.setOnInfoListener(new c(a));
        if (c != null)
        {
            c.a(mediaplayer);
        }
    }

    public void pause()
    {
        a.setVisibility(0);
        stopPlayback();
    }

    public void setFrameVideoViewListener(b b1)
    {
        c = b1;
    }

    public void start()
    {
        setVideoURI(b);
        start();
    }
}
