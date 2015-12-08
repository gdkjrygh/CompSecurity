// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package kik.android.widget:
//            WebVideoView

final class er
    implements android.media.MediaPlayer.OnVideoSizeChangedListener
{

    final WebVideoView a;

    er(WebVideoView webvideoview)
    {
        a = webvideoview;
        super();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        WebVideoView.a(a, mediaplayer.getVideoWidth());
        WebVideoView.b(a, mediaplayer.getVideoHeight());
        if (WebVideoView.a(a) != 0 && WebVideoView.b(a) != 0)
        {
            a.getHolder().setFixedSize(WebVideoView.a(a), WebVideoView.b(a));
        }
    }
}
