// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.widget.RelativeLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bw, bm

class bx
    implements Runnable
{

    final bw a;

    bx(bw bw1)
    {
        a = bw1;
        super();
    }

    public void run()
    {
        a.c.m.removeView(a.a);
    }
}
