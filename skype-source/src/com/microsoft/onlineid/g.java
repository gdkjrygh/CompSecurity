// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;

import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid:
//            d

public final class g
    implements d
{

    private final String a;
    private final String b;
    private String c;

    public g(String s, String s1)
    {
        o.a(s, "target");
        a = s;
        b = s1;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof d))
            {
                return false;
            }
            obj = (d)obj;
            if (!a.equalsIgnoreCase(((d) (obj)).a()) || !o.b(b, ((d) (obj)).b()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return k.a(toString());
    }

    public final String toString()
    {
        if (c == null)
        {
            c = String.format(Locale.US, "service::%s::%s", new Object[] {
                a, b
            });
        }
        return c;
    }
}
