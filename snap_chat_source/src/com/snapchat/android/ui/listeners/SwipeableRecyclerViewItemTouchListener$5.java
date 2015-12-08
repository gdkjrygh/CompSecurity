// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.animation.Animator;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableRecyclerViewItemTouchListener

final class a
    implements android.animation.TouchListener._cls5
{

    private Integer a;
    private SwipeableRecyclerViewItemTouchListener b;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (SwipeableRecyclerViewItemTouchListener.e(b) != null && a.intValue() != -1)
        {
            SwipeableRecyclerViewItemTouchListener.a(b).c(a.intValue());
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener, Integer integer)
    {
        b = swipeablerecyclerviewitemtouchlistener;
        a = integer;
        super();
    }
}
