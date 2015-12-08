// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.widget.ProgressBar;
import com.brightcove.player.media.VideoListener;
import com.brightcove.player.model.Video;

// Referenced classes of package com.jcp.views:
//            JcpBrightcoveVideoView

class r
    implements VideoListener
{

    final JcpBrightcoveVideoView a;

    r(JcpBrightcoveVideoView jcpbrightcovevideoview)
    {
        a = jcpbrightcovevideoview;
        super();
    }

    public void onError(String s)
    {
        if (JcpBrightcoveVideoView.a(a) != null)
        {
            JcpBrightcoveVideoView.a(a).setVisibility(8);
        }
        JcpBrightcoveVideoView.a(a, s);
    }

    public void onVideo(Video video)
    {
        a.add(video);
        a.start();
    }
}
