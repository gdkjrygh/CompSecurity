// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.ParsableByteArray;

public final class ChunkExtractorWrapper
    implements ExtractorOutput, TrackOutput
{

    private final Extractor a;
    private boolean b;
    private SingleTrackOutput c;
    private boolean d;

    public ChunkExtractorWrapper(Extractor extractor)
    {
        a = extractor;
    }

    public final int a(ExtractorInput extractorinput)
    {
        boolean flag = true;
        int i = a.a(extractorinput, null);
        if (i == 1)
        {
            flag = false;
        }
        Assertions.b(flag);
        return i;
    }

    public final int a(ExtractorInput extractorinput, int i, boolean flag)
    {
        return c.a(extractorinput, i, flag);
    }

    public final void a()
    {
        Assertions.b(d);
    }

    public final void a(long l, int i, int j, int k, byte abyte0[])
    {
        c.a(l, i, j, k, abyte0);
    }

    public final void a(MediaFormat mediaformat)
    {
        c.a(mediaformat);
    }

    public final void a(SingleTrackOutput singletrackoutput)
    {
        c = singletrackoutput;
        if (!b)
        {
            a.a(this);
            b = true;
            return;
        } else
        {
            a.b();
            return;
        }
    }

    public final void a(DrmInitData drminitdata)
    {
        c.a(drminitdata);
    }

    public final void a(SeekMap seekmap)
    {
        c.a(seekmap);
    }

    public final void a(ParsableByteArray parsablebytearray, int i)
    {
        c.a(parsablebytearray, i);
    }

    public final TrackOutput a_(int i)
    {
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        d = true;
        return this;
    }

    private class SingleTrackOutput
        implements TrackOutput
    {

        public abstract void a(DrmInitData drminitdata);

        public abstract void a(SeekMap seekmap);
    }

}
