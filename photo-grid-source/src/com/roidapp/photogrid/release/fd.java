// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            fb, PhotoGridActivity, ih, mm

final class fd
    implements android.view.View.OnClickListener
{

    final fb a;

    fd(fb fb1)
    {
        a = fb1;
        super();
    }

    public final void onClick(View view)
    {
        if (!fb.b(a).i)
        {
            if (fb.d(a) != null)
            {
                int i = view.getLeft() - fb.d(a).getScrollX();
                if (i < fb.e(a))
                {
                    fb.d(a).smoothScrollBy(i - fb.e(a), 0);
                }
            }
            if (fb.f(a) != 0 || ih.C().W() != 1 && ih.C().W() != 0)
            {
                View view1 = fb.g(a).findViewWithTag(Integer.valueOf(fb.f(a)));
                if (view1 != null)
                {
                    view1.findViewById(0x7f0d0493).setVisibility(8);
                }
                view.findViewById(0x7f0d0493).setVisibility(0);
                fb.a(a, 0);
                fb.b(a).b.a(0, false);
                fb.b(a).c(false, false);
                return;
            }
        }
    }
}
