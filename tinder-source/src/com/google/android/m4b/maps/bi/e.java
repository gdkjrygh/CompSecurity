// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bi;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.bo.c;
import com.google.android.m4b.maps.bo.g;

// Referenced classes of package com.google.android.m4b.maps.bi:
//            c

public final class e
{
    public static interface a
    {

        public abstract float a(g g1);

        public abstract float e();
    }


    public volatile float a;
    public a b;
    private final float c;
    private final Resources d;

    public e(Resources resources)
    {
        a = 75F;
        float f;
        if (resources != null)
        {
            f = resources.getDisplayMetrics().densityDpi;
        } else
        {
            f = 1.0F;
        }
        c = f;
        d = resources;
    }

    public final com.google.android.m4b.maps.bi.c a(com.google.android.m4b.maps.bi.c c1)
    {
        float f;
        float f1;
        float f2;
        g g1;
        int i;
        int j;
        if (b != null)
        {
            f1 = Math.min(21F, b.a(g.a(c1.a)));
            f = Math.max(2.0F, b.e());
        } else
        {
            f1 = 21F;
            f = 2.0F;
        }
        f1 = Math.max(Math.min(c1.b, f1), f);
        f2 = a;
        f = c1.b;
        if (f >= 16F)
        {
            f = 75F;
        } else
        if (f > 14F)
        {
            f = ((f - 14F) * 30F) / 2.0F + 45F;
        } else
        if (f > 10F)
        {
            f = ((f - 10F) * 15F) / 4F + 30F;
        } else
        {
            f = 30F;
        }
        f = Math.min(f2, f);
        f = Math.max(Math.min(c1.c, f), 0.0F);
        g1 = g.a(c1.a);
        if (d == null) goto _L2; else goto _L1
_L1:
        f2 = (float)d.getDisplayMetrics().heightPixels / d.getDisplayMetrics().density;
        g1.a = g.a(g1.a);
        j = 0x20000000 - (int)Math.ceil(f2 * 0.5F * com.google.android.m4b.maps.bo.c.a(f1));
        i = j;
        if (j < 0)
        {
            i = 0;
        }
        if (g1.b > i)
        {
            g1.b = i;
        } else
        if (g1.b < -i)
        {
            g1.b = -i;
        } else
        {
            g1.b = g1.b;
        }
        g1.c = g1.c;
_L4:
        return new com.google.android.m4b.maps.bi.c(g1, f1, f, c1.d, c1.e);
_L2:
        g1.a = g.a(g1.a);
        j = g1.b;
        if (j >= 0xe0000000)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0xe0000000;
_L5:
        g1.b = i;
        g1.c = g1.c;
        if (true) goto _L4; else goto _L3
_L3:
        i = j;
        if (j >= 0x20000000)
        {
            i = 0x1fffffff;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }
}
