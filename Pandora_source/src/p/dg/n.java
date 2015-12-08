// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import java.io.Serializable;

public class n
    implements Serializable, Cloneable
{

    private final String a;
    private boolean b;
    private boolean c;
    private int d;

    public n(String s)
    {
        a = s;
        b = false;
        c = false;
        d = -1;
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        if (i > d)
        {
            d = i;
        }
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    public boolean b()
    {
        return b;
    }

    public boolean c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (n)obj;
            if (a() == null ? ((n) (obj)).a() != null : !a().equals(((n) (obj)).a()))
            {
                return false;
            }
            if (b != ((n) (obj)).b)
            {
                return false;
            }
            if (c != ((n) (obj)).c)
            {
                return false;
            }
            if (d != ((n) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 1;
        int i;
        int j;
        if (a() != null)
        {
            i = a().hashCode();
        } else
        {
            i = 0;
        }
        if (b)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!c)
        {
            k = 0;
        }
        return ((j + i * 31) * 31 + k) * 31 + (d ^ d >>> 16);
    }
}
