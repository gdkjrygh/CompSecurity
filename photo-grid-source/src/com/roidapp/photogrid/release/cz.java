// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            cy, PhotoGridActivity, az

final class cz
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final View b;
    final int c;
    final int d;
    final cy e;

    cz(cy cy1, ViewGroup viewgroup, View view, int i, int j)
    {
        e = cy1;
        a = viewgroup;
        b = view;
        c = i;
        d = j;
        super();
    }

    public final void onClick(View view)
    {
        if (!cy.a(e).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (cy.b(e) != null)
        {
            int i = cy.c(e) - cy.b(e).getLeft() - (view.getRight() - cy.b(e).getScrollX());
            if (i >= cy.d(e) >> 1)
            {
                break; /* Loop/switch isn't completed */
            }
            cy.b(e).smoothScrollBy((cy.d(e) >> 1) - i, 0);
        }
_L4:
        if (cy.e(e) != null)
        {
            a.findViewById(cy.e(e).intValue()).findViewById(0x7f0d0493).setVisibility(8);
        }
        b.findViewById(0x7f0d0493).setVisibility(0);
        cy.a(e, Integer.valueOf(c));
        view = cy.a(e).P();
        if (view != null)
        {
            cy.a(e, d);
            view.a(d);
            view.invalidate();
            cy.b(e, d);
            cy.c(e, cy.f(e) - 1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int j = view.getLeft() - cy.b(e).getScrollX();
        if (j < cy.d(e) >> 1)
        {
            cy.b(e).smoothScrollBy(j - (cy.d(e) >> 1), 0);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
