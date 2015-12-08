// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            q, r, c, ByteString

public interface d
    extends q
{

    public abstract long a(r r)
        throws IOException;

    public abstract c b();

    public abstract d b(String s1)
        throws IOException;

    public abstract d b(ByteString bytestring)
        throws IOException;

    public abstract d c()
        throws IOException;

    public abstract d c(byte abyte0[])
        throws IOException;

    public abstract d c(byte abyte0[], int i, int i1)
        throws IOException;

    public abstract d f(int i)
        throws IOException;

    public abstract d g(int i)
        throws IOException;

    public abstract d h(int i)
        throws IOException;

    public abstract d j(long l1)
        throws IOException;

    public abstract d k(long l1)
        throws IOException;

    public abstract d l(long l1)
        throws IOException;

    public abstract d s()
        throws IOException;
}
