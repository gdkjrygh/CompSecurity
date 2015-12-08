// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.LinearLayout;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;
import com.roidapp.photogrid.video.ScrollImageViewEx;

// Referenced classes of package com.roidapp.photogrid.release:
//            hr, hk

final class hp
    implements hr
{

    final hk a;

    hp(hk hk1)
    {
        a = hk1;
        super();
    }

    public final void a()
    {
        if (hk.b(a) != null && hk.c(a) != null)
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
    }
}
