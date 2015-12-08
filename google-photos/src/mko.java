// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AnimationUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class mko extends mkf
{

    private mkm a;

    mko(mkm mkm1)
    {
        a = mkm1;
        super();
    }

    public final void a()
    {
        double d5;
        mkm mkm1;
        mkm1 = a;
        mkm1.g = false;
        long l = AnimationUtils.currentAnimationTimeMillis();
        d5 = (double)(l - mkm1.e) / 1000D;
        mkm1.e = l;
        if (mkm1.d == 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        if (d5 > 0.064000000000000001D)
        {
            d5 = 0.064000000000000001D;
        }
        iterator = mkm1.b.iterator();
_L10:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        mkk mkk1;
        boolean flag1;
        mkk1 = (mkk)iterator.next();
        Boolean boolean1 = (Boolean)mkm1.c.get(mkk1);
        if (boolean1 == null || !boolean1.booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = mkk1.a();
        if (flag1 && mkk1.k) goto _L6; else goto _L5
_L5:
        mkk1.m = mkk1.m + d5;
        double d1 = mkk1.f;
        double d = mkk1.g;
        double d4 = mkk1.h;
        double d3 = mkk1.d;
        double d2 = mkk1.e;
        while (mkk1.m >= 0.001D) 
        {
            mkk1.m = mkk1.m - 0.001D;
            d3 = mkk1.a * (mkk1.j - d1) - mkk1.b * d;
            d4 = 0.001D * d3 * 0.5D + d;
            d2 = mkk1.a;
            double d6 = (mkk1.j - (0.001D * d * 0.5D + d1)) * d2 - mkk1.b * d4;
            double d9 = d + 0.001D * d6 * 0.5D;
            d2 = mkk1.a;
            double d12 = (mkk1.j - (0.001D * d4 * 0.5D + d1)) * d2 - mkk1.b * d9;
            d2 = 0.001D * d9 + d1;
            double d13 = 0.001D * d12 + d;
            double d14 = mkk1.a;
            double d15 = mkk1.j;
            double d16 = mkk1.b;
            d4 = ((d4 + d9) * 2D + d + d13) / 6D;
            d3 = (d3 + (d6 + d12) * 2D + (d14 * (d15 - d2) - d16 * d13)) / 6D;
            d4 = 0.001D * d4 + d1;
            d3 = d + d3 * 0.001D;
            Iterator iterator1;
            boolean flag;
            if (mkk1.l && mkk.a(d4, mkk1.a, mkk1.i, mkk1.j))
            {
                mkk1.m = 0.0D;
                double d7 = d2;
                double d10 = d4;
                d2 = d;
                d = d3;
                d3 = d1;
                d4 = d7;
                d1 = d10;
            } else
            {
                double d8 = d2;
                double d11 = d4;
                d2 = d;
                d = d3;
                d3 = d1;
                d4 = d8;
                d1 = d11;
            }
        }
        mkk1.h = d4;
        mkk1.f = d1;
        mkk1.g = d;
        mkk1.d = d3;
        mkk1.e = d2;
        if (mkk1.m > 0.0D)
        {
            d = mkk1.m / 0.001D;
            mkk1.f = mkk1.f * d + mkk1.d * (1.0D - d);
            d1 = mkk1.g;
            mkk1.g = (1.0D - d) * mkk1.e + d1 * d;
        }
        if (mkk1.l && mkk.a(mkk1.f, mkk1.a, mkk1.i, mkk1.j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || mkk1.a())
        {
            if (mkk1.a > 0.0D)
            {
                mkk1.i = mkk1.j;
                mkk1.f = mkk1.j;
            } else
            {
                mkk1.j = mkk1.f;
                mkk1.i = mkk1.j;
            }
            mkk1.g = 0.0D;
            mkk1.m = 0.0D;
            flag1 = true;
        }
        mkk1.k = flag1;
        for (iterator1 = mkk1.c.iterator(); iterator1.hasNext(); ((mkl)iterator1.next()).a(mkk1.f)) { }
        if (flag1) goto _L6; else goto _L7
_L7:
        flag = true;
_L8:
        if (!flag)
        {
            mkm1.c.put(mkk1, Boolean.valueOf(false));
            mkm1.d = mkm1.d - 1;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        flag = false;
        if (true) goto _L8; else goto _L4
_L4:
        mkm1.a();
_L2:
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
