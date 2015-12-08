// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.Cluster;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements com.google.maps.android.clustering.OnClusterClickListener
{

    final MapFragment this$0;

    public boolean onClusterClick(Cluster cluster)
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("onClusterClick():cluster:").append(cluster).toString());
        com.google.android.gms.maps.model.ilder ilder = new com.google.android.gms.maps.model.ilder();
        for (cluster = cluster.getItems().iterator(); cluster.hasNext(); ilder.include(((POIDetail)cluster.next()).getPosition())) { }
        cluster = ilder.build();
        MapFragment.access$100(MapFragment.this).animateCamera(CameraUpdateFactory.newLatLngBounds(cluster, 100));
        return true;
    }

    ickListener()
    {
        this$0 = MapFragment.this;
        super();
    }
}
