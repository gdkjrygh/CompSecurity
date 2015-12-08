// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.content.Context;

// Referenced classes of package com.skype.android.widget.recycler:
//            TwoWayRecyclerView, OnSpanCountListener

public static class j extends j
{

    private final getOrientation j;
    private OnSpanCountListener k;

    public final void a(int i)
    {
        int l = i;
        if (i <= 0)
        {
            l = 1;
        }
        if (l != b())
        {
            super.b(l);
            if (j != null)
            {
                j.j(l);
                if (k != null)
                {
                    if (j.j())
                    {
                        l = 1;
                    }
                    k.onSpanCount(l);
                }
            }
        }
    }

    public final void a(android.support.v7.widget.Manager manager)
    {
        throw new UnsupportedOperationException("TwoWayLayoutManager has its own built-in SpanSizeLookup");
    }

    public final void a(OnSpanCountListener onspancountlistener)
    {
        k = onspancountlistener;
    }

    public final boolean c()
    {
        return false;
    }

    public void setOrientation(int i)
    {
        boolean flag = true;
        super.entation(i);
        if (j != null)
        {
            k k1 = j;
            if (getOrientation() != 1)
            {
                flag = false;
            }
            k1.getOrientation(flag);
        }
    }

    public (Context context, int i, int l, int i1, int j1, int k1, int l1, 
            int i2, int j2,  )
    {
        boolean flag = true;
        super(context, i, l, i1, j1, k1, l1, i2, j2);
        if (i != 1)
        {
            flag = false;
        }
        .(flag);
        j = ;
        super.j();
    }
}
