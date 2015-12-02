// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.s;

import com.google.common.base.Preconditions;

public abstract class a
    implements Comparable
{

    private final String a;

    protected a(String s)
    {
        a = s;
    }

    public String a()
    {
        return a;
    }

    public boolean a(a a1)
    {
        return a.startsWith(a1.a());
    }

    protected abstract a b(String s);

    public String b(a a1)
    {
        Preconditions.checkArgument(a.startsWith(a1.a()));
        return a.substring(a1.a().length());
    }

    public int c(a a1)
    {
        return a.compareTo(a1.a());
    }

    public a c(String s)
    {
        return b((new StringBuilder()).append(a).append(s).toString());
    }

    public int compareTo(Object obj)
    {
        return c((a)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a)obj;
            if (a == null ? ((a) (obj)).a() != null : !a.equals(((a) (obj)).a()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (a != null)
        {
            return a.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return a;
    }
}
