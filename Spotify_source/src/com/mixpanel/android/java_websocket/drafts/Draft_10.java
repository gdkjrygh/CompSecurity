// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;

import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.LimitExedeedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import cwh;
import cwi;
import cwj;
import cwk;
import cwl;
import cwm;
import cwp;
import cwr;
import cws;
import cwt;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.mixpanel.android.java_websocket.drafts:
//            Draft

public class Draft_10 extends Draft
{

    private static boolean f;
    private ByteBuffer d;
    private final Random e = new Random();

    public Draft_10()
    {
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
        return cwt.a(messagedigest.digest(s.getBytes()));
    }

    private static byte[] a(long l, int i)
    {
        byte abyte0[] = new byte[i];
        for (int j = 0; j < i; j++)
        {
            abyte0[j] = (byte)(int)(l >>> (i << 3) - 8 - (j << 3));
        }

        return abyte0;
    }

    public static int c(cwp cwp1)
    {
        int i = -1;
        cwp1 = cwp1.b("Sec-WebSocket-Version");
        if (cwp1.length() > 0)
        {
            try
            {
                i = (new Integer(cwp1.trim())).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (cwp cwp1)
            {
                return -1;
            }
        }
        return i;
    }

    private Framedata c(ByteBuffer bytebuffer)
    {
        int i;
        int j;
        boolean flag;
        boolean flag1;
        int k;
        boolean flag2;
        j = 10;
        flag1 = false;
        k = bytebuffer.remaining();
        if (k < 2)
        {
            throw new IncompleteException(2);
        }
        byte byte0 = bytebuffer.get();
        if (byte0 >> 8 != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i = (byte)((byte0 & 0x7f) >> 4);
        if (i != 0)
        {
            throw new InvalidFrameException((new StringBuilder("bad rsv ")).append(i).toString());
        }
        i = bytebuffer.get();
        if ((i & 0xffffff80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = (byte)(i & 0x7f);
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
        throw new InvalidFrameException((new StringBuilder("unknow optcode ")).append((short)byte0).toString());
_L2:
        com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.a;
_L9:
        if (!flag2 && (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.d || opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.e || opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f))
        {
            throw new InvalidFrameException("control frames may no be fragmented");
        }
        break; /* Loop/switch isn't completed */
_L3:
        opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b;
        continue; /* Loop/switch isn't completed */
_L4:
        opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.c;
        continue; /* Loop/switch isn't completed */
_L5:
        opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f;
        continue; /* Loop/switch isn't completed */
_L6:
        opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.d;
        continue; /* Loop/switch isn't completed */
_L7:
        opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.e;
        if (true) goto _L9; else goto _L8
_L8:
        ByteBuffer bytebuffer1;
        byte byte1;
        if (i < 0 || i > 125)
        {
            if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.d || opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.e || opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f)
            {
                throw new InvalidFrameException("more than 125 octets");
            }
            if (i == 126)
            {
                if (k < 4)
                {
                    throw new IncompleteException(4);
                }
                byte abyte0[] = new byte[3];
                abyte0[1] = bytebuffer.get();
                abyte0[2] = bytebuffer.get();
                i = (new BigInteger(abyte0)).intValue();
                j = 4;
            } else
            {
                if (k < 10)
                {
                    throw new IncompleteException(10);
                }
                byte abyte1[] = new byte[8];
                for (i = 0; i < 8; i++)
                {
                    abyte1[i] = bytebuffer.get();
                }

                long l = (new BigInteger(abyte1)).longValue();
                if (l > 0x7fffffffL)
                {
                    throw new LimitExedeedException("Payloadsize is to big...");
                }
                i = (int)l;
            }
        } else
        {
            j = 2;
        }
        if (flag)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        j = byte1 + j + i;
        if (k < j)
        {
            throw new IncompleteException(j);
        }
        bytebuffer1 = ByteBuffer.allocate(a(i));
        if (flag)
        {
            byte abyte2[] = new byte[4];
            bytebuffer.get(abyte2);
            for (j = ((flag1) ? 1 : 0); j < i; j++)
            {
                bytebuffer1.put((byte)(bytebuffer.get() ^ abyte2[j % 4]));
            }

        } else
        {
            bytebuffer1.put(bytebuffer.array(), bytebuffer.position(), bytebuffer1.limit());
            bytebuffer.position(bytebuffer.position() + bytebuffer1.limit());
        }
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f)
        {
            bytebuffer = new cwh();
        } else
        {
            bytebuffer = new cwj();
            bytebuffer.a(flag2);
            bytebuffer.a(opcode);
        }
        bytebuffer1.flip();
        bytebuffer.a(bytebuffer1);
        return bytebuffer;
    }

    public Draft.HandshakeState a(cwk cwk1)
    {
        int i = c(cwk1);
        if (i == 7 || i == 8)
        {
            if (a(((cwp) (cwk1))))
            {
                return Draft.HandshakeState.a;
            } else
            {
                return Draft.HandshakeState.b;
            }
        } else
        {
            return Draft.HandshakeState.b;
        }
    }

    public final Draft.HandshakeState a(cwk cwk1, cwr cwr1)
    {
        if (!cwk1.c("Sec-WebSocket-Key") || !cwr1.c("Sec-WebSocket-Accept"))
        {
            return Draft.HandshakeState.b;
        }
        cwr1 = cwr1.b("Sec-WebSocket-Accept");
        if (a(cwk1.b("Sec-WebSocket-Key")).equals(cwr1))
        {
            return Draft.HandshakeState.a;
        } else
        {
            return Draft.HandshakeState.b;
        }
    }

    public cwl a(cwl cwl1)
    {
        cwl1.a("Upgrade", "websocket");
        cwl1.a("Connection", "Upgrade");
        cwl1.a("Sec-WebSocket-Version", "8");
        byte abyte0[] = new byte[16];
        e.nextBytes(abyte0);
        cwl1.a("Sec-WebSocket-Key", cwt.a(abyte0));
        return cwl1;
    }

    public final cwm a(cwk cwk1, cws cws1)
    {
        cws1.a("Upgrade", "websocket");
        cws1.a("Connection", cwk1.b("Connection"));
        cws1.a("Switching Protocols");
        cwk1 = cwk1.b("Sec-WebSocket-Key");
        if (cwk1 == null)
        {
            throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
        } else
        {
            cws1.a("Sec-WebSocket-Accept", a(((String) (cwk1))));
            return cws1;
        }
    }

    public final ByteBuffer a(Framedata framedata)
    {
        byte byte0 = -128;
        boolean flag1 = false;
        ByteBuffer bytebuffer = framedata.c();
        ByteBuffer bytebuffer1;
        com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode;
        int i;
        int k;
        boolean flag;
        int l;
        if (c == com.mixpanel.android.java_websocket.WebSocket.Role.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bytebuffer.remaining() <= 125)
        {
            k = 1;
        } else
        if (bytebuffer.remaining() <= 65535)
        {
            k = 2;
        } else
        {
            k = 8;
        }
        if (k > 1)
        {
            i = k + 1;
        } else
        {
            i = k;
        }
        if (flag)
        {
            l = 4;
        } else
        {
            l = 0;
        }
        bytebuffer1 = ByteBuffer.allocate(l + (i + 1) + bytebuffer.remaining());
        opcode = framedata.f();
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.a)
        {
            i = 0;
        } else
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b)
        {
            i = 1;
        } else
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.c)
        {
            i = 2;
        } else
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f)
        {
            i = 8;
        } else
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.d)
        {
            i = 9;
        } else
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.e)
        {
            i = 10;
        } else
        {
            throw new RuntimeException((new StringBuilder("Don't know how to handle ")).append(opcode.toString()).toString());
        }
        if (framedata.d())
        {
            l = -128;
        } else
        {
            l = 0;
        }
        bytebuffer1.put((byte)(i | (byte)l));
        framedata = a(bytebuffer.remaining(), k);
        if (!f && framedata.length != k)
        {
            throw new AssertionError();
        }
        if (k == 1)
        {
            int j = framedata[0];
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(j | byte0));
        } else
        if (k == 2)
        {
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(byte0 | 0x7e));
            bytebuffer1.put(framedata);
        } else
        if (k == 8)
        {
            if (!flag)
            {
                byte0 = 0;
            }
            bytebuffer1.put((byte)(byte0 | 0x7f));
            bytebuffer1.put(framedata);
        } else
        {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (flag)
        {
            framedata = ByteBuffer.allocate(4);
            framedata.putInt(e.nextInt());
            bytebuffer1.put(framedata.array());
            for (j = ((flag1) ? 1 : 0); bytebuffer.hasRemaining(); j++)
            {
                bytebuffer1.put((byte)(bytebuffer.get() ^ framedata.get(j % 4)));
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
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        int i;
        int j;
        bytebuffer.mark();
        i = bytebuffer.remaining();
        j = d.remaining();
        if (j <= i)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        d.put(bytebuffer.array(), bytebuffer.position(), i);
        bytebuffer.position(i + bytebuffer.position());
        return Collections.emptyList();
        d.put(bytebuffer.array(), bytebuffer.position(), j);
        bytebuffer.position(bytebuffer.position() + j);
        linkedlist.add(c((ByteBuffer)d.duplicate().position(0)));
        d = null;
_L2:
        if (!bytebuffer.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_192;
        }
        bytebuffer.mark();
        linkedlist.add(c(bytebuffer));
        if (true) goto _L2; else goto _L1
_L1:
        IncompleteException incompleteexception1;
        incompleteexception1;
        bytebuffer.reset();
        d = ByteBuffer.allocate(a(incompleteexception1.preferedsize));
        d.put(bytebuffer);
        return linkedlist;
        IncompleteException incompleteexception;
        incompleteexception;
        d.limit();
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(incompleteexception.preferedsize));
        if (!f && bytebuffer1.limit() <= d.limit())
        {
            throw new AssertionError();
        }
        d.rewind();
        bytebuffer1.put(d);
        d = bytebuffer1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        d = null;
    }

    public final Draft.CloseHandshakeType b()
    {
        return Draft.CloseHandshakeType.c;
    }

    public Draft c()
    {
        return new Draft_10();
    }

    static 
    {
        boolean flag;
        if (!com/mixpanel/android/java_websocket/drafts/Draft_10.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    private class IncompleteException extends Throwable
    {

        private static final long serialVersionUID = 0x65bb3ca323055105L;
        int preferedsize;
        final Draft_10 this$0;

        public IncompleteException(int i)
        {
            this$0 = Draft_10.this;
            super();
            preferedsize = i;
        }
    }

}
