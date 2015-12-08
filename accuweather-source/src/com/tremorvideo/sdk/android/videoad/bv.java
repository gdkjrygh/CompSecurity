// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bm, bk

class bv
    implements android.media.MediaPlayer.OnCompletionListener
{

    final bm a;

    bv(bm bm1)
    {
        a = bm1;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        bm.c(a, bm.d(a).getDuration());
        if (bm.a(a).K())
        {
            bm.d(a).pause();
            a.o = true;
            mediaplayer = a;
            mediaplayer.b = ((bm) (mediaplayer)).b + 1;
            bm.i(a);
            return;
        } else
        {
            a.i = true;
            bm.d(a).stopPlayback();
            bm.j(a).a(null);
            return;
        }
    }
}
