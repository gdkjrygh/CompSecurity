// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.os.Handler;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            a

final class f
    implements Runnable
{

    final float a = 300F;
    final long b;
    final float c;
    final float d;
    final float e;
    final float f;
    final a g;

    public final void run()
    {
        long l = System.currentTimeMillis();
        float f1 = Math.min(a, l - b);
        float f2 = c;
        float f3 = d;
        g.a(f2 + f3 * f1, e, f);
        if (f1 < a)
        {
            g.i.post(this);
        }
    }

    (a a1, long l, float f1, float f2, float f3, float f4)
    {
        g = a1;
        b = l;
        c = f1;
        d = f2;
        e = f3;
        f = f4;
        super();
    }
}
