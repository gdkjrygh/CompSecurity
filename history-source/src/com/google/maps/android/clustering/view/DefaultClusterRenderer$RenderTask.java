// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

private class <init>
    implements Runnable
{

    final Set clusters;
    private Runnable mCallback;
    private float mMapZoom;
    private Projection mProjection;
    private SphericalMercatorProjection mSphericalMercatorProjection;
    final DefaultClusterRenderer this$0;

    public void run()
    {
        if (clusters.equals(DefaultClusterRenderer.access$1100(DefaultClusterRenderer.this)))
        {
            mCallback.run();
            return;
        }
        ier ier = new ier(DefaultClusterRenderer.this, null);
        float f = mMapZoom;
        float f1;
        Object obj;
        Object obj1;
        LatLngBounds latlngbounds;
        Set set;
        boolean flag;
        if (f > DefaultClusterRenderer.access$1000(DefaultClusterRenderer.this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f1 = DefaultClusterRenderer.access$1000(DefaultClusterRenderer.this);
        set = DefaultClusterRenderer.access$1300(DefaultClusterRenderer.this);
        latlngbounds = mProjection.getVisibleRegion().latLngBounds;
        obj1 = null;
        obj = obj1;
        if (DefaultClusterRenderer.access$1100(DefaultClusterRenderer.this) != null)
        {
            obj = obj1;
            if (DefaultClusterRenderer.access$1400())
            {
                ArrayList arraylist = new ArrayList();
                Iterator iterator2 = DefaultClusterRenderer.access$1100(DefaultClusterRenderer.this).iterator();
                do
                {
                    obj = arraylist;
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    obj = (Cluster)iterator2.next();
                    if (shouldRenderAsCluster(((Cluster) (obj))) && latlngbounds.contains(((Cluster) (obj)).getPosition()))
                    {
                        arraylist.add(mSphericalMercatorProjection.toPoint(((Cluster) (obj)).getPosition()));
                    }
                } while (true);
            }
        }
        Set set1 = Collections.newSetFromMap(new ConcurrentHashMap());
        for (Iterator iterator = clusters.iterator(); iterator.hasNext();)
        {
            Cluster cluster = (Cluster)iterator.next();
            boolean flag1 = latlngbounds.contains(cluster.getPosition());
            if (flag && flag1 && DefaultClusterRenderer.access$1400())
            {
                Object obj3 = DefaultClusterRenderer.access$1500(((List) (obj)), mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                if (obj3 != null)
                {
                    obj3 = mSphericalMercatorProjection.toLatLng(((com.google.maps.android.geometry.Point) (obj3)));
                    ier.add(true, new rTask(DefaultClusterRenderer.this, cluster, set1, ((com.google.android.gms.maps.model.LatLng) (obj3))));
                } else
                {
                    ier.add(true, new rTask(DefaultClusterRenderer.this, cluster, set1, null));
                }
            } else
            {
                ier.add(flag1, new rTask(DefaultClusterRenderer.this, cluster, set1, null));
            }
        }

        ier.waitUntilFree();
        set.removeAll(set1);
        obj = null;
        if (DefaultClusterRenderer.access$1400())
        {
            ArrayList arraylist1 = new ArrayList();
            Iterator iterator3 = clusters.iterator();
            do
            {
                obj = arraylist1;
                if (!iterator3.hasNext())
                {
                    break;
                }
                obj = (Cluster)iterator3.next();
                if (shouldRenderAsCluster(((Cluster) (obj))) && latlngbounds.contains(((Cluster) (obj)).getPosition()))
                {
                    arraylist1.add(mSphericalMercatorProjection.toPoint(((Cluster) (obj)).getPosition()));
                }
            } while (true);
        }
        for (Iterator iterator1 = set.iterator(); iterator1.hasNext();)
        {
            osition osition = (osition)iterator1.next();
            boolean flag2 = latlngbounds.contains(osition.access._mth1600(osition));
            if (!flag && f - f1 > -3F && flag2 && DefaultClusterRenderer.access$1400())
            {
                Object obj2 = DefaultClusterRenderer.access$1500(((List) (obj)), mSphericalMercatorProjection.toPoint(osition.access._mth1600(osition)));
                if (obj2 != null)
                {
                    obj2 = mSphericalMercatorProjection.toLatLng(((com.google.maps.android.geometry.Point) (obj2)));
                    ier.animateThenRemove(osition, osition.access._mth1600(osition), ((com.google.android.gms.maps.model.LatLng) (obj2)));
                } else
                {
                    ier.remove(true, osition.access._mth1700(osition));
                }
            } else
            {
                ier.remove(flag2, osition.access._mth1700(osition));
            }
        }

        ier.waitUntilFree();
        DefaultClusterRenderer.access$1302(DefaultClusterRenderer.this, set1);
        DefaultClusterRenderer.access$1102(DefaultClusterRenderer.this, clusters);
        DefaultClusterRenderer.access$1002(DefaultClusterRenderer.this, f);
        mCallback.run();
    }

    public void setCallback(Runnable runnable)
    {
        mCallback = runnable;
    }

    public void setMapZoom(float f)
    {
        mMapZoom = f;
        mSphericalMercatorProjection = new SphericalMercatorProjection(256D * Math.pow(2D, Math.min(f, DefaultClusterRenderer.access$1000(DefaultClusterRenderer.this))));
    }

    public void setProjection(Projection projection)
    {
        mProjection = projection;
    }

    private osition(Set set)
    {
        this$0 = DefaultClusterRenderer.this;
        super();
        clusters = set;
    }

    clusters(Set set, clusters clusters1)
    {
        this(set);
    }
}
