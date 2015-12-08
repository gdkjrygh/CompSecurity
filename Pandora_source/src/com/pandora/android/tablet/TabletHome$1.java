// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import android.view.View;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

class a
    implements android.view.ver.OnGlobalLayoutListener
{

    final TabletHome a;

    public void onGlobalLayout()
    {
        if (TabletHome.d(a).getRootView().getHeight() - TabletHome.d(a).getHeight() > TabletHome.d(a).getHeight() / 3)
        {
            TabletHome.e(a).setVisibility(8);
            return;
        } else
        {
            TabletHome.e(a).setVisibility(0);
            return;
        }
    }

    youtListener(TabletHome tablethome)
    {
        a = tablethome;
        super();
    }
}
