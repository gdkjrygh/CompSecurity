// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.f;
import java.io.Closeable;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            Settings, ErrorCode

public interface FrameWriter
    extends Closeable
{

    public abstract void ackSettings(Settings settings1);

    public abstract void connectionPreface();

    public abstract void data(boolean flag, int i, f f, int j);

    public abstract void flush();

    public abstract void goAway(int i, ErrorCode errorcode, byte abyte0[]);

    public abstract void headers(int i, List list);

    public abstract int maxDataLength();

    public abstract void ping(boolean flag, int i, int j);

    public abstract void pushPromise(int i, int j, List list);

    public abstract void rstStream(int i, ErrorCode errorcode);

    public abstract void settings(Settings settings1);

    public abstract void synReply(boolean flag, int i, List list);

    public abstract void synStream(boolean flag, boolean flag1, int i, int j, List list);

    public abstract void windowUpdate(int i, long l);
}
