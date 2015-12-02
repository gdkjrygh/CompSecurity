// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.os.Handler;
import com.facebook.widget.images.zoomableimageview.a.b;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            e

class h
    implements Runnable
{

    final float a;
    final long b;
    final float c;
    final float d;
    final float e;
    final float f;
    final e g;

    h(e e1, float f1, long l, float f2, float f3, float f4, 
            float f5)
    {
        g = e1;
        a = f1;
        b = l;
        c = f2;
        d = f3;
        e = f4;
        f = f5;
        super();
    }

    public void run()
    {
        long l = System.currentTimeMillis();
        float f1 = Math.min(a, l - b);
        float f2 = (float)g.l.b(f1, 0.0D, c, a);
        g.b(f2 + d, e, f);
        if (f1 < a)
        {
            g.o.post(this);
            return;
        } else
        {
            g.b(g.getScale());
            g.a(true, true);
            return;
        }
    }
}
