// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.b;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.java_websocket.c.c;
import org.java_websocket.d.b;
import org.java_websocket.d.e;
import org.java_websocket.e.f;
import org.java_websocket.e.h;
import org.java_websocket.e.i;
import org.java_websocket.util.a;

// Referenced classes of package org.java_websocket.b:
//            a, e, c, b

public class d extends org.java_websocket.b.a
{

    static final boolean f;
    private ByteBuffer g;
    private org.java_websocket.d.d h;
    private final Random i = new Random();

    public d()
    {
        h = null;
    }

    private static String a(String s)
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
        return org.java_websocket.util.a.a(messagedigest.digest(s.getBytes()));
    }

    private static byte[] a(long l, int j)
    {
        byte abyte0[] = new byte[j];
        for (int k = 0; k < j; k++)
        {
            abyte0[k] = (byte)(int)(l >>> j * 8 - 8 - k * 8);
        }

        return abyte0;
    }

    public static int c(f f1)
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

    private org.java_websocket.d.d c(ByteBuffer bytebuffer)
    {
        int j;
        int k;
        boolean flag;
        boolean flag1;
        int l;
        boolean flag2;
        k = 10;
        flag1 = false;
        l = bytebuffer.remaining();
        if (l < 2)
        {
            throw new org.java_websocket.b.e(this, 2);
        }
        byte byte0 = bytebuffer.get();
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
            throw new c((new StringBuilder("bad rsv ")).append(j).toString());
        }
        j = bytebuffer.get();
        if ((j & 0xffffff80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = (byte)(j & 0x7f);
        byte0 &= 0xf;
        byte0;
        JVM INSTR tableswitch 0 10: default 184
    //                   0 216
    //                   1 256
    //                   2 263
    //                   3 184
    //                   4 184
    //                   5 184
    //                   6 184
    //                   7 184
    //                   8 270
    //                   9 277
    //                   10 284;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L1 _L1 _L5 _L6 _L7
_L1:
        throw new c((new StringBuilder("unknow optcode ")).append((short)byte0).toString());
_L2:
        e e1 = e.a;
_L9:
        if (!flag2 && (e1 == e.d || e1 == e.e || e1 == e.f))
        {
            throw new c("control frames may no be fragmented");
        }
        break; /* Loop/switch isn't completed */
_L3:
        e1 = e.b;
        continue; /* Loop/switch isn't completed */
_L4:
        e1 = e.c;
        continue; /* Loop/switch isn't completed */
_L5:
        e1 = e.f;
        continue; /* Loop/switch isn't completed */
_L6:
        e1 = e.d;
        continue; /* Loop/switch isn't completed */
_L7:
        e1 = e.e;
        if (true) goto _L9; else goto _L8
_L8:
        ByteBuffer bytebuffer1;
        byte byte1;
        if (j < 0 || j > 125)
        {
            if (e1 == e.d || e1 == e.e || e1 == e.f)
            {
                throw new c("more than 125 octets");
            }
            if (j == 126)
            {
                if (l < 4)
                {
                    throw new org.java_websocket.b.e(this, 4);
                }
                byte abyte0[] = new byte[3];
                abyte0[1] = bytebuffer.get();
                abyte0[2] = bytebuffer.get();
                j = (new BigInteger(abyte0)).intValue();
                k = 4;
            } else
            {
                if (l < 10)
                {
                    throw new org.java_websocket.b.e(this, 10);
                }
                byte abyte1[] = new byte[8];
                for (j = 0; j < 8; j++)
                {
                    abyte1[j] = bytebuffer.get();
                }

                long l1 = (new BigInteger(abyte1)).longValue();
                if (l1 > 0x7fffffffL)
                {
                    throw new org.java_websocket.c.e("Payloadsize is to big...");
                }
                j = (int)l1;
            }
        } else
        {
            k = 2;
        }
        if (flag)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        k = byte1 + k + j;
        if (l < k)
        {
            throw new org.java_websocket.b.e(this, k);
        }
        bytebuffer1 = ByteBuffer.allocate(a(j));
        if (flag)
        {
            byte abyte2[] = new byte[4];
            bytebuffer.get(abyte2);
            for (k = ((flag1) ? 1 : 0); k < j; k++)
            {
                bytebuffer1.put((byte)(bytebuffer.get() ^ abyte2[k % 4]));
            }

        } else
        {
            bytebuffer1.put(bytebuffer.array(), bytebuffer.position(), bytebuffer1.limit());
            bytebuffer.position(bytebuffer.position() + bytebuffer1.limit());
        }
        if (e1 == e.f)
        {
            bytebuffer = new b();
        } else
        {
            bytebuffer = new org.java_websocket.d.f();
            bytebuffer.a(flag2);
            bytebuffer.a(e1);
        }
        bytebuffer1.flip();
        bytebuffer.a(bytebuffer1);
        return bytebuffer;
    }

    public int a(org.java_websocket.e.a a1)
    {
        int j = c(a1);
        if (j == 7 || j == 8)
        {
            if (a(((f) (a1))))
            {
                return org.java_websocket.b.c.a;
            } else
            {
                return org.java_websocket.b.c.b;
            }
        } else
        {
            return org.java_websocket.b.c.b;
        }
    }

    public final int a(org.java_websocket.e.a a1, h h1)
    {
        if (!a1.c("Sec-WebSocket-Key") || !h1.c("Sec-WebSocket-Accept"))
        {
            return org.java_websocket.b.c.b;
        }
        h1 = h1.b("Sec-WebSocket-Accept");
        if (a(a1.b("Sec-WebSocket-Key")).equals(h1))
        {
            return org.java_websocket.b.c.a;
        } else
        {
            return org.java_websocket.b.c.b;
        }
    }

    public final ByteBuffer a(org.java_websocket.d.d d1)
    {
        byte byte0 = -128;
        boolean flag1 = false;
        ByteBuffer bytebuffer = d1.c();
        ByteBuffer bytebuffer1;
        e e1;
        int j;
        int l;
        boolean flag;
        int i1;
        if (d == org.java_websocket.c.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bytebuffer.remaining() <= 125)
        {
            l = 1;
        } else
        if (bytebuffer.remaining() <= 65535)
        {
            l = 2;
        } else
        {
            l = 8;
        }
        if (l > 1)
        {
            j = l + 1;
        } else
        {
            j = l;
        }
        if (flag)
        {
            i1 = 4;
        } else
        {
            i1 = 0;
        }
        bytebuffer1 = ByteBuffer.allocate(i1 + (j + 1) + bytebuffer.remaining());
        e1 = d1.f();
        if (e1 == e.a)
        {
            j = 0;
        } else
        if (e1 == e.b)
        {
            j = 1;
        } else
        if (e1 == e.c)
        {
            j = 2;
        } else
        if (e1 == e.f)
        {
            j = 8;
        } else
        if (e1 == e.d)
        {
            j = 9;
        } else
        if (e1 == e.e)
        {
            j = 10;
        } else
        {
            throw new RuntimeException((new StringBuilder("Don't know how to handle ")).append(e1.toString()).toString());
        }
        if (d1.d())
        {
            i1 = -128;
        } else
        {
            i1 = 0;
        }
        bytebuffer1.put((byte)(j | (byte)i1));
        d1 = a(bytebuffer.remaining(), l);
        if (!f && d1.length != l)
        {
            throw new AssertionError();
        }
        if (l == 1)
        {
            int k = d1[0];
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(k | byte0));
        } else
        if (l == 2)
        {
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(byte0 | 0x7e));
            bytebuffer1.put(d1);
        } else
        if (l == 8)
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
            for (k = ((flag1) ? 1 : 0); bytebuffer.hasRemaining(); k++)
            {
                bytebuffer1.put((byte)(bytebuffer.get() ^ d1.get(k % 4)));
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

    public final List a(ByteBuffer bytebuffer)
    {
_L4:
        LinkedList linkedlist;
        linkedlist = new LinkedList();
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        int j;
        int k;
        bytebuffer.mark();
        j = bytebuffer.remaining();
        k = g.remaining();
        if (k <= j)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        g.put(bytebuffer.array(), bytebuffer.position(), j);
        bytebuffer.position(j + bytebuffer.position());
        return Collections.emptyList();
        g.put(bytebuffer.array(), bytebuffer.position(), k);
        bytebuffer.position(bytebuffer.position() + k);
        linkedlist.add(c((ByteBuffer)g.duplicate().position(0)));
        g = null;
_L2:
        if (!bytebuffer.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_192;
        }
        bytebuffer.mark();
        linkedlist.add(c(bytebuffer));
        if (true) goto _L2; else goto _L1
_L1:
        org.java_websocket.b.e e2;
        e2;
        bytebuffer.reset();
        g = ByteBuffer.allocate(a(e2.a()));
        g.put(bytebuffer);
        return linkedlist;
        org.java_websocket.b.e e1;
        e1;
        g.limit();
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(e1.a()));
        if (!f && bytebuffer1.limit() <= g.limit())
        {
            throw new AssertionError();
        }
        g.rewind();
        bytebuffer1.put(g);
        g = bytebuffer1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public org.java_websocket.e.b a(org.java_websocket.e.b b1)
    {
        b1.a("Upgrade", "websocket");
        b1.a("Connection", "Upgrade");
        b1.a("Sec-WebSocket-Version", "8");
        byte abyte0[] = new byte[16];
        i.nextBytes(abyte0);
        b1.a("Sec-WebSocket-Key", org.java_websocket.util.a.a(abyte0));
        return b1;
    }

    public final org.java_websocket.e.c a(org.java_websocket.e.a a1, i j)
    {
        j.a("Upgrade", "websocket");
        j.a("Connection", a1.b("Connection"));
        j.a("Switching Protocols");
        a1 = a1.b("Sec-WebSocket-Key");
        if (a1 == null)
        {
            throw new org.java_websocket.c.d("missing Sec-WebSocket-Key");
        } else
        {
            j.a("Sec-WebSocket-Accept", a(((String) (a1))));
            return j;
        }
    }

    public final void a()
    {
        g = null;
    }

    public final int b()
    {
        return org.java_websocket.b.b.c;
    }

    public org.java_websocket.b.a c()
    {
        return new d();
    }

    static 
    {
        boolean flag;
        if (!org/java_websocket/b/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
