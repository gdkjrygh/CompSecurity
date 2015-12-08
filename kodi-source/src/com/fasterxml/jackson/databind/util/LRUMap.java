// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class LRUMap
    implements Serializable
{

    protected final transient ConcurrentHashMap _map;
    protected final transient int _maxEntries;

    public LRUMap(int i, int j)
    {
        _map = new ConcurrentHashMap(i, 0.8F, 4);
        _maxEntries = j;
    }

    public void clear()
    {
        _map.clear();
    }

    public Object get(Object obj)
    {
        return _map.get(obj);
    }

    public Object put(Object obj, Object obj1)
    {
        if (_map.size() < _maxEntries) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (_map.size() >= _maxEntries)
        {
            clear();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return _map.put(obj, obj1);
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        if (_map.size() < _maxEntries) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (_map.size() >= _maxEntries)
        {
            clear();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return _map.putIfAbsent(obj, obj1);
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
