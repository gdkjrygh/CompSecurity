// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import java.util.Arrays;
import java.util.List;

public class b
{

    private final int a;
    private List b;

    public b(int i, Object aobj[])
    {
        a = i;
        b = Arrays.asList(aobj);
    }

    public int a()
    {
        return a;
    }

    public List b()
    {
        return b;
    }

    public int c()
    {
        return b.size();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (b == null)
            {
                if (((b) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((b) (obj)).b))
            {
                return false;
            }
            if (a != ((b) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return ((i + 31) * 31 + a) * 31 + c();
    }

    public String toString()
    {
        return (new StringBuilder()).append("[position: ").append(a).append(", size: ").append(c()).append(", lines: ").append(b).append("]").toString();
    }
}
