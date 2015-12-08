// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.kik.cache:
//            ad

public final class g
{

    final ad a;
    private Bitmap b;
    private final tmap c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;

    static Bitmap a(tmap tmap, Bitmap bitmap)
    {
        tmap.b = bitmap;
        return bitmap;
    }

    static b a(b b1)
    {
        return b1.c;
    }

    public final void a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c c1 = (c)ad.b(a).get(d);
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c1.b(this))
        {
            ad.b(a).remove(d);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        c c2 = (d)ad.c(a).get(d);
        if (c2 != null)
        {
            c2.b(this);
            if (b(c2).size() == 0)
            {
                ad.c(a).remove(d);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final Bitmap b()
    {
        return b;
    }

    public final int c()
    {
        return f;
    }

    public final int d()
    {
        return g;
    }

    public final String e()
    {
        return d;
    }

    public tmap(ad ad1, Bitmap bitmap, String s, String s1, tmap tmap, int i, int j)
    {
        a = ad1;
        super();
        b = bitmap;
        e = s;
        d = s1;
        c = tmap;
        f = i;
        g = j;
    }
}
