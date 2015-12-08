// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package com.auditude.ads.view.linear:
//            VideoView

class this._cls0
    implements android.media.OnCompletionListener
{

    final VideoView this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        VideoView.access$4(VideoView.this, 5);
        VideoView.access$12(VideoView.this, 5);
        if (VideoView.access$7(VideoView.this) != null)
        {
            VideoView.access$7(VideoView.this).hide();
        }
        if (VideoView.access$13(VideoView.this) != null)
        {
            VideoView.access$13(VideoView.this).onCompletion(VideoView.access$6(VideoView.this));
        }
    }

    tener()
    {
        this$0 = VideoView.this;
        super();
    }
}
