// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o, bk

class z
    implements android.media.MediaPlayer.OnPreparedListener
{

    final int a;
    final o b;

    z(o o1, int i)
    {
        b = o1;
        a = i;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (a > 0)
        {
            o.d(b).seekTo(a);
        }
        o.e(b);
        o.b(b, o.d(b).getDuration());
        if (o.a(b).g(o.f(b)))
        {
            o.a(b, o.a(b));
        }
        o.h(b).a(o.g(b));
        o.h(b).postDelayed(o.i(b), 10L);
        o.d(b).setOnPreparedListener(null);
    }
}
