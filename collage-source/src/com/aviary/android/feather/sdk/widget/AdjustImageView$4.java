// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.Paint;
import android.os.Handler;
import it.sephiroth.android.library.easing.d;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

class c
    implements Runnable
{

    final int a;
    final long b;
    final d c;
    final AdjustImageView d;

    public void run()
    {
        long l = System.currentTimeMillis();
        float f = Math.min(a, l - b);
        float f1 = (float)c.c(f, 0.0D, d.s, a);
        float f2 = (float)c.c(f, 0.0D, d.r, a);
        float f3 = (float)c.c(f, 0.0D, d.t, a);
        d.i.setAlpha((int)f1);
        d.h.setAlpha((int)f2);
        d.l.setAlpha((int)f3);
        d.invalidate();
        if (f < (float)a)
        {
            d.aa.post(this);
            return;
        } else
        {
            d.i.setAlpha(d.s);
            d.h.setAlpha(d.r);
            d.l.setAlpha(d.t);
            d.invalidate();
            return;
        }
    }

    (AdjustImageView adjustimageview, int i, long l, d d1)
    {
        d = adjustimageview;
        a = i;
        b = l;
        c = d1;
        super();
    }
}
