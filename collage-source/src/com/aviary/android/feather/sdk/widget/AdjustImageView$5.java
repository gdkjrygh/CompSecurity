// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.Paint;
import android.os.Handler;
import it.sephiroth.android.library.easing.d;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

class 
    implements Runnable
{

    final int a;
    final long b;
    final d c;
    final int d;
    final int e;
    final int f;
    final AdjustImageView g;

    public void run()
    {
        long l = System.currentTimeMillis();
        float f1 = Math.min(a, l - b);
        float f2 = (float)c.c(f1, d, 0.0D, a);
        float f3 = (float)c.c(f1, e, 0.0D, a);
        float f4 = (float)c.c(f1, f, 0.0D, a);
        g.i.setAlpha((int)f2);
        g.h.setAlpha((int)f3);
        g.l.setAlpha((int)f4);
        g.invalidate();
        if (f1 < (float)a)
        {
            g.aa.post(this);
            return;
        } else
        {
            g.a();
            return;
        }
    }
}
