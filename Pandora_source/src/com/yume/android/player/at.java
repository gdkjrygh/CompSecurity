// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.yume.android.player:
//            ar

final class at
    implements android.media.MediaPlayer.OnVideoSizeChangedListener
{

    private ar a;

    at(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        a.e = mediaplayer.getVideoWidth();
        a.f = mediaplayer.getVideoHeight();
        if (a.e != 0 && a.f != 0)
        {
            a.getHolder().setFixedSize(a.e, a.f);
        }
    }
}
