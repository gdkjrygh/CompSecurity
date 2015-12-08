// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package me.lyft.android.controls:
//            TextureVideoView

class this._cls0
    implements android.media.etionListener
{

    final TextureVideoView this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (TextureVideoView.access$200(TextureVideoView.this) != 5)
        {
            TextureVideoView.access$202(TextureVideoView.this, 5);
            TextureVideoView.access$802(TextureVideoView.this, 5);
            if (TextureVideoView.access$500(TextureVideoView.this) != null)
            {
                TextureVideoView.access$500(TextureVideoView.this).hide();
            }
            if (TextureVideoView.access$900(TextureVideoView.this) != null)
            {
                TextureVideoView.access$900(TextureVideoView.this).onCompletion(TextureVideoView.access$400(TextureVideoView.this));
                return;
            }
        }
    }

    er()
    {
        this$0 = TextureVideoView.this;
        super();
    }
}
