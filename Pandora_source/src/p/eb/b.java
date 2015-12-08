// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.eb;

import java.nio.ByteBuffer;
import p.ea.c;

// Referenced classes of package p.eb:
//            e, a

public class b extends e
    implements a
{

    static final ByteBuffer a = ByteBuffer.allocate(0);
    private int f;
    private String g;

    public b()
    {
        super(d.a.f);
        a(true);
    }

    public b(int i)
        throws p.ea.b
    {
        super(d.a.f);
        a(true);
        a(i, "");
    }

    public b(int i, String s)
        throws p.ea.b
    {
        super(d.a.f);
        a(true);
        a(i, s);
    }

    private void a(int i, String s)
        throws p.ea.b
    {
        if (s == null)
        {
            s = "";
        }
        int j = i;
        if (i == 1015)
        {
            s = "";
            j = 1005;
        }
        if (j == 1005)
        {
            if (s.length() > 0)
            {
                throw new p.ea.b(1002, "A close frame must have a closecode if it has a reason");
            }
        } else
        {
            s = p.ee.b.a(s);
            ByteBuffer bytebuffer = ByteBuffer.allocate(4);
            bytebuffer.putInt(j);
            bytebuffer.position(2);
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(s.length + 2);
            bytebuffer1.put(bytebuffer);
            bytebuffer1.put(s);
            bytebuffer1.rewind();
            a(bytebuffer1);
        }
    }

    private void g()
        throws c
    {
        f = 1005;
        ByteBuffer bytebuffer = super.c();
        bytebuffer.mark();
        if (bytebuffer.remaining() >= 2)
        {
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(4);
            bytebuffer1.position(2);
            bytebuffer1.putShort(bytebuffer.getShort());
            bytebuffer1.position(0);
            f = bytebuffer1.getInt();
            if (f == 1006 || f == 1015 || f == 1005 || f > 4999 || f < 1000 || f == 1004)
            {
                throw new c((new StringBuilder()).append("closecode must not be sent over the wire: ").append(f).toString());
            }
        }
        bytebuffer.reset();
    }

    private void h()
        throws p.ea.b
    {
        ByteBuffer bytebuffer;
        int i;
        if (f == 1005)
        {
            g = p.ee.b.a(super.c());
            return;
        }
        bytebuffer = super.c();
        i = bytebuffer.position();
        bytebuffer.position(bytebuffer.position() + 2);
        g = p.ee.b.a(bytebuffer);
        bytebuffer.position(i);
        return;
        Object obj;
        obj;
        throw new c(((Throwable) (obj)));
        obj;
        bytebuffer.position(i);
        throw obj;
    }

    public int a()
    {
        return f;
    }

    public void a(ByteBuffer bytebuffer)
        throws p.ea.b
    {
        super.a(bytebuffer);
        g();
        h();
    }

    public String b()
    {
        return g;
    }

    public ByteBuffer c()
    {
        if (f == 1005)
        {
            return a;
        } else
        {
            return super.c();
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("code: ").append(f).toString();
    }

}
