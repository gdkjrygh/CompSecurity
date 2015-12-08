// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.ay;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            ah, l

public static final class nit>
{

    float a;
    float b;
    public final ay c;
    final long d = System.currentTimeMillis();
    final int e = 1000;
    private float f;
    private float g;

    public final float a()
    {
        return Math.min(1.0F, (float)(System.currentTimeMillis() - d) / (float)e);
    }

    public final boolean a(l l1)
    {
        float af[] = new float[2];
        ar.a(f, 0.0F, -g, af);
        float f1 = l1.a(af[0], af[1], null) * 0.9F;
        a = f;
        b = g;
        float f2 = (float)Math.sqrt(f * f + g * g);
        if (f1 > 0.0F && f2 > f1)
        {
            a = a * (f1 / f2);
            b = b * (f1 / f2);
            return true;
        } else
        {
            return false;
        }
    }

    public (float f1, float f2, ay ay1)
    {
        f = f1;
        g = f2;
        a = f1;
        b = f2;
        c = new ay(ay1);
    }
}
