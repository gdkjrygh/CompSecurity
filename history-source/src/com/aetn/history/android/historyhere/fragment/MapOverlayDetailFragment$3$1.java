// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayDetailFragment

class this._cls1
    implements Runnable
{

    final Detail this$1;

    public void run()
    {
        MapOverlayDetailFragment.access$100(_fld0).animateCloseMapDetail();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3

/* anonymous class */
    class MapOverlayDetailFragment._cls3
        implements com.aetn.history.android.historyhere.model.PoiManager.PoiDetailLoadedListener
    {

        final MapOverlayDetailFragment this$0;

        public void onPoiDetailLoadFailed()
        {
            ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003d));
            (new Handler()).postDelayed(new MapOverlayDetailFragment._cls3._cls1(), 1000L);
        }

        public void onPoiDetailLoaded(POIDetail poidetail)
        {
            setRemainingData();
        }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
    }

}
