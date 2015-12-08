// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class Eventer
{

    private List _handlers;

    public Eventer()
    {
        _handlers = new ArrayList();
    }

    public void AddHandler(Callable callable)
    {
        _handlers.add(callable);
    }

    public void Cleanup()
    {
        _handlers.clear();
    }

    public void DeleteHandler(Callable callable)
    {
        _handlers.remove(callable);
    }

    public void DispatchEvent()
    {
        try
        {
            for (Iterator iterator = _handlers.iterator(); iterator.hasNext(); ((Callable)iterator.next()).call()) { }
        }
        catch (Exception exception) { }
    }
}
