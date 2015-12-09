// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a;

import com.google.b.e.a.c;

final class b
{

    private final boolean a;
    private final com.google.b.e.a.b b;
    private final com.google.b.e.a.b c;
    private final c d;

    b(com.google.b.e.a.b b1, com.google.b.e.a.b b2, c c1, boolean flag)
    {
        b = b1;
        c = b2;
        d = c1;
        a = flag;
    }

    private static int a(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return obj.hashCode();
        }
    }

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    com.google.b.e.a.b a()
    {
        return b;
    }

    com.google.b.e.a.b b()
    {
        return c;
    }

    c c()
    {
        return d;
    }

    public boolean d()
    {
        return c == null;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (a(b, ((b) (obj = (b)obj)).b) && a(c, ((b) (obj)).c) && a(d, ((b) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a(b) ^ a(c) ^ a(d);
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("[ ").append(b).append(" , ").append(c).append(" : ");
        Object obj;
        if (d == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(d.a());
        }
        return stringbuilder.append(obj).append(" ]").toString();
    }
}
