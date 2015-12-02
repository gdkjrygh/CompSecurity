// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer.dash.mpd.Representation;

// Referenced classes of package com.google.android.exoplayer.dash:
//            DashSegmentIndex

class c
{

    public final Representation a;
    public final ChunkExtractorWrapper b;
    public DashSegmentIndex c;
    public MediaFormat d;
    public int e;
    public long f;
    public byte g[];

    public (Representation representation, ChunkExtractorWrapper chunkextractorwrapper)
    {
        a = representation;
        b = chunkextractorwrapper;
        c = representation.f();
    }
}
