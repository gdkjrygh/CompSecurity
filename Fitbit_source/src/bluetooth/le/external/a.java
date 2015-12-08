// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;

import java.util.UUID;

public class a
{

    private final UUID a;
    private final byte b[];

    public a(UUID uuid, byte abyte0[])
    {
        a = uuid;
        b = (byte[])abyte0.clone();
    }

    public UUID a()
    {
        return a;
    }

    public byte[] b()
    {
        return b;
    }
}
