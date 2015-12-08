// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.animation.Interpolator;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public final class isa
{

    public final pey a;
    final int b;
    public final boolean c;
    final msx d[][];
    final msx e[];
    final Map f = new HashMap();

    isa(pey pey1, int i, boolean flag)
    {
        int j = 0;
        super();
        a = pey1;
        b = i;
        c = flag;
        if (a.e == null)
        {
            i = 0;
        } else
        {
            i = a.e.b.length;
        }
        d = new msx[i][];
        for (; j < i; j++)
        {
            d[j] = a(a.e.b[j]);
        }

        if (a.b != null)
        {
            pey1 = a.b.b;
        } else
        {
            pey1 = null;
        }
        e = a(pey1);
        c();
    }

    private int a(float f1)
    {
        return Math.round((float)b * f1);
    }

    private static Interpolator a(pfb pfb1)
    {
        if (pfb1 == null)
        {
            return null;
        }
        switch (pfb1.a)
        {
        default:
            int i = pfb1.a;
            Log.w("StoryLayoutAdapter", (new StringBuilder(38)).append("Unknown interpolator type: ").append(i).toString());
            return null;

        case 1: // '\001'
            return new ipl(pfb1.b);

        case 2: // '\002'
            return new ipi(ite.a(pfb1.c));
        }
    }

    private msx[] a(pfx pfx1)
    {
        int j;
        if (pfx1 != null)
        {
            pfx1 = pfx1.a;
        } else
        {
            pfx1 = null;
        }
        pfx1 = ite.a(pfx1);
        j = pfx1.length;
        for (int i = 0; i < j; i++)
        {
            pfx1[i].e(b);
        }

        return pfx1;
    }

    private void c()
    {
        pez apez[];
        int i;
        int j;
        if (a.f == null)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        apez = a.f;
        j = apez.length;
        i = 0;
_L8:
        pez pez1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        pez1 = apez[i];
        pez1.b;
        JVM INSTR tableswitch 1 5: default 76
    //                   1 140
    //                   2 246
    //                   3 300
    //                   4 374
    //                   5 408;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_408;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        Object obj;
        obj = null;
        int k = pez1.b;
        Log.w("StoryLayoutAdapter", (new StringBuilder(35)).append("Unknown animation type: ").append(k).toString());
_L9:
        if (obj != null)
        {
            f.put(pez1.a, obj);
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        int l = a(pez1.e.a.floatValue());
        int i1 = a(pez1.e.c.floatValue());
        int j1 = a(pez1.e.b.floatValue());
        int k1 = a(pez1.e.d.floatValue());
        obj = new ips(b.a(pez1.c), a(pez1.d), b.a(pez1.h, false), l, i1, j1, k1);
          goto _L9
_L3:
        obj = new ipg(b.a(pez1.c), a(pez1.d), b.a(pez1.h, false), pez1.f.a.floatValue(), pez1.f.b.floatValue());
          goto _L9
_L4:
        obj = new ipm(b.a(pez1.c), a(pez1.d), b.a(pez1.h, false), pez1.g.a.floatValue(), pez1.g.c.floatValue(), pez1.g.b.floatValue(), pez1.g.d.floatValue());
          goto _L9
_L5:
        obj = new ipt(b.a(pez1.c), a(pez1.d), b.a(pez1.h, false));
          goto _L9
        obj = new ipj(b.a(pez1.c), a(pez1.d), b.a(pez1.h, false));
          goto _L9
    }

    public final float[][] a()
    {
        if (a.e != null && a.e.a != null && a.e.a.length != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((float [][]) (obj));
_L2:
        int i = a.e.a.length;
        int j = a.e.a[0].a.length;
        float af[][] = (float[][])Array.newInstance(Float.TYPE, new int[] {
            i, j
        });
        pgd apgd[] = a.e.a;
        int i1 = apgd.length;
        j = 0;
        i = 0;
        do
        {
            obj = af;
            if (j >= i1)
            {
                continue;
            }
            obj = apgd[j].a;
            int j1 = obj.length;
            int l = 0;
            for (int k = 0; l < j1; k++)
            {
                pge pge1 = obj[l];
                af[i][k] = pge1.b.floatValue();
                l++;
            }

            j++;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return a.b != null && a.b.a != null && b.a(a.b.a.u, 0.0F) > 0.0F && a.b.a.g != null;
    }
}
