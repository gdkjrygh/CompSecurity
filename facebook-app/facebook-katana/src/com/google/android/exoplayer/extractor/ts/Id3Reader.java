// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            ElementaryStreamReader

final class Id3Reader extends ElementaryStreamReader
{

    private boolean b;
    private long c;
    private int d;

    public Id3Reader(TrackOutput trackoutput)
    {
        super(trackoutput);
        trackoutput.a(MediaFormat.a("application/id3"));
    }

    public final void a()
    {
        b = false;
    }

    public final void a(ParsableByteArray parsablebytearray, long l, boolean flag)
    {
        if (flag)
        {
            b = true;
            c = l;
            d = 0;
        }
        if (b)
        {
            d = d + parsablebytearray.b();
            a.a(parsablebytearray, parsablebytearray.b());
        }
    }

    public final void b()
    {
        a.a(c, 1, d, 0, null);
        b = false;
    }
}
