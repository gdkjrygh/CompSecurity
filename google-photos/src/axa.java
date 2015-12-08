// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;
import java.util.UUID;

final class axa
    implements ane
{

    private final UUID b;

    public axa()
    {
        this(UUID.randomUUID());
    }

    private axa(UUID uuid)
    {
        b = uuid;
    }

    public final void a(MessageDigest messagedigest)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof axa)
        {
            return ((axa)obj).b.equals(b);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }
}
