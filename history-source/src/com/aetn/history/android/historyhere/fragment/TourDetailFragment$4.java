// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            TourDetailFragment

class this._cls0
    implements com.aetn.history.android.historyhere.model.LoadedListener
{

    final TourDetailFragment this$0;

    public void onTourDetailLoadFailed()
    {
        Utils.logger(TourDetailFragment.access$300(), "onTourDetailLoadFailed(): show error ");
        ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003f));
        (new Handler()).postDelayed(new Runnable() {

            final TourDetailFragment._cls4 this$1;

            public void run()
            {
                getFragmentManager().popBackStack();
            }

            
            {
                this$1 = TourDetailFragment._cls4.this;
                super();
            }
        }, 1000L);
    }

    public void onTourDetailLoaded(POIDetail poidetail)
    {
        Utils.logger(TourDetailFragment.access$300(), "setOnTourDetailReceivedListener");
        TourDetailFragment.access$502(TourDetailFragment.this, poidetail);
        setRemainingData();
    }

    _cls1.this._cls1()
    {
        this$0 = TourDetailFragment.this;
        super();
    }
}
