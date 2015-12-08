// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class cnk
    implements cnv
{

    private static final String a = cnk.getSimpleName();
    private static final float b[] = {
        0.0F, 0.03F, 0.083F, 0.193F, 0.503F, 0.746F, 0.848F, 0.907F, 0.945F, 0.97F, 
        0.986F, 0.995F, 1.0F
    };
    private final List c;

    private cnk(List list)
    {
        c = list;
    }

    public static cnv a(pyg pyg1)
    {
        pxv apxv[];
        if (pyg1 != null && pyg1.f != null)
        {
            if ((apxv = pyg1.f.d).length != 0)
            {
                ArrayList arraylist = new ArrayList(apxv.length);
                int i = 0;
                while (i < apxv.length) 
                {
                    pxv pxv1 = apxv[i];
                    Object obj = pxv1.a;
                    float f;
                    boolean flag;
                    if (pxv1.c == null)
                    {
                        f = 0.0F;
                    } else
                    {
                        f = pxv1.c.floatValue();
                    }
                    obj = cnw.a(((pxs) (obj)), f);
                    if (pxv1.b == null)
                    {
                        f = 0.0F;
                    } else
                    {
                        f = pxv1.b.floatValue();
                    }
                    if (pyg1.f.a == 5)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    arraylist.add(i, new cnl(((cnw) (obj)), f, flag));
                    i++;
                }
                return new cnk(arraylist);
            }
        }
        return null;
    }

    public final cnw a(long l, long l1)
    {
        int i = c.size();
        if (i <= 0)
        {
            c.a((new StringBuilder()).append("crops.size()").append(" must be positive: ").append(i), "AnimatedCropSequence should have at least one crop.");
        }
        if (l == -1L)
        {
            return ((cnl)c.get(c.size() - 1)).a;
        }
        if (l == 0L)
        {
            return ((cnl)c.get(0)).a;
        }
        long l2 = 0L;
        i = 0;
        while (i < c.size()) 
        {
            cnl cnl1 = (cnl)c.get(i);
            long l4 = (long)(cnl1.b * (float)l1);
            long l3;
            if (cnl1.c)
            {
                l3 = 0x61a80L;
            } else
            {
                l3 = 0L;
            }
            l3 /= 2L;
            if (l < (l2 + l4) - l3)
            {
                cnw cnw1 = cnl1.a;
                if (cnl1.c && l - l2 < l3 && i > 0)
                {
                    cnw cnw2 = ((cnl)c.get(i - 1)).a;
                    float f = b.a((((float)l - (float)l2) + (float)l3) / 400000F, b);
                    float f1 = 1.0F - f;
                    float f2 = cnw2.a;
                    float f3 = cnw1.a;
                    float f4 = cnw2.b;
                    float f5 = cnw1.b;
                    float f6 = cnw2.c;
                    float f7 = cnw1.c;
                    float f8 = cnw2.d;
                    float f9 = cnw1.d;
                    float f10 = cnw2.e;
                    return new cnw(f2 * f1 + f3 * f, f4 * f1 + f5 * f, f6 * f1 + f7 * f, f8 * f1 + f9 * f, cnw1.e * f + f10 * f1);
                } else
                {
                    return cnw1;
                }
            }
            l2 += l4;
            i++;
        }
        Log.w(a, (new StringBuilder(88)).append("Not enough subclips: ").append(l).append(" : ").append(l2).append(" in ").append(l1).toString());
        return ((cnl)c.get(c.size() - 1)).a;
    }

}
