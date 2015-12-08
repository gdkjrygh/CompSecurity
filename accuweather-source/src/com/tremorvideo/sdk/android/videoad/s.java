// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o

class s
    implements Runnable
{

    final o a;

    s(o o1)
    {
        a = o1;
        super();
    }

    public void run()
    {
        if (!o.d(a).isPlaying())
        {
            if (a.q)
            {
                o.k(a);
            }
        } else
        {
            int i = o.d(a).getCurrentPosition();
            o.e(a, i);
            o.c(a, i);
            o.h(a).a(o.l(a));
        }
        o.h(a).postDelayed(this, 500L);
    }
}
