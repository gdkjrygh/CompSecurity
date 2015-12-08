// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.kik.g.as;

// Referenced classes of package com.kik.cache:
//            y, l, m, n

public final class k extends y
{

    private static final as f = new l();
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;

    private k(kik.a.d.k k1, String s, com.android.volley.r.b b1, android.graphics.Bitmap.Config config, com.android.volley.r.a a1, boolean flag, int i1, 
            boolean flag1, boolean flag2)
    {
        super(k1, s, b1, 0, 0, config, a1);
        g = flag;
        h = i1;
        i = flag2;
        j = flag1;
        if (g)
        {
            a(new m(this, i1));
        }
        if (i)
        {
            a(f);
        }
    }

    public static k a(kik.a.d.k k1, com.android.volley.r.b b1, com.android.volley.r.a a1, boolean flag, int i1, boolean flag1, boolean flag2)
    {
        String s = a(k1, flag1);
        if (s == null)
        {
            return null;
        } else
        {
            return new k(k1, s, b1, a, a1, flag, i1, flag1, flag2);
        }
    }

    public static String a(kik.a.d.k k1)
    {
        return a(k1, false);
    }

    private static String a(kik.a.d.k k1, boolean flag)
    {
        if (k1 == null || k1.r() == null)
        {
            return null;
        }
        String s = k1.s();
        k1 = new StringBuilder(k1.r());
        if (flag)
        {
            k1.append("/orig.jpg");
        } else
        {
            k1.append("/thumb.jpg");
        }
        if (s != null)
        {
            k1.append("?");
            k1.append("request_ts");
            k1.append("=");
            k1.append(s);
        }
        return k1.toString();
    }

    public static SimpleLruBitmapCache.a b(kik.a.d.k k1)
    {
        return new n((new StringBuilder()).append(a(k1, false)).append("#!#ContactImageRequest").toString());
    }

    public final String a(int i1, int j1)
    {
        String s = a((kik.a.d.k)x(), j);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("#W").append(i1).append("#H").append(j1);
        if (g)
        {
            stringbuilder.append("#BLUR");
            stringbuilder.append(h);
        }
        if (i)
        {
            stringbuilder.append("#LIGHTEN");
        }
        stringbuilder.append(s).append("#!#ContactImageRequest");
        return stringbuilder.toString();
    }

    public final kik.a.d.k u()
    {
        return (kik.a.d.k)x();
    }

}
