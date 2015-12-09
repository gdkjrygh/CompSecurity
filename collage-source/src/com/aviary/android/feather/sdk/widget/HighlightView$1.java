// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import it.sephiroth.android.library.easing.b;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            e

class i
    implements Runnable
{

    final long a;
    final double b;
    final double c;
    final double d;
    final double e;
    final float f[];
    final float g[];
    final View h;
    final boolean i;
    final e j;

    public void run()
    {
        long l = System.currentTimeMillis();
        double d1 = Math.min(j.e, l - a);
        double d2 = j.f.a(d1, 0.0D, b, j.e);
        double d3 = j.f.a(d1, 0.0D, c, j.e);
        double d4 = j.f.a(d1, 0.0D, d, j.e);
        double d5 = j.f.a(d1, 0.0D, e, j.e);
        com.aviary.android.feather.sdk.widget.e.a(j).left = (int)((double)f[0] + d2);
        com.aviary.android.feather.sdk.widget.e.a(j).right = (int)((double)g[0] + d3);
        com.aviary.android.feather.sdk.widget.e.a(j).top = (int)((double)f[1] + d4);
        com.aviary.android.feather.sdk.widget.e.a(j).bottom = (int)(d5 + (double)g[1]);
        if (d1 < (double)j.e)
        {
            if (h != null)
            {
                h.invalidate();
                com.aviary.android.feather.sdk.widget.e.i().post(this);
            }
        } else
        {
            com.aviary.android.feather.sdk.widget.e.a(j, i);
            j.d = false;
            j.d();
            if (h != null)
            {
                h.postInvalidate();
                return;
            }
        }
    }

    (e e1, long l, double d1, double d2, 
            double d3, double d4, float af[], float af1[], View view, 
            boolean flag)
    {
        j = e1;
        a = l;
        b = d1;
        c = d2;
        d = d3;
        e = d4;
        f = af;
        g = af1;
        h = view;
        i = flag;
        super();
    }
}
