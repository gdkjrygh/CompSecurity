// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            StickyScrollView

class a
    implements Runnable
{

    final StickyScrollView a;

    public void run()
    {
        if (StickyScrollView.a(a) != null)
        {
            int i = StickyScrollView.a(a, StickyScrollView.a(a));
            int j = StickyScrollView.b(a, StickyScrollView.a(a));
            int k = StickyScrollView.c(a, StickyScrollView.a(a));
            int l = (int)((float)a.getScrollY() + ((float)StickyScrollView.a(a).getHeight() + StickyScrollView.b(a)));
            a.invalidate(i, j, k, l);
        }
        a.postDelayed(this, 16L);
    }

    (StickyScrollView stickyscrollview)
    {
        a = stickyscrollview;
        super();
    }
}
