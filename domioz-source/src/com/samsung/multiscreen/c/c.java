// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.c;


// Referenced classes of package com.samsung.multiscreen.c:
//            d

public final class c
{

    private final d a;
    private final String b;

    public c(d d1, String s)
    {
        a = d1;
        b = s;
    }

    public final boolean equals(Object obj)
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
            obj = (c)obj;
            if (b == null)
            {
                if (((c) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((c) (obj)).b))
            {
                return false;
            }
            if (a != ((c) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (a != null)
        {
            j = a.hashCode();
        }
        return (i + 31) * 31 + j;
    }
}
