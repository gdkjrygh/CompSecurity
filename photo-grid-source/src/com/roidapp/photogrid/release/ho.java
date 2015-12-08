// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.LinearLayout;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;

// Referenced classes of package com.roidapp.photogrid.release:
//            hr, hk

final class ho
    implements hr
{

    final hk a;

    ho(hk hk1)
    {
        a = hk1;
        super();
    }

    public final void a()
    {
        if (hk.b(a).a() != null)
        {
            if (a.e == 0)
            {
                a.e = hk.b(a).a().getWidth() - hk.b(a).getWidth();
            }
            if (a.e > 0 && a.f != 0)
            {
                hk.b(a).b(a.e * a.f >> 10);
            }
        }
    }
}
