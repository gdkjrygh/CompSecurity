// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;

import java.util.UUID;

public class b
{

    private final UUID a;
    private final UUID b;
    private final byte c[];

    public b(UUID uuid, UUID uuid1, byte abyte0[])
    {
        a = uuid;
        b = uuid1;
        c = (byte[])abyte0.clone();
    }

    public UUID a()
    {
        return a;
    }

    public UUID b()
    {
        return b;
    }

    public byte[] c()
    {
        return c;
    }
}
