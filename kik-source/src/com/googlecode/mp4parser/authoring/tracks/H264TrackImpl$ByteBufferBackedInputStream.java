// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

public class buf extends InputStream
{

    private final ByteBuffer buf;
    final H264TrackImpl this$0;

    public int read()
    {
        if (!buf.hasRemaining())
        {
            return -1;
        } else
        {
            return buf.get() & 0xff;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (!buf.hasRemaining())
        {
            return -1;
        } else
        {
            j = Math.min(j, buf.remaining());
            buf.get(abyte0, i, j);
            return j;
        }
    }

    public Y(ByteBuffer bytebuffer)
    {
        this$0 = H264TrackImpl.this;
        super();
        buf = bytebuffer.duplicate();
    }
}
