// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.media.MediaPlayer;

// Referenced classes of package kik.android.widget:
//            WebVideoView

final class es
    implements android.media.MediaPlayer.OnPreparedListener
{

    final WebVideoView a;

    es(WebVideoView webvideoview)
    {
        a = webvideoview;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        WebVideoView.c(a, 2);
        WebVideoView.c(a);
        WebVideoView.d(a);
        WebVideoView.e(a);
        if (WebVideoView.f(a) != null)
        {
            WebVideoView.f(a).onPrepared(WebVideoView.g(a));
        }
    }
}
