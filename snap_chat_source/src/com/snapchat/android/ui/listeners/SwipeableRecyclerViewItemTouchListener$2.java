// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableRecyclerViewItemTouchListener

final class a
    implements Runnable
{

    private int a;
    private SwipeableRecyclerViewItemTouchListener b;

    public final void run()
    {
        android.support.v7.widget.tener tener = SwipeableRecyclerViewItemTouchListener.a(b).c(a);
        SwipeableRecyclerViewItemTouchListener.b(b).h(tener);
        SwipeableRecyclerViewItemTouchListener.c(b);
    }

    (SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener, int i)
    {
        b = swipeablerecyclerviewitemtouchlistener;
        a = i;
        super();
    }
}
