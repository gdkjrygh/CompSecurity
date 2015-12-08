// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


final class ad
    implements java.util.Map.Entry
{

    ad a;
    ad b;
    ad c;
    ad d;
    ad e;
    final Object f;
    Object g;
    int h;

    ad()
    {
        f = null;
        e = this;
        d = this;
    }

    ad(ad ad1, Object obj, ad ad2, ad ad3)
    {
        a = ad1;
        f = obj;
        h = 1;
        d = ad2;
        e = ad3;
        ad3.d = this;
        ad2.e = this;
    }

    public ad a()
    {
        ad ad1 = b;
        ad ad2 = this;
        ad ad3;
        for (; ad1 != null; ad1 = ad3)
        {
            ad3 = ad1.b;
            ad2 = ad1;
        }

        return ad2;
    }

    public ad b()
    {
        ad ad1 = c;
        ad ad2 = this;
        ad ad3;
        for (; ad1 != null; ad1 = ad3)
        {
            ad3 = ad1.c;
            ad2 = ad1;
        }

        return ad2;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!(obj instanceof java.util.Map.Entry)) goto _L2; else goto _L1
_L1:
        obj = (java.util.Map.Entry)obj;
        if (f != null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (((java.util.Map.Entry) (obj)).getKey() != null) goto _L2; else goto _L5
_L5:
        if (g != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((java.util.Map.Entry) (obj)).getValue() != null) goto _L2; else goto _L8
_L8:
        flag = true;
_L2:
        return flag;
_L4:
        flag = flag1;
        if (!f.equals(((java.util.Map.Entry) (obj)).getKey())) goto _L2; else goto _L5
_L7:
        flag = flag1;
        if (!g.equals(((java.util.Map.Entry) (obj)).getValue())) goto _L2; else goto _L8
    }

    public Object getKey()
    {
        return f;
    }

    public Object getValue()
    {
        return g;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (f == null)
        {
            i = 0;
        } else
        {
            i = f.hashCode();
        }
        if (g != null)
        {
            j = g.hashCode();
        }
        return i ^ j;
    }

    public Object setValue(Object obj)
    {
        Object obj1 = g;
        g = obj;
        return obj1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(f).append("=").append(g).toString();
    }
}
