// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.t;

abstract class b
    implements java.util.Map.Entry
{

    b()
    {
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (t.a(getKey(), ((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (t.a(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode()
    {
        int j = 0;
        Object obj = getKey();
        Object obj1 = getValue();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            j = obj1.hashCode();
        }
        return j ^ i;
    }

    public Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(getKey()));
        String s1 = String.valueOf(String.valueOf(getValue()));
        return (new StringBuilder(s.length() + 1 + s1.length())).append(s).append("=").append(s1).toString();
    }
}
