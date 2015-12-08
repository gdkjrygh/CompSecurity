// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dz;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import p.ea.c;
import p.eb.d;
import p.eb.e;
import p.ec.f;
import p.ec.h;
import p.ec.i;
import p.ee.a;

// Referenced classes of package p.dz:
//            a

public class b extends p.dz.a
{
    private class a extends Throwable
    {

        final b a;
        private int b;

        public int a()
        {
            return b;
        }

        public a(int j)
        {
            a = b.this;
            super();
            b = j;
        }
    }


    static final boolean f;
    private ByteBuffer g;
    private d h;
    private final Random i = new Random();

    public b()
    {
        h = null;
    }

    private byte a(p.eb.d.a a1)
    {
        if (a1 == p.eb.d.a.a)
        {
            return 0;
        }
        if (a1 == p.eb.d.a.b)
        {
            return 1;
        }
        if (a1 == p.eb.d.a.c)
        {
            return 2;
        }
        if (a1 == p.eb.d.a.f)
        {
            return 8;
        }
        if (a1 == p.eb.d.a.d)
        {
            return 9;
        }
        if (a1 == p.eb.d.a.e)
        {
            return 10;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("Don't know how to handle ").append(a1.toString()).toString());
        }
    }

    private String a(String s)
    {
        s = s.trim();
        s = (new StringBuilder()).append(s).append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11").toString();
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA1");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return p.ee.a.a(messagedigest.digest(s.getBytes()));
    }

    private p.eb.d.a a(byte byte0)
        throws c
    {
        switch (byte0)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            throw new c((new StringBuilder()).append("unknow optcode ").append((short)byte0).toString());

        case 0: // '\0'
            return p.eb.d.a.a;

        case 1: // '\001'
            return p.eb.d.a.b;

        case 2: // '\002'
            return p.eb.d.a.c;

        case 8: // '\b'
            return p.eb.d.a.f;

        case 9: // '\t'
            return p.eb.d.a.d;

        case 10: // '\n'
            return p.eb.d.a.e;
        }
    }

    private byte[] a(long l, int j)
    {
        byte abyte0[] = new byte[j];
        for (int k = 0; k < j; k++)
        {
            abyte0[k] = (byte)(int)(l >>> j * 8 - 8 - k * 8);
        }

        return abyte0;
    }

    public static int b(f f1)
    {
        int j = -1;
        f1 = f1.b("Sec-WebSocket-Version");
        if (f1.length() > 0)
        {
            try
            {
                j = (new Integer(f1.trim())).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                return -1;
            }
        }
        return j;
    }

    public ByteBuffer a(d d1)
    {
        byte byte0 = -128;
        boolean flag1 = false;
        ByteBuffer bytebuffer = d1.c();
        ByteBuffer bytebuffer1;
        int j;
        boolean flag;
        int k;
        byte byte1;
        if (d == p.dx.b.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bytebuffer.remaining() <= 125)
        {
            j = 1;
        } else
        if (bytebuffer.remaining() <= 65535)
        {
            j = 2;
        } else
        {
            j = 8;
        }
        if (j > 1)
        {
            k = j + 1;
        } else
        {
            k = j;
        }
        if (flag)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        bytebuffer1 = ByteBuffer.allocate(byte1 + (k + 1) + bytebuffer.remaining());
        byte1 = a(d1.f());
        if (d1.d())
        {
            k = -128;
        } else
        {
            k = 0;
        }
        bytebuffer1.put((byte)((byte)k | byte1));
        d1 = a(bytebuffer.remaining(), j);
        if (!f && d1.length != j)
        {
            throw new AssertionError();
        }
        if (j == 1)
        {
            j = d1[0];
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(j | byte0));
        } else
        if (j == 2)
        {
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(byte0 | 0x7e));
            bytebuffer1.put(d1);
        } else
        if (j == 8)
        {
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(byte0 | 0x7f));
            bytebuffer1.put(d1);
        } else
        {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (flag)
        {
            d1 = ByteBuffer.allocate(4);
            d1.putInt(i.nextInt());
            bytebuffer1.put(d1.array());
            for (j = ((flag1) ? 1 : 0); bytebuffer.hasRemaining(); j++)
            {
                bytebuffer1.put((byte)(bytebuffer.get() ^ d1.get(j % 4)));
            }

        } else
        {
            bytebuffer1.put(bytebuffer);
        }
        if (!f && bytebuffer1.remaining() != 0)
        {
            throw new AssertionError(bytebuffer1.remaining());
        } else
        {
            bytebuffer1.flip();
            return bytebuffer1;
        }
    }

    public List a(String s, boolean flag)
    {
        e e1 = new e();
        try
        {
            e1.a(ByteBuffer.wrap(p.ee.b.a(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new p.ea.f(s);
        }
        e1.a(true);
        e1.a(p.eb.d.a.b);
        e1.b(flag);
        return Collections.singletonList(e1);
    }

    public a.b a(p.ec.a a1)
        throws p.ea.d
    {
        int j = b(a1);
        if (j == 7 || j == 8)
        {
            if (a(((f) (a1))))
            {
                return p.dz.a.b.a;
            } else
            {
                return a.b.b;
            }
        } else
        {
            return a.b.b;
        }
    }

    public a.b a(p.ec.a a1, h h1)
        throws p.ea.d
    {
        if (!a1.c("Sec-WebSocket-Key") || !h1.c("Sec-WebSocket-Accept"))
        {
            return a.b.b;
        }
        h1 = h1.b("Sec-WebSocket-Accept");
        if (a(a1.b("Sec-WebSocket-Key")).equals(h1))
        {
            return p.dz.a.b.a;
        } else
        {
            return a.b.b;
        }
    }

    public p.ec.b a(p.ec.b b1)
    {
        b1.a("Upgrade", "websocket");
        b1.a("Connection", "Upgrade");
        b1.a("Sec-WebSocket-Version", "8");
        byte abyte0[] = new byte[16];
        i.nextBytes(abyte0);
        b1.a("Sec-WebSocket-Key", p.ee.a.a(abyte0));
        return b1;
    }

    public p.ec.c a(p.ec.a a1, i j)
        throws p.ea.d
    {
        j.a("Upgrade", "websocket");
        j.a("Connection", a1.b("Connection"));
        j.a("Switching Protocols");
        a1 = a1.b("Sec-WebSocket-Key");
        if (a1 == null)
        {
            throw new p.ea.d("missing Sec-WebSocket-Key");
        } else
        {
            j.a("Sec-WebSocket-Accept", a(((String) (a1))));
            return j;
        }
    }

    public void a()
    {
        g = null;
    }

    public a.a b()
    {
        return p.dz.a.a.c;
    }

    public List c(ByteBuffer bytebuffer)
        throws p.ea.e, p.ea.b
    {
        LinkedList linkedlist = new LinkedList();
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        a a2;
        int j;
        int k;
        try
        {
            bytebuffer.mark();
            j = bytebuffer.remaining();
            k = g.remaining();
        }
        catch (a a1)
        {
            g.limit();
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(a1.a()));
            if (!f && bytebuffer1.limit() <= g.limit())
            {
                throw new AssertionError();
            } else
            {
                g.rewind();
                bytebuffer1.put(g);
                g = bytebuffer1;
                return c(bytebuffer);
            }
        }
        if (k <= j)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        g.put(bytebuffer.array(), bytebuffer.position(), j);
        bytebuffer.position(j + bytebuffer.position());
        return Collections.emptyList();
        g.put(bytebuffer.array(), bytebuffer.position(), k);
        bytebuffer.position(bytebuffer.position() + k);
        linkedlist.add(e((ByteBuffer)g.duplicate().position(0)));
        g = null;
_L2:
        if (!bytebuffer.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_193;
        }
        bytebuffer.mark();
        linkedlist.add(e(bytebuffer));
        if (true) goto _L2; else goto _L1
_L1:
        a2;
        bytebuffer.reset();
        g = ByteBuffer.allocate(a(a2.a()));
        g.put(bytebuffer);
        return linkedlist;
    }

    public p.dz.a c()
    {
        return new b();
    }

    public d e(ByteBuffer bytebuffer)
        throws a, p.ea.b
    {
        int k = 2;
        boolean flag1 = false;
        int i1 = bytebuffer.remaining();
        if (i1 < 2)
        {
            throw new a(2);
        }
        byte byte0 = bytebuffer.get();
        int j;
        boolean flag2;
        if (byte0 >> 8 != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j = (byte)((byte0 & 0x7f) >> 4);
        if (j != 0)
        {
            throw new c((new StringBuilder()).append("bad rsv ").append(j).toString());
        }
        j = bytebuffer.get();
        p.eb.d.a a1;
        boolean flag;
        if ((j & 0xffffff80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = (byte)(j & 0x7f);
        a1 = a((byte)(byte0 & 0xf));
        if (!flag2 && (a1 == p.eb.d.a.d || a1 == p.eb.d.a.e || a1 == p.eb.d.a.f))
        {
            throw new c("control frames may no be fragmented");
        }
        if (j < 0 || j > 125)
        {
            if (a1 == p.eb.d.a.d || a1 == p.eb.d.a.e || a1 == p.eb.d.a.f)
            {
                throw new c("more than 125 octets");
            }
            if (j == 126)
            {
                if (i1 < 4)
                {
                    throw new a(4);
                }
                byte abyte0[] = new byte[3];
                abyte0[1] = bytebuffer.get();
                abyte0[2] = bytebuffer.get();
                j = (new BigInteger(abyte0)).intValue();
                k = 4;
            } else
            {
                if (i1 < 10)
                {
                    throw new a(10);
                }
                byte abyte1[] = new byte[8];
                for (j = 0; j < 8; j++)
                {
                    abyte1[j] = bytebuffer.get();
                }

                long l1 = (new BigInteger(abyte1)).longValue();
                if (l1 > 0x7fffffffL)
                {
                    throw new p.ea.e("Payloadsize is to big...");
                }
                j = (int)l1;
                k = 10;
            }
        }
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        k = byte0 + k + j;
        if (i1 < k)
        {
            throw new a(k);
        }
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(j));
        if (flag)
        {
            byte abyte2[] = new byte[4];
            bytebuffer.get(abyte2);
            for (int l = ((flag1) ? 1 : 0); l < j; l++)
            {
                bytebuffer1.put((byte)(bytebuffer.get() ^ abyte2[l % 4]));
            }

        } else
        {
            bytebuffer1.put(bytebuffer.array(), bytebuffer.position(), bytebuffer1.limit());
            bytebuffer.position(bytebuffer.position() + bytebuffer1.limit());
        }
        if (a1 == p.eb.d.a.f)
        {
            bytebuffer = new p.eb.b();
        } else
        {
            bytebuffer = new e();
            bytebuffer.a(flag2);
            bytebuffer.a(a1);
        }
        bytebuffer1.flip();
        bytebuffer.a(bytebuffer1);
        return bytebuffer;
    }

    static 
    {
        boolean flag;
        if (!p/dz/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
