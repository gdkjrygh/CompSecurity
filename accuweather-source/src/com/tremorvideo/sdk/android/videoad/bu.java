// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bm

class bu
    implements android.media.MediaPlayer.OnPreparedListener
{

    final int a;
    final bm b;

    bu(bm bm1, int i)
    {
        b = bm1;
        a = i;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (a > 0)
        {
            bm.d(b).seekTo(a);
        }
        bm.e(b);
        bm.b(b, bm.d(b).getDuration());
        bm.g(b).a(bm.f(b));
        bm.g(b).postDelayed(bm.h(b), 10L);
        bm.d(b).setOnPreparedListener(null);
    }
}
