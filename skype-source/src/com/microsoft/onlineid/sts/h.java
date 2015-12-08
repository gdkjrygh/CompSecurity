// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.k;
import java.io.Serializable;

public final class h
    implements Serializable
{

    private final String a;
    private final String b;

    public h(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException("username and password must not be null.");
        } else
        {
            a = s;
            b = s1;
            return;
        }
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
            if (obj != null && (obj instanceof h))
            {
                if (!k.a(a, ((h) (obj = (h)obj)).a) || !k.a(b, ((h) (obj)).b))
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
        return a.hashCode() + b.hashCode();
    }
}
