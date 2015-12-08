// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.as;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

public abstract class c
{

    final int a = 100;
    final LinkedList b = new LinkedList();
    private int c;
    private int d;

    public c()
    {
    }

    protected abstract Object a();

    public final Object b()
    {
        LinkedList linkedlist = b;
        linkedlist;
        JVM INSTR monitorenter ;
        Object obj;
        if (b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj = ((SoftReference)b.removeLast()).get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        d = d + 1;
        linkedlist;
        JVM INSTR monitorexit ;
        return obj;
        linkedlist;
        JVM INSTR monitorexit ;
        c = c + 1;
        return a();
        Exception exception;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
