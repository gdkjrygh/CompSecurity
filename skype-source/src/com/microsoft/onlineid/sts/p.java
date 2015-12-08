// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid.sts:
//            r

public final class p
{

    private final String a;
    private final int b;

    public p(String s, int i)
    {
        o.a(s, "error");
        a = s;
        b = i;
    }

    public final String a()
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
            if (obj != null && (obj instanceof p))
            {
                if (!k.a(a, ((p) (obj = (p)obj)).a) || b != ((p) (obj)).b)
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
        return k.a(a) + b;
    }

    public final String toString()
    {
        return String.format(Locale.US, "Server Error: %s SubError: %s", new Object[] {
            a, r.a(b)
        });
    }
}
