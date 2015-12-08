// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            ErrorCode, Settings

public interface FrameWriter
    extends Closeable
{

    public abstract void connectionHeader();

    public abstract void data(boolean flag, int i, byte abyte0[])
        throws IOException;

    public abstract void data(boolean flag, int i, byte abyte0[], int j, int k)
        throws IOException;

    public abstract void flush()
        throws IOException;

    public abstract void goAway(int i, ErrorCode errorcode)
        throws IOException;

    public abstract void headers(int i, List list)
        throws IOException;

    public abstract void noop()
        throws IOException;

    public abstract void ping(boolean flag, int i, int j)
        throws IOException;

    public abstract void rstStream(int i, ErrorCode errorcode)
        throws IOException;

    public abstract void settings(Settings settings1)
        throws IOException;

    public abstract void synReply(boolean flag, int i, List list)
        throws IOException;

    public abstract void synStream(boolean flag, boolean flag1, int i, int j, int k, int l, List list)
        throws IOException;

    public abstract void windowUpdate(int i, int j)
        throws IOException;
}
