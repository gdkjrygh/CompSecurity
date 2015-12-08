// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.MarkerManager;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.google.maps.android.clustering:
//            ClusterItem, Cluster

public class ClusterManager
    implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
{
    private class ClusterTask extends AsyncTask
    {

        final ClusterManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Float[])aobj);
        }

        protected transient Set doInBackground(Float afloat[])
        {
            mAlgorithmLock.readLock().lock();
            afloat = mAlgorithm.getClusters(afloat[0].floatValue());
            mAlgorithmLock.readLock().unlock();
            return afloat;
            afloat;
            mAlgorithmLock.readLock().unlock();
            throw afloat;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Set)obj);
        }

        protected void onPostExecute(Set set)
        {
            mRenderer.onClustersChanged(set);
        }

        private ClusterTask()
        {
            this$0 = ClusterManager.this;
            super();
        }

    }

    public static interface OnClusterClickListener
    {

        public abstract boolean onClusterClick(Cluster cluster1);
    }

    public static interface OnClusterInfoWindowClickListener
    {

        public abstract void onClusterInfoWindowClick(Cluster cluster1);
    }

    public static interface OnClusterItemClickListener
    {

        public abstract boolean onClusterItemClick(ClusterItem clusteritem);
    }

    public static interface OnClusterItemInfoWindowClickListener
    {

        public abstract void onClusterItemInfoWindowClick(ClusterItem clusteritem);
    }


    private Algorithm mAlgorithm;
    private final ReadWriteLock mAlgorithmLock;
    private final com.google.maps.android.MarkerManager.Collection mClusterMarkers;
    private ClusterTask mClusterTask;
    private final ReadWriteLock mClusterTaskLock;
    private GoogleMap mMap;
    private final MarkerManager mMarkerManager;
    private final com.google.maps.android.MarkerManager.Collection mMarkers;
    private OnClusterClickListener mOnClusterClickListener;
    private OnClusterInfoWindowClickListener mOnClusterInfoWindowClickListener;
    private OnClusterItemClickListener mOnClusterItemClickListener;
    private OnClusterItemInfoWindowClickListener mOnClusterItemInfoWindowClickListener;
    private CameraPosition mPreviousCameraPosition;
    private ClusterRenderer mRenderer;

    public ClusterManager(Context context, GoogleMap googlemap)
    {
        this(context, googlemap, new MarkerManager(googlemap));
    }

    public ClusterManager(Context context, GoogleMap googlemap, MarkerManager markermanager)
    {
        mAlgorithmLock = new ReentrantReadWriteLock();
        mClusterTaskLock = new ReentrantReadWriteLock();
        mMap = googlemap;
        mMarkerManager = markermanager;
        mClusterMarkers = markermanager.newCollection();
        mMarkers = markermanager.newCollection();
        mRenderer = new DefaultClusterRenderer(context, googlemap, this);
        mAlgorithm = new PreCachingAlgorithmDecorator(new NonHierarchicalDistanceBasedAlgorithm());
        mClusterTask = new ClusterTask();
        mRenderer.onAdd();
    }

    public void addItem(ClusterItem clusteritem)
    {
        mAlgorithmLock.writeLock().lock();
        mAlgorithm.addItem(clusteritem);
        mAlgorithmLock.writeLock().unlock();
        return;
        clusteritem;
        mAlgorithmLock.writeLock().unlock();
        throw clusteritem;
    }

    public void addItems(Collection collection)
    {
        mAlgorithmLock.writeLock().lock();
        mAlgorithm.addItems(collection);
        mAlgorithmLock.writeLock().unlock();
        return;
        collection;
        mAlgorithmLock.writeLock().unlock();
        throw collection;
    }

    public void clearItems()
    {
        mAlgorithmLock.writeLock().lock();
        mAlgorithm.clearItems();
        mAlgorithmLock.writeLock().unlock();
        return;
        Exception exception;
        exception;
        mAlgorithmLock.writeLock().unlock();
        throw exception;
    }

    public void cluster()
    {
        mClusterTaskLock.writeLock().lock();
        mClusterTask.cancel(true);
        mClusterTask = new ClusterTask();
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        mClusterTask.execute(new Float[] {
            Float.valueOf(mMap.getCameraPosition().zoom)
        });
_L4:
        mClusterTaskLock.writeLock().unlock();
        return;
_L2:
        mClusterTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Float[] {
            Float.valueOf(mMap.getCameraPosition().zoom)
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        mClusterTaskLock.writeLock().unlock();
        throw exception;
    }

    public com.google.maps.android.MarkerManager.Collection getClusterMarkerCollection()
    {
        return mClusterMarkers;
    }

    public com.google.maps.android.MarkerManager.Collection getMarkerCollection()
    {
        return mMarkers;
    }

    public MarkerManager getMarkerManager()
    {
        return mMarkerManager;
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        if (mRenderer instanceof com.google.android.gms.maps.GoogleMap.OnCameraChangeListener)
        {
            ((com.google.android.gms.maps.GoogleMap.OnCameraChangeListener)mRenderer).onCameraChange(cameraposition);
        }
        cameraposition = mMap.getCameraPosition();
        if (mPreviousCameraPosition != null && mPreviousCameraPosition.zoom == cameraposition.zoom)
        {
            return;
        } else
        {
            mPreviousCameraPosition = mMap.getCameraPosition();
            cluster();
            return;
        }
    }

    public void onInfoWindowClick(Marker marker)
    {
        getMarkerManager().onInfoWindowClick(marker);
    }

    public boolean onMarkerClick(Marker marker)
    {
        return getMarkerManager().onMarkerClick(marker);
    }

    public void removeItem(ClusterItem clusteritem)
    {
        mAlgorithmLock.writeLock().lock();
        mAlgorithm.removeItem(clusteritem);
        mAlgorithmLock.writeLock().unlock();
        return;
        clusteritem;
        mAlgorithmLock.writeLock().unlock();
        throw clusteritem;
    }

    public void setAlgorithm(Algorithm algorithm)
    {
        mAlgorithmLock.writeLock().lock();
        if (mAlgorithm != null)
        {
            algorithm.addItems(mAlgorithm.getItems());
        }
        mAlgorithm = new PreCachingAlgorithmDecorator(algorithm);
        mAlgorithmLock.writeLock().unlock();
        cluster();
        return;
        algorithm;
        mAlgorithmLock.writeLock().unlock();
        throw algorithm;
    }

    public void setOnClusterClickListener(OnClusterClickListener onclusterclicklistener)
    {
        mOnClusterClickListener = onclusterclicklistener;
        mRenderer.setOnClusterClickListener(onclusterclicklistener);
    }

    public void setOnClusterInfoWindowClickListener(OnClusterInfoWindowClickListener onclusterinfowindowclicklistener)
    {
        mOnClusterInfoWindowClickListener = onclusterinfowindowclicklistener;
        mRenderer.setOnClusterInfoWindowClickListener(onclusterinfowindowclicklistener);
    }

    public void setOnClusterItemClickListener(OnClusterItemClickListener onclusteritemclicklistener)
    {
        mOnClusterItemClickListener = onclusteritemclicklistener;
        mRenderer.setOnClusterItemClickListener(onclusteritemclicklistener);
    }

    public void setOnClusterItemInfoWindowClickListener(OnClusterItemInfoWindowClickListener onclusteriteminfowindowclicklistener)
    {
        mOnClusterItemInfoWindowClickListener = onclusteriteminfowindowclicklistener;
        mRenderer.setOnClusterItemInfoWindowClickListener(onclusteriteminfowindowclicklistener);
    }

    public void setRenderer(ClusterRenderer clusterrenderer)
    {
        mRenderer.setOnClusterClickListener(null);
        mRenderer.setOnClusterItemClickListener(null);
        mClusterMarkers.clear();
        mMarkers.clear();
        mRenderer.onRemove();
        mRenderer = clusterrenderer;
        mRenderer.onAdd();
        mRenderer.setOnClusterClickListener(mOnClusterClickListener);
        mRenderer.setOnClusterInfoWindowClickListener(mOnClusterInfoWindowClickListener);
        mRenderer.setOnClusterItemClickListener(mOnClusterItemClickListener);
        mRenderer.setOnClusterItemInfoWindowClickListener(mOnClusterItemInfoWindowClickListener);
        cluster();
    }



}
