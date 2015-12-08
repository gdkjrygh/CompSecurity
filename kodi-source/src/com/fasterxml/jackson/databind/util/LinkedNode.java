// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


public final class LinkedNode
{

    private LinkedNode next;
    private final Object value;

    public LinkedNode(Object obj, LinkedNode linkednode)
    {
        value = obj;
        next = linkednode;
    }

    public void linkNext(LinkedNode linkednode)
    {
        if (next != null)
        {
            throw new IllegalStateException();
        } else
        {
            next = linkednode;
            return;
        }
    }

    public LinkedNode next()
    {
        return next;
    }

    public Object value()
    {
        return value;
    }
}
