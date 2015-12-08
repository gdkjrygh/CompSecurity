// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;

import com.digby.localpoint.sdk.core.filter.ILPLocationFilterFactory;
import com.digby.localpoint.sdk.core.ordering.ILPLocationOrderingFactory;
import java.util.List;

// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPLocationListener, ILPID, ILPLocation, ILPFilter, 
//            ILPOrdering

public interface ILPLocationProvider
{

    public abstract void addListener(ILPLocationListener ilplocationlistener);

    public abstract ILPLocationFilterFactory getFilterFactory();

    public abstract ILPLocation getLocation(ILPID ilpid);

    public abstract List getLocations();

    public abstract List getLocations(ILPFilter ilpfilter, ILPOrdering ilpordering);

    public abstract ILPLocationOrderingFactory getOrderingFactory();

    public abstract void removeAllListeners();

    public abstract void removeListener(ILPLocationListener ilplocationlistener);
}
