// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.View;
import com.aetn.history.android.historyhere.MainNavigationActivity;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            ListViewFragment, MapFragment

class this._cls0
    implements android.view.r
{

    final ListViewFragment this$0;

    public void onClick(View view)
    {
        ListViewFragment.access$100(ListViewFragment.this).showMap();
        ListViewFragment.access$100(ListViewFragment.this).getMapFragment().showSearch();
    }

    ()
    {
        this$0 = ListViewFragment.this;
        super();
    }
}
