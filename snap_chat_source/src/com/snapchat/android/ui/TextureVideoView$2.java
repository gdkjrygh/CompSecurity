// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

final class a
    implements android.media.redListener
{

    private TextureVideoView a;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (TextureVideoView.a(a) == 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        TextureVideoView.a(a, 2);
        TextureVideoView.b(a);
        if (TextureVideoView.c(a) != null)
        {
            TextureVideoView.c(a).onPrepared(TextureVideoView.d(a));
        }
        if (TextureVideoView.e(a) != null)
        {
            TextureVideoView.e(a).setEnabled(true);
        }
        TextureVideoView.a(a, mediaplayer);
        i = TextureVideoView.f(a);
        if (i != 0)
        {
            a.seekTo(i);
        }
        if (a.a == 0 || a.b == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (TextureVideoView.g(a) != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        a.start();
        if (TextureVideoView.e(a) == null) goto _L1; else goto _L3
_L3:
        TextureVideoView.e(a).show();
        return;
        if (a.isPlaying() || i == 0 && a.getCurrentPosition() <= 0 || TextureVideoView.e(a) == null) goto _L1; else goto _L4
_L4:
        TextureVideoView.e(a).show(0);
        return;
        if (TextureVideoView.g(a) != 3) goto _L1; else goto _L5
_L5:
        a.start();
        return;
    }

    r(TextureVideoView texturevideoview)
    {
        a = texturevideoview;
        super();
    }
}
