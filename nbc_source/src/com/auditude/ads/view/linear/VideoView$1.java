// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.auditude.ads.view.linear:
//            VideoView

class this._cls0
    implements android.media.OnVideoSizeChangedListener
{

    final VideoView this$0;

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        VideoView.access$0(VideoView.this, mediaplayer.getVideoWidth());
        VideoView.access$1(VideoView.this, mediaplayer.getVideoHeight());
        if (VideoView.access$2(VideoView.this) != 0 && VideoView.access$3(VideoView.this) != 0)
        {
            getHolder().setFixedSize(VideoView.access$2(VideoView.this), VideoView.access$3(VideoView.this));
        }
    }

    gedListener()
    {
        this$0 = VideoView.this;
        super();
    }
}
