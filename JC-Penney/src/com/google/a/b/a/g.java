// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.a.b;
import com.google.a.af;
import com.google.a.ag;
import com.google.a.b.ae;
import com.google.a.b.f;
import com.google.a.c.a;
import com.google.a.j;

public final class g
    implements ag
{

    private final f a;

    public g(f f1)
    {
        a = f1;
    }

    static af a(f f1, j j, a a1, b b1)
    {
        b1 = b1.a();
        if (com/google/a/af.isAssignableFrom(b1))
        {
            return (af)f1.a(com.google.a.c.a.b(b1)).a();
        }
        if (com/google/a/ag.isAssignableFrom(b1))
        {
            return ((ag)f1.a(com.google.a.c.a.b(b1)).a()).a(j, a1);
        } else
        {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }
    }

    public af a(j j, a a1)
    {
        b b1 = (b)a1.a().getAnnotation(com/google/a/a/b);
        if (b1 == null)
        {
            return null;
        } else
        {
            return a(a, j, a1, b1);
        }
    }
}
