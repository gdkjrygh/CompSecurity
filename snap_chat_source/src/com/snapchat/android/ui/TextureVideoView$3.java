// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

final class a
    implements android.media.etionListener
{

    private TextureVideoView a;

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (TextureVideoView.h(a))
        {
            TextureVideoView.a(a, 5);
            TextureVideoView.b(a, 5);
            if (TextureVideoView.e(a) != null)
            {
                TextureVideoView.e(a).hide();
            }
            if (TextureVideoView.i(a) != null)
            {
                TextureVideoView.i(a).onCompletion(TextureVideoView.d(a));
                return;
            }
        }
    }

    ner(TextureVideoView texturevideoview)
    {
        a = texturevideoview;
        super();
    }
}
