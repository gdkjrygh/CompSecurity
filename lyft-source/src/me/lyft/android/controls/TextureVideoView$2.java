// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package me.lyft.android.controls:
//            TextureVideoView

class this._cls0
    implements android.media.redListener
{

    final TextureVideoView this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        TextureVideoView.access$202(TextureVideoView.this, 2);
        if (TextureVideoView.access$300(TextureVideoView.this) != null)
        {
            TextureVideoView.access$300(TextureVideoView.this).onPrepared(TextureVideoView.access$400(TextureVideoView.this));
        }
        if (TextureVideoView.access$500(TextureVideoView.this) != null)
        {
            TextureVideoView.access$500(TextureVideoView.this).setEnabled(true);
        }
        TextureVideoView.access$002(TextureVideoView.this, mediaplayer.getVideoWidth());
        TextureVideoView.access$102(TextureVideoView.this, mediaplayer.getVideoHeight());
        if (TextureVideoView.access$000(TextureVideoView.this) == 0 || TextureVideoView.access$100(TextureVideoView.this) == 0) goto _L2; else goto _L1
_L1:
        getSurfaceTexture().setDefaultBufferSize(TextureVideoView.access$000(TextureVideoView.this), TextureVideoView.access$100(TextureVideoView.this));
        if (TextureVideoView.access$600(TextureVideoView.this) != TextureVideoView.access$000(TextureVideoView.this) || TextureVideoView.access$700(TextureVideoView.this) != TextureVideoView.access$100(TextureVideoView.this)) goto _L4; else goto _L3
_L3:
        if (TextureVideoView.access$800(TextureVideoView.this) != 3) goto _L6; else goto _L5
_L5:
        start();
        if (TextureVideoView.access$500(TextureVideoView.this) != null)
        {
            TextureVideoView.access$500(TextureVideoView.this).show();
        }
_L4:
        return;
_L6:
        if (!isPlaying() && getCurrentPosition() > 0 && TextureVideoView.access$500(TextureVideoView.this) != null)
        {
            TextureVideoView.access$500(TextureVideoView.this).show(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (TextureVideoView.access$800(TextureVideoView.this) == 3)
        {
            start();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    ()
    {
        this$0 = TextureVideoView.this;
        super();
    }
}
