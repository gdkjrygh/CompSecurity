// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            ErrorCode, HeadersMode, Settings

public interface FrameReader
    extends Closeable
{
    public static interface Handler
    {

        public abstract void data(boolean flag, int i, InputStream inputstream, int j)
            throws IOException;

        public abstract void goAway(int i, ErrorCode errorcode);

        public abstract void headers(boolean flag, boolean flag1, int i, int j, int k, List list, HeadersMode headersmode);

        public abstract void noop();

        public abstract void ping(boolean flag, int i, int j);

        public abstract void priority(int i, int j);

        public abstract void rstStream(int i, ErrorCode errorcode);

        public abstract void settings(boolean flag, Settings settings1);

        public abstract void windowUpdate(int i, int j, boolean flag);
    }


    public abstract boolean nextFrame(Handler handler)
        throws IOException;

    public abstract void readConnectionHeader()
        throws IOException;
}
