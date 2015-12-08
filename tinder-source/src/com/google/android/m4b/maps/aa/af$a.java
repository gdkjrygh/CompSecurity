// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            af, j, bh

public static class b
{

    getValue a[];
    int b;

    private void a(int i)
    {
        if (i > a.length)
        {
            a = (a[])j.b(a, a(a.length, i));
        }
    }

    public a a(Object obj, Object obj1)
    {
        a(b + 1);
        obj = af.b(obj, obj1);
        obj1 = a;
        int i = b;
        b = i + 1;
        obj1[i] = obj;
        return this;
    }

    public b a(java.util.ntry ntry)
    {
        return a(ntry.getKey(), ntry.getValue());
    }

    public a a(Map map)
    {
        a(b + map.size());
        for (map = map.entrySet().iterator(); map.hasNext(); a((java.util.ntry)map.next())) { }
        return this;
    }

    public af a()
    {
        switch (b)
        {
        default:
            return new bh(b, a);

        case 0: // '\0'
            return af.d();

        case 1: // '\001'
            return af.a(a[0].getKey(), a[0].getValue());
        }
    }

    public ()
    {
        this((byte)0);
    }

    private <init>(byte byte0)
    {
        a = new a[4];
        b = 0;
    }
}
