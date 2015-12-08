// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;

import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.microsoft.onlineid:
//            d

public final class i
    implements Serializable
{

    private final d a;
    private final Date b;
    private final String c;

    public i(d d, Date date, String s)
    {
        k.a(d, "scope");
        k.a(date, "expiry");
        o.a(s, "value");
        a = d;
        b = date;
        c = s;
    }

    public final d a()
    {
        return a;
    }

    public final Date b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && (obj instanceof i))
            {
                if (!k.a(a, ((i) (obj = (i)obj)).a) || !k.a(b, ((i) (obj)).b) || !k.a(c, ((i) (obj)).c))
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
        return k.a(a) + k.a(b) + k.a(c);
    }

    public final String toString()
    {
        return (new StringBuilder("Ticket{scope: ")).append(a).append(", expiry: ").append(b).append("}").toString();
    }
}
