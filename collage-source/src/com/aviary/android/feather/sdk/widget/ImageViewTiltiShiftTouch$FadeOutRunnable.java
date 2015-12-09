// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.os.Handler;
import it.sephiroth.android.library.easing.b;
import it.sephiroth.android.library.easing.d;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            ImageViewTiltiShiftTouch

class b
    implements Runnable
{

    final ImageViewTiltiShiftTouch a;
    private volatile boolean b;
    private int c;
    private int d;
    private long e;
    private b f;

    public void run()
    {
label0:
        {
            if (a.getContext() != null)
            {
                if (!b)
                {
                    e = System.currentTimeMillis();
                    c = a.f;
                    d = a.g;
                    b = true;
                }
                long l = System.currentTimeMillis();
                double d1 = Math.min(a.k, l - e);
                double d2 = f.a(d1, 0.0D, c, a.k);
                double d3 = f.a(d1, 0.0D, d, a.k);
                a.f = c - (int)d2;
                a.g = d - (int)d3;
                a.invalidate();
                if (d1 >= (double)a.k)
                {
                    break label0;
                }
                Handler handler = a.getHandler();
                if (handler != null)
                {
                    handler.post(this);
                }
            }
            return;
        }
        a.invalidate();
    }

    (ImageViewTiltiShiftTouch imageviewtiltishifttouch)
    {
        a = imageviewtiltishifttouch;
        super();
        f = new d();
        b = false;
    }
}
