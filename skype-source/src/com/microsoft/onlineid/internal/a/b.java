// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.a;

import com.microsoft.onlineid.internal.k;
import java.net.URL;

public final class b
{

    private final String a;
    private final URL b;

    public b(String s, URL url)
    {
        a = s;
        b = url;
    }

    public final String a()
    {
        return a;
    }

    public final URL b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && (obj instanceof b))
            {
                if (!k.a(a, ((b) (obj = (b)obj)).a) || !k.a(b, ((b) (obj)).b))
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
        return k.a(a) + k.a(b);
    }
}
