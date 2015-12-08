// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.filter.impl;

import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.geofence.IGeoFence;

public class GeoFenceIDFilter
    implements IFilter
{

    private long mID;

    public GeoFenceIDFilter(long l)
    {
        mID = l;
    }

    public boolean matches(IGeoFence igeofence)
    {
        return igeofence.getID() == mID;
    }

    public volatile boolean matches(Object obj)
    {
        return matches((IGeoFence)obj);
    }
}
