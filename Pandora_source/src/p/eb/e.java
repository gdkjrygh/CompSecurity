// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.eb;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p.ea.b;

// Referenced classes of package p.eb:
//            c, d

public class e
    implements c
{

    protected static byte b[] = new byte[0];
    private ByteBuffer a;
    protected boolean c;
    protected d.a d;
    protected boolean e;

    public e()
    {
    }

    public e(d.a a1)
    {
        d = a1;
        a = ByteBuffer.wrap(b);
    }

    public e(d d1)
    {
        c = d1.d();
        d = d1.f();
        a = d1.c();
        e = d1.e();
    }

    public void a(ByteBuffer bytebuffer)
        throws b
    {
        a = bytebuffer;
    }

    public void a(d.a a1)
    {
        d = a1;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public void b(boolean flag)
    {
        e = flag;
    }

    public ByteBuffer c()
    {
        return a;
    }

    public boolean d()
    {
        return c;
    }

    public boolean e()
    {
        return e;
    }

    public d.a f()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Framedata{ optcode:").append(f()).append(", fin:").append(d()).append(", payloadlength:[pos:").append(a.position()).append(", len:").append(a.remaining()).append("], payload:").append(Arrays.toString(p.ee.b.a(new String(a.array())))).append("}").toString();
    }

}
