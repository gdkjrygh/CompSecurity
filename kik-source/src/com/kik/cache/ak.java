// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import kik.a.d.aa;

// Referenced classes of package com.kik.cache:
//            y, an, al, am

public final class ak extends y
{

    private boolean f;
    private int g;
    private boolean h;
    private boolean i;

    private ak(aa aa1, String s, com.android.volley.r.b b1, android.graphics.Bitmap.Config config, boolean flag, com.android.volley.r.a a1, boolean flag1, 
            boolean flag2)
    {
        super(aa1, s, b1, 0, 0, config, a1);
        h = flag1;
        f = flag;
        g = 4;
        i = flag2;
    }

    public static SimpleLruBitmapCache.a a(aa aa1, boolean flag)
    {
        return new an((new StringBuilder()).append(b(aa1, flag)).append("#!#MyPicImageRequest").toString());
    }

    public static ak a(aa aa1, com.android.volley.r.b b1, boolean flag, com.android.volley.r.a a1, boolean flag1, boolean flag2)
    {
        String s = b(aa1, flag1);
        if (s == null)
        {
            aa1 = null;
        } else
        {
            b1 = new ak(aa1, s, b1, a, flag, a1, flag1, flag2);
            if (flag)
            {
                b1.a(((com.kik.g.as) (new al())));
            }
            aa1 = b1;
            if (flag2)
            {
                b1.a(((com.kik.g.as) (new am())));
                return b1;
            }
        }
        return aa1;
    }

    private static String b(aa aa1, boolean flag)
    {
        if (aa1 == null || aa1.f == null)
        {
            return null;
        }
        if (flag)
        {
            return (new StringBuilder()).append(aa1.f).append("/orig.jpg").toString();
        } else
        {
            return (new StringBuilder()).append(aa1.f).append("/thumb.jpg").toString();
        }
    }

    public final String a(int j, int k)
    {
        StringBuilder stringbuilder = new StringBuilder(e());
        if (f)
        {
            stringbuilder.append("#BLUR");
            stringbuilder.append(g);
        }
        if (i)
        {
            stringbuilder.append("#LIGHTEN");
        }
        stringbuilder.append(b((aa)x(), h)).append("#!#MyPicImageRequest");
        return stringbuilder.toString();
    }

    public final String e()
    {
        if (h)
        {
            return "myPicVolleyDiskKey#FULLSIZE";
        } else
        {
            return "myPicVolleyDiskKey";
        }
    }
}
