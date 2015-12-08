// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

private class animateFrom
{

    private final LatLng animateFrom;
    private final Cluster cluster;
    private final Set newMarkers;
    final DefaultClusterRenderer this$0;

    private void perform(animateFrom animatefrom)
    {
        if (!shouldRenderAsCluster(cluster))
        {
            Iterator iterator = cluster.getItems().iterator();
            while (iterator.hasNext()) 
            {
                ClusterItem clusteritem = (ClusterItem)iterator.next();
                Object obj = DefaultClusterRenderer.access$300(DefaultClusterRenderer.this)._mth0(clusteritem);
                n n;
                if (obj == null)
                {
                    obj = new MarkerOptions();
                    com.google.android.gms.maps.model.Marker marker;
                    n n1;
                    if (animateFrom != null)
                    {
                        ((MarkerOptions) (obj)).position(animateFrom);
                    } else
                    {
                        ((MarkerOptions) (obj)).position(clusteritem.getPosition());
                    }
                    onBeforeClusterItemRendered(clusteritem, ((MarkerOptions) (obj)));
                    marker = DefaultClusterRenderer.access$1900(DefaultClusterRenderer.this).getMarkerCollection().ction(((MarkerOptions) (obj)));
                    n1 = new n(marker, null);
                    DefaultClusterRenderer.access$300(DefaultClusterRenderer.this)._mth0(clusteritem, marker);
                    obj = marker;
                    n = n1;
                    if (animateFrom != null)
                    {
                        animatefrom.imate(n1, animateFrom, clusteritem.getPosition());
                        n = n1;
                        obj = marker;
                    }
                } else
                {
                    n = new n(((com.google.android.gms.maps.model.Marker) (obj)), null);
                }
                onClusterItemRendered(clusteritem, ((com.google.android.gms.maps.model.Marker) (obj)));
                newMarkers.add(n);
            }
        } else
        {
            Object obj2 = new MarkerOptions();
            Object obj1;
            if (animateFrom == null)
            {
                obj1 = cluster.getPosition();
            } else
            {
                obj1 = animateFrom;
            }
            obj1 = ((MarkerOptions) (obj2)).position(((LatLng) (obj1)));
            onBeforeClusterRendered(cluster, ((MarkerOptions) (obj1)));
            obj1 = DefaultClusterRenderer.access$1900(DefaultClusterRenderer.this).getClusterMarkerCollection().erCollection(((MarkerOptions) (obj1)));
            DefaultClusterRenderer.access$600(DefaultClusterRenderer.this).put(obj1, cluster);
            DefaultClusterRenderer.access$2100(DefaultClusterRenderer.this).put(cluster, obj1);
            obj2 = new n(((com.google.android.gms.maps.model.Marker) (obj1)), null);
            if (animateFrom != null)
            {
                animatefrom.imate(((n) (obj2)), animateFrom, cluster.getPosition());
            }
            onClusterRendered(cluster, ((com.google.android.gms.maps.model.Marker) (obj1)));
            newMarkers.add(obj2);
        }
    }


    public n(Cluster cluster1, Set set, LatLng latlng)
    {
        this$0 = DefaultClusterRenderer.this;
        super();
        cluster = cluster1;
        newMarkers = set;
        animateFrom = latlng;
    }
}
