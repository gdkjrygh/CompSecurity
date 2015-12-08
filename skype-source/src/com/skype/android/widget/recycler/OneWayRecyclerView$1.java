// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.support.v7.widget.RecyclerView;
import com.skype.android.widget.fastscroll.FastScrollDelegate;

// Referenced classes of package com.skype.android.widget.recycler:
//            OneWayRecyclerView

final class a extends android.support.v7.widget.rView._cls1
{

    final OneWayRecyclerView a;

    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        recyclerview = a.a;
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        recyclerview.a(flag);
    }

    public final void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        a.a.a(a.computeVerticalScrollOffset(), a.computeVerticalScrollExtent(), a.computeVerticalScrollRange());
    }

    (OneWayRecyclerView onewayrecyclerview)
    {
        a = onewayrecyclerview;
        super();
    }
}
