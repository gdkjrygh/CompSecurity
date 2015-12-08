// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.holder;

import abc;
import abm;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.porcelain.holder:
//            PorcelainCarouselViewHolder

public final class b extends abc
{

    private int a;
    private int b;
    private PorcelainCarouselViewHolder c;

    public final void a(Rect rect, View view, RecyclerView recyclerview, abm abm)
    {
        super.a(rect, view, recyclerview, abm);
        PorcelainCarouselViewHolder.a(c);
        int j = RecyclerView.d(view);
        int k = PorcelainCarouselViewHolder.b(c).w();
        int i;
        if (j == 0)
        {
            i = a;
        } else
        {
            i = b;
        }
        if (j == k)
        {
            j = a;
        } else
        {
            j = b;
        }
        rect.set(i, 0, j, 0);
    }

    (PorcelainCarouselViewHolder porcelaincarouselviewholder, int i, int j)
    {
        c = porcelaincarouselviewholder;
        a = i;
        b = j;
        super();
    }
}
