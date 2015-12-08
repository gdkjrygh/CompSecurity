// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.a.b;
import com.google.b.al;
import com.google.b.am;
import com.google.b.b.ae;
import com.google.b.b.f;
import com.google.b.c.a;
import com.google.b.k;

public final class g
    implements am
{

    private final f a;

    public g(f f1)
    {
        a = f1;
    }

    static al a(f f1, k k, a a1, b b1)
    {
        b1 = b1.a();
        if (com/google/b/al.isAssignableFrom(b1))
        {
            return (al)f1.a(com.google.b.c.a.get(b1)).a();
        }
        if (com/google/b/am.isAssignableFrom(b1))
        {
            return ((am)f1.a(com.google.b.c.a.get(b1)).a()).a(k, a1);
        } else
        {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }
    }

    public final al a(k k, a a1)
    {
        b b1 = (b)a1.getRawType().getAnnotation(com/google/b/a/b);
        if (b1 == null)
        {
            return null;
        } else
        {
            return a(a, k, a1, b1);
        }
    }
}
