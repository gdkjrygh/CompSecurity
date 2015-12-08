// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.comparator.impl;

import com.digby.mm.android.library.geofence.IGeoFence;
import java.util.Comparator;

public class NullComparator
    implements Comparator
{

    public NullComparator()
    {
    }

    public int compare(IGeoFence igeofence, IGeoFence igeofence1)
    {
        return -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((IGeoFence)obj, (IGeoFence)obj1);
    }
}
