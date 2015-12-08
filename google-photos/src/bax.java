// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bax
{

    public static void a(ByteBuffer bytebuffer, double d)
    {
        int i = (int)(65536D * d);
        bytebuffer.put((byte)(i >> 24));
        bytebuffer.put((byte)(i >> 16 & 0xff));
        bytebuffer.put((byte)(i >> 8 & 0xff));
        bytebuffer.put((byte)i);
    }

    public static void a(ByteBuffer bytebuffer, int i)
    {
        i = 0xffffff & i;
        b(bytebuffer, i >> 8);
        c(bytebuffer, i);
    }

    public static void a(ByteBuffer bytebuffer, long l)
    {
        bytebuffer.putLong(l);
    }

    public static void a(ByteBuffer bytebuffer, String s)
    {
        int i = 0;
        if (s.getBytes().length != 3)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 51)).append("\"").append(s).append("\" language string isn't exactly 3 characters long!").toString());
        }
        int j = 0;
        for (; i < 3; i++)
        {
            j += s.getBytes()[i] - 96 << (2 - i) * 5;
        }

        b(bytebuffer, j);
    }

    public static void b(ByteBuffer bytebuffer, double d)
    {
        int i = (int)(1073741824D * d);
        bytebuffer.put((byte)(i >> 24));
        bytebuffer.put((byte)(i >> 16 & 0xff));
        bytebuffer.put((byte)(i >> 8 & 0xff));
        bytebuffer.put((byte)i);
    }

    public static void b(ByteBuffer bytebuffer, int i)
    {
        i = 0xffff & i;
        c(bytebuffer, i >> 8);
        c(bytebuffer, i & 0xff);
    }

    public static void b(ByteBuffer bytebuffer, long l)
    {
        bytebuffer.putInt((int)l);
    }

    public static void b(ByteBuffer bytebuffer, String s)
    {
        bytebuffer.put(b.g(s));
        c(bytebuffer, 0);
    }

    public static void c(ByteBuffer bytebuffer, double d)
    {
        short word0 = (short)(int)(256D * d);
        bytebuffer.put((byte)(word0 >> 8 & 0xff));
        bytebuffer.put((byte)word0);
    }

    public static void c(ByteBuffer bytebuffer, int i)
    {
        bytebuffer.put((byte)(i & 0xff));
    }

    public static void c(ByteBuffer bytebuffer, long l)
    {
        l = 0xffffffffffffL & l;
        b(bytebuffer, (int)(l >> 32));
        bytebuffer.putInt((int)(l & 0xffffffffL));
    }

    public static void c(ByteBuffer bytebuffer, String s)
    {
        bytebuffer.put(b.g(s));
        c(bytebuffer, 0);
    }
}
