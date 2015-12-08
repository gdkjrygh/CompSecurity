// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.wallet.widgets.dynamicwidth.ScreenWidthSensitiveListView;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListFragment, ViewWoblActivity

final class this._cls0
    implements android.widget.ClickListener
{

    final WobListFragment this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (listView.getAdapter().getItem(i)));
        if (adapterview instanceof com.google.wallet.proto.WobInstance)
        {
            startActivity(ViewWoblActivity.createExpandedViewIntent(getActivity(), (com.google.wallet.proto.WobInstance)adapterview));
        } else
        if (adapterview instanceof com.google.android.apps.wallet.wobs.list.r.ListItem)
        {
            adapterview = ((com.google.android.apps.wallet.wobs.list.r.ListItem)adapterview).getEntityId();
            startActivity(ViewWoblActivity.createExpandedViewIntent(getActivity(), adapterview));
            return;
        }
    }

    dapter.ListItem()
    {
        this$0 = WobListFragment.this;
        super();
    }
}
