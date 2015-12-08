// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.holder;

import abf;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.porcelain.holder:
//            PorcelainCarouselViewHolder

final class a extends abf
{

    private PorcelainCarouselViewHolder a;

    public final void a(RecyclerView recyclerview, int i, int j)
    {
label0:
        {
            if (PorcelainCarouselViewHolder.c(a) != null)
            {
                PorcelainCarouselViewHolder.c(a).a = PorcelainCarouselViewHolder.b(a).k();
                recyclerview = PorcelainCarouselViewHolder.b(a).b(PorcelainCarouselViewHolder.c(a).a);
                if (recyclerview == null)
                {
                    break label0;
                }
                PorcelainCarouselViewHolder.c(a).b = recyclerview.getLeft();
            }
            return;
        }
        PorcelainCarouselViewHolder.c(a).a = 0;
        PorcelainCarouselViewHolder.c(a).b = 0;
    }

    rouselScrollPosition(PorcelainCarouselViewHolder porcelaincarouselviewholder)
    {
        a = porcelaincarouselviewholder;
        super();
    }
}
