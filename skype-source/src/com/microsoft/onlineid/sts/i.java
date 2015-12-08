// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.k;
import java.io.Serializable;

// Referenced classes of package com.microsoft.onlineid.sts:
//            h, f

public final class i
    implements Serializable
{

    private final h a;
    private final String b;
    private f c;

    public i(h h1, String s, f f)
    {
        if (h1 == null || s == null)
        {
            throw new IllegalArgumentException("credentials and puid must not be null.");
        } else
        {
            a = h1;
            b = s;
            c = f;
            return;
        }
    }

    public final h a()
    {
        return a;
    }

    final void a(f f)
    {
        c = f;
    }

    public final String b()
    {
        return b;
    }

    public final f c()
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
        return a.hashCode() + b.hashCode() + k.a(c);
    }
}
