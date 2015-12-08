// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.c.a;
import com.google.a.k;

final class ax
    implements an
{

    final Class a;
    final Class b;
    final am c;

    ax(Class class1, Class class2, am am)
    {
        a = class1;
        b = class2;
        c = am;
        super();
    }

    public final am a(k k, a a1)
    {
        k = a1.a();
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
        return (new StringBuilder("Factory[type=")).append(a.getName()).append("+").append(b.getName()).append(",adapter=").append(c).append("]").toString();
    }
}
