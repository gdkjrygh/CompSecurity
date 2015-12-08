// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.algo;

import android.support.v4.util.LruCache;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.google.maps.android.clustering.algo:
//            Algorithm

public class PreCachingAlgorithmDecorator
    implements Algorithm
{
    private class PrecacheRunnable
        implements Runnable
    {

        private final int mZoom;
        final PreCachingAlgorithmDecorator this$0;

        public void run()
        {
            try
            {
                Thread.sleep((long)(Math.random() * 500D + 500D));
            }
            catch (InterruptedException interruptedexception) { }
            getClustersInternal(mZoom);
        }

        public PrecacheRunnable(int i)
        {
            this$0 = PreCachingAlgorithmDecorator.this;
            super();
            mZoom = i;
        }
    }


    private final Algorithm mAlgorithm;
    private final LruCache mCache = new LruCache(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();

    public PreCachingAlgorithmDecorator(Algorithm algorithm)
    {
        mAlgorithm = algorithm;
    }

    private void clearCache()
    {
        mCache.evictAll();
    }

    private Set getClustersInternal(int i)
    {
        mCacheLock.readLock().lock();
        Set set1 = (Set)mCache.get(Integer.valueOf(i));
        mCacheLock.readLock().unlock();
        Set set = set1;
        if (set1 == null)
        {
            mCacheLock.writeLock().lock();
            Set set2 = (Set)mCache.get(Integer.valueOf(i));
            set = set2;
            if (set2 == null)
            {
                set = mAlgorithm.getClusters(i);
                mCache.put(Integer.valueOf(i), set);
            }
            mCacheLock.writeLock().unlock();
        }
        return set;
    }

    public void addItem(ClusterItem clusteritem)
    {
        mAlgorithm.addItem(clusteritem);
        clearCache();
    }

    public void addItems(Collection collection)
    {
        mAlgorithm.addItems(collection);
        clearCache();
    }

    public void clearItems()
    {
        mAlgorithm.clearItems();
        clearCache();
    }

    public Set getClusters(double d)
    {
        int i = (int)d;
        Set set = getClustersInternal(i);
        if (mCache.get(Integer.valueOf(i + 1)) == null)
        {
            (new Thread(new PrecacheRunnable(i + 1))).start();
        }
        if (mCache.get(Integer.valueOf(i - 1)) == null)
        {
            (new Thread(new PrecacheRunnable(i - 1))).start();
        }
        return set;
    }

    public Collection getItems()
    {
        return mAlgorithm.getItems();
    }

    public void removeItem(ClusterItem clusteritem)
    {
        mAlgorithm.removeItem(clusteritem);
        clearCache();
    }

}
