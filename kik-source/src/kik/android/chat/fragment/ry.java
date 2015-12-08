// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import android.widget.VideoView;
import kik.android.widget.VideoKeyFrameView;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

final class ry
    implements android.media.MediaPlayer.OnPreparedListener
{

    final VideoTrimmingFragment a;

    ry(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (a._videoKeyFrameView != null && a._videoView != null)
        {
            a._videoView.seekTo((int)(a._videoKeyFrameView.b() * (float)VideoTrimmingFragment.c(a)));
        }
    }
}
