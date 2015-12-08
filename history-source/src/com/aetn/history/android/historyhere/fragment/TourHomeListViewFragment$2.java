// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            TourHomeListViewFragment

class this._cls0
    implements com.aetn.history.android.historyhere.model.edListener
{

    final TourHomeListViewFragment this$0;

    public void onDataLoadFailed()
    {
        Utils.logger("TourHomeListViewFragment", "onPoiDetailLoadFailed");
        ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003b));
        getActivity().getSupportFragmentManager().popBackStack();
    }

    public void onDataLoaded(ArrayList arraylist)
    {
        TourHomeListViewFragment.access$002(TourHomeListViewFragment.this, arraylist);
        Utils.logger("TourHomeListViewFragment", "loadCurrentData() now loaded");
        if (TourHomeListViewFragment.access$000(TourHomeListViewFragment.this) == null)
        {
            TourHomeListViewFragment.access$002(TourHomeListViewFragment.this, new ArrayList());
        }
        TourHomeListViewFragment.access$000(TourHomeListViewFragment.this).add(new POIDetail());
        TourHomeListViewFragment.access$100(TourHomeListViewFragment.this);
    }

    istener()
    {
        this$0 = TourHomeListViewFragment.this;
        super();
    }
}
