// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package xyz.danoz.recyclerviewfastscroller;

import android.support.v7.widget.RecyclerView;
import aoD;

// Referenced classes of package xyz.danoz.recyclerviewfastscroller:
//            AbsRecyclerViewFastScroller

final class a extends android.support.v7.widget.roller._cls1
{

    private AbsRecyclerViewFastScroller a;

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        float f = 0.0F;
        aoE aoe = a.d();
        if (aoe != null)
        {
            f = aoe.a(recyclerview);
        }
        a.a(f);
    }

    (AbsRecyclerViewFastScroller absrecyclerviewfastscroller)
    {
        a = absrecyclerviewfastscroller;
        super();
    }
}
