// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.widget.MediaController;

// Referenced classes of package com.auditude.ads.view.linear:
//            VideoView

class this._cls0
    implements android.media.OnPreparedListener
{

    final VideoView this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        int i;
        VideoView.access$4(VideoView.this, 2);
        if (VideoView.access$5(VideoView.this) != null)
        {
            VideoView.access$5(VideoView.this).onPrepared(VideoView.access$6(VideoView.this));
        }
        if (VideoView.access$7(VideoView.this) != null)
        {
            VideoView.access$7(VideoView.this).setEnabled(true);
        }
        VideoView.access$0(VideoView.this, mediaplayer.getVideoWidth());
        VideoView.access$1(VideoView.this, mediaplayer.getVideoHeight());
        i = VideoView.access$8(VideoView.this);
        if (i != 0)
        {
            seekTo(i);
        }
        if (VideoView.access$2(VideoView.this) == 0 || VideoView.access$3(VideoView.this) == 0) goto _L2; else goto _L1
_L1:
        getHolder().setFixedSize(VideoView.access$2(VideoView.this), VideoView.access$3(VideoView.this));
        if (VideoView.access$9(VideoView.this) != VideoView.access$2(VideoView.this) || VideoView.access$10(VideoView.this) != VideoView.access$3(VideoView.this)) goto _L4; else goto _L3
_L3:
        if (VideoView.access$11(VideoView.this) != 3) goto _L6; else goto _L5
_L5:
        start();
        if (VideoView.access$7(VideoView.this) != null)
        {
            VideoView.access$7(VideoView.this).show();
        }
_L4:
        setZOrderOnTop(true);
        setZOrderMediaOverlay(true);
        return;
_L6:
        if (!isPlaying() && (i != 0 || getCurrentPosition() > 0) && VideoView.access$7(VideoView.this) != null)
        {
            VideoView.access$7(VideoView.this).show(0);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (VideoView.access$11(VideoView.this) == 3)
        {
            start();
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    ner()
    {
        this$0 = VideoView.this;
        super();
    }
}
