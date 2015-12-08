// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.a.b;
import com.google.gson.b.a;
import com.google.gson.internal.e;
import com.google.gson.r;
import com.google.gson.s;

public final class d
    implements s
{

    private final com.google.gson.internal.b a;

    public d(com.google.gson.internal.b b1)
    {
        a = b1;
    }

    static r a(com.google.gson.internal.b b1, com.google.gson.e e1, a a1, b b2)
    {
        b2 = b2.a();
        if (com/google/gson/r.isAssignableFrom(b2))
        {
            return (r)b1.a(com.google.gson.b.a.a(b2)).a();
        }
        if (com/google/gson/s.isAssignableFrom(b2))
        {
            return ((s)b1.a(com.google.gson.b.a.a(b2)).a()).a(e1, a1);
        } else
        {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }
    }

    public final r a(com.google.gson.e e1, a a1)
    {
        b b1 = (b)a1.a.getAnnotation(com/google/gson/a/b);
        if (b1 == null)
        {
            return null;
        } else
        {
            return a(a, e1, a1, b1);
        }
    }
}
