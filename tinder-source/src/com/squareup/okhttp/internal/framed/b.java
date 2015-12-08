// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.c;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            ErrorCode, m

public interface b
    extends Closeable
{

    public abstract void a()
        throws IOException;

    public abstract void a(int i, long l)
        throws IOException;

    public abstract void a(int i, ErrorCode errorcode)
        throws IOException;

    public abstract void a(int i, ErrorCode errorcode, byte abyte0[])
        throws IOException;

    public abstract void a(m m)
        throws IOException;

    public abstract void a(boolean flag, int i, int j)
        throws IOException;

    public abstract void a(boolean flag, int i, List list)
        throws IOException;

    public abstract void a(boolean flag, int i, c c1, int j)
        throws IOException;

    public abstract void b()
        throws IOException;

    public abstract void b(m m)
        throws IOException;

    public abstract int c();
}
