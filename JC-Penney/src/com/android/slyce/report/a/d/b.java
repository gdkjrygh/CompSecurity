// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.d;

import com.android.slyce.report.a.f.c;
import java.nio.ByteBuffer;

// Referenced classes of package com.android.slyce.report.a.d:
//            f, a, e

public class b extends f
    implements a
{

    static final ByteBuffer a = ByteBuffer.allocate(0);
    private int f;
    private String g;

    public b()
    {
        super(e.f);
        a(true);
    }

    public b(int i)
    {
        super(e.f);
        a(true);
        a(i, "");
    }

    public b(int i, String s)
    {
        super(e.f);
        a(true);
        a(i, s);
    }

    private void a(int i, String s)
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
                throw new com.android.slyce.report.a.c.b(1002, "A close frame must have a closecode if it has a reason");
            }
        } else
        {
            s = com.android.slyce.report.a.f.c.a(s);
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
                throw new com.android.slyce.report.a.c.c((new StringBuilder()).append("closecode must not be sent over the wire: ").append(f).toString());
            }
        }
        bytebuffer.reset();
    }

    private void h()
    {
        ByteBuffer bytebuffer;
        int i;
        if (f == 1005)
        {
            g = com.android.slyce.report.a.f.c.a(super.c());
            return;
        }
        bytebuffer = super.c();
        i = bytebuffer.position();
        bytebuffer.position(bytebuffer.position() + 2);
        g = com.android.slyce.report.a.f.c.a(bytebuffer);
        bytebuffer.position(i);
        return;
        Object obj;
        obj;
        throw new com.android.slyce.report.a.c.c(((Throwable) (obj)));
        obj;
        bytebuffer.position(i);
        throw obj;
    }

    public int a()
    {
        return f;
    }

    public void a(ByteBuffer bytebuffer)
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
