// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;


public class s
{

    public final Object a;
    public final Object b;

    public s(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof s))
        {
            if ((a == ((s) (obj = (s)obj)).a || a == null || a.equals(((s) (obj)).a)) && (b == ((s) (obj)).b || b == null || b.equals(((s) (obj)).b)))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int i = 0;
        if (a != null)
        {
            i = 0 ^ a.hashCode();
        }
        int j = i;
        if (b != null)
        {
            j = i ^ b.hashCode();
        }
        return j;
    }

    public String toString()
    {
        String s1 = "<";
        if (a != null)
        {
            s1 = (new StringBuilder()).append("<").append(a).toString();
        }
        String s2 = (new StringBuilder()).append(s1).append(":").toString();
        s1 = s2;
        if (b != null)
        {
            s1 = (new StringBuilder()).append(s2).append(b).toString();
        }
        return (new StringBuilder()).append(s1).append(">").toString();
    }
}
