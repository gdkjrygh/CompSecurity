// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.b;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.java_websocket.c.c;
import org.java_websocket.c.d;
import org.java_websocket.d.b;
import org.java_websocket.d.e;
import org.java_websocket.e.a;
import org.java_websocket.e.f;
import org.java_websocket.e.i;

// Referenced classes of package org.java_websocket.b:
//            g, c, b, a

public final class h extends g
{

    private static final byte j[] = {
        -1, 0
    };
    private boolean i;
    private final Random k = new Random();

    public h()
    {
        i = false;
    }

    private static byte[] a(String s)
    {
        long l;
        long l1;
        try
        {
            l = Long.parseLong(s.replaceAll("[^0-9]", ""));
            l1 = s.split(" ").length - 1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new d("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        throw new d("invalid Sec-WebSocket-Key (/key2/)");
        l = (new Long(l / l1)).longValue();
        byte byte0 = (byte)(int)(l >> 24);
        byte byte1 = (byte)(int)((l << 8) >> 24);
        byte byte2 = (byte)(int)((l << 16) >> 24);
        byte byte3 = (byte)(int)((l << 24) >> 24);
        return (new byte[] {
            byte0, byte1, byte2, byte3
        });
    }

    private static byte[] a(String s, String s1, byte abyte0[])
    {
        s = a(s);
        s1 = a(s1);
        byte byte0 = s[0];
        byte byte1 = s[1];
        byte byte2 = s[2];
        byte byte3 = s[3];
        byte byte4 = s1[0];
        byte byte5 = s1[1];
        byte byte6 = s1[2];
        byte byte7 = s1[3];
        byte byte8 = abyte0[0];
        byte byte9 = abyte0[1];
        byte byte10 = abyte0[2];
        byte byte11 = abyte0[3];
        byte byte12 = abyte0[4];
        byte byte13 = abyte0[5];
        byte byte14 = abyte0[6];
        byte byte15 = abyte0[7];
        try
        {
            s = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s.digest(new byte[] {
            byte0, byte1, byte2, byte3, byte4, byte5, byte6, byte7, byte8, byte9, 
            byte10, byte11, byte12, byte13, byte14, byte15
        });
    }

    private static String d()
    {
        Random random = new Random();
        long l2 = random.nextInt(12) + 1;
        String s = Long.toString((long)(random.nextInt(Math.abs((new Long(0xffffffffL / l2)).intValue())) + 1) * l2);
        int j1 = random.nextInt(12);
        for (int l = 0; l < j1 + 1; l++)
        {
            int l1 = Math.abs(random.nextInt(s.length()));
            char c2 = (char)(random.nextInt(95) + 33);
            char c1 = c2;
            if (c2 >= '0')
            {
                c1 = c2;
                if (c2 <= '9')
                {
                    c1 = (char)(c2 - 15);
                }
            }
            s = (new StringBuilder(s)).insert(l1, c1).toString();
        }

        for (int i1 = 0; (long)i1 < l2; i1++)
        {
            int k1 = Math.abs(random.nextInt(s.length() - 1) + 1);
            s = (new StringBuilder(s)).insert(k1, " ").toString();
        }

        return s;
    }

    public final int a(a a1)
    {
        if (a1.b("Upgrade").equals("WebSocket") && a1.b("Connection").contains("Upgrade") && a1.b("Sec-WebSocket-Key1").length() > 0 && !a1.b("Sec-WebSocket-Key2").isEmpty() && a1.c("Origin"))
        {
            return org.java_websocket.b.c.a;
        } else
        {
            return org.java_websocket.b.c.b;
        }
    }

    public final int a(a a1, org.java_websocket.e.h h1)
    {
        if (i)
        {
            return org.java_websocket.b.c.b;
        }
        try
        {
            if (!h1.b("Sec-WebSocket-Origin").equals(a1.b("Origin")) || !a(((f) (h1))))
            {
                return org.java_websocket.b.c.b;
            }
            h1 = h1.c();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new RuntimeException("bad handshakerequest", a1);
        }
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (h1.length != 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        throw new org.java_websocket.c.a();
        int l;
        if (Arrays.equals(h1, a(a1.b("Sec-WebSocket-Key1"), a1.b("Sec-WebSocket-Key2"), a1.c())))
        {
            return org.java_websocket.b.c.a;
        }
        l = org.java_websocket.b.c.b;
        return l;
    }

    public final ByteBuffer a(org.java_websocket.d.d d1)
    {
        if (d1.f() == e.f)
        {
            return ByteBuffer.wrap(j);
        } else
        {
            return super.a(d1);
        }
    }

    public final List a(ByteBuffer bytebuffer)
    {
        List list;
label0:
        {
label1:
            {
                bytebuffer.mark();
                List list1 = super.c(bytebuffer);
                list = list1;
                if (list1 == null)
                {
                    bytebuffer.reset();
                    list = g;
                    f = true;
                    if (h == null)
                    {
                        h = ByteBuffer.allocate(2);
                        if (bytebuffer.remaining() > h.remaining())
                        {
                            throw new c();
                        }
                    } else
                    {
                        throw new c();
                    }
                    h.put(bytebuffer);
                    if (h.hasRemaining())
                    {
                        break label0;
                    }
                    if (!Arrays.equals(h.array(), j))
                    {
                        break label1;
                    }
                    list.add(new b((byte)0));
                }
                return list;
            }
            throw new c();
        }
        g = new LinkedList();
        return list;
    }

    public final org.java_websocket.e.b a(org.java_websocket.e.b b1)
    {
        b1.a("Upgrade", "WebSocket");
        b1.a("Connection", "Upgrade");
        b1.a("Sec-WebSocket-Key1", d());
        b1.a("Sec-WebSocket-Key2", d());
        if (!b1.c("Origin"))
        {
            b1.a("Origin", (new StringBuilder("random")).append(k.nextInt()).toString());
        }
        byte abyte0[] = new byte[8];
        k.nextBytes(abyte0);
        b1.a(abyte0);
        return b1;
    }

    public final org.java_websocket.e.c a(a a1, i l)
    {
        l.a("WebSocket Protocol Handshake");
        l.a("Upgrade", "WebSocket");
        l.a("Connection", a1.b("Connection"));
        l.a("Sec-WebSocket-Origin", a1.b("Origin"));
        l.a("Sec-WebSocket-Location", (new StringBuilder("ws://")).append(a1.b("Host")).append(a1.a()).toString());
        String s = a1.b("Sec-WebSocket-Key1");
        String s1 = a1.b("Sec-WebSocket-Key2");
        a1 = a1.c();
        if (s == null || s1 == null || a1 == null || a1.length != 8)
        {
            throw new d("Bad keys");
        } else
        {
            l.a(a(s, s1, ((byte []) (a1))));
            return l;
        }
    }

    public final int b()
    {
        return org.java_websocket.b.b.b;
    }

    public final f b(ByteBuffer bytebuffer)
    {
        org.java_websocket.e.c c1 = a(bytebuffer, d);
        if ((c1.c("Sec-WebSocket-Key1") || d == org.java_websocket.c.a) && !c1.c("Sec-WebSocket-Version"))
        {
            byte abyte0[];
            byte byte0;
            if (d == org.java_websocket.c.b)
            {
                byte0 = 8;
            } else
            {
                byte0 = 16;
            }
            abyte0 = new byte[byte0];
            try
            {
                bytebuffer.get(abyte0);
            }
            catch (BufferUnderflowException bufferunderflowexception)
            {
                throw new org.java_websocket.c.a(bytebuffer.capacity() + 16);
            }
            c1.a(abyte0);
        }
        return c1;
    }

    public final org.java_websocket.b.a c()
    {
        return new h();
    }

}
