// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

final class osm
{

    MediaFormat a;
    final MediaCodec b;
    int c;

    public osm(MediaFormat mediaformat)
    {
        b = MediaCodec.createEncoderByType(mediaformat.getString("mime"));
        b.configure(mediaformat, null, null, 1);
        b.start();
        c = osp.a;
    }

    public final void a(ByteBuffer bytebuffer, long l)
    {
        oss oss1;
        do
        {
            oss1 = oss.a(b);
        } while (oss1 != null && oss1.a(bytebuffer, l, 0));
    }
}
