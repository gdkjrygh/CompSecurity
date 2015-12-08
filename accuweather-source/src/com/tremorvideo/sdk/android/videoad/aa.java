// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o, bk

class aa
    implements android.media.MediaPlayer.OnCompletionListener
{

    final o a;

    aa(o o1)
    {
        a = o1;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        o.c(a, o.d(a).getDuration());
        if (o.a(a).K())
        {
            o.d(a).pause();
            a.q = true;
            mediaplayer = a;
            mediaplayer.d = ((o) (mediaplayer)).d + 1;
            o.j(a);
            return;
        } else
        {
            a.k = true;
            o.d(a).stopPlayback();
            a.b.a(a);
            return;
        }
    }
}
