// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.lyft.android.analytics.IEvent;
import me.lyft.android.analytics.ITrackerExtra;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            MapParameterStore, Parameter, Subevent

public abstract class Event2
    implements IEvent
{

    protected final MapParameterStore parameterStore = new MapParameterStore();
    private final List trackerExtraList = new ArrayList();

    public Event2()
    {
    }

    public volatile IEvent addTracker(ITrackerExtra itrackerextra)
    {
        return addTracker(itrackerextra);
    }

    public Event2 addTracker(ITrackerExtra itrackerextra)
    {
        trackerExtraList.add(itrackerextra);
        return this;
    }

    public abstract boolean contains(Subevent subevent);

    public abstract int getEventVersion();

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

    public Map getParameters()
    {
        return parameterStore.getMap();
    }

    public Float getSampleRate()
    {
        return parameterStore.getFloat(Parameter.SAMPLE_RATE);
    }

    public Event2 setParameter(String s)
    {
        parameterStore.put(Parameter.PARAMETER, s);
        return this;
    }

    public Event2 setSampleRate(float f)
    {
        parameterStore.put(Parameter.SAMPLE_RATE, Float.valueOf(f));
        return this;
    }

    public Event2 setTag(String s)
    {
        parameterStore.put(Parameter.TAG, s);
        return this;
    }

    public Event2 setValue(long l)
    {
        parameterStore.put(Parameter.VALUE, Long.valueOf(l));
        return this;
    }
}
