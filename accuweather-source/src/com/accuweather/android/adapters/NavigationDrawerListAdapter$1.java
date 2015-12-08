// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.view.View;

// Referenced classes of package com.accuweather.android.adapters:
//            NavigationDrawerListAdapter

class val.position
    implements android.view.DrawerListAdapter._cls1
{

    final NavigationDrawerListAdapter this$0;
    final int val$position;

    public void onClick(View view)
    {
        NavigationDrawerListAdapter.access$000(NavigationDrawerListAdapter.this).onNavigationDrawerItemSelected(val$position);
    }

    avigationDrawerListListener()
    {
        this$0 = final_navigationdrawerlistadapter;
        val$position = I.this;
        super();
    }
}
