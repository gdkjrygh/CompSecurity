// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.VideoView;
import kik.android.widget.VideoKeyFrameView;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

final class sc
    implements android.media.MediaPlayer.OnCompletionListener
{

    final VideoTrimmingFragment a;

    sc(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        VideoTrimmingFragment.a(a, false);
        if (a._videoKeyFrameView != null && a._videoView != null)
        {
            a._videoView.seekTo((int)(a._videoKeyFrameView.b() * (float)VideoTrimmingFragment.c(a)));
            a._videoKeyFrameView.c(a._videoKeyFrameView.b());
        }
        a._videoPlayIcon.setVisibility(0);
    }
}
