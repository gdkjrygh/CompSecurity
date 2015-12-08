// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.a.a;

import com.nuance.a.a.a.a.c.c;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;

public class a
{

    private static final e e = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/a/a/a);
    public byte a;
    public byte b;
    public short c;
    public int d;

    public a(byte byte0, byte byte1, short word0, int i)
    {
        if (e.b())
        {
            (new StringBuilder("Constructing XModeMsgHeader(protocol=")).append(byte0).append(", version=").append(byte1).append(", cmd=").append(word0).append(", len=").append(i).append(")");
        }
        a = byte0;
        b = byte1;
        c = word0;
        d = i;
    }

    public a(byte abyte0[])
    {
        if (e.b())
        {
            e.a(abyte0);
        }
        a = abyte0[0];
        b = abyte0[1];
        c = com.nuance.a.a.a.a.c.c.a(abyte0, 2);
        d = com.nuance.a.a.a.a.c.c.b(abyte0, 4);
    }

    public final byte[] a()
    {
        e.b();
        byte abyte0[] = new byte[8];
        abyte0[0] = a;
        abyte0[1] = b;
        com.nuance.a.a.a.a.c.c.a(c, abyte0, 2);
        com.nuance.a.a.a.a.c.c.a(d, abyte0, 4);
        if (e.b())
        {
            e.a(abyte0);
        }
        return abyte0;
    }

}
