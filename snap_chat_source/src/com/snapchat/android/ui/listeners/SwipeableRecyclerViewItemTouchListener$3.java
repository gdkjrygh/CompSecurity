// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;


// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableRecyclerViewItemTouchListener

final class a
    implements Runnable
{

    private SwipeableRecyclerViewItemTouchListener a;

    public final void run()
    {
        SwipeableRecyclerViewItemTouchListener.d(a);
    }

    (SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        a = swipeablerecyclerviewitemtouchlistener;
        super();
    }
}
