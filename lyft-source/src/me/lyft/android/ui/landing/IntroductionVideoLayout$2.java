// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.media.MediaPlayer;
import me.lyft.android.controls.TextureVideoView;

// Referenced classes of package me.lyft.android.ui.landing:
//            IntroductionVideoLayout

class this._cls0
    implements android.media.ener
{

    final IntroductionVideoLayout this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        videoView.start();
        mediaplayer.setLooping(true);
        IntroductionVideoLayout.access$100(IntroductionVideoLayout.this, mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight());
    }

    ()
    {
        this$0 = IntroductionVideoLayout.this;
        super();
    }
}
