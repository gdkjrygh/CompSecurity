// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            SlidingDrawer

private class <init>
    implements android.view.ener
{

    final SlidingDrawer a;

    public void onClick(View view)
    {
        if (SlidingDrawer.a(a))
        {
            return;
        }
        if (SlidingDrawer.b(a))
        {
            a.b();
            return;
        } else
        {
            a.a();
            return;
        }
    }

    private (SlidingDrawer slidingdrawer)
    {
        a = slidingdrawer;
        super();
    }

    a(SlidingDrawer slidingdrawer, a a1)
    {
        this(slidingdrawer);
    }
}
