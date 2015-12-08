// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            LocalTimeRange, TimeRange

public final class Context extends GenericJson
{

    private List anyOfActivityContexts;
    private List anyOfLocationContexts;
    private List anyOfLocations;
    private List anyOfTimeContexts;
    private String contextId;
    private LocalTimeRange localTimeRange;
    private TimeRange timeRange;

    public Context()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public Context clone()
    {
        return (Context)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public List getAnyOfActivityContexts()
    {
        return anyOfActivityContexts;
    }

    public List getAnyOfLocationContexts()
    {
        return anyOfLocationContexts;
    }

    public List getAnyOfLocations()
    {
        return anyOfLocations;
    }

    public List getAnyOfTimeContexts()
    {
        return anyOfTimeContexts;
    }

    public String getContextId()
    {
        return contextId;
    }

    public LocalTimeRange getLocalTimeRange()
    {
        return localTimeRange;
    }

    public TimeRange getTimeRange()
    {
        return timeRange;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public Context set(String s, Object obj)
    {
        return (Context)super.set(s, obj);
    }

    public Context setAnyOfActivityContexts(List list)
    {
        anyOfActivityContexts = list;
        return this;
    }

    public Context setAnyOfLocationContexts(List list)
    {
        anyOfLocationContexts = list;
        return this;
    }

    public Context setAnyOfLocations(List list)
    {
        anyOfLocations = list;
        return this;
    }

    public Context setAnyOfTimeContexts(List list)
    {
        anyOfTimeContexts = list;
        return this;
    }

    public Context setContextId(String s)
    {
        contextId = s;
        return this;
    }

    public Context setLocalTimeRange(LocalTimeRange localtimerange)
    {
        localTimeRange = localtimerange;
        return this;
    }

    public Context setTimeRange(TimeRange timerange)
    {
        timeRange = timerange;
        return this;
    }
}
