// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.support.v7.widget.GridLayoutManager;
import com.cardinalblue.android.piccollage.view.a.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

class kup extends android.support.v7.widget.LayoutManager.SpanSizeLookup
{

    final GridLayoutManager a;
    final i b;

    public int getSpanSize(int j)
    {
        if (b.b.a(j))
        {
            return a.getSpanCount();
        } else
        {
            return 1;
        }
    }

    kup(i j, GridLayoutManager gridlayoutmanager)
    {
        b = j;
        a = gridlayoutmanager;
        super();
    }
}
