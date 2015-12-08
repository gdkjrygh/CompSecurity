// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableRecyclerViewItemTouchListener

public final class a extends android.support.v7.widget.tener._cls1
{

    private SwipeableRecyclerViewItemTouchListener a;

    public final void a(RecyclerView recyclerview, int i)
    {
        super._mth1(recyclerview, i);
        recyclerview = a;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        recyclerview.a(flag);
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        super._mth1(recyclerview, i, j);
    }

    public (SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        a = swipeablerecyclerviewitemtouchlistener;
        super();
    }
}
