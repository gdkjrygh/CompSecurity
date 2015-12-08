// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.AbstractList;

final class z extends AbstractList
{

    final Object a[];
    final Object b;
    final Object c;

    z(Object aobj[], Object obj, Object obj1)
    {
        a = aobj;
        b = obj;
        c = obj1;
        super();
    }

    public final Object get(int i)
    {
        switch (i)
        {
        default:
            return a[i - 2];

        case 0: // '\0'
            return b;

        case 1: // '\001'
            return c;
        }
    }

    public final int size()
    {
        return a.length + 2;
    }
}
