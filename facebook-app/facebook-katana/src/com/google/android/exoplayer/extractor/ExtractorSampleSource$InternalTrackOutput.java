// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.upstream.Allocator;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            DefaultTrackOutput, ExtractorSampleSource

class a extends DefaultTrackOutput
{

    final ExtractorSampleSource a;

    public final void a(long l, int i, int j, int k, byte abyte0[])
    {
        super.a(l, i, j, k, abyte0);
        ExtractorSampleSource.a(a);
    }

    public (ExtractorSampleSource extractorsamplesource, Allocator allocator)
    {
        a = extractorsamplesource;
        super(allocator);
    }
}
