// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.util.Log;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.applications.telemetry:
//            PiiKind, EventPriority

public class EventProperties
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/EventProperties.getSimpleName();
    private boolean hasCustomProperties;
    private String name;
    private final long nativeInstance;
    private Date timestamp;

    public EventProperties(String s)
    {
        name = null;
        timestamp = null;
        hasCustomProperties = false;
        long l = createNative(s);
        if (l == 0L)
        {
            Log.wtf(LOG_TAG, "Error creating EventProperties nativeInstance from native code.");
            throw new IllegalStateException("Error creating EventProperties nativeInstance from native code.");
        } else
        {
            nativeInstance = l;
            (new StringBuilder("Created EventProperties: ")).append(this);
            return;
        }
    }

    public EventProperties(String s, Map map)
    {
        this(s);
        if (map != null)
        {
            for (s = map.entrySet().iterator(); s.hasNext(); setProperty((String)map.getKey(), (String)map.getValue(), PiiKind.NONE))
            {
                map = (java.util.Map.Entry)s.next();
            }

        }
    }

    public EventProperties(String s, Map map, Map map1)
    {
        this(s, map);
        if (map1 != null)
        {
            for (s = map1.entrySet().iterator(); s.hasNext(); setProperty((String)map.getKey(), ((Double)map.getValue()).doubleValue()))
            {
                map = (java.util.Map.Entry)s.next();
            }

        }
    }

    private native long createNative(String s);

    private native void destroyNative(long l);

    protected static long getEventPropertiesNativeInstance(EventProperties eventproperties)
    {
        if (eventproperties == null)
        {
            return 0L;
        }
        if (eventproperties.hasCustomProperties() && eventproperties.getName() == null)
        {
            throw new IllegalStateException(String.format("EventProperties found to have custom properties without a name. Event name is required.", new Object[0]));
        } else
        {
            return eventproperties.nativeInstance;
        }
    }

    private native int getPriorityNative(long l);

    private native void setNameNative(long l, String s);

    private native void setPriorityNative(long l, int i);

    private native void setPropertyDoubleNative(long l, String s, double d);

    private native void setPropertyLongNative(long l, String s, long l1);

    private native void setPropertyStringNative(long l, String s, String s1, int i);

    private native void setTimestampNative(long l, long l1);

    public void finalize()
        throws Throwable
    {
        String.format("destroyNative: 0x%x", new Object[] {
            Long.valueOf(nativeInstance)
        });
        destroyNative(nativeInstance);
        super.finalize();
    }

    public String getName()
    {
        String.format("getName: %s", new Object[] {
            name
        });
        return name;
    }

    public EventPriority getPriority()
    {
        EventPriority eventpriority = EventPriority.fromValue(getPriorityNative(nativeInstance));
        String.format("getPriority: %d", new Object[] {
            Integer.valueOf(eventpriority.getValue())
        });
        return eventpriority;
    }

    public Date getTimestamp()
    {
        String.format("getTimestamp: %s", new Object[] {
            timestamp
        });
        return timestamp;
    }

    protected boolean hasCustomProperties()
    {
        return hasCustomProperties;
    }

    public void setName(String s)
    {
        String.format("setName: %s", new Object[] {
            s
        });
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException(String.format("Invalid event name: %s", new Object[] {
                s
            }));
        } else
        {
            setNameNative(nativeInstance, s);
            name = s;
            return;
        }
    }

    public void setPriority(EventPriority eventpriority)
    {
        String.format("setPriority: %d", new Object[] {
            Integer.valueOf(eventpriority.getValue())
        });
        setPriorityNative(nativeInstance, eventpriority.getValue());
    }

    public void setProperty(String s, double d)
    {
        String.format("setProperty|name: %s|value: %s", new Object[] {
            s, Double.valueOf(d)
        });
        setPropertyDoubleNative(nativeInstance, s, d);
        hasCustomProperties = true;
    }

    public void setProperty(String s, long l)
    {
        String.format("setProperty|name: %s|value: %d", new Object[] {
            s, Long.valueOf(l)
        });
        setPropertyLongNative(nativeInstance, s, l);
        hasCustomProperties = true;
    }

    public void setProperty(String s, String s1, PiiKind piikind)
    {
        String.format("setProperty|name: %s|value: %s|piiKind: %d", new Object[] {
            s, s1, Integer.valueOf(piikind.getValue())
        });
        setPropertyStringNative(nativeInstance, s, s1, piikind.getValue());
        hasCustomProperties = true;
    }

    public void setProperty(String s, Date date)
    {
        String.format("setProperty|name: %s|value: %s", new Object[] {
            s, date
        });
        if (date == null)
        {
            throw new IllegalArgumentException("setProperty|date cannot be null");
        } else
        {
            long l = date.getTime();
            setPropertyLongNative(nativeInstance, s, l);
            hasCustomProperties = true;
            return;
        }
    }

    public void setTimestamp(Date date)
    {
        String.format("setTimestamp: %s", new Object[] {
            date
        });
        if (date == null)
        {
            throw new IllegalArgumentException(String.format("Invalid timestamp|setTimestamp: %s", new Object[] {
                date
            }));
        } else
        {
            long l = date.getTime();
            setTimestampNative(nativeInstance, l);
            timestamp = date;
            return;
        }
    }

    public String toString()
    {
        return String.format("0x%x", new Object[] {
            Long.valueOf(nativeInstance)
        });
    }

}
