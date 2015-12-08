// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.hardware;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractHardwareInformation
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/hardware/AbstractHardwareInformation.getSimpleName();
    private final Map observableProperties = new HashMap();
    protected final Set subscriberInstances = Collections.synchronizedSet(new HashSet());

    protected AbstractHardwareInformation()
    {
    }

    private boolean isSupportedType(Object obj)
    {
        return (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double);
    }

    private native void propertyChangedBoolean(long l, String s, boolean flag);

    private native void propertyChangedDouble(long l, String s, double d);

    private native void propertyChangedInt(long l, String s, int i);

    private native void propertyChangedLong(long l, String s, long l1);

    private native void propertyChangedString(long l, String s, String s1);

    public void addSubscriberInstance(long l)
    {
        String.format("Adding subscriber: 0x%x", new Object[] {
            Long.valueOf(l)
        });
        subscriberInstances.add(Long.valueOf(l));
    }

    protected void clearProperties()
    {
        observableProperties.clear();
    }

    protected Object getObservableProperty(String s)
    {
        return observableProperties.get(s);
    }

    public void removeSubscriberInstance(long l)
    {
        String.format("Removing subscriber: 0x%x", new Object[] {
            Long.valueOf(l)
        });
        subscriberInstances.remove(Long.valueOf(l));
    }

    protected boolean setObservableProperty(String s, Object obj)
    {
        (new StringBuilder("Setting props {'")).append(s).append("' : '").append(obj).append("'}");
        if (!isSupportedType(obj))
        {
            Log.w(LOG_TAG, (new StringBuilder("Value type ")).append(obj.getClass()).append(" not supported. Property is ignored").toString());
            return false;
        }
        if (!observableProperties.containsKey(s))
        {
            observableProperties.put(s, obj);
        } else
        {
            Object obj1 = observableProperties.get(s);
            if (obj1.getClass() != obj.getClass())
            {
                Log.w(LOG_TAG, (new StringBuilder("Cannot re-assign value type: ")).append(obj.getClass().getSimpleName()).append(" after already assigning value type: ").append(obj1.getClass().getSimpleName()).toString());
                return false;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            (new StringBuilder("Property changed {'")).append(s).append("' : '").append(obj).append("'}");
            observableProperties.put(s, obj);
            obj1 = subscriberInstances.iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                Long long1 = (Long)((Iterator) (obj1)).next();
                if (obj instanceof Boolean)
                {
                    boolean flag = ((Boolean)obj).booleanValue();
                    propertyChangedBoolean(long1.longValue(), s, flag);
                } else
                if (obj instanceof String)
                {
                    String s1 = (String)obj;
                    propertyChangedString(long1.longValue(), s, s1);
                } else
                if (obj instanceof Integer)
                {
                    int i = ((Integer)obj).intValue();
                    propertyChangedInt(long1.longValue(), s, i);
                } else
                if (obj instanceof Long)
                {
                    long l = ((Long)obj).longValue();
                    propertyChangedLong(long1.longValue(), s, l);
                } else
                if (obj instanceof Double)
                {
                    double d = ((Double)obj).doubleValue();
                    propertyChangedDouble(long1.longValue(), s, d);
                }
            }
        }
        return true;
    }

}
