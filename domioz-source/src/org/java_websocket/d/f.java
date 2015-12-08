// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.d;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.java_websocket.util.Charsetfunctions;

// Referenced classes of package org.java_websocket.d:
//            c, d, e

public class f
    implements c
{

    protected static byte b[] = new byte[0];
    private ByteBuffer a;
    protected boolean c;
    protected e d;
    protected boolean e;

    public f()
    {
    }

    public f(d d1)
    {
        c = d1.d();
        d = d1.f();
        a = d1.c();
        e = d1.e();
    }

    public f(e e1)
    {
        d = e1;
        a = ByteBuffer.wrap(b);
    }

    public void a(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
    }

    public final void a(e e1)
    {
        d = e1;
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public ByteBuffer c()
    {
        return a;
    }

    public final boolean d()
    {
        return c;
    }

    public final boolean e()
    {
        return e;
    }

    public final e f()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder("Framedata{ optcode:")).append(d).append(", fin:").append(c).append(", payloadlength:[pos:").append(a.position()).append(", len:").append(a.remaining()).append("], payload:").append(Arrays.toString(Charsetfunctions.a(new String(a.array())))).append("}").toString();
    }

}
