// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.crypt;

import com.fitbit.galileo.a.d;
import java.nio.ByteBuffer;

class a
{

    private static final String a = "SecureDataHolder";
    private static final int b = 4;
    private byte c[];

    a(byte abyte0[])
    {
        c = abyte0;
    }

    static a a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        ByteBuffer bytebuffer = ByteBuffer.allocate(abyte0.length);
        bytebuffer.put(abyte0);
        bytebuffer.position(0);
        int i = bytebuffer.getInt();
        abyte0 = new byte[bytebuffer.remaining()];
        bytebuffer.get(abyte0);
        if (i != d.a(abyte0))
        {
            com.fitbit.e.a.a("SecureDataHolder", "Unable to verify data", new Object[0]);
            return null;
        } else
        {
            return new a(abyte0);
        }
    }

    public byte[] a()
    {
        return c;
    }

    byte[] b()
    {
        if (c == null)
        {
            return null;
        } else
        {
            int i = c.length;
            int j = d.a(c);
            ByteBuffer bytebuffer = ByteBuffer.allocate(i + 4);
            bytebuffer.putInt(j);
            bytebuffer.put(c);
            return bytebuffer.array();
        }
    }
}
