// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.text.eia608.Eia608Parser;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            ElementaryStreamReader

final class SeiReader extends ElementaryStreamReader
{

    public SeiReader(TrackOutput trackoutput)
    {
        super(trackoutput);
        trackoutput.a(MediaFormat.a("application/eia-608"));
    }

    public final void a()
    {
    }

    public final void a(ParsableByteArray parsablebytearray, long l, boolean flag)
    {
        while (parsablebytearray.b() > 1) 
        {
            int i = 0;
            int j;
            int k;
            do
            {
                k = parsablebytearray.f();
                j = i + k;
                i = j;
            } while (k == 255);
            i = 0;
            int i1;
            do
            {
                i1 = parsablebytearray.f();
                k = i + i1;
                i = k;
            } while (i1 == 255);
            if (Eia608Parser.a(j, k, parsablebytearray))
            {
                a.a(parsablebytearray, k);
                a.a(l, 1, k, 0, null);
            } else
            {
                parsablebytearray.c(k);
            }
        }
    }

    public final void b()
    {
    }
}
