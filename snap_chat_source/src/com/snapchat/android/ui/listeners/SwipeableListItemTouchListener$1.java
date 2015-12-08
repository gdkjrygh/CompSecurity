// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.widget.AbsListView;

// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableListItemTouchListener

public final class a
    implements android.widget.temTouchListener._cls1
{

    private SwipeableListItemTouchListener a;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        boolean flag = true;
        abslistview = a;
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            flag = false;
        }
        abslistview.c = flag;
    }

    public (SwipeableListItemTouchListener swipeablelistitemtouchlistener)
    {
        a = swipeablelistitemtouchlistener;
        super();
    }
}
