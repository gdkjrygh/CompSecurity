// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid.sts:
//            r

public final class l
{

    private final int a;
    private final int b;
    private final String c;

    public l(int i)
    {
        this(i, 0, null);
    }

    public l(int i, int j, String s)
    {
        a = i;
        b = j;
        c = s;
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && (obj instanceof l))
            {
                if (a != ((l) (obj = (l)obj)).a || b != ((l) (obj)).b)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a + b;
    }

    public final String toString()
    {
        return String.format(Locale.US, "Server Error: %s SubError: %s Message: %s", new Object[] {
            r.a(a), r.a(b), c
        });
    }
}
