// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            fb, PhotoGridActivity, mm

final class ff
    implements android.view.View.OnClickListener
{

    final fb a;

    ff(fb fb1)
    {
        a = fb1;
        super();
    }

    public final void onClick(View view)
    {
        if (!fb.b(a).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (fb.d(a) != null)
        {
            int i = fb.l(a) - fb.d(a).getLeft() - (view.getRight() - fb.d(a).getScrollX());
            if (i >= fb.e(a))
            {
                break; /* Loop/switch isn't completed */
            }
            fb.d(a).smoothScrollBy(fb.e(a) - i, 0);
        }
_L4:
        int j = ((Integer)view.getTag()).intValue();
        if (fb.f(a) != j)
        {
            fb.b(a).b.a(j, false);
            fb.b(a).a(false, false);
            View view1 = fb.g(a).findViewWithTag(Integer.valueOf(fb.f(a)));
            if (view1 != null)
            {
                view1.findViewById(0x7f0d0493).setVisibility(8);
            }
            if (fb.m(a) == 1)
            {
                View view2 = fb.g(a).findViewWithTag("noMask");
                if (view2 != null)
                {
                    view2.findViewById(0x7f0d0493).setVisibility(8);
                }
            }
            view.findViewById(0x7f0d0493).setVisibility(0);
            fb.a(a, j);
            fb.n(a).remove(String.valueOf(j));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k = view.getLeft() - fb.d(a).getScrollX();
        if (k < fb.e(a))
        {
            fb.d(a).smoothScrollBy(k - fb.e(a), 0);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
