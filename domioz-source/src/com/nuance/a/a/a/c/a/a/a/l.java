// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.b.a.b.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class l extends h
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/a/a/a/l);
    private short b;

    public l(short word0)
    {
        b = word0;
    }

    public l(short word0, byte abyte0[])
    {
        super(abyte0);
        b = word0;
    }

    public final short c()
    {
        return b;
    }

    public final byte[] d()
    {
        return super.e();
    }

    public final byte[] e()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bytearrayoutputstream.write(b & 0xff);
        bytearrayoutputstream.write(b >> 8 & 0xff);
        try
        {
            bytearrayoutputstream.write(super.e());
        }
        catch (IOException ioexception)
        {
            a.b((new StringBuilder("PDXMessage.toByteArray() ")).append(ioexception.toString()).append(". ").toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

}
