// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import android.graphics.Rect;
import android.view.View;
import p.df.a;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

class c
    implements android.view.ver.OnScrollChangedListener
{

    final TabletHome a;
    private Rect b;
    private int c;
    private float d;
    private float e;

    public void onScrollChanged()
    {
        if (c == -1)
        {
            c = TabletHome.f(a).getMeasuredWidth();
        }
        TabletHome.f(a).getLocalVisibleRect(b);
        d = (float)(c - b.width()) / (float)c;
        if (d == 0.0F && TabletHome.g(a).getVisibility() == 0)
        {
            TabletHome.g(a).setVisibility(8);
            p.df.a.a("TabletHome", "TabletHome.onScrollChanged() --> mStationPaneOverlay = View.GONE");
        } else
        if (Math.abs(e - d) > 0.01F)
        {
            if (TabletHome.g(a).getVisibility() != 0)
            {
                TabletHome.g(a).setVisibility(0);
            }
            TabletHome.g(a).setAlpha(d);
            e = d;
            return;
        }
    }

    angedListener(TabletHome tablethome)
    {
        a = tablethome;
        super();
        b = new Rect();
        c = -1;
    }
}
