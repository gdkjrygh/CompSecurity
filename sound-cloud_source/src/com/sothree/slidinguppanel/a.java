// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.view.View;

// Referenced classes of package com.sothree.slidinguppanel:
//            SlidingUpPanelLayout

final class a
    implements android.view.View.OnClickListener
{

    final SlidingUpPanelLayout a;

    a(SlidingUpPanelLayout slidinguppanellayout)
    {
        a = slidinguppanellayout;
        super();
    }

    public final void onClick(View view)
    {
        if (!a.isEnabled())
        {
            return;
        }
        if (!a.d())
        {
            boolean flag;
            if (a.d == SlidingUpPanelLayout.c.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                a.b(SlidingUpPanelLayout.a(a));
                return;
            }
        }
        a.c();
    }
}
