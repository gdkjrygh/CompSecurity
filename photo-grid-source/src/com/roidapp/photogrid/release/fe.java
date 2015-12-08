// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            fb, PhotoGridActivity, mm

final class fe
    implements android.view.View.OnClickListener
{

    final fb a;

    fe(fb fb1)
    {
        a = fb1;
        super();
    }

    public final void onClick(View view)
    {
        if (fb.b(a).i)
        {
            return;
        }
        if (fb.d(a) != null)
        {
            int i = view.getLeft() - fb.d(a).getScrollX();
            if (i < fb.e(a))
            {
                fb.d(a).smoothScrollBy(i - fb.e(a), 0);
            }
        }
        if (!fb.h(a))
        {
            int j = fb.i(a);
            if (j != -1)
            {
                fb.b(a).b.a(j, false);
                fb.b(a).a(false, false);
                view = fb.g(a).findViewWithTag(Integer.valueOf(fb.f(a)));
                if (view != null)
                {
                    view.findViewById(0x7f0d0493).setVisibility(8);
                }
                fb.g(a).getChildAt(j + 2).findViewById(0x7f0d0493).setVisibility(0);
                fb.a(a, j);
                return;
            }
            fb.j(a);
        }
        if (fb.f(a) != fb.k(a))
        {
            fb.g(a).getChildAt(fb.f(a) + 2).findViewById(0x7f0d0493).setVisibility(8);
            fb.a(a, fb.k(a));
        }
        fb.b(a).b.a(fb.k(a), true);
        fb.b(a).a(false, false);
    }
}
