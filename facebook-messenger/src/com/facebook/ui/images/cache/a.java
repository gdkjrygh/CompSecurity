// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.analytics.av;
import com.facebook.analytics.cache.h;
import com.facebook.cache.j;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.facebook.ui.media.cache.g;
import com.facebook.ui.media.cache.m;

// Referenced classes of package com.facebook.ui.images.cache:
//            b

public class a extends g
{

    private final com.facebook.ui.media.attachments.d a;
    private final com.facebook.ui.images.a.a b;
    private final d c;

    public a(Context context, com.facebook.ui.media.attachments.d d1, com.facebook.ui.images.a.a a1, d d2, com.facebook.common.time.a a2, com.facebook.ui.c.d d3, h h1, 
            com.facebook.analytics.j.a a3, com.facebook.common.e.h h2, int i, boolean flag, String s, av av, j j, 
            javax.inject.a a4)
    {
        super(context, a2, d3, h1, a3, h2, a(i, flag, s), av, j, a4);
        a = d1;
        b = a1;
        c = d2;
    }

    static com.facebook.ui.media.attachments.d a(a a1)
    {
        return a1.a;
    }

    private static m a(int i, boolean flag, String s)
    {
        long l1 = 0x1e00000L;
        int j;
        long l;
        if (i >= 64)
        {
            j = 0x1000000;
        } else
        if (i >= 32)
        {
            j = 0x400000;
        } else
        {
            j = 0x200000;
        }
        if (i >= 32)
        {
            i = j - 0x100000;
        } else
        {
            i = j - 0x80000;
        }
        s = (new m()).a("image").b(".image").c((new StringBuilder()).append(s).append("_image").toString()).a(1).d(j).e(i).b(100).c(80).a(true);
        if (flag)
        {
            l = 0x3c00000L;
        } else
        {
            l = 0x1e00000L;
        }
        s = s.a(l);
        if (flag)
        {
            l = l1;
        } else
        {
            l = 0xf00000L;
        }
        return s.b(l);
    }

    static boolean b(a a1)
    {
        return a1.h();
    }

    static com.facebook.ui.images.a.a c(a a1)
    {
        return a1.b;
    }

    private boolean h()
    {
        return c.a(aj.u, true);
    }

    protected int a(Bitmap bitmap)
    {
        return bitmap.getWidth() * bitmap.getHeight() * 4;
    }

    protected volatile int a(Object obj)
    {
        return a((Bitmap)obj);
    }

    protected com.facebook.ui.media.cache.a a(Context context, com.facebook.common.e.h h1, com.facebook.ui.c.d d1, h h2, com.facebook.common.time.a a1, m m1)
    {
        return new b(this, context, h1, d1, h2, a1, m1);
    }
}
