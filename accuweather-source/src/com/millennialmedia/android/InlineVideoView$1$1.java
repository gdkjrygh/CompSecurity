// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.MediaPlayer;
import android.widget.ProgressBar;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView

class this._cls1
    implements android.media.stener
{

    final is._cls0 this$1;

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 3)
        {
            InlineVideoView.access$402(_fld0, true);
        }
        return false;
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/millennialmedia/android/InlineVideoView$1

/* anonymous class */
    class InlineVideoView._cls1
        implements android.media.MediaPlayer.OnPreparedListener
    {

        final InlineVideoView this$0;

        public void onPrepared(MediaPlayer mediaplayer)
        {
            if (InlineVideoView.access$300(InlineVideoView.this))
            {
                mediaplayer.setOnInfoListener(new InlineVideoView._cls1._cls1());
            }
            InlineVideoView.access$000(InlineVideoView.this).videoState = InlineVideoView.InlineParams.VideoState.PREPARED;
            if (InlineVideoView.access$000(InlineVideoView.this).autoPlay && InlineVideoView.access$000(InlineVideoView.this).playerState == InlineVideoView.InlineParams.PlayerState.DEFAULT)
            {
                InlineVideoView.access$000(InlineVideoView.this).playerState = InlineVideoView.InlineParams.PlayerState.PLAY;
            }
            loadingSpinner.setVisibility(8);
            duration = getDuration();
            seekTo(InlineVideoView.access$000(InlineVideoView.this).currentPosition);
            InlineVideoView.access$800(InlineVideoView.this);
        }

            
            {
                this$0 = InlineVideoView.this;
                super();
            }
    }

}
