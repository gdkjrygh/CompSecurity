// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dz;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p.ea.d;
import p.ec.c;
import p.ec.e;
import p.ec.f;
import p.ec.h;
import p.ec.i;
import p.ee.b;

public abstract class p.dz.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dz/a$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("ONEWAY", 1);
            c = new a("TWOWAY", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(p/dz/a$b, s);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("MATCHED", 0);
            b = new b("NOT_MATCHED", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s, int j)
        {
            super(s, j);
        }
    }


    public static int a = 1000;
    public static int b = 64;
    public static final byte c[] = p.ee.b.a("<policy-file-request/>\0");
    protected p.dx.b.b d;
    protected p.eb.d.a e;

    public p.dz.a()
    {
        d = null;
        e = null;
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

    public static c a(ByteBuffer bytebuffer, p.dx.b.b b1)
        throws d, p.ea.a
    {
        Object obj = b(bytebuffer);
        if (obj == null)
        {
            throw new p.ea.a(bytebuffer.capacity() + 128);
        }
        obj = ((String) (obj)).split(" ", 3);
        if (obj.length != 3)
        {
            throw new d();
        }
        if (b1 == p.dx.b.b.a)
        {
            b1 = new e();
            i j = (i)b1;
            j.a(Short.parseShort(obj[1]));
            j.a(obj[2]);
        } else
        {
            b1 = new p.ec.d();
            b1.a(obj[1]);
        }
        for (obj = b(bytebuffer); obj != null && ((String) (obj)).length() > 0; obj = b(bytebuffer))
        {
            obj = ((String) (obj)).split(":", 2);
            if (obj.length != 2)
            {
                throw new d("not an http header");
            }
            b1.a(obj[0], obj[1].replaceFirst("^ +", ""));
        }

        if (obj == null)
        {
            throw new p.ea.a();
        } else
        {
            return b1;
        }
    }

    public static String b(ByteBuffer bytebuffer)
    {
        bytebuffer = a(bytebuffer);
        if (bytebuffer == null)
        {
            return null;
        } else
        {
            return p.ee.b.a(bytebuffer.array(), 0, bytebuffer.limit());
        }
    }

    public int a(int j)
        throws p.ea.e, p.ea.b
    {
        if (j < 0)
        {
            throw new p.ea.b(1002, "Negative count");
        } else
        {
            return j;
        }
    }

    public abstract ByteBuffer a(p.eb.d d1);

    public abstract List a(String s, boolean flag);

    public List a(f f1, p.dx.b.b b1)
    {
        return a(f1, b1, true);
    }

    public List a(f f1, p.dx.b.b b1, boolean flag)
    {
        b1 = new StringBuilder(100);
        if (f1 instanceof p.ec.a)
        {
            b1.append("GET ");
            b1.append(((p.ec.a)f1).a());
            b1.append(" HTTP/1.1");
        } else
        if (f1 instanceof h)
        {
            b1.append((new StringBuilder()).append("HTTP/1.1 101 ").append(((h)f1).a()).toString());
        } else
        {
            throw new RuntimeException("unknow role");
        }
        b1.append("\r\n");
        for (Iterator iterator = f1.b(); iterator.hasNext(); b1.append("\r\n"))
        {
            String s = (String)iterator.next();
            String s1 = f1.b(s);
            b1.append(s);
            b1.append(": ");
            b1.append(s1);
        }

        b1.append("\r\n");
        b1 = p.ee.b.b(b1.toString());
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
        bytebuffer = ByteBuffer.allocate(j + b1.length);
        bytebuffer.put(b1);
        if (f1 != null)
        {
            bytebuffer.put(f1);
        }
        bytebuffer.flip();
        return Collections.singletonList(bytebuffer);
    }

    public abstract b a(p.ec.a a1)
        throws d;

    public abstract b a(p.ec.a a1, h h1)
        throws d;

    public abstract p.ec.b a(p.ec.b b1)
        throws d;

    public abstract c a(p.ec.a a1, i j)
        throws d;

    public abstract void a();

    public void a(p.dx.b.b b1)
    {
        d = b1;
    }

    protected boolean a(f f1)
    {
        return f1.b("Upgrade").equalsIgnoreCase("websocket") && f1.b("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public abstract a b();

    public abstract List c(ByteBuffer bytebuffer)
        throws p.ea.b;

    public abstract p.dz.a c();

    public p.dx.b.b d()
    {
        return d;
    }

    public f d(ByteBuffer bytebuffer)
        throws d
    {
        return a(bytebuffer, d);
    }

}
