// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            ListOverlayDetailFragment

class this._cls0
    implements com.aetn.history.android.historyhere.model.stener
{

    final ListOverlayDetailFragment this$0;

    public void onPoiDetailLoadFailed()
    {
        Utils.logger("ListOverlayDetailFragment", "onPoiDetailLoadFailed");
        ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003d));
        ListOverlayDetailFragment.access$100(ListOverlayDetailFragment.this).animateCloseListDetail();
    }

    public void onPoiDetailLoaded(POIDetail poidetail)
    {
        Utils.logger("ListOverlayDetailFragment", "setOnDetailReceivedListener");
        setRemainingData();
    }

    ner()
    {
        this$0 = ListOverlayDetailFragment.this;
        super();
    }
}
