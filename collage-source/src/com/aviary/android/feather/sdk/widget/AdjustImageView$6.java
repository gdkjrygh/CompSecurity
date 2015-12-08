// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.os.Handler;
import com.aviary.android.feather.library.graphics.a;
import it.sephiroth.android.library.easing.b;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

class b
    implements Runnable
{

    float a;
    float b;
    final long c;
    final long d;
    final double e;
    final double f;
    final double g;
    final AdjustImageView h;

    public void run()
    {
        long l = System.currentTimeMillis();
        float f1 = Math.min(c, l - d);
        float f2 = (float)com.aviary.android.feather.sdk.widget.AdjustImageView.a(h).b(f1, 0.0D, e, c);
        h.ad = com.aviary.android.feather.library.graphics.a.a(f + (double)f2);
        com.aviary.android.feather.sdk.widget.AdjustImageView.a(h, h.ad, false);
        b = f2;
        h.V = true;
        h.invalidate();
        if (f1 < (float)c)
        {
            h.ac.post(this);
        } else
        {
            h.ad = com.aviary.android.feather.library.graphics.a.a(g);
            com.aviary.android.feather.sdk.widget.AdjustImageView.a(h, h.ad, true);
            h.V = true;
            h.af = false;
            h.invalidate();
            h.b();
            if (h.a)
            {
                com.aviary.android.feather.sdk.widget.AdjustImageView.b(h);
                return;
            }
        }
    }

    (AdjustImageView adjustimageview, long l, long l1, double d1, 
            double d2, double d3)
    {
        h = adjustimageview;
        c = l;
        d = l1;
        e = d1;
        f = d2;
        g = d3;
        super();
        a = 0.0F;
        b = 0.0F;
    }
}
