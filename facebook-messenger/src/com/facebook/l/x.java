// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;


// Referenced classes of package com.facebook.l:
//            a

public class x
{

    public static x a;
    private final a b;
    private final boolean c;
    private final boolean d;

    public x(a a1, boolean flag, boolean flag1)
    {
        b = a1;
        c = flag;
        d = flag1;
    }

    public a a()
    {
        return b;
    }

    public boolean b()
    {
        return c;
    }

    public boolean c()
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
            obj = (x)obj;
            if (c != ((x) (obj)).c)
            {
                return false;
            }
            if (d != ((x) (obj)).d)
            {
                return false;
            }
            if (b != ((x) (obj)).b)
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
        if (b != null)
        {
            i = b.hashCode();
        } else
        {
            i = 0;
        }
        if (c)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!d)
        {
            k = 0;
        }
        return (j + i * 31) * 31 + k;
    }

    static 
    {
        a = new x(a.NONE, false, false);
    }
}
