// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            by, PhotoGridActivity, bu, cd, 
//            ih

final class cb
    implements android.view.View.OnClickListener
{

    final by a;

    cb(by by1)
    {
        a = by1;
        super();
    }

    public final void onClick(View view)
    {
        if (!by.a(a).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (by.g(a) == null) goto _L4; else goto _L3
_L3:
        int i = by.h(a) - by.g(a).getLeft() - (view.getRight() - by.g(a).getScrollX());
        if (i >= by.i(a)) goto _L6; else goto _L5
_L5:
        by.g(a).smoothScrollBy(by.i(a) - i, 0);
_L4:
        i = ((Integer)view.getTag()).intValue();
        if (i == 1)
        {
            by.a(a).a(by.a(a).k);
            view = new bu();
            view.a(by.j(a), by.k(a), by.b(a));
            by.a(a).a(0x7f0d03ec, view, "FragmentBgColor");
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        i = view.getLeft() - by.g(a).getScrollX();
        if (i < by.i(a))
        {
            by.g(a).smoothScrollBy(i - by.i(a), 0);
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (by.a(a).b("FragmentBgListSub")) goto _L1; else goto _L8
_L8:
        view = new cd();
        ih.C().q(i);
        view.a(by.j(a), by.k(a), by.b(a));
        by.a(a).a(0x7f0d03ec, view, "FragmentBgListSub");
        return;
    }
}
