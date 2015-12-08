// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;

// Referenced classes of package com.google.a.b:
//            ao, y, cm

abstract class an extends ao
{

    Object a[];
    int b;

    an()
    {
        y.a(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }

    public an a(Object obj)
    {
        ad.a(obj);
        int i = b + 1;
        if (a.length < i)
        {
            a = cm.b(a, a(a.length, i));
        }
        Object aobj[] = a;
        i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public ao b(Object obj)
    {
        return a(obj);
    }
}
