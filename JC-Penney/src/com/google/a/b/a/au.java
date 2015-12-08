// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.c.a;
import com.google.a.j;

final class au
    implements ag
{

    final Class a;
    final af b;

    au(Class class1, af af)
    {
        a = class1;
        b = af;
        super();
    }

    public af a(j j, a a1)
    {
        if (a1.a() == a)
        {
            return b;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Factory[type=").append(a.getName()).append(",adapter=").append(b).append("]").toString();
    }
}
