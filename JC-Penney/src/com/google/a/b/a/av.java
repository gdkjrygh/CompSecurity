// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.c.a;
import com.google.a.j;

final class av
    implements ag
{

    final Class a;
    final Class b;
    final af c;

    av(Class class1, Class class2, af af)
    {
        a = class1;
        b = class2;
        c = af;
        super();
    }

    public af a(j j, a a1)
    {
        j = a1.a();
        if (j == a || j == b)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Factory[type=").append(b.getName()).append("+").append(a.getName()).append(",adapter=").append(c).append("]").toString();
    }
}
