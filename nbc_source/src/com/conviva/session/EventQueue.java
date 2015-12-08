// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.session;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EventQueue
{

    private List _events;
    private int _nextSeqNumber;

    public EventQueue()
    {
        _events = null;
        _nextSeqNumber = 0;
        _events = new ArrayList();
    }

    public void enqueueEvent(String s, Map map, int i)
    {
        map.put("t", s);
        map.put("st", Integer.valueOf(i));
        map.put("seq", Integer.valueOf(_nextSeqNumber));
        _nextSeqNumber = _nextSeqNumber + 1;
        _events.add(map);
    }

    public List flushEvents()
    {
        List list = _events;
        _events = new ArrayList();
        return list;
    }

    public int size()
    {
        return _events.size();
    }
}
