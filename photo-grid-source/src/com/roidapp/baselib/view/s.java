// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

// Referenced classes of package com.roidapp.baselib.view:
//            r

final class s
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final int a;
    final View b;
    final View c;
    final int d;
    final r e;

    s(r r1, int i, View view, View view1, int j)
    {
        e = r1;
        a = i;
        b = view;
        c = view1;
        d = j;
        super();
    }

    public final void onGlobalLayout()
    {
        int i = -(a + (int)((float)b.getHeight() * 1.25F));
        r.a(e).update(c, d, i, r.a(e).getWidth(), r.a(e).getHeight());
        b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
