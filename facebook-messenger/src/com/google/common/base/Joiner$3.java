// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.AbstractList;

final class val.second extends AbstractList
{

    final Object val$first;
    final Object val$rest[];
    final Object val$second;

    public Object get(int i)
    {
        switch (i)
        {
        default:
            return val$rest[i - 2];

        case 0: // '\0'
            return val$first;

        case 1: // '\001'
            return val$second;
        }
    }

    public int size()
    {
        return val$rest.length + 2;
    }

    ()
    {
        val$rest = aobj;
        val$first = obj;
        val$second = obj1;
        super();
    }
}
