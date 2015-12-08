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

class this._cls1
    implements Runnable
{

    final ragmentManager this$1;

    public void run()
    {
        getFragmentManager().popBackStack();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/TourDetailFragment$4

/* anonymous class */
    class TourDetailFragment._cls4
        implements com.aetn.history.android.historyhere.model.PoiManager.TourDetailLoadedListener
    {

        final TourDetailFragment this$0;

        public void onTourDetailLoadFailed()
        {
            Utils.logger(TourDetailFragment.access$300(), "onTourDetailLoadFailed(): show error ");
            ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003f));
            (new Handler()).postDelayed(new TourDetailFragment._cls4._cls1(), 1000L);
        }

        public void onTourDetailLoaded(POIDetail poidetail)
        {
            Utils.logger(TourDetailFragment.access$300(), "setOnTourDetailReceivedListener");
            TourDetailFragment.access$502(TourDetailFragment.this, poidetail);
            setRemainingData();
        }

            
            {
                this$0 = TourDetailFragment.this;
                super();
            }
    }

}
