// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.LinearLayout;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;
import com.roidapp.photogrid.video.ScrollImageViewEx;

// Referenced classes of package com.roidapp.photogrid.release:
//            hs, hk, ng

final class hq
    implements hs
{

    final hk a;

    hq(hk hk1)
    {
        a = hk1;
        super();
    }

    public final void a(float f)
    {
        int j = hk.c(a).a(f);
        int i = j;
        if (j < 0)
        {
            i = 0;
        }
        a.b.a(false, false);
        a.b.s();
        if (a.e == 0)
        {
            a.e = hk.b(a).a().getWidth() - hk.b(a).getWidth();
        }
        if (hk.c(a) != null && hk.c(a).a() == 0)
        {
            ScrollImageViewEx scrollimageviewex = hk.c(a);
            int k;
            if (hk.b(a).a().getWidth() > hk.b(a).getWidth())
            {
                k = hk.b(a).getWidth();
            } else
            {
                k = hk.b(a).a().getWidth();
            }
            scrollimageviewex.a(k);
        }
        if (a.e > 0)
        {
            hk.b(a).scrollTo(a.e * i >> 10, 0);
        }
        a.b.l((int)(((float)i / 1024F) * (float)a.b.o()));
    }
}
