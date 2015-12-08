// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            cd, PhotoGridActivity, PhotoView, ra, 
//            mm, ih

final class cf
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final View b;
    final int c;
    final cd d;

    cf(cd cd1, ViewGroup viewgroup, View view, int i)
    {
        d = cd1;
        a = viewgroup;
        b = view;
        c = i;
        super();
    }

    public final void onClick(View view)
    {
        if (!cd.a(d).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (cd.f(d) == null) goto _L4; else goto _L3
_L3:
        int i = cd.g(d) - cd.f(d).getLeft() - (view.getRight() - cd.f(d).getScrollX());
        if (i >= cd.h(d)) goto _L6; else goto _L5
_L5:
        cd.f(d).smoothScrollBy(cd.h(d) - i, 0);
_L4:
        if (cd.i(d) != null)
        {
            a.findViewById(cd.i(d).intValue()).findViewById(0x7f0d0493).setVisibility(8);
        }
        b.findViewById(0x7f0d0493).setVisibility(0);
        cd.a(d, Integer.valueOf(c));
        int j;
        if (cd.e(d) == 1)
        {
            Object obj = cd.a(d).O().g();
            if (obj != null && (obj instanceof ra))
            {
                obj = (ra)obj;
                obj.aq = false;
                ((ra) (obj)).a(cd.b(d), ((Integer)view.getTag()).intValue());
                ((ra) (obj)).j();
                cd.a(d).O().invalidate();
                return;
            }
        } else
        if (cd.b(d) == 0)
        {
            cd.a(d).b.b(((Integer)view.getTag()).intValue());
            return;
        } else
        {
            az.C = false;
            ih.C().v(false);
            cd.a(d).b.a(cd.b(d), ((Integer)view.getTag()).intValue());
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        j = view.getLeft() - cd.f(d).getScrollX();
        if (j < cd.h(d))
        {
            cd.f(d).smoothScrollBy(j - cd.h(d), 0);
        }
          goto _L4
    }
}
