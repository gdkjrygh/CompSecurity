// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.pager.viewpager.PhotoViewPager;
import com.google.android.apps.photos.slideshow.SlideshowService;

final class goe
    implements imd
{

    private gnw a;

    goe(gnw gnw1)
    {
        a = gnw1;
        super();
    }

    public final void a(boolean flag)
    {
        if (flag != gnw.h(a))
        {
            gnw.a(a, flag);
            boolean flag2 = ((nux)gnw.i(a).a(nux)).a();
            if (flag)
            {
                gnw.c(a, true);
                SlideshowService.a(gnw.j(a), gnw.e(a).f.a, gnw.e(a).f.b, gnw.e(a).j);
                if (!flag2)
                {
                    ((am) (a)).R.setKeepScreenOn(true);
                    return;
                }
            } else
            {
                boolean flag1;
                if (gnw.c(a).v != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    gnw.c(a, false);
                }
                SlideshowService.a(gnw.k(a));
                ((am) (a)).R.setKeepScreenOn(false);
                return;
            }
        }
    }

    public final boolean a()
    {
        return gnw.g(a);
    }
}
