// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            TsExtractor

class eader extends eader
{

    final TsExtractor a;
    private final ParsableBitArray b = new ParsableBitArray(new byte[4]);

    public final void a()
    {
    }

    public final void a(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
    {
        if (flag)
        {
            parsablebytearray.c(parsablebytearray.f());
        }
        parsablebytearray.a(b, 3);
        b.b(12);
        int i = b.c(12);
        parsablebytearray.c(5);
        int k = (i - 9) / 4;
        for (int j = 0; j < k; j++)
        {
            parsablebytearray.a(b, 4);
            b.b(19);
            int l = b.c(13);
            a.c.put(l, new <init>(a));
        }

    }

    public eader(TsExtractor tsextractor)
    {
        a = tsextractor;
        super((byte)0);
    }
}
