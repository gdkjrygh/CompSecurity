// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import java.util.LinkedList;

public class q
{

    LinkedList a;

    public q()
    {
        a = new LinkedList();
    }

    public Object a()
        throws InterruptedException
    {
        this;
        JVM INSTR monitorenter ;
        for (; a.isEmpty(); wait()) { }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        throw exception;
        Object obj = a.removeFirst();
        this;
        JVM INSTR monitorexit ;
        return obj;
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        a.addLast(obj);
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }
}
