// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.media.MediaPlayer;

// Referenced classes of package kik.android.widget:
//            WebVideoView

final class ew
    implements android.media.MediaPlayer.OnBufferingUpdateListener
{

    final WebVideoView a;

    ew(WebVideoView webvideoview)
    {
        a = webvideoview;
        super();
    }

    public final void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        if (i > 0 && i < 100)
        {
            WebVideoView.e(a, i);
        }
    }
}
