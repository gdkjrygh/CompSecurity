// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.model.CustomMapClusteringAlgorithm;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.UiSettings;
import com.google.maps.android.clustering.ClusterManager;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements Runnable
{

    final MapFragment this$0;

    public void run()
    {
        if (MapFragment.access$100(MapFragment.this) != null)
        {
            if (LocationManager.getInstance(getActivity()).isUsersLocationKnown())
            {
                MapFragment.access$100(MapFragment.this).setMyLocationEnabled(true);
                MapFragment.access$100(MapFragment.this).getUiSettings().setMyLocationButtonEnabled(false);
            }
            MapFragment.access$200(MapFragment.this);
            MapFragment.access$302(MapFragment.this, new ClusterManager(getActivity(), MapFragment.access$100(MapFragment.this)));
            MapFragment.access$402(MapFragment.this, new iRenderer(MapFragment.this));
            MapFragment.access$300(MapFragment.this).setRenderer(MapFragment.access$400(MapFragment.this));
            MapFragment.access$300(MapFragment.this).setAlgorithm(new CustomMapClusteringAlgorithm());
            MapFragment.access$500(MapFragment.this);
        }
    }

    ngAlgorithm()
    {
        this$0 = MapFragment.this;
        super();
    }
}
