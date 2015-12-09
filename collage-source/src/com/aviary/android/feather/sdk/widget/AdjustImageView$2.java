// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.Paint;
import android.os.Handler;
import it.sephiroth.android.library.easing.d;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

class d
    implements Runnable
{

    final int a;
    final long b;
    final d c;
    final float d;
    final AdjustImageView e;

    public void run()
    {
        long l = System.currentTimeMillis();
        float f = Math.min(a, l - b);
        float f1 = (float)c.c(f, d, e.t, a);
        e.l.setAlpha((int)f1);
        e.invalidate();
        if (f < (float)a)
        {
            e.aa.post(this);
            return;
        } else
        {
            e.l.setAlpha(e.t);
            e.invalidate();
            return;
        }
    }

    (AdjustImageView adjustimageview, int i, long l, d d1, float f)
    {
        e = adjustimageview;
        a = i;
        b = l;
        c = d1;
        d = f;
        super();
    }
}
