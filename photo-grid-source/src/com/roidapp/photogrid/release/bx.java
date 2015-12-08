// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            bu, PhotoGridActivity, PhotoView, ra, 
//            ih, mm

final class bx
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final View b;
    final int c;
    final int d;
    final bu e;

    bx(bu bu1, ViewGroup viewgroup, View view, int i, int j)
    {
        e = bu1;
        a = viewgroup;
        b = view;
        c = i;
        d = j;
        super();
    }

    public final void onClick(View view)
    {
        if (!bu.a(e).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (bu.e(e) == null) goto _L4; else goto _L3
_L3:
        int i = bu.f(e) - bu.e(e).getLeft() - (view.getRight() - bu.e(e).getScrollX());
        if (i >= bu.g(e) >> 1) goto _L6; else goto _L5
_L5:
        bu.e(e).smoothScrollBy((bu.g(e) >> 1) - i, 0);
_L4:
        if (bu.h(e) != null)
        {
            a.findViewById(bu.h(e).intValue()).findViewById(0x7f0d0493).setVisibility(8);
        }
        b.findViewById(0x7f0d0493).setVisibility(0);
        bu.a(e, Integer.valueOf(c));
        int j;
        if (bu.d(e) == 1)
        {
            view = bu.a(e).O().g();
            if (view != null && (view instanceof ra))
            {
                ((ra)view).a(d);
                bu.a(e).O().invalidate();
                return;
            }
        } else
        {
            az.C = false;
            ih.C().v(false);
            bu.a(e).b.a(d);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        j = view.getLeft() - bu.e(e).getScrollX();
        if (j < bu.g(e) >> 1)
        {
            bu.e(e).smoothScrollBy(j - (bu.g(e) >> 1), 0);
        }
          goto _L4
    }
}
