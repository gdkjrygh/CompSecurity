// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.destination.util.NavigationDrawerUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            SideDrawerAdapter, DestinationFragmentActivity

final class val.parent
    implements android.view.
{

    final SideDrawerAdapter this$0;
    final ViewGroup val$parent;
    final int val$position;

    public final void onClick(View view)
    {
        NavigationDrawerUtils.onDrawerItemClicked(SideDrawerAdapter.access$000(SideDrawerAdapter.this), val$position, val$parent);
        SideDrawerAdapter.access$000(SideDrawerAdapter.this).closeDrawer();
        notifyDataSetChanged();
    }

    ctivity()
    {
        this$0 = final_sidedraweradapter;
        val$position = i;
        val$parent = ViewGroup.this;
        super();
    }
}
