// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g;


public class g
{

    private Class a;
    private Class b;

    public g()
    {
    }

    public g(Class class1, Class class2)
    {
        a(class1, class2);
    }

    public void a(Class class1, Class class2)
    {
        a = class1;
        b = class2;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (g)obj;
            if (!a.equals(((g) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((g) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a.hashCode() * 31 + b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("MultiClassKey{first=").append(a).append(", second=").append(b).append('}').toString();
    }
}
