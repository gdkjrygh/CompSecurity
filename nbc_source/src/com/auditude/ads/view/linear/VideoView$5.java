// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.media.MediaPlayer;

// Referenced classes of package com.auditude.ads.view.linear:
//            VideoView

class this._cls0
    implements android.media.OnBufferingUpdateListener
{

    final VideoView this$0;

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        VideoView.access$16(VideoView.this, i);
    }

    teListener()
    {
        this$0 = VideoView.this;
        super();
    }
}
