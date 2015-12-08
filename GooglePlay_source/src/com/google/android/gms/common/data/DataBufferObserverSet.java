// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBufferObserver

public final class DataBufferObserverSet
    implements DataBufferObserver, DataBufferObserver.Observable
{

    HashSet mObserverSet;

    public DataBufferObserverSet()
    {
        mObserverSet = new HashSet();
    }

    public final void addObserver(DataBufferObserver databufferobserver)
    {
        mObserverSet.add(databufferobserver);
    }

    public final boolean hasObservers()
    {
        return !mObserverSet.isEmpty();
    }

    public final void onDataRangeChanged(int i, int j)
    {
        for (Iterator iterator = mObserverSet.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataRangeChanged(i, j)) { }
    }

    public final void onDataRangeInserted(int i, int j)
    {
        for (Iterator iterator = mObserverSet.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataRangeInserted(i, j)) { }
    }

    public final void onDataRangeRemoved(int i, int j)
    {
        for (Iterator iterator = mObserverSet.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataRangeRemoved(i, j)) { }
    }

    public final void removeObserver(DataBufferObserver databufferobserver)
    {
        mObserverSet.remove(databufferobserver);
    }
}
