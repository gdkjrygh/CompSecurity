// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.media.MediaPlayer;
import android.widget.MediaController;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.controls:
//            TextureVideoView

class this._cls0
    implements android.media.Listener
{

    final TextureVideoView this$0;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = (new StringBuilder()).append("Error: ").append(i).append(",").append(j).toString();
        L.e(new IllegalStateException((new StringBuilder()).append(TextureVideoView.access$1000(TextureVideoView.this)).append(" ").append(mediaplayer).toString()), mediaplayer, new Object[0]);
        TextureVideoView.access$202(TextureVideoView.this, -1);
        TextureVideoView.access$802(TextureVideoView.this, -1);
        if (TextureVideoView.access$500(TextureVideoView.this) != null)
        {
            TextureVideoView.access$500(TextureVideoView.this).hide();
        }
        while (TextureVideoView.access$1100(TextureVideoView.this) != null && TextureVideoView.access$1100(TextureVideoView.this).onError(TextureVideoView.access$400(TextureVideoView.this), i, j) || getWindowToken() == null || TextureVideoView.access$900(TextureVideoView.this) == null) 
        {
            return true;
        }
        TextureVideoView.access$900(TextureVideoView.this).onCompletion(TextureVideoView.access$400(TextureVideoView.this));
        return true;
    }

    er()
    {
        this$0 = TextureVideoView.this;
        super();
    }
}
