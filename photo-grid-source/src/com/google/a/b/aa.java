// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


final class aa
    implements java.util.Map.Entry
{

    final String a;
    Object b;
    final int c;
    aa d;
    aa e;
    aa f;

    aa()
    {
        this(null, null, 0, null, null, null);
        f = this;
        e = this;
    }

    aa(String s, Object obj, int i, aa aa1, aa aa2, aa aa3)
    {
        a = s;
        b = obj;
        c = i;
        d = aa1;
        e = aa2;
        f = aa3;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getValue();
            if (a.equals(((java.util.Map.Entry) (obj)).getKey()) && (b != null ? b.equals(obj1) : obj1 == null))
            {
                return true;
            }
        }
        return false;
    }

    public final volatile Object getKey()
    {
        return a;
    }

    public final Object getValue()
    {
        return b;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i ^ j;
    }

    public final Object setValue(Object obj)
    {
        Object obj1 = b;
        b = obj;
        return obj1;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append("=").append(b).toString();
    }
}
