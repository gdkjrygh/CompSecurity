// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import com.kik.cache.g;
import com.kik.cache.h;
import com.kik.g.p;
import com.kik.g.r;
import com.kik.sdkutils.a.a;
import com.kik.sdkutils.b.b;

// Referenced classes of package com.kik.sdkutils:
//            LazyLoadingImage

final class aa extends r
{

    final p a;
    final b b;
    final boolean c = false;
    final LazyLoadingImage d;

    aa(LazyLoadingImage lazyloadingimage, p p, b b1)
    {
        d = lazyloadingimage;
        a = p;
        b = b1;
        super();
    }

    public final void a()
    {
        if (com.kik.sdkutils.LazyLoadingImage.a(d) == a)
        {
            com.kik.sdkutils.LazyLoadingImage.b(d, com.kik.sdkutils.LazyLoadingImage.b(d));
            LazyLoadingImage.d(d).a(LazyLoadingImage.c(d), com.kik.sdkutils.LazyLoadingImage.b(d));
            com.kik.sdkutils.LazyLoadingImage.a(d, LazyLoadingImage.d(d));
        }
    }

    public final void a(Object obj)
    {
        obj = (h)obj;
        if (com.kik.sdkutils.LazyLoadingImage.a(d) == a)
        {
            if (obj == null)
            {
                throw new IllegalArgumentException("image result null!");
            }
            if (b == null)
            {
                throw new IllegalArgumentException("inflater null!");
            }
            obj = (g)((h) (obj)).a();
            obj = (g)b.a(obj);
            if (obj == null)
            {
                throw new IllegalArgumentException("inflated null!");
            }
            com.kik.sdkutils.LazyLoadingImage.a(d, ((g) (obj)).a());
            if (c)
            {
                com.kik.sdkutils.LazyLoadingImage.a(d, kik.android.util.r.a(com.kik.sdkutils.LazyLoadingImage.b(d)));
            }
        }
    }

    public final void a(Throwable throwable)
    {
        if (com.kik.sdkutils.LazyLoadingImage.a(d) == a)
        {
            com.kik.sdkutils.LazyLoadingImage.a(d, null);
        }
    }
}
