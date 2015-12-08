// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import android.support.v4.util.ArrayMap;
import java.util.Map;

public class TrackingEvent
{

    public static final String KIND_DEFAULT = "default";
    protected final Map attributes = new ArrayMap();
    protected final String kind;
    protected final long timestamp;

    protected TrackingEvent(String s, long l)
    {
        kind = s;
        timestamp = l;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            obj = (TrackingEvent)obj;
            if (timestamp != ((TrackingEvent) (obj)).timestamp)
            {
                return false;
            }
            if (!attributes.equals(((TrackingEvent) (obj)).attributes))
            {
                return false;
            }
            if (!kind.equals(((TrackingEvent) (obj)).kind))
            {
                return false;
            }
        }
        return true;
    }

    public String get(String s)
    {
        return (String)attributes.get(s);
    }

    public Map getAttributes()
    {
        return attributes;
    }

    public String getKind()
    {
        return kind;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public final int hashCode()
    {
        return (kind.hashCode() * 31 + (int)(timestamp ^ timestamp >>> 32)) * 31 + attributes.hashCode();
    }

    public TrackingEvent put(String s, String s1)
    {
        attributes.put(s, s1);
        return this;
    }
}
