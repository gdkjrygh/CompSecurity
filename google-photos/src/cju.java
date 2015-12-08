// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public final class cju
    implements cjt
{

    private final MediaExtractor a;

    public cju(MediaExtractor mediaextractor)
    {
        a = mediaextractor;
    }

    public final int a(ByteBuffer bytebuffer, int i)
    {
        return a.readSampleData(bytebuffer, 0);
    }

    public final MediaFormat a(int i)
    {
        return a.getTrackFormat(i);
    }

    public final void a()
    {
        a.release();
    }

    public final void a(long l)
    {
    }

    public final void a(long l, int i)
    {
        a.seekTo(l, i);
    }

    public final void b(int i)
    {
        a.selectTrack(i);
    }

    public final boolean b()
    {
        return a.advance();
    }

    public final int c()
    {
        return a.getSampleFlags();
    }

    public final void c(int i)
    {
        a.unselectTrack(i);
    }

    public final long d()
    {
        return a.getSampleTime();
    }

    public final int e()
    {
        return a.getSampleTrackIndex();
    }

    public final int f()
    {
        return a.getTrackCount();
    }

    public final boolean g()
    {
        return true;
    }

    public final void h()
    {
    }
}
