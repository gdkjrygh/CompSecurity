// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.view.View;

// Referenced classes of package com.fitbit.ui.views:
//            DragListView

class a
    implements Runnable
{

    final View a;
    final DragListView b;

    public void run()
    {
        a.setVisibility(0);
    }

    (DragListView draglistview, View view)
    {
        b = draglistview;
        a = view;
        super();
    }
}
