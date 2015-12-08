// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.ViewGroup;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment, MapFragment

class this._cls0
    implements android.support.v4.view.Listener
{

    final MapOverlayFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
        if (MapOverlayFragment.access$200(MapOverlayFragment.this))
        {
            if (MapOverlayFragment.access$700(MapOverlayFragment.this) != null)
            {
                Utils.logger(MapOverlayFragment.access$000(MapOverlayFragment.this), "onPageScrollStateChanged:mNewPOIList:");
                MapOverlayFragment.access$302(MapOverlayFragment.this, MapOverlayFragment.access$700(MapOverlayFragment.this));
            }
            MapOverlayFragment.access$800(MapOverlayFragment.this);
            setPoiInList();
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        Utils.logger(MapOverlayFragment.access$000(MapOverlayFragment.this), (new StringBuilder()).append("onPageSelected:mExternalSelectedAction:").append(MapOverlayFragment.access$1100(MapOverlayFragment.this)).toString());
        MapFragment mapfragment = MapOverlayFragment.access$600(MapOverlayFragment.this).getMapFragment();
        POIDetail poidetail;
        if (MainNavigationActivity.isMapTypePlaces())
        {
            poidetail = (POIDetail)MapOverlayFragment.access$300(MapOverlayFragment.this).get(i);
        } else
        if (MainNavigationActivity.isMapTypeTours())
        {
            poidetail = (POIDetail)MapOverlayFragment.access$300(MapOverlayFragment.this).get(i);
        } else
        {
            poidetail = (POIDetail)MapOverlayFragment.access$300(MapOverlayFragment.this).get(i);
        }
        if (MapOverlayFragment.access$1200(MapOverlayFragment.this).getVisibility() == 0)
        {
            mapfragment.setSelectedMarkerByPoi(poidetail);
        }
        MapOverlayFragment.access$1102(MapOverlayFragment.this, false);
        MapOverlayFragment.access$1300(MapOverlayFragment.this, i);
        if (MainNavigationActivity.isMapTypeTours())
        {
            MapOverlayFragment.access$600(MapOverlayFragment.this).localyticsIncrementTourPoiSelectCount();
        }
    }

    I()
    {
        this$0 = MapOverlayFragment.this;
        super();
    }
}
