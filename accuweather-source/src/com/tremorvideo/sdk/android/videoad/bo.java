// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bm

class bo
    implements Runnable
{

    final bm a;

    bo(bm bm1)
    {
        a = bm1;
        super();
    }

    public void run()
    {
        if (!bm.d(a).isPlaying())
        {
            if (a.o)
            {
                bm.k(a);
            }
        } else
        {
            int i = bm.d(a).getCurrentPosition();
            bm.e(a, i);
            bm.c(a, i);
            bm.g(a).a(bm.l(a));
        }
        bm.g(a).postDelayed(this, 500L);
    }
}
