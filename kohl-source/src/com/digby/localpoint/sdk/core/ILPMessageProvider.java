// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;

import com.digby.localpoint.sdk.core.filter.ILPMessageFilterFactory;
import com.digby.localpoint.sdk.core.ordering.ILPMessageOrderingFactory;
import java.util.List;

// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPMessageListener, ILPID, ILPMessage, ILPFilter, 
//            ILPOrdering

public interface ILPMessageProvider
{

    public abstract void addListener(ILPMessageListener ilpmessagelistener);

    public abstract ILPMessageFilterFactory getFilterFactory();

    public abstract ILPMessage getMessage(ILPID ilpid);

    public abstract List getMessages();

    public abstract List getMessages(ILPFilter ilpfilter, ILPOrdering ilpordering);

    public abstract ILPMessageOrderingFactory getOrderingFactory();

    public abstract void removeAllListeners();

    public abstract void removeListener(ILPMessageListener ilpmessagelistener);
}
