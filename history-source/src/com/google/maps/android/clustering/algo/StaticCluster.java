// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StaticCluster
    implements Cluster
{

    private final LatLng mCenter;
    private final List mItems = new ArrayList();

    public StaticCluster(LatLng latlng)
    {
        mCenter = latlng;
    }

    public boolean add(ClusterItem clusteritem)
    {
        return mItems.add(clusteritem);
    }

    public Collection getItems()
    {
        return mItems;
    }

    public LatLng getPosition()
    {
        return mCenter;
    }

    public int getSize()
    {
        return mItems.size();
    }

    public boolean remove(ClusterItem clusteritem)
    {
        return mItems.remove(clusteritem);
    }

    public String toString()
    {
        return (new StringBuilder()).append("StaticCluster{mCenter=").append(mCenter).append(", mItems.size=").append(mItems.size()).append('}').toString();
    }
}
