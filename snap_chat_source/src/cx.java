// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class cx
{

    private static boolean a;

    public cx()
    {
    }

    public static void a(ByteBuffer bytebuffer, double d)
    {
        int i = (int)(65536D * d);
        bytebuffer.put(i >> 24);
        bytebuffer.put((byte)(i >> 16));
        bytebuffer.put((byte)(i >> 8));
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
        if (!a && l < 0L)
        {
            throw new AssertionError("The given long is negative");
        } else
        {
            bytebuffer.putLong(l);
            return;
        }
    }

    public static void a(ByteBuffer bytebuffer, String s)
    {
        int i = 0;
        if (s.getBytes().length != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("\"")).append(s).append("\" language string isn't exactly 3 characters long!").toString());
        }
        int j = 0;
        do
        {
            if (i >= 3)
            {
                b(bytebuffer, j);
                return;
            }
            j += s.getBytes()[i] - 96 << (2 - i) * 5;
            i++;
        } while (true);
    }

    public static void b(ByteBuffer bytebuffer, double d)
    {
        int i = (int)(1073741824D * d);
        bytebuffer.put(i >> 24);
        bytebuffer.put((byte)(i >> 16));
        bytebuffer.put((byte)(i >> 8));
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
        if (!a && (l < 0L || l > 0x100000000L))
        {
            throw new AssertionError((new StringBuilder("The given long is not in the range of uint32 (")).append(l).append(")").toString());
        } else
        {
            bytebuffer.putInt((int)l);
            return;
        }
    }

    public static void c(ByteBuffer bytebuffer, double d)
    {
        short word0 = (short)(int)(256D * d);
        bytebuffer.put((byte)(word0 >> 8));
        bytebuffer.put((byte)word0);
    }

    public static void c(ByteBuffer bytebuffer, int i)
    {
        bytebuffer.put((byte)(i & 0xff));
    }

    static 
    {
        boolean flag;
        if (!cx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
