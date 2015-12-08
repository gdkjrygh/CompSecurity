// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import com.bumptech.glide.load.c;
import java.security.MessageDigest;
import java.util.UUID;

final class k
    implements c
{

    private final UUID a;

    public k()
    {
        this(UUID.randomUUID());
    }

    private k(UUID uuid)
    {
        a = uuid;
    }

    public final void a(MessageDigest messagedigest)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof k)
        {
            return ((k)obj).a.equals(a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
