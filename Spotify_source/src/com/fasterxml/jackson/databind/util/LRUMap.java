// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class LRUMap
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected transient int _jdkSerializeMaxEntries;
    protected final transient ConcurrentHashMap _map;
    protected final transient int _maxEntries;

    public LRUMap(int i, int j)
    {
        _map = new ConcurrentHashMap(i, 0.8F, 4);
        _maxEntries = j;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        _jdkSerializeMaxEntries = objectinputstream.readInt();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeInt(_jdkSerializeMaxEntries);
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

    protected Object readResolve()
    {
        return new LRUMap(_jdkSerializeMaxEntries, _jdkSerializeMaxEntries);
    }
}
