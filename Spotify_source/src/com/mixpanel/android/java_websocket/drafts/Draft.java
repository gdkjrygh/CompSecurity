// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;

import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import cwi;
import cwj;
import cwk;
import cwl;
import cwm;
import cwn;
import cwo;
import cwp;
import cwr;
import cws;
import cwu;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class Draft
{

    public static int a = 64;
    public static final byte b[] = cwu.a("<policy-file-request/>\0");
    public com.mixpanel.android.java_websocket.WebSocket.Role c;
    private com.mixpanel.android.java_websocket.framing.Framedata.Opcode d;

    public Draft()
    {
        c = null;
        d = null;
    }

    public static int a(int i)
    {
        if (i < 0)
        {
            throw new InvalidDataException(1002, "Negative count");
        } else
        {
            return i;
        }
    }

    public static cwm a(ByteBuffer bytebuffer, com.mixpanel.android.java_websocket.WebSocket.Role role)
    {
        Object obj = c(bytebuffer);
        if (obj == null)
        {
            throw new IncompleteHandshakeException(bytebuffer.capacity() + 128);
        }
        obj = ((String) (obj)).split(" ", 3);
        if (obj.length != 3)
        {
            throw new InvalidHandshakeException();
        }
        if (role == com.mixpanel.android.java_websocket.WebSocket.Role.a)
        {
            role = new cwo();
            cws cws1 = (cws)role;
            Short.parseShort(obj[1]);
            cws1.a(obj[2]);
        } else
        {
            role = new cwn();
            role.a(obj[1]);
        }
        do
        {
            obj = c(bytebuffer);
            if (obj == null || ((String) (obj)).length() <= 0)
            {
                break;
            }
            obj = ((String) (obj)).split(":", 2);
            if (obj.length != 2)
            {
                throw new InvalidHandshakeException("not an http header");
            }
            role.a(obj[0], obj[1].replaceFirst("^ +", ""));
        } while (true);
        if (obj == null)
        {
            throw new IncompleteHandshakeException();
        } else
        {
            return role;
        }
    }

    public static boolean a(cwp cwp1)
    {
        return cwp1.b("Upgrade").equalsIgnoreCase("websocket") && cwp1.b("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public static List b(cwp cwp1)
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        if (cwp1 instanceof cwk)
        {
            stringbuilder.append("GET ");
            stringbuilder.append(((cwk)cwp1).a());
            stringbuilder.append(" HTTP/1.1");
        } else
        if (cwp1 instanceof cwr)
        {
            stringbuilder.append((new StringBuilder("HTTP/1.1 101 ")).append(((cwr)cwp1).a()).toString());
        } else
        {
            throw new RuntimeException("unknow role");
        }
        stringbuilder.append("\r\n");
        for (Iterator iterator = cwp1.b(); iterator.hasNext(); stringbuilder.append("\r\n"))
        {
            String s = (String)iterator.next();
            String s1 = cwp1.b(s);
            stringbuilder.append(s);
            stringbuilder.append(": ");
            stringbuilder.append(s1);
        }

        stringbuilder.append("\r\n");
        byte abyte0[] = cwu.b(stringbuilder.toString());
        cwp1 = cwp1.c();
        ByteBuffer bytebuffer;
        int i;
        if (cwp1 == null)
        {
            i = 0;
        } else
        {
            i = cwp1.length;
        }
        bytebuffer = ByteBuffer.allocate(i + abyte0.length);
        bytebuffer.put(abyte0);
        if (cwp1 != null)
        {
            bytebuffer.put(cwp1);
        }
        bytebuffer.flip();
        return Collections.singletonList(bytebuffer);
    }

    private static String c(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1;
        byte byte1;
        bytebuffer1 = ByteBuffer.allocate(bytebuffer.remaining());
        byte1 = 48;
_L2:
        byte byte0;
        if (bytebuffer.hasRemaining())
        {
            byte0 = bytebuffer.get();
            bytebuffer1.put(byte0);
            if (byte1 != 13 || byte0 != 10)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            bytebuffer1.limit(bytebuffer1.position() - 2);
            bytebuffer1.position(0);
            bytebuffer = bytebuffer1;
        } else
        {
            bytebuffer.position(bytebuffer.position() - bytebuffer1.position());
            bytebuffer = null;
        }
        if (bytebuffer == null)
        {
            return null;
        } else
        {
            return cwu.a(bytebuffer.array(), bytebuffer.limit());
        }
        byte1 = byte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract HandshakeState a(cwk cwk1);

    public abstract HandshakeState a(cwk cwk1, cwr cwr1);

    public abstract cwl a(cwl cwl1);

    public abstract cwm a(cwk cwk1, cws cws1);

    public abstract ByteBuffer a(Framedata framedata);

    public final List a(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode, ByteBuffer bytebuffer, boolean flag)
    {
        if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.c && opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b && opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b)
        {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        cwj cwj1;
        if (d != null)
        {
            d = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.a;
        } else
        {
            d = opcode;
        }
        cwj1 = new cwj(d);
        try
        {
            cwj1.a(bytebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode)
        {
            throw new RuntimeException(opcode);
        }
        cwj1.a(flag);
        if (flag)
        {
            d = null;
        } else
        {
            d = opcode;
        }
        return Collections.singletonList(cwj1);
    }

    public abstract List a(ByteBuffer bytebuffer);

    public abstract void a();

    public final void a(com.mixpanel.android.java_websocket.WebSocket.Role role)
    {
        c = role;
    }

    public abstract CloseHandshakeType b();

    public cwp b(ByteBuffer bytebuffer)
    {
        return a(bytebuffer, c);
    }

    public abstract Draft c();

}
