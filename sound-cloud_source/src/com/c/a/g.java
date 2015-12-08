// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.i;

public final class g
{

    public final String a;
    public final String b;

    public g(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof g) && i.a(a, ((g)obj).a) && i.a(b, ((g)obj).b);
    }

    public final int hashCode()
    {
        int k = 0;
        int j;
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (a != null)
        {
            k = a.hashCode();
        }
        return (j + 899) * 31 + k;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(" realm=\"").append(b).append("\"").toString();
    }
}
