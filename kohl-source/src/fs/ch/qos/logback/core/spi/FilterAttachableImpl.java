// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.spi;

import fs.ch.qos.logback.core.filter.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package fs.ch.qos.logback.core.spi:
//            FilterReply

public final class FilterAttachableImpl
{

    CopyOnWriteArrayList filterList;

    public FilterAttachableImpl()
    {
        filterList = new CopyOnWriteArrayList();
    }

    public void addFilter(Filter filter)
    {
        filterList.add(filter);
    }

    public void clearAllFilters()
    {
        filterList.clear();
    }

    public List getCopyOfAttachedFiltersList()
    {
        return new ArrayList(filterList);
    }

    public FilterReply getFilterChainDecision(Object obj)
    {
        for (Iterator iterator = filterList.iterator(); iterator.hasNext();)
        {
            FilterReply filterreply = ((Filter)iterator.next()).decide(obj);
            if (filterreply == FilterReply.DENY || filterreply == FilterReply.ACCEPT)
            {
                return filterreply;
            }
        }

        return FilterReply.NEUTRAL;
    }
}
