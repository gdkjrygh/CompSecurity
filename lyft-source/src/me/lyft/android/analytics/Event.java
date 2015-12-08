// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.common.Preconditions;

// Referenced classes of package me.lyft.android.analytics:
//            IEvent, ITrackerExtra

public class Event
    implements IEvent
{

    private final String name;
    protected final Map parameters;
    private final List trackerExtraList;

    public Event(String s)
    {
        trackerExtraList = new ArrayList();
        parameters = new HashMap();
        name = s;
    }

    public Event(EventName eventname)
    {
        trackerExtraList = new ArrayList();
        parameters = new HashMap();
        name = eventname.toString();
    }

    private Event putParameterInternal(Parameter parameter, Object obj)
    {
        parameter = parameter.toString();
        boolean flag;
        if (!parameters.containsKey(parameter))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        parameters.put(parameter, obj);
        return this;
    }

    public Event addTracker(ITrackerExtra itrackerextra)
    {
        trackerExtraList.add(itrackerextra);
        return this;
    }

    public volatile IEvent addTracker(ITrackerExtra itrackerextra)
    {
        return addTracker(itrackerextra);
    }

    public ITrackerExtra getExtra(Class class1)
    {
        for (Iterator iterator = trackerExtraList.iterator(); iterator.hasNext();)
        {
            ITrackerExtra itrackerextra = (ITrackerExtra)iterator.next();
            if (class1.isAssignableFrom(itrackerextra.getClass()))
            {
                return itrackerextra;
            }
        }

        return null;
    }

    public String getName()
    {
        return name;
    }

    public Map getParameters()
    {
        return parameters;
    }

    public Event putParameter(Parameter parameter, Boolean boolean1)
    {
        return putParameterInternal(parameter, boolean1);
    }

    public Event putParameter(Parameter parameter, Double double1)
    {
        return putParameterInternal(parameter, double1);
    }

    public Event putParameter(Parameter parameter, Float float1)
    {
        return putParameterInternal(parameter, float1);
    }

    public Event putParameter(Parameter parameter, Integer integer)
    {
        return putParameterInternal(parameter, integer);
    }

    public Event putParameter(Parameter parameter, Long long1)
    {
        return putParameterInternal(parameter, long1);
    }

    public Event putParameter(Parameter parameter, String s)
    {
        return putParameterInternal(parameter, s);
    }
}
