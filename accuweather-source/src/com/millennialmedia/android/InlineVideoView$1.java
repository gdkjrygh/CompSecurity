// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.MediaPlayer;
import android.widget.ProgressBar;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView

class this._cls0
    implements android.media.aredListener
{

    final InlineVideoView this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (InlineVideoView.access$300(InlineVideoView.this))
        {
            mediaplayer.setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() {

                final InlineVideoView._cls1 this$1;

                public boolean onInfo(MediaPlayer mediaplayer1, int i, int j)
                {
                    if (i == 3)
                    {
                        InlineVideoView.access$402(this$0, true);
                    }
                    return false;
                }

            
            {
                this$1 = InlineVideoView._cls1.this;
                super();
            }
            });
        }
        InlineVideoView.access$000(InlineVideoView.this).videoState = lineParams.VideoState.PREPARED;
        if (InlineVideoView.access$000(InlineVideoView.this).autoPlay && InlineVideoView.access$000(InlineVideoView.this).playerState == lineParams.PlayerState.DEFAULT)
        {
            InlineVideoView.access$000(InlineVideoView.this).playerState = lineParams.PlayerState.PLAY;
        }
        loadingSpinner.setVisibility(8);
        duration = getDuration();
        seekTo(InlineVideoView.access$000(InlineVideoView.this).currentPosition);
        InlineVideoView.access$800(InlineVideoView.this);
    }

    _cls1.this._cls1()
    {
        this$0 = InlineVideoView.this;
        super();
    }
}
