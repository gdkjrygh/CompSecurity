// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.b;

import com.android.slyce.report.a.c.d;
import com.android.slyce.report.a.d.f;
import com.android.slyce.report.a.e.b;
import com.android.slyce.report.a.e.e;
import com.android.slyce.report.a.e.h;
import com.android.slyce.report.a.e.i;
import com.android.slyce.report.a.f.c;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.android.slyce.report.a.b:
//            c, b

public abstract class a
{

    public static int a = 1000;
    public static int b = 64;
    public static final byte c[] = com.android.slyce.report.a.f.c.a("<policy-file-request/>\0");
    protected com.android.slyce.report.a.c d;
    protected com.android.slyce.report.a.d.e e;

    public a()
    {
        d = null;
        e = null;
    }

    public static com.android.slyce.report.a.e.c a(ByteBuffer bytebuffer, com.android.slyce.report.a.c c1)
    {
        Object obj = b(bytebuffer);
        if (obj == null)
        {
            throw new com.android.slyce.report.a.c.a(bytebuffer.capacity() + 128);
        }
        obj = ((String) (obj)).split(" ", 3);
        if (obj.length != 3)
        {
            throw new d();
        }
        if (c1 == com.android.slyce.report.a.c.a)
        {
            c1 = new e();
            i j = (i)c1;
            j.a(Short.parseShort(obj[1]));
            j.a(obj[2]);
        } else
        {
            c1 = new com.android.slyce.report.a.e.d();
            c1.a(obj[1]);
        }
        for (obj = b(bytebuffer); obj != null && ((String) (obj)).length() > 0; obj = b(bytebuffer))
        {
            obj = ((String) (obj)).split(":", 2);
            if (obj.length != 2)
            {
                throw new d("not an http header");
            }
            c1.a(obj[0], obj[1].replaceFirst("^ +", ""));
        }

        if (obj == null)
        {
            throw new com.android.slyce.report.a.c.a();
        } else
        {
            return c1;
        }
    }

    public static ByteBuffer a(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(bytebuffer.remaining());
        byte byte1 = 48;
        do
        {
            byte byte0;
            if (bytebuffer.hasRemaining())
            {
                byte0 = bytebuffer.get();
                bytebuffer1.put(byte0);
                if (byte1 == 13 && byte0 == 10)
                {
                    bytebuffer1.limit(bytebuffer1.position() - 2);
                    bytebuffer1.position(0);
                    return bytebuffer1;
                }
            } else
            {
                bytebuffer.position(bytebuffer.position() - bytebuffer1.position());
                return null;
            }
            byte1 = byte0;
        } while (true);
    }

    public static String b(ByteBuffer bytebuffer)
    {
        bytebuffer = a(bytebuffer);
        if (bytebuffer == null)
        {
            return null;
        } else
        {
            return com.android.slyce.report.a.f.c.a(bytebuffer.array(), 0, bytebuffer.limit());
        }
    }

    public int a(int j)
    {
        if (j < 0)
        {
            throw new com.android.slyce.report.a.c.b(1002, "Negative count");
        } else
        {
            return j;
        }
    }

    public abstract com.android.slyce.report.a.b.c a(com.android.slyce.report.a.e.a a1);

    public abstract com.android.slyce.report.a.b.c a(com.android.slyce.report.a.e.a a1, h h1);

    public abstract b a(b b1);

    public abstract com.android.slyce.report.a.e.c a(com.android.slyce.report.a.e.a a1, i j);

    public abstract ByteBuffer a(com.android.slyce.report.a.d.d d1);

    public List a(com.android.slyce.report.a.d.e e1, ByteBuffer bytebuffer, boolean flag)
    {
        if (e1 != com.android.slyce.report.a.d.e.c && e1 != com.android.slyce.report.a.d.e.b && e1 != com.android.slyce.report.a.d.e.b)
        {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        f f1;
        if (e != null)
        {
            e = com.android.slyce.report.a.d.e.a;
        } else
        {
            e = e1;
        }
        f1 = new f(e);
        try
        {
            f1.a(bytebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (com.android.slyce.report.a.d.e e1)
        {
            throw new RuntimeException(e1);
        }
        f1.a(flag);
        if (flag)
        {
            e = null;
        } else
        {
            e = e1;
        }
        return Collections.singletonList(f1);
    }

    public List a(com.android.slyce.report.a.e.f f1, com.android.slyce.report.a.c c1)
    {
        return a(f1, c1, true);
    }

    public List a(com.android.slyce.report.a.e.f f1, com.android.slyce.report.a.c c1, boolean flag)
    {
        c1 = new StringBuilder(100);
        if (f1 instanceof com.android.slyce.report.a.e.a)
        {
            c1.append("GET ");
            c1.append(((com.android.slyce.report.a.e.a)f1).a());
            c1.append(" HTTP/1.1");
        } else
        if (f1 instanceof h)
        {
            c1.append((new StringBuilder()).append("HTTP/1.1 101 ").append(((h)f1).a()).toString());
        } else
        {
            throw new RuntimeException("unknow role");
        }
        c1.append("\r\n");
        for (Iterator iterator = f1.b(); iterator.hasNext(); c1.append("\r\n"))
        {
            String s = (String)iterator.next();
            String s1 = f1.b(s);
            c1.append(s);
            c1.append(": ");
            c1.append(s1);
        }

        c1.append("\r\n");
        c1 = com.android.slyce.report.a.f.c.b(c1.toString());
        ByteBuffer bytebuffer;
        int j;
        if (flag)
        {
            f1 = f1.c();
        } else
        {
            f1 = null;
        }
        if (f1 == null)
        {
            j = 0;
        } else
        {
            j = f1.length;
        }
        bytebuffer = ByteBuffer.allocate(j + c1.length);
        bytebuffer.put(c1);
        if (f1 != null)
        {
            bytebuffer.put(f1);
        }
        bytebuffer.flip();
        return Collections.singletonList(bytebuffer);
    }

    public abstract void a();

    public void a(com.android.slyce.report.a.c c1)
    {
        d = c1;
    }

    protected boolean a(com.android.slyce.report.a.e.f f1)
    {
        return f1.b("Upgrade").equalsIgnoreCase("websocket") && f1.b("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public abstract com.android.slyce.report.a.b.b b();

    public abstract a c();

    public abstract List c(ByteBuffer bytebuffer);

    public com.android.slyce.report.a.e.f d(ByteBuffer bytebuffer)
    {
        return a(bytebuffer, d);
    }

}
