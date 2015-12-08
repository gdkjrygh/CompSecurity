// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.os.Handler;
import com.aviary.android.feather.library.graphics.a;
import it.sephiroth.android.library.easing.b;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

class f
    implements Runnable
{

    final long a;
    final long b;
    final Camera c;
    final boolean d;
    final float e;
    final float f;
    final AdjustImageView g;

    public void run()
    {
        long l = System.currentTimeMillis();
        double d1 = Math.min(a, l - b);
        if (AdjustImageView.c(g))
        {
            float f1 = (float)(0.0D + -180D * (d1 / (double)a));
            c.save();
            if (d)
            {
                c.rotateY(f1);
            } else
            {
                c.rotateX(f1);
            }
            c.getMatrix(AdjustImageView.d(g));
            c.restore();
            AdjustImageView.d(g).preTranslate(-e, -f);
            AdjustImageView.d(g).postTranslate(e, f);
        } else
        {
            double d2 = com.aviary.android.feather.sdk.widget.AdjustImageView.a(g).b(d1, 1.0D, -2D, a);
            if (d)
            {
                AdjustImageView.d(g).setScale((float)d2, 1.0F, e, f);
            } else
            {
                AdjustImageView.d(g).setScale(1.0F, (float)d2, e, f);
            }
        }
        g.invalidate();
        if (d1 < (double)a)
        {
            g.ac.post(this);
        } else
        {
            if (d)
            {
                AdjustImageView adjustimageview = g;
                adjustimageview.ah = adjustimageview.ah ^ com.aviary.android.feather.sdk.widget.b.d;
                AdjustImageView.e(g).postScale(-1F, 1.0F, e, f);
            } else
            {
                AdjustImageView adjustimageview1 = g;
                adjustimageview1.ah = adjustimageview1.ah ^ c.d;
                AdjustImageView.e(g).postScale(1.0F, -1F, e, f);
            }
            AdjustImageView.f(g).postRotate((float)(-g.ad * 2D), e, f);
            g.ad = com.aviary.android.feather.library.graphics.a.a(com.aviary.android.feather.sdk.widget.AdjustImageView.a(g, AdjustImageView.f(g)));
            AdjustImageView.d(g).reset();
            g.invalidate();
            g.b();
            g.af = false;
            if (g.a)
            {
                com.aviary.android.feather.sdk.widget.AdjustImageView.b(g);
                return;
            }
        }
    }

    (AdjustImageView adjustimageview, long l, long l1, Camera camera, boolean flag, 
            float f1, float f2)
    {
        g = adjustimageview;
        a = l;
        b = l1;
        c = camera;
        d = flag;
        e = f1;
        f = f2;
        super();
    }
}
