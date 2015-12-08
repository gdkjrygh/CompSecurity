// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;

// Referenced classes of package org.slf4j.helpers:
//            BasicMarker

public class BasicMarkerFactory
    implements IMarkerFactory
{

    Map markerMap;

    public BasicMarkerFactory()
    {
        markerMap = new HashMap();
    }

    public boolean detachMarker(String s)
    {
        while (s == null || markerMap.remove(s) == null) 
        {
            return false;
        }
        return true;
    }

    public boolean exists(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = markerMap.containsKey(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public Marker getDetachedMarker(String s)
    {
        return new BasicMarker(s);
    }

    public Marker getMarker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Marker name cannot be null");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        Marker marker = (Marker)markerMap.get(s);
        Object obj;
        obj = marker;
        if (marker != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = new BasicMarker(s);
        markerMap.put(s, obj);
        this;
        JVM INSTR monitorexit ;
        return ((Marker) (obj));
    }
}
