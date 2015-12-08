// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.b;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.java_websocket.c;
import org.java_websocket.c.b;
import org.java_websocket.c.d;
import org.java_websocket.e.e;
import org.java_websocket.e.f;
import org.java_websocket.e.h;
import org.java_websocket.e.i;
import org.java_websocket.util.Charsetfunctions;

public abstract class a
{

    public static int a = 1000;
    public static int b = 64;
    public static final byte c[] = Charsetfunctions.a("<policy-file-request/>\0");
    protected int d;
    protected org.java_websocket.d.e e;

    public a()
    {
        d = 0;
        e = null;
    }

    public static int a(int j)
    {
        if (j < 0)
        {
            throw new b(1002, "Negative count");
        } else
        {
            return j;
        }
    }

    public static org.java_websocket.e.c a(ByteBuffer bytebuffer, int j)
    {
        Object obj = c(bytebuffer);
        if (obj == null)
        {
            throw new org.java_websocket.c.a(bytebuffer.capacity() + 128);
        }
        Object obj1 = ((String) (obj)).split(" ", 3);
        if (obj1.length != 3)
        {
            throw new d();
        }
        if (j == c.a)
        {
            obj = new e();
            i k = (i)obj;
            k.a(Short.parseShort(obj1[1]));
            k.a(obj1[2]);
        } else
        {
            obj = new org.java_websocket.e.d();
            ((org.java_websocket.e.b) (obj)).a(obj1[1]);
        }
        do
        {
            obj1 = c(bytebuffer);
            if (obj1 == null || ((String) (obj1)).length() <= 0)
            {
                break;
            }
            obj1 = ((String) (obj1)).split(":", 2);
            if (obj1.length != 2)
            {
                throw new d("not an http header");
            }
            ((org.java_websocket.e.c) (obj)).a(obj1[0], obj1[1].replaceFirst("^ +", ""));
        } while (true);
        if (obj1 == null)
        {
            throw new org.java_websocket.c.a();
        } else
        {
            return ((org.java_websocket.e.c) (obj));
        }
    }

    protected static boolean a(f f1)
    {
        return f1.b("Upgrade").equalsIgnoreCase("websocket") && f1.b("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public static List b(f f1)
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        if (f1 instanceof org.java_websocket.e.a)
        {
            stringbuilder.append("GET ");
            stringbuilder.append(((org.java_websocket.e.a)f1).a());
            stringbuilder.append(" HTTP/1.1");
        } else
        if (f1 instanceof h)
        {
            stringbuilder.append((new StringBuilder("HTTP/1.1 101 ")).append(((h)f1).a()).toString());
        } else
        {
            throw new RuntimeException("unknow role");
        }
        stringbuilder.append("\r\n");
        for (Iterator iterator = f1.b(); iterator.hasNext(); stringbuilder.append("\r\n"))
        {
            String s = (String)iterator.next();
            String s1 = f1.b(s);
            stringbuilder.append(s);
            stringbuilder.append(": ");
            stringbuilder.append(s1);
        }

        stringbuilder.append("\r\n");
        byte abyte0[] = Charsetfunctions.b(stringbuilder.toString());
        f1 = f1.c();
        ByteBuffer bytebuffer;
        int j;
        if (f1 == null)
        {
            j = 0;
        } else
        {
            j = f1.length;
        }
        bytebuffer = ByteBuffer.allocate(j + abyte0.length);
        bytebuffer.put(abyte0);
        if (f1 != null)
        {
            bytebuffer.put(f1);
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
            return Charsetfunctions.a(bytebuffer.array(), bytebuffer.limit());
        }
        byte1 = byte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract int a(org.java_websocket.e.a a1);

    public abstract int a(org.java_websocket.e.a a1, h h1);

    public abstract ByteBuffer a(org.java_websocket.d.d d1);

    public abstract List a(ByteBuffer bytebuffer);

    public abstract org.java_websocket.e.b a(org.java_websocket.e.b b1);

    public abstract org.java_websocket.e.c a(org.java_websocket.e.a a1, i j);

    public abstract void a();

    public abstract int b();

    public f b(ByteBuffer bytebuffer)
    {
        return a(bytebuffer, d);
    }

    public final void b(int j)
    {
        d = j;
    }

    public abstract a c();

}
