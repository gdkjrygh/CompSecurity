// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPinSearchFragment

class this._cls0
    implements com.pinterest.ui.tab.nSearchFragment._cls6
{

    final GuidedPinSearchFragment this$0;

    public void onTabReselected(int i)
    {
    }

    public void onTabSelected(int i)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        if (GuidedPinSearchFragment.access$500(GuidedPinSearchFragment.this).getEmptyView() != null)
        {
            GuidedPinSearchFragment.access$700(GuidedPinSearchFragment.this).getEmptyView().setAction(1, 0x7f070503, GuidedPinSearchFragment.access$600(GuidedPinSearchFragment.this));
        }
_L4:
        GuidedPinSearchFragment.access$1002(GuidedPinSearchFragment.this, i);
        reload(_lastQuery, _queryMetaList, _lastQueryData, _lastQueryState, _queryAutoCorrectionDisabled, _commerceOnly);
        return;
_L2:
        if (GuidedPinSearchFragment.access$800(GuidedPinSearchFragment.this).getEmptyView() != null)
        {
            GuidedPinSearchFragment.access$900(GuidedPinSearchFragment.this).getEmptyView().removeAction(1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = GuidedPinSearchFragment.this;
        super();
    }
}
