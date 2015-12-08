// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;

// Referenced classes of package com.c.a.b:
//            k, d, ae

static abstract class b extends b
{

    Object a[];
    int b;

    public ct a(Object obj)
    {
        u.a(obj);
        int i = b + 1;
        if (a.length < i)
        {
            a = ae.b(a, a(a.length, i));
        }
        Object aobj[] = a;
        i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public ct b(Object obj)
    {
        return a(obj);
    }

    ng()
    {
        d.a(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }
}
