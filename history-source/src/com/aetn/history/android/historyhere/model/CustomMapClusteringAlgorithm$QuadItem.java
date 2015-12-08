// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            CustomMapClusteringAlgorithm

private static class <init>
    implements com.google.maps.android.quadtree..QuadItem, Cluster
{

    private final ClusterItem mClusterItem;
    private final Point mPoint;
    private final LatLng mPosition;
    private Set singletonSet;

    public volatile Collection getItems()
    {
        return getItems();
    }

    public Set getItems()
    {
        return singletonSet;
    }

    public Point getPoint()
    {
        return mPoint;
    }

    public LatLng getPosition()
    {
        return mPosition;
    }

    public int getSize()
    {
        return 1;
    }


    private (ClusterItem clusteritem)
    {
        mClusterItem = clusteritem;
        mPosition = clusteritem.getPosition();
        mPoint = CustomMapClusteringAlgorithm.access$200().toPoint(mPosition);
        singletonSet = Collections.singleton(mClusterItem);
    }

    mClusterItem(ClusterItem clusteritem, mClusterItem mclusteritem)
    {
        this(clusteritem);
    }
}
