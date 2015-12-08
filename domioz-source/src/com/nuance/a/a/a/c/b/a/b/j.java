// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.b;


// Referenced classes of package com.nuance.a.a.a.c.b.a.b:
//            e

public final class j extends e
{

    private int a;

    public j(int i)
    {
        super((short)192);
        a = i;
    }

    public j(byte abyte0[])
    {
        super((short)192);
        if (abyte0.length == 1)
        {
            a = abyte0[0] & 0xff;
            return;
        }
        if (abyte0.length == 2)
        {
            a = ((abyte0[1] & 0xff) << 8) + (abyte0[0] & 0xff);
            return;
        }
        if (abyte0.length == 3)
        {
            a = ((abyte0[2] & 0xff) << 16) + ((abyte0[1] & 0xff) << 8) + (abyte0[0] & 0xff);
            return;
        } else
        {
            a = ((abyte0[3] & 0xff) << 24) + ((abyte0[2] & 0xff) << 16) + ((abyte0[1] & 0xff) << 8) + (abyte0[0] & 0xff);
            return;
        }
    }

    public final int a()
    {
        return a;
    }

    public final byte[] b()
    {
        byte abyte0[];
        if (Math.abs(a) < 128)
        {
            abyte0 = new byte[1];
            abyte0[0] = (byte)a;
        } else
        if (Math.abs(a) < 32768)
        {
            abyte0 = new byte[2];
            abyte0[0] = (byte)a;
            abyte0[1] = (byte)(a >> 8);
        } else
        {
            abyte0 = new byte[4];
            abyte0[0] = (byte)a;
            abyte0[1] = (byte)(a >> 8);
            abyte0[2] = (byte)(a >> 16);
            abyte0[3] = (byte)(a >>> 24);
        }
        return super.b(abyte0);
    }
}
