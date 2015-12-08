// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package okio:
//            r, c, ByteString

public interface e
    extends r
{

    public abstract int a(byte abyte0[], int i1, int j1)
        throws IOException;

    public abstract long a(byte byte0)
        throws IOException;

    public abstract void a(long l1)
        throws IOException;

    public abstract void a(byte abyte0[])
        throws IOException;

    public abstract c b();

    public abstract void b(c c1, long l1)
        throws IOException;

    public abstract ByteString c(long l1)
        throws IOException;

    public abstract boolean d()
        throws IOException;

    public abstract InputStream e();

    public abstract byte[] e(long l1)
        throws IOException;

    public abstract byte f()
        throws IOException;

    public abstract void f(long l1)
        throws IOException;

    public abstract short g()
        throws IOException;

    public abstract int h()
        throws IOException;

    public abstract long i()
        throws IOException;

    public abstract short j()
        throws IOException;

    public abstract int k()
        throws IOException;

    public abstract long l()
        throws IOException;

    public abstract long m()
        throws IOException;

    public abstract String o()
        throws IOException;

    public abstract String p()
        throws IOException;

    public abstract byte[] q()
        throws IOException;
}
