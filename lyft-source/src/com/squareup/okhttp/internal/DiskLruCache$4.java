// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import okio.Buffer;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache

final class 
    implements Sink
{

    public void close()
    {
    }

    public void flush()
    {
    }

    public Timeout timeout()
    {
        return Timeout.NONE;
    }

    public void write(Buffer buffer, long l)
    {
        buffer.skip(l);
    }

    ()
    {
    }
}
