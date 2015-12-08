// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.widget.ImageView;
import com.jcp.util.bt;

// Referenced classes of package com.jcp.views:
//            ag, j, DataListView

class k
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ag a;
    final j b;

    k(j j1, ag ag1)
    {
        b = j1;
        a = ag1;
        super();
    }

    public void onGlobalLayout()
    {
        bt.a(((ImageView)a.a(Integer.valueOf(0x7f0e026e))).getViewTreeObserver(), this);
        DataListView.a(b.a, ((ImageView)a.a(Integer.valueOf(0x7f0e026e))).getMeasuredWidth());
        DataListView.b(b.a, ((ImageView)a.a(Integer.valueOf(0x7f0e026e))).getMeasuredHeight());
    }
}
