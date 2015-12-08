// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

public abstract class bas
    implements bau
{

    private static Logger a = Logger.getLogger(bas.getName());
    private ThreadLocal b;

    public bas()
    {
        b = new bat(this);
    }

    public abstract baz a(String s);

    public final baz a(qsw qsw1, bbe bbe)
    {
        long l = qsw1.b();
        ((ByteBuffer)b.get()).rewind().limit(8);
        do
        {
            int i = qsw1.a((ByteBuffer)b.get());
            if (i != 8)
            {
                if (i < 0)
                {
                    qsw1.a(l);
                    throw new EOFException();
                }
            } else
            {
                ((ByteBuffer)b.get()).rewind();
                long l1 = b.a((ByteBuffer)b.get());
                if (l1 < 8L && l1 > 1L)
                {
                    a.severe((new StringBuilder(80)).append("Plausibility check failed: size < 8 (size = ").append(l1).append("). Stop parsing!").toString());
                    return null;
                }
                Object obj = b.i((ByteBuffer)b.get());
                if (l1 == 1L)
                {
                    ((ByteBuffer)b.get()).limit(16);
                    qsw1.a((ByteBuffer)b.get());
                    ((ByteBuffer)b.get()).position(8);
                    l1 = b.e((ByteBuffer)b.get()) - 16L;
                } else
                if (l1 == 0L)
                {
                    l1 = qsw1.a() - qsw1.b();
                } else
                {
                    l1 -= 8L;
                }
                if ("uuid".equals(obj))
                {
                    ((ByteBuffer)b.get()).limit(((ByteBuffer)b.get()).limit() + 16);
                    qsw1.a((ByteBuffer)b.get());
                    byte abyte0[] = new byte[16];
                    for (int j = ((ByteBuffer)b.get()).position() - 16; j < ((ByteBuffer)b.get()).position(); j++)
                    {
                        abyte0[j - (((ByteBuffer)b.get()).position() - 16)] = ((ByteBuffer)b.get()).get(j);
                    }

                    l1 -= 16L;
                }
                obj = a(((String) (obj)));
                ((baz) (obj)).a(bbe);
                ((ByteBuffer)b.get()).rewind();
                ((baz) (obj)).a(qsw1, (ByteBuffer)b.get(), l1, this);
                return ((baz) (obj));
            }
        } while (true);
    }

}
