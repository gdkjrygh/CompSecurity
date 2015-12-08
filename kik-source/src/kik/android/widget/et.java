// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.media.MediaPlayer;

// Referenced classes of package kik.android.widget:
//            WebVideoView, VideoController

final class et
    implements android.media.MediaPlayer.OnCompletionListener
{

    final WebVideoView a;

    et(WebVideoView webvideoview)
    {
        a = webvideoview;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        WebVideoView.c(a, 5);
        WebVideoView.d(a, 5);
        if (WebVideoView.h(a) != null)
        {
            WebVideoView.h(a).c();
        }
        if (WebVideoView.i(a) != null)
        {
            WebVideoView.i(a).onCompletion(WebVideoView.g(a));
        }
    }
}
