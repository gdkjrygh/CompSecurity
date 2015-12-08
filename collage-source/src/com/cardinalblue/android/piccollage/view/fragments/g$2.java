// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.support.v7.widget.GridLayoutManager;
import com.cardinalblue.android.piccollage.view.a.w;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            g

class kup extends android.support.v7.widget.LayoutManager.SpanSizeLookup
{

    final w a;
    final GridLayoutManager b;
    final g c;

    public int getSpanSize(int i)
    {
        if (a.a(i))
        {
            return b.getSpanCount();
        } else
        {
            return 1;
        }
    }

    kup(g g1, w w1, GridLayoutManager gridlayoutmanager)
    {
        c = g1;
        a = w1;
        b = gridlayoutmanager;
        super();
    }
}
