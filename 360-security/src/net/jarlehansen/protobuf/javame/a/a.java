// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame.a;

import java.io.IOException;
import java.util.Vector;
import net.jarlehansen.protobuf.javame.a.a.b;

public class a
{

    private final b a;
    private final net.jarlehansen.protobuf.javame.original.input.a b;
    private int c;

    public a(byte abyte0[], b b1)
    {
        c = 0;
        b = net.jarlehansen.protobuf.javame.original.input.a.a(abyte0);
        a = b1;
    }

    public int a()
        throws IOException
    {
        c = b.a();
        return net.jarlehansen.protobuf.javame.original.a.b(c);
    }

    public int a(int i)
        throws IOException
    {
        return b.e();
    }

    public String b(int i)
        throws IOException
    {
        return b.g();
    }

    public void b()
        throws IOException
    {
        StringBuffer stringbuffer;
        int i;
        i = net.jarlehansen.protobuf.javame.original.a.a(c);
        stringbuffer = new StringBuffer();
        stringbuffer.append("FieldNumber: ").append(net.jarlehansen.protobuf.javame.original.a.b(c)).append(" - ");
        i;
        JVM INSTR tableswitch 0 5: default 76
    //                   0 156
    //                   1 113
    //                   2 136
    //                   3 76
    //                   4 76
    //                   5 90;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5
_L1:
        a.a(stringbuffer.toString());
        return;
_L5:
        stringbuffer.append("float value: ").append(Float.toString(b.c()));
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("double value: ").append(Double.toString(b.b()));
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("Length delimited (String or ByteString) value: ").append(b.g());
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuffer.append("varint (long, int or boolean) value: ").append(b.i());
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean c(int i)
        throws IOException
    {
        return b.f();
    }

    public long d(int i)
        throws IOException
    {
        return b.d();
    }

    public net.jarlehansen.protobuf.javame.b e(int i)
        throws IOException
    {
        return b.h();
    }

    public Vector f(int i)
        throws IOException
    {
        return b.a(i);
    }
}
