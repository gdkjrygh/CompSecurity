// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.util.Assertions;

public final class HlsExtractorWrapper
    implements ExtractorOutput
{

    public final int a;
    public final Format b;
    public final long c;
    private final Extractor d;
    private final SparseArray e = new SparseArray();
    private final boolean f;
    private Allocator g;
    private volatile boolean h;
    private boolean i;
    private boolean j;

    public HlsExtractorWrapper(int k, Format format, long l, Extractor extractor, boolean flag)
    {
        a = k;
        b = format;
        c = l;
        d = extractor;
        f = flag;
    }

    public final int a(ExtractorInput extractorinput)
    {
        boolean flag = true;
        int k = d.a(extractorinput, null);
        if (k == 1)
        {
            flag = false;
        }
        Assertions.b(flag);
        return k;
    }

    public final void a()
    {
        h = true;
    }

    public final void a(int k, long l)
    {
        Assertions.b(b());
        ((DefaultTrackOutput)e.valueAt(k)).a(l);
    }

    public final void a(DrmInitData drminitdata)
    {
    }

    public final void a(SeekMap seekmap)
    {
    }

    public final void a(HlsExtractorWrapper hlsextractorwrapper)
    {
        Assertions.b(b());
        if (j || !hlsextractorwrapper.f || !hlsextractorwrapper.b())
        {
            return;
        }
        int l = e();
        int k = 0;
        boolean flag;
        boolean flag1;
        for (flag = true; k < l; flag &= flag1)
        {
            flag1 = ((DefaultTrackOutput)e.valueAt(k)).a((DefaultTrackOutput)hlsextractorwrapper.e.valueAt(k));
            k++;
        }

        j = flag;
    }

    public final void a(Allocator allocator)
    {
        g = allocator;
        d.a(this);
    }

    public final boolean a(int k, SampleHolder sampleholder)
    {
        Assertions.b(b());
        return ((DefaultTrackOutput)e.valueAt(k)).a(sampleholder);
    }

    public final TrackOutput a_(int k)
    {
        DefaultTrackOutput defaulttrackoutput = new DefaultTrackOutput(g);
        e.put(k, defaulttrackoutput);
        return defaulttrackoutput;
    }

    public final MediaFormat b(int k)
    {
        Assertions.b(b());
        return ((DefaultTrackOutput)e.valueAt(k)).e();
    }

    public final boolean b()
    {
        if (!i && h)
        {
            for (int k = 0; k < e.size(); k++)
            {
                if (!((DefaultTrackOutput)e.valueAt(k)).d())
                {
                    return false;
                }
            }

            i = true;
        }
        return i;
    }

    public final void c()
    {
        for (int k = 0; k < e.size(); k++)
        {
            ((DefaultTrackOutput)e.valueAt(k)).a();
        }

    }

    public final boolean c(int k)
    {
        Assertions.b(b());
        return !((DefaultTrackOutput)e.valueAt(k)).g();
    }

    public final long d()
    {
        long l = 0x8000000000000000L;
        for (int k = 0; k < e.size(); k++)
        {
            l = Math.max(l, ((DefaultTrackOutput)e.valueAt(k)).f());
        }

        return l;
    }

    public final int e()
    {
        Assertions.b(b());
        return e.size();
    }
}
