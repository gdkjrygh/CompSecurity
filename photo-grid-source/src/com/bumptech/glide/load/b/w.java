// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.load.c;
import java.security.MessageDigest;

final class w
    implements c
{

    private final String a;
    private final c b;

    public w(String s, c c1)
    {
        a = s;
        b = c1;
    }

    public final void a(MessageDigest messagedigest)
    {
        messagedigest.update(a.getBytes("UTF-8"));
        b.a(messagedigest);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (w)obj;
            if (!a.equals(((w) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((w) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode() * 31 + b.hashCode();
    }
}
