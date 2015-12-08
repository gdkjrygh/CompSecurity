// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.view.ViewTreeObserver;
import com.roidapp.imagelib.ImageLibrary;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            e, FreeCropView, d, Magnifier

final class g
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final e a;

    g(e e1)
    {
        a = e1;
        super();
    }

    public final void onGlobalLayout()
    {
        ImageLibrary.a().a("FreeCropFrag/onGlobalLayout");
        e.e(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        e.a(a, e.e(a).getWidth());
        e.b(a, e.e(a).getHeight());
        int i = e.f(a);
        int j = e.g(a);
        e.a(a, new d(a.getActivity(), e.h(a), i, j));
        e.i(a).a(e.e(a));
        e.e(a).a(e.i(a));
        e.j(a).a(e.i(a));
        e.e(a).invalidate();
    }
}
