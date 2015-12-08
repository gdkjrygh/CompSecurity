// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

final class a
    implements android.media.SizeChangedListener
{

    private TextureVideoView a;

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        TextureVideoView.a(a, mediaplayer);
        if (a.a != 0 && a.b != 0)
        {
            a.requestLayout();
        }
    }

    dListener(TextureVideoView texturevideoview)
    {
        a = texturevideoview;
        super();
    }
}
