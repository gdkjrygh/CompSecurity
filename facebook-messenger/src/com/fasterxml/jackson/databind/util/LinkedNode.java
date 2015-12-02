// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


public final class LinkedNode
{

    final LinkedNode _next;
    final Object _value;

    public LinkedNode(Object obj, LinkedNode linkednode)
    {
        _value = obj;
        _next = linkednode;
    }

    public static boolean contains(LinkedNode linkednode, Object obj)
    {
        for (; linkednode != null; linkednode = linkednode.next())
        {
            if (linkednode.value() == obj)
            {
                return true;
            }
        }

        return false;
    }

    public LinkedNode next()
    {
        return _next;
    }

    public Object value()
    {
        return _value;
    }
}
