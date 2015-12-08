// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

final class a
    implements android.media.Listener
{

    private TextureVideoView a;

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (TextureVideoView.d(a) != null)
        {
            TextureVideoView.a(a, -1);
            TextureVideoView.b(a, -1);
            if (TextureVideoView.e(a) != null)
            {
                TextureVideoView.e(a).hide();
            }
            if (TextureVideoView.l(a) != null && TextureVideoView.l(a).onError(TextureVideoView.d(a), i, j))
            {
                return true;
            }
        }
        return true;
    }

    (TextureVideoView texturevideoview)
    {
        a = texturevideoview;
        super();
    }
}
