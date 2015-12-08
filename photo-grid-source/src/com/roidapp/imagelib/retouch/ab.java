// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Matrix;
import android.support.v4.view.ViewCompat;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            x

final class ab
    implements Runnable
{

    final x a;
    private final float b;
    private final float c;
    private final long d = System.currentTimeMillis();
    private final float e;
    private final float f = 1.0F;

    public ab(x x1, float f1, float f2, float f3)
    {
        a = x1;
        super();
        b = f2;
        c = f3;
        e = f1;
    }

    public final void run()
    {
        ImageView imageview = (ImageView)x.c(a).get();
        if (imageview != null)
        {
            float f1 = Math.min(1.0F, ((float)(System.currentTimeMillis() - d) * 1.0F) / 200F);
            f1 = x.c().getInterpolation(f1);
            float f2 = (e + (f - e) * f1) / a.b();
            x.a(a).postScale(f2, f2, b, c);
            x.b(a);
            if (f1 < 1.0F)
            {
                ViewCompat.postOnAnimation(imageview, this);
                return;
            }
        }
    }
}
