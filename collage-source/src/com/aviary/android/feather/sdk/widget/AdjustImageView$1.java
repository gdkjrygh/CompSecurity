// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import it.sephiroth.android.library.easing.b;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

class g
    implements Runnable
{

    final long a;
    final long b;
    final double c;
    final int d;
    final int e;
    final double f;
    final double g;
    final AdjustImageView h;

    public void run()
    {
        long l = System.currentTimeMillis();
        float f1 = Math.min(a, l - b);
        double d1 = AdjustImageView.a(h).b(f1, 0.0D, c, a);
        double d2 = AdjustImageView.a(h).b(f1, 0.0D, d, a);
        h.m.setBounds((int)(((double)e + d2) - (double)h.n), (int)(h.U.bottom - (float)h.o), (int)(d2 + (double)e + (double)h.n), (int)(h.U.bottom + (float)h.o));
        AdjustImageView.a(h, f + d1);
        h.invalidate();
        if (f1 < (float)a)
        {
            h.ac.post(this);
        } else
        {
            h.m.setBounds(d - h.n, (int)(h.U.bottom - (float)h.o), d + h.n, (int)(h.U.bottom + (float)h.o));
            AdjustImageView.a(h, g);
            h.af = false;
            h.invalidate();
            if (h.a)
            {
                h.u = false;
                com.aviary.android.feather.sdk.widget.AdjustImageView.b(h);
                return;
            }
        }
    }

    (AdjustImageView adjustimageview, long l, long l1, double d1, 
            int i, int j, double d2, double d3)
    {
        h = adjustimageview;
        a = l;
        b = l1;
        c = d1;
        d = i;
        e = j;
        f = d2;
        g = d3;
        super();
    }
}
