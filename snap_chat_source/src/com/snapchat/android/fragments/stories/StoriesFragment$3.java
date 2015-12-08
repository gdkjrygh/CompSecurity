// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import IG;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import com.snapchat.android.util.ScrollState;
import com.snapchat.android.util.StoriesPageStateManager;
import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class a extends android.support.v7.widget.esFragment._cls3
{

    private StoriesFragment a;

    public final void a(RecyclerView recyclerview, int i)
    {
        ScrollState scrollstate;
        long l;
        recyclerview = StoriesFragment.k(a);
        scrollstate = ScrollState.fromRecyclerViewState(i);
        l = SystemClock.elapsedRealtime();
        com.snapchat.android.util.nager._cls1..SwitchMap.com.snapchat.android.util.ScrollState[scrollstate.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 62
    //                   2 98
    //                   3 98;
           goto _L1 _L2 _L3 _L3
_L1:
        recyclerview.mLastScrollState = scrollstate;
        if (i == 0);
        return;
_L2:
        if (((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.a())
        {
            ((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.mEnd = l;
        } else
        {
            ((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.a(l, l);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (((StoriesPageStateManager) (recyclerview)).mLastScrollState == ScrollState.IDLE || ((StoriesPageStateManager) (recyclerview)).mLastScrollState == ScrollState.UNKNOWN)
        {
            ((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.a(l, 0x7fffffffffffffffL);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        recyclerview = (android.widget.outParams)StoriesFragment.l(a).getLayoutParams();
        if (a.s())
        {
            StoriesFragment.a(a, StoriesFragment.l(a), ((android.widget.outParams) (recyclerview)).rightMargin, 0).start();
        } else
        if (a.t())
        {
            StoriesFragment.a(a, StoriesFragment.l(a), ((android.widget.outParams) (recyclerview)).rightMargin, -((android.widget.outParams) (recyclerview)).width).start();
            return;
        }
    }

    lerViewFastScroller(StoriesFragment storiesfragment)
    {
        a = storiesfragment;
        super();
    }
}
