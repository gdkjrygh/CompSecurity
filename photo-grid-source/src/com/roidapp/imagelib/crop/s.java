// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.os.Handler;

// Referenced classes of package com.roidapp.imagelib.crop:
//            ImageViewTouchBase

final class s
    implements Runnable
{

    final float a = 300F;
    final long b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final ImageViewTouchBase i;

    s(ImageViewTouchBase imageviewtouchbase, long l, float f1, float f2, float f3, float f4, 
            float f5, float f6)
    {
        i = imageviewtouchbase;
        b = l;
        c = f1;
        d = f2;
        e = f3;
        f = f4;
        g = f5;
        h = f6;
        super();
    }

    public final void run()
    {
        long l = System.currentTimeMillis();
        float f1 = Math.min(a, l - b);
        float f2 = c;
        float f3 = d;
        float f4 = e;
        float f5 = f;
        i.a(f3 * f1 + f2, g, h, f4 * f1, f5 * f1);
        if (f1 < a)
        {
            i.m.post(this);
        }
    }
}
