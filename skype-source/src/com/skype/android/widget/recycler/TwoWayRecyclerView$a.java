// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;


// Referenced classes of package com.skype.android.widget.recycler:
//            TwoWayRecyclerView, ReservedViewTypes

final class a extends android.support.v7.widget.rView.a
{

    final TwoWayRecyclerView a;
    private boolean b;
    private int c;

    public final void a(int i)
    {
        c = i;
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    public final boolean a()
    {
        return b;
    }

    public final int getSpanSize(int i)
    {
        if (b)
        {
            android.support.v7.widget.rView.a a1 = a.getAdapter();
            if (i < a1.mCount() && a1.mViewType(i) == ReservedViewTypes.a.c)
            {
                return c;
            }
        }
        return 1;
    }

    (TwoWayRecyclerView twowayrecyclerview)
    {
        a = twowayrecyclerview;
        super();
    }
}
