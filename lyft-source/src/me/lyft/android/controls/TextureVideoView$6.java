// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.media.MediaPlayer;

// Referenced classes of package me.lyft.android.controls:
//            TextureVideoView

class this._cls0
    implements android.media.ringUpdateListener
{

    final TextureVideoView this$0;

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        TextureVideoView.access$1202(TextureVideoView.this, i);
    }

    istener()
    {
        this$0 = TextureVideoView.this;
        super();
    }
}
