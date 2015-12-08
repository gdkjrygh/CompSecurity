// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import java.util.Collections;
import java.util.List;
import rx.b.f;

class StationBucket
{

    private final int bucketSize;
    private final int collectionType;
    private final List stationViewModels;
    private final String title;

    public StationBucket(String s, int i, int j, List list)
    {
        title = s;
        collectionType = i;
        bucketSize = j;
        stationViewModels = Collections.unmodifiableList(list);
    }

    public static f fromStationViewModels(final String name, final int collectionType, final int bucketSize)
    {
        return new _cls1();
    }

    public int getBucketSize()
    {
        return bucketSize;
    }

    public int getCollectionType()
    {
        return collectionType;
    }

    public List getStationViewModels()
    {
        return stationViewModels;
    }

    public String getTitle()
    {
        return title;
    }

    private class _cls1
        implements f
    {

        final int val$bucketSize;
        final int val$collectionType;
        final String val$name;

        public final StationBucket call(List list)
        {
            return new StationBucket(name, collectionType, bucketSize, list);
        }

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls1()
        {
            name = s;
            collectionType = i;
            bucketSize = j;
            super();
        }
    }

}
