// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

final class bi
{

    private Map a;
    private Map b;

    bi()
    {
        a = new HashMap();
        b = new HashMap();
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a.put(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void a(Map map, Boolean boolean1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
        a.putAll(map);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.putAll(map);
        if (true) goto _L4; else goto _L3
_L3:
        map;
        throw map;
    }

    public final Map b()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        hashmap = new HashMap(b);
        hashmap.putAll(a);
        this;
        JVM INSTR monitorexit ;
        return hashmap;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
