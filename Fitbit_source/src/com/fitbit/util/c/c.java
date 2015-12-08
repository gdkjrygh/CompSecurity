// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.c;

import com.fitbit.util.d;
import java.util.Date;

public class c
{

    private static final byte a[] = {
        37, 90, 64, 80, 20, 6, 69, 15, 92, 15, 
        16, 22, 81, 17, 118, 90, 76, 95, 70, 92, 
        66, 94, 91, 95, 71, 77, 93, 70, 120, 84, 
        77, 12, 18, 81, 18, 15, 89, 87, 70, 77
    };
    private static final byte b[] = {
        111, 90, 64, 21, 9, 23, 64, 21, 24, 81, 
        0, 67, 81, 22, 83, 21, 87, 92, 70, 65, 
        90, 16, 89, 66, 6, 86, 87, 93, 1, 2, 
        76, 90
    };
    private static final byte c[] = {
        122, 90, 16, 88, 93, 21, 64, 89, 65, 92, 
        20, 83, 91, 8, 13, 82, 90, 76, 8, 93, 
        94, 22, 68, 102, 15, 84, 7, 65, 92, 69, 
        87, 14
    };
    private static final String d = (new StringBuilder()).append(new Date()).append("").toString();

    public c()
    {
    }

    public byte a(byte byte0, byte byte1)
    {
        return (byte)(byte0 ^ byte1);
    }

    public String a(byte abyte0[])
    {
        return new String(com.fitbit.util.d.a(com.fitbit.util.d.a(abyte0), new com.fitbit.util.d.b(abyte0) {

            final byte a[];
            final c b;

            public byte a(byte byte0)
            {
                return (byte)(a.length ^ byte0);
            }

            
            {
                b = c.this;
                a = abyte0;
                super();
            }
        }));
    }

    public byte[] a()
    {
        return a;
    }

    public byte[] b()
    {
        return b;
    }

    public byte[] c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

}
