// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.utils.Utils;
import com.aetn.history.android.historyhere.widgets.CustomViewPager;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment, MapFragment

class this._cls0
    implements com.aetn.history.android.historyhere.model.redMapMarkersListener
{

    final MapOverlayFragment this$0;

    public void onUnclusteredPoisChanged()
    {
        Utils.logger(MapOverlayFragment.access$000(MapOverlayFragment.this), "onUnclusteredPoisChanged");
        MapOverlayFragment.access$102(MapOverlayFragment.this, true);
        if (mIsDetailVisible)
        {
            MapOverlayFragment.access$202(MapOverlayFragment.this, true);
            if (MapOverlayFragment.access$300(MapOverlayFragment.this) != null)
            {
                int i = MapOverlayFragment.access$400(MapOverlayFragment.this).getCurrentItem();
                POIDetail poidetail = (POIDetail)MapOverlayFragment.access$300(MapOverlayFragment.this).get(i);
                if (!Boolean.valueOf(PoiManager.getInstance(getActivity()).isInUnclusteredMapMarkers(poidetail.getId())).booleanValue())
                {
                    Utils.logger(MapOverlayFragment.access$000(MapOverlayFragment.this), "onUnclusteredPoisChanged: it is not in the list close the details");
                    animateHideDetailPager();
                    MapOverlayFragment.access$502(MapOverlayFragment.this, null);
                    MapOverlayFragment.access$600(MapOverlayFragment.this).getMapFragment().clearSelectedMarkerIcon();
                } else
                {
                    Utils.logger(MapOverlayFragment.access$000(MapOverlayFragment.this), "onUnclusteredPoisChanged: don't do anything right now");
                }
            }
        }
        PoiManager.getInstance(getActivity()).loadUnclusteredMapPois();
    }

    public void onUnclusteredPoisLoaded(ArrayList arraylist)
    {
        Utils.logger(MapOverlayFragment.access$000(MapOverlayFragment.this), (new StringBuilder()).append("onUnclusteredPoisLoaded: mWaitToReloadAdapter").append(MapOverlayFragment.access$200(MapOverlayFragment.this)).toString());
        MapOverlayFragment.access$702(MapOverlayFragment.this, arraylist);
        if (!MapOverlayFragment.access$200(MapOverlayFragment.this))
        {
            MapOverlayFragment.access$800(MapOverlayFragment.this);
            setPoiInList();
        }
        MapOverlayFragment.access$102(MapOverlayFragment.this, false);
    }

    MapMarkersListener()
    {
        this$0 = MapOverlayFragment.this;
        super();
    }
}
