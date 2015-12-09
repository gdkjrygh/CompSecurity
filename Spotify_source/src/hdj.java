// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

public final class hdj
    implements Closeable
{

    public final hdh a;
    public MessageBufferOutput b;
    public MessageBuffer c;
    public int d;
    public long e;
    private MessageBuffer f;
    private CharsetEncoder g;

    public hdj(MessageBufferOutput messagebufferoutput)
    {
        this(messagebufferoutput, hdf.b);
    }

    private hdj(MessageBufferOutput messagebufferoutput, hdh hdh1)
    {
        a = (hdh)hdm.a(hdh1, "config is null");
        b = (MessageBufferOutput)hdm.a(messagebufferoutput, "MessageBufferOutput is null");
        d = 0;
        e = 0L;
    }

    private void a(byte byte0, long l)
    {
        a(9);
        MessageBuffer messagebuffer = c;
        int i = d;
        d = i + 1;
        messagebuffer.putByte(i, byte0);
        c.putLong(d, l);
        d = d + 8;
    }

    private hdj b(int i)
    {
        if (i < 32)
        {
            a((byte)(i | 0xffffffa0));
            return this;
        }
        if (i < 256)
        {
            a((byte)-39, (byte)i);
            return this;
        }
        if (i < 0x10000)
        {
            a((byte)-38, (short)i);
            return this;
        } else
        {
            a((byte)-37, i);
            return this;
        }
    }

    public final hdj a(double d1)
    {
        a(9);
        MessageBuffer messagebuffer = c;
        int i = d;
        d = i + 1;
        messagebuffer.putByte(i, (byte)-53);
        c.putDouble(d, d1);
        d = d + 8;
        return this;
    }

    public final hdj a(long l)
    {
        if (l < -32L)
        {
            if (l < -32768L)
            {
                if (l < 0xffffffff80000000L)
                {
                    a((byte)-45, l);
                    return this;
                } else
                {
                    a((byte)-46, (int)l);
                    return this;
                }
            }
            if (l < -128L)
            {
                a((byte)-47, (short)(int)l);
                return this;
            } else
            {
                a((byte)-48, (byte)(int)l);
                return this;
            }
        }
        if (l < 128L)
        {
            a((byte)(int)l);
            return this;
        }
        if (l < 0x10000L)
        {
            if (l < 256L)
            {
                a((byte)-52, (byte)(int)l);
                return this;
            } else
            {
                a((byte)-51, (short)(int)l);
                return this;
            }
        }
        if (l < 0x100000000L)
        {
            a((byte)-50, (int)l);
            return this;
        } else
        {
            a((byte)-49, l);
            return this;
        }
    }

    public final hdj a(String s)
    {
        CharBuffer charbuffer;
        int i;
        if (s.length() <= 0)
        {
            b(0);
            return this;
        }
        charbuffer = CharBuffer.wrap(s);
        if (g == null)
        {
            g = hdf.a.newEncoder().onMalformedInput(a.c).onUnmappableCharacter(a.c);
        }
        b();
        a();
        s = c.toByteBuffer(d, c.size() - d);
        g.reset();
        i = 0;
_L2:
        if (!charbuffer.hasRemaining())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        CoderResult coderresult;
        try
        {
            coderresult = g.encode(charbuffer, s, true);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MessageStringCodingException(s);
        }
        obj = coderresult;
        if (coderresult.isUnderflow())
        {
            obj = g.flush(s);
        }
        if (!((CoderResult) (obj)).isOverflow())
        {
            break MISSING_BLOCK_LABEL_218;
        }
        i = Math.max(1, (int)((float)charbuffer.remaining() * g.averageBytesPerChar()));
        s.flip();
        obj = ByteBuffer.allocate(Math.max((int)((double)s.capacity() * 1.5D), i + s.remaining()));
        ((ByteBuffer) (obj)).put(s);
        g.reset();
        s = ((String) (obj));
        i = 1;
        continue; /* Loop/switch isn't completed */
        if (((CoderResult) (obj)).isError() && (((CoderResult) (obj)).isMalformed() && a.c == CodingErrorAction.REPORT || ((CoderResult) (obj)).isUnmappable() && a.d == CodingErrorAction.REPORT))
        {
            ((CoderResult) (obj)).throwException();
        }
        if (true) goto _L2; else goto _L1
_L1:
        s.flip();
        int j = s.remaining();
        MessageBuffer messagebuffer = c;
        if (f == null)
        {
            f = MessageBuffer.newBuffer(5);
        }
        c = f;
        d = 0;
        b(j);
        b();
        if (i != 0)
        {
            s = MessageBuffer.wrap(s);
        } else
        {
            s = messagebuffer;
        }
        c = s;
        d = j;
        return this;
    }

    public final hdj a(BigInteger biginteger)
    {
        if (biginteger.bitLength() <= 63)
        {
            a(biginteger.longValue());
            return this;
        }
        if (biginteger.bitLength() == 64 && biginteger.signum() == 1)
        {
            a((byte)-49, biginteger.longValue());
            return this;
        } else
        {
            throw new IllegalArgumentException("Messagepack cannot serialize BigInteger larger than 2^64-1");
        }
    }

    public final void a()
    {
        if (c == null)
        {
            c = b.next(a.e);
        }
    }

    public final void a(byte byte0)
    {
        a(1);
        MessageBuffer messagebuffer = c;
        int i = d;
        d = i + 1;
        messagebuffer.putByte(i, byte0);
    }

    public final void a(byte byte0, byte byte1)
    {
        a(2);
        MessageBuffer messagebuffer = c;
        int i = d;
        d = i + 1;
        messagebuffer.putByte(i, byte0);
        messagebuffer = c;
        i = d;
        d = i + 1;
        messagebuffer.putByte(i, byte1);
    }

    public final void a(byte byte0, int i)
    {
        a(5);
        MessageBuffer messagebuffer = c;
        int j = d;
        d = j + 1;
        messagebuffer.putByte(j, byte0);
        c.putInt(d, i);
        d = d + 4;
    }

    public final void a(byte byte0, short word0)
    {
        a(3);
        MessageBuffer messagebuffer = c;
        int i = d;
        d = i + 1;
        messagebuffer.putByte(i, byte0);
        c.putShort(d, word0);
        d = d + 2;
    }

    public final void a(int i)
    {
        if (c == null || d + i >= c.size())
        {
            b();
            c = b.next(Math.max(a.e, i));
        }
    }

    public final void b()
    {
        if (c == null)
        {
            return;
        }
        if (d == c.size())
        {
            b.flush(c);
        } else
        {
            b.flush(c.slice(0, d));
        }
        c = null;
        e = e + (long)d;
        d = 0;
    }

    public final void close()
    {
        b();
        b.close();
        return;
        Exception exception;
        exception;
        b.close();
        throw exception;
    }
}
