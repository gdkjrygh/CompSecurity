// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.maps.android.clustering.ClusterItem;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements com.google.maps.android.clustering.OnClusterItemClickListener
{

    final MapFragment this$0;

    public boolean onClusterItemClick(POIDetail poidetail)
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("onMarkerClick():getPoiIndexById(poi.getTitle()): ").append(poidetail.getId()).toString());
        clearSelectedMarkerIcon();
        MapFragment.access$2200(MapFragment.this, poidetail);
        Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("onMarkerClick():index:").append(MapFragment.access$2300(MapFragment.this)).toString());
        if (MapFragment.access$2400(MapFragment.this) != null)
        {
            MapFragment.access$1202(MapFragment.this, true);
        }
        MapFragment.access$2500(MapFragment.this, false);
        MapFragment.access$2600(MapFragment.this, MapFragment.access$2400(MapFragment.this));
        return true;
    }

    public volatile boolean onClusterItemClick(ClusterItem clusteritem)
    {
        return onClusterItemClick((POIDetail)clusteritem);
    }

    emClickListener()
    {
        this$0 = MapFragment.this;
        super();
    }
}
