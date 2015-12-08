// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.widget.AbsListView;

// Referenced classes of package com.thetransitapp.droid:
//            RoutesScreen

class this._cls0
    implements android.widget.crollListener
{

    private int oldLastVisibleItem;
    final RoutesScreen this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (i != oldLastVisibleItem)
        {
            hidePopover(false);
        }
        oldLastVisibleItem = i;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    ener()
    {
        this$0 = RoutesScreen.this;
        super();
    }
}
