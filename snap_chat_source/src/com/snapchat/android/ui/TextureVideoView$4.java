// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

final class a
    implements android.media.ompleteListener
{

    private TextureVideoView a;

    public final void onSeekComplete(MediaPlayer mediaplayer)
    {
        if (TextureVideoView.j(a) != null)
        {
            TextureVideoView.j(a).onSeekComplete(mediaplayer);
        }
    }

    tener(TextureVideoView texturevideoview)
    {
        a = texturevideoview;
        super();
    }
}
