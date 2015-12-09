// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.d;

import com.android.slyce.report.a.f.c;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.android.slyce.report.a.d:
//            c, d, e

public class f
    implements com.android.slyce.report.a.d.c
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

    public void a(e e1)
    {
        d = e1;
    }

    public void a(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
    }

    public void a(boolean flag)
    {
        c = flag;
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

    public e f()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Framedata{ optcode:").append(f()).append(", fin:").append(d()).append(", payloadlength:[pos:").append(a.position()).append(", len:").append(a.remaining()).append("], payload:").append(Arrays.toString(com.android.slyce.report.a.f.c.a(new String(a.array())))).append("}").toString();
    }

}
