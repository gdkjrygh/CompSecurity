// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity

class this._cls0
    implements android.view.ayerActivity._cls3
{

    final VideoPlayerActivity this$0;

    public void onClick(View view)
    {
label0:
        {
            if (mVideoView != null)
            {
                if (!mVideoView.isPlaying())
                {
                    break label0;
                }
                pauseVideoByUser();
                pausePlay.setBackgroundResource(0x1080024);
            }
            return;
        }
        if (isVideoCompleted)
        {
            playVideo(0);
        } else
        if (isUserPausing && !isVideoCompleted)
        {
            resumeVideo();
        } else
        {
            playVideo(currentVideoPosition);
        }
        pausePlay.setBackgroundResource(0x1080023);
    }

    ()
    {
        this$0 = VideoPlayerActivity.this;
        super();
    }
}
