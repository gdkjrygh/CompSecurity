// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import com.bumptech.glide.load.c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            f

static class a
    implements c
{

    private final UUID a;

    public void a(MessageDigest messagedigest)
        throws UnsupportedEncodingException
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof )
        {
            return (()obj).a.equals(a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public ()
    {
        this(UUID.randomUUID());
    }

    <init>(UUID uuid)
    {
        a = uuid;
    }
}
