// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class cwf extends cwe
{

    private static final byte g[] = {
        -1, 0
    };
    private final Random h = new Random();

    public cwf()
    {
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
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
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
        long l1 = random.nextInt(12) + 1;
        String s = Long.toString((long)(random.nextInt(Math.abs((new Long(0xffffffffL / l1)).intValue())) + 1) * l1);
        int k = random.nextInt(12);
        for (int i = 0; i < k + 1; i++)
        {
            int i1 = Math.abs(random.nextInt(s.length()));
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
            s = (new StringBuilder(s)).insert(i1, c1).toString();
        }

        for (int j = 0; (long)j < l1; j++)
        {
            int l = Math.abs(random.nextInt(s.length() - 1) + 1);
            s = (new StringBuilder(s)).insert(l, " ").toString();
        }

        return s;
    }

    public final com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState a(cwk cwk1)
    {
        if (cwk1.b("Upgrade").equals("WebSocket") && cwk1.b("Connection").contains("Upgrade") && cwk1.b("Sec-WebSocket-Key1").length() > 0 && !cwk1.b("Sec-WebSocket-Key2").isEmpty() && cwk1.c("Origin"))
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        } else
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
        }
    }

    public final com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState a(cwk cwk1, cwr cwr1)
    {
        try
        {
            if (!cwr1.b("Sec-WebSocket-Origin").equals(cwk1.b("Origin")) || !a(((cwp) (cwr1))))
            {
                return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
            }
            cwr1 = cwr1.c();
        }
        // Misplaced declaration of an exception variable
        catch (cwk cwk1)
        {
            throw new RuntimeException("bad handshakerequest", cwk1);
        }
        if (cwr1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (cwr1.length != 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        throw new IncompleteHandshakeException();
        if (Arrays.equals(cwr1, a(cwk1.b("Sec-WebSocket-Key1"), cwk1.b("Sec-WebSocket-Key2"), cwk1.c())))
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        }
        cwk1 = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
        return cwk1;
    }

    public final cwl a(cwl cwl1)
    {
        cwl1.a("Upgrade", "WebSocket");
        cwl1.a("Connection", "Upgrade");
        cwl1.a("Sec-WebSocket-Key1", d());
        cwl1.a("Sec-WebSocket-Key2", d());
        if (!cwl1.c("Origin"))
        {
            cwl1.a("Origin", (new StringBuilder("random")).append(h.nextInt()).toString());
        }
        byte abyte0[] = new byte[8];
        h.nextBytes(abyte0);
        cwl1.a(abyte0);
        return cwl1;
    }

    public final cwm a(cwk cwk1, cws cws1)
    {
        cws1.a("WebSocket Protocol Handshake");
        cws1.a("Upgrade", "WebSocket");
        cws1.a("Connection", cwk1.b("Connection"));
        cws1.a("Sec-WebSocket-Origin", cwk1.b("Origin"));
        cws1.a("Sec-WebSocket-Location", (new StringBuilder("ws://")).append(cwk1.b("Host")).append(cwk1.a()).toString());
        String s = cwk1.b("Sec-WebSocket-Key1");
        String s1 = cwk1.b("Sec-WebSocket-Key2");
        cwk1 = cwk1.c();
        if (s == null || s1 == null || cwk1 == null || cwk1.length != 8)
        {
            throw new InvalidHandshakeException("Bad keys");
        } else
        {
            cws1.a(a(s, s1, ((byte []) (cwk1))));
            return cws1;
        }
    }

    public final ByteBuffer a(Framedata framedata)
    {
        if (framedata.f() == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f)
        {
            return ByteBuffer.wrap(g);
        } else
        {
            return super.a(framedata);
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
                    list = e;
                    d = true;
                    if (f == null)
                    {
                        f = ByteBuffer.allocate(2);
                        if (bytebuffer.remaining() > f.remaining())
                        {
                            throw new InvalidFrameException();
                        }
                    } else
                    {
                        throw new InvalidFrameException();
                    }
                    f.put(bytebuffer);
                    if (f.hasRemaining())
                    {
                        break label0;
                    }
                    if (!Arrays.equals(f.array(), g))
                    {
                        break label1;
                    }
                    list.add(new cwh((byte)0));
                }
                return list;
            }
            throw new InvalidFrameException();
        }
        e = new LinkedList();
        return list;
    }

    public final com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType b()
    {
        return com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.b;
    }

    public final cwp b(ByteBuffer bytebuffer)
    {
        cwm cwm1 = a(bytebuffer, c);
        if ((cwm1.c("Sec-WebSocket-Key1") || c == com.mixpanel.android.java_websocket.WebSocket.Role.a) && !cwm1.c("Sec-WebSocket-Version"))
        {
            byte abyte0[];
            byte byte0;
            if (c == com.mixpanel.android.java_websocket.WebSocket.Role.b)
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
                throw new IncompleteHandshakeException(bytebuffer.capacity() + 16);
            }
            cwm1.a(abyte0);
        }
        return cwm1;
    }

    public final Draft c()
    {
        return new cwf();
    }

}
