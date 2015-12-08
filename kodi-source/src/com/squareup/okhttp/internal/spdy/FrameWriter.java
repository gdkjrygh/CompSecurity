// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.Buffer;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Settings, ErrorCode

public interface FrameWriter
    extends Closeable
{

    public abstract void ackSettings(Settings settings1)
        throws IOException;

    public abstract void connectionPreface()
        throws IOException;

    public abstract void data(boolean flag, int i, Buffer buffer, int j)
        throws IOException;

    public abstract void flush()
        throws IOException;

    public abstract void goAway(int i, ErrorCode errorcode, byte abyte0[])
        throws IOException;

    public abstract int maxDataLength();

    public abstract void ping(boolean flag, int i, int j)
        throws IOException;

    public abstract void pushPromise(int i, int j, List list)
        throws IOException;

    public abstract void rstStream(int i, ErrorCode errorcode)
        throws IOException;

    public abstract void settings(Settings settings1)
        throws IOException;

    public abstract void synStream(boolean flag, boolean flag1, int i, int j, List list)
        throws IOException;

    public abstract void windowUpdate(int i, long l)
        throws IOException;
}
