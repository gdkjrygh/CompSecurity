// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.Catalog;
import com.brightcove.player.model.Video;
import com.brightcove.player.view.BrightcoveVideoView;
import com.jcp.e.q;
import com.jcp.util.ae;

// Referenced classes of package com.jcp.views:
//            r, s, t, u, 
//            v, w

public class JcpBrightcoveVideoView extends BrightcoveVideoView
{

    private static final String p = com/jcp/views/JcpBrightcoveVideoView.getName();
    private Catalog q;
    private ProgressBar r;
    private q s;

    public JcpBrightcoveVideoView(Context context)
    {
        this(context, null, 0);
    }

    public JcpBrightcoveVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public JcpBrightcoveVideoView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        j();
    }

    static ProgressBar a(JcpBrightcoveVideoView jcpbrightcovevideoview)
    {
        return jcpbrightcovevideoview.r;
    }

    static void a(JcpBrightcoveVideoView jcpbrightcovevideoview, String s1)
    {
        jcpbrightcovevideoview.b(s1);
    }

    private void b(String s1)
    {
        if (s != null)
        {
            s.a(s1);
            return;
        } else
        {
            ae.a(p, (new StringBuilder()).append("Error in playing:").append(s1).toString());
            return;
        }
    }

    private void j()
    {
        q = new Catalog("c7KW_5dOVeDnTpceisJWavGpFEWZY_OjPwMZ11SF-iybuem0-bdPzQ..");
    }

    public void a(Video video)
    {
        if (video == null)
        {
            b(getResources().getString(0x7f070467));
        }
        if (r != null)
        {
            r.setVisibility(0);
        }
        clear();
        add(0, video);
        setCurrentIndex(0);
    }

    public void a(String s1)
    {
        if (r != null)
        {
            r.setVisibility(0);
        }
        q.findVideoByID(s1, new r(this));
    }

    public void i()
    {
        if (d != null && d.getMediaPlayer() != null)
        {
            getVideoDisplay().getMediaPlayer().reset();
            getVideoDisplay().getMediaPlayer().release();
        }
        clear();
    }

    public void setVideoListener(q q1)
    {
        s = q1;
        if (q1 != null)
        {
            getEventEmitter().on("enterFullScreen", new s(this, q1));
            getEventEmitter().on("exitFullScreen", new t(this, q1));
            getEventEmitter().on("didPlay", new u(this, q1));
            getEventEmitter().on("pause", new v(this, q1));
            getEventEmitter().on("completed", new w(this, q1));
        }
    }

    public void setVideoLoader(ProgressBar progressbar)
    {
        r = progressbar;
    }

}
