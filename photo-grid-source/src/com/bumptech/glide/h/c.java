// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.h;

import java.security.MessageDigest;

public final class c
    implements com.bumptech.glide.load.c
{

    private final String a;

    public c(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("Signature cannot be null!");
        } else
        {
            a = s;
            return;
        }
    }

    public final void a(MessageDigest messagedigest)
    {
        messagedigest.update(a.getBytes("UTF-8"));
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (c)obj;
            return a.equals(((c) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("StringSignature{signature='")).append(a).append('\'').append('}').toString();
    }
}
