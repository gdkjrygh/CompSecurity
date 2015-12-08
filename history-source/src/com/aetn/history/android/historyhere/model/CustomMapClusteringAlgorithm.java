// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.clustering.algo.StaticCluster;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomMapClusteringAlgorithm
    implements Algorithm
{
    private static class QuadItem
        implements com.google.maps.android.quadtree.PointQuadTree.Item, Cluster
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


        private QuadItem(ClusterItem clusteritem)
        {
            mClusterItem = clusteritem;
            mPosition = clusteritem.getPosition();
            mPoint = CustomMapClusteringAlgorithm.PROJECTION.toPoint(mPosition);
            singletonSet = Collections.singleton(mClusterItem);
        }

    }


    public static final int MAX_DISTANCE_AT_ZOOM = 30;
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0D);
    private final Collection mItems = new ArrayList();
    private final PointQuadTree mQuadTree = new PointQuadTree(0.0D, 1.0D, 0.0D, 1.0D);

    public CustomMapClusteringAlgorithm()
    {
    }

    private Bounds createBoundsFromSpan(Point point, double d)
    {
        d /= 2D;
        return new Bounds(point.x - d, point.x + d, point.y - d, point.y + d);
    }

    private double distanceSquared(Point point, Point point1)
    {
        return (point.x - point1.x) * (point.x - point1.x) + (point.y - point1.y) * (point.y - point1.y);
    }

    public void addItem(ClusterItem clusteritem)
    {
        QuadItem quaditem = new QuadItem(clusteritem);
        synchronized (mQuadTree)
        {
            mItems.add(quaditem);
            mQuadTree.add(quaditem);
        }
        return;
        exception;
        clusteritem;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void addItems(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext(); addItem((ClusterItem)collection.next())) { }
    }

    public void clearItems()
    {
        synchronized (mQuadTree)
        {
            mItems.clear();
            mQuadTree.clear();
        }
        return;
        exception;
        pointquadtree;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Set getClusters(double d)
    {
        Object obj;
        HashSet hashset;
        HashMap hashmap;
        HashMap hashmap1;
        d = 30D / Math.pow(2D, (int)d) / 256D;
        obj = new HashSet();
        hashset = new HashSet();
        hashmap = new HashMap();
        hashmap1 = new HashMap();
        PointQuadTree pointquadtree = mQuadTree;
        pointquadtree;
        JVM INSTR monitorenter ;
        Iterator iterator = mItems.iterator();
_L3:
        QuadItem quaditem;
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_365;
            }
            quaditem = (QuadItem)iterator.next();
        } while (((Set) (obj)).contains(quaditem));
        obj1 = createBoundsFromSpan(quaditem.getPoint(), d);
        obj1 = mQuadTree.search(((Bounds) (obj1)));
        if (((Collection) (obj1)).size() != 1) goto _L2; else goto _L1
_L1:
        hashset.add(quaditem);
        ((Set) (obj)).add(quaditem);
        hashmap.put(quaditem, Double.valueOf(0.0D));
          goto _L3
        obj;
        pointquadtree;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        StaticCluster staticcluster;
        Iterator iterator1;
        staticcluster = new StaticCluster(quaditem.mClusterItem.getPosition());
        hashset.add(staticcluster);
        iterator1 = ((Collection) (obj1)).iterator();
_L5:
        double d1;
        QuadItem quaditem1;
        Double double1;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_352;
        }
        quaditem1 = (QuadItem)iterator1.next();
        double1 = (Double)hashmap.get(quaditem1);
        d1 = distanceSquared(quaditem1.getPoint(), quaditem.getPoint());
        if (double1 == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        if (double1.doubleValue() < d1) goto _L5; else goto _L4
_L4:
        ((StaticCluster)hashmap1.get(quaditem1)).remove(quaditem1.mClusterItem);
        hashmap.put(quaditem1, Double.valueOf(d1));
        staticcluster.add(quaditem1.mClusterItem);
        hashmap1.put(quaditem1, staticcluster);
          goto _L5
        ((Set) (obj)).addAll(((Collection) (obj1)));
          goto _L3
        pointquadtree;
        JVM INSTR monitorexit ;
        return hashset;
    }

    public Collection getItems()
    {
        Object obj = new ArrayList();
        PointQuadTree pointquadtree = mQuadTree;
        pointquadtree;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mItems.iterator(); iterator.hasNext(); ((List) (obj)).add(((QuadItem)iterator.next()).mClusterItem)) { }
        break MISSING_BLOCK_LABEL_61;
        obj;
        pointquadtree;
        JVM INSTR monitorexit ;
        throw obj;
        pointquadtree;
        JVM INSTR monitorexit ;
        return ((Collection) (obj));
    }

    public void removeItem(ClusterItem clusteritem)
    {
        throw new UnsupportedOperationException("NonHierarchicalDistanceBasedAlgorithm.remove not implemented");
    }


}
