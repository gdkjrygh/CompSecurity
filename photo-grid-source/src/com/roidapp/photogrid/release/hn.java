// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.LinearLayout;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;
import com.roidapp.photogrid.video.ScrollImageViewEx;

// Referenced classes of package com.roidapp.photogrid.release:
//            hs, hk, ng

final class hn
    implements hs
{

    final hk a;

    hn(hk hk1)
    {
        a = hk1;
        super();
    }

    public final void a(float f)
    {
        if (a.e == 0)
        {
            a.e = hk.b(a).a().getWidth() - hk.b(a).getWidth();
        }
        if (hk.c(a) != null && hk.c(a).a() == 0)
        {
            ScrollImageViewEx scrollimageviewex = hk.c(a);
            int i;
            if (hk.b(a).a().getWidth() > hk.b(a).getWidth())
            {
                i = hk.b(a).getWidth();
            } else
            {
                i = hk.b(a).a().getWidth();
            }
            scrollimageviewex.a(i);
        }
        if (a.e == 0)
        {
            return;
        }
        float f1 = f / (float)a.e;
        f = f1;
        if (f1 < 0.0F)
        {
            f = 0.0F;
        }
        a.b.a(false, false);
        a.b.s();
        a.b.l((int)((float)a.b.o() * f));
        hk.c(a).a((int)(f * 1024F), false);
    }
}
