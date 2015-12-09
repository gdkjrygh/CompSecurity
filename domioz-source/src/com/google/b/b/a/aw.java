// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.c.a;
import com.google.b.k;

final class aw
    implements am
{

    final Class a;
    final Class b;
    final al c;

    aw(Class class1, Class class2, al al)
    {
        a = class1;
        b = class2;
        c = al;
        super();
    }

    public final al a(k k, a a1)
    {
        k = a1.getRawType();
        if (k == a || k == b)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[type=")).append(b.getName()).append("+").append(a.getName()).append(",adapter=").append(c).append("]").toString();
    }
}
