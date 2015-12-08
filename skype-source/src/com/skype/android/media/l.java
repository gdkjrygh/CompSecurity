// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import java.nio.ByteBuffer;

// Referenced classes of package com.skype.android.media:
//            m

final class l
    implements m
{

    private String a;
    private ByteBuffer b;
    private android.media.MediaCodec.BufferInfo c;

    l(String s, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        a = s;
        b = bytebuffer;
        c = bufferinfo;
    }

    public final android.media.MediaCodec.BufferInfo a()
    {
        return c;
    }

    public final ByteBuffer b()
    {
        return b;
    }

    public final String c()
    {
        return a;
    }

    public final long d()
    {
        return c.presentationTimeUs;
    }
}
