// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Tracker

private static class <init>
{

    private Map permanentMap;
    private Map temporaryMap;

    public void clearTemporaryValues()
    {
        this;
        JVM INSTR monitorenter ;
        temporaryMap.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String get(String s)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = (String)temporaryMap.get(s);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s = s1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = (String)permanentMap.get(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public Map getKeysAndValues()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        hashmap = new HashMap(permanentMap);
        hashmap.putAll(temporaryMap);
        this;
        JVM INSTR monitorexit ;
        return hashmap;
        Exception exception;
        exception;
        throw exception;
    }

    public void set(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        permanentMap.put(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setAll(Map map, Boolean boolean1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
        temporaryMap.putAll(map);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        permanentMap.putAll(map);
        if (true) goto _L4; else goto _L3
_L3:
        map;
        throw map;
    }

    public void setForNextHit(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        temporaryMap.put(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private ()
    {
        temporaryMap = new HashMap();
        permanentMap = new HashMap();
    }

    permanentMap(permanentMap permanentmap)
    {
        this();
    }
}
