// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.AbstractList;

// Referenced classes of package com.google.android.m4b.maps.y:
//            g

public static final class c extends AbstractList
{

    private Object a[];
    private Object b;
    private Object c;

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

    public (Object aobj[], Object obj, Object obj1)
    {
        a = aobj;
        b = obj;
        c = obj1;
        super();
    }
}
