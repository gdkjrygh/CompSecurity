// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;

// Referenced classes of package me.lyft.android.controls:
//            TextureVideoView

class this._cls0
    implements android.media.SizeChangedListener
{

    final TextureVideoView this$0;

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        TextureVideoView.access$002(TextureVideoView.this, mediaplayer.getVideoWidth());
        TextureVideoView.access$102(TextureVideoView.this, mediaplayer.getVideoHeight());
        if (TextureVideoView.access$000(TextureVideoView.this) != 0 && TextureVideoView.access$100(TextureVideoView.this) != 0)
        {
            getSurfaceTexture().setDefaultBufferSize(TextureVideoView.access$000(TextureVideoView.this), TextureVideoView.access$100(TextureVideoView.this));
            requestLayout();
        }
    }

    Listener()
    {
        this$0 = TextureVideoView.this;
        super();
    }
}
