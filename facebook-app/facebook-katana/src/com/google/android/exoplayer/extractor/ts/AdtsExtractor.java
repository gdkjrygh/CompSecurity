// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.PositionHolder;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            AdtsReader

public final class AdtsExtractor
    implements Extractor
{

    private final long a;
    private final ParsableByteArray b;
    private AdtsReader c;
    private boolean d;

    public AdtsExtractor()
    {
        this(0L);
    }

    public AdtsExtractor(long l)
    {
        a = l;
        b = new ParsableByteArray(200);
        d = true;
    }

    public final int a(ExtractorInput extractorinput, PositionHolder positionholder)
    {
        int i = extractorinput.a(b.a, 0, 200);
        if (i == -1)
        {
            return -1;
        } else
        {
            b.b(0);
            b.a(i);
            c.a(b, a, d);
            d = false;
            return 0;
        }
    }

    public final void a(ExtractorOutput extractoroutput)
    {
        c = new AdtsReader(extractoroutput.a_(0));
        extractoroutput.a();
        extractoroutput.a(SeekMap.f);
    }

    public final boolean a(ExtractorInput extractorinput)
    {
        boolean flag = false;
        ParsableByteArray parsablebytearray = new ParsableByteArray(10);
        extractorinput.c(parsablebytearray.a, 0, 10);
        int i = parsablebytearray.h();
        if (i != Util.e("ID3"))
        {
            i >>= 8;
        } else
        {
            extractorinput.b((parsablebytearray.a[6] & 0x7f) << 21 | (parsablebytearray.a[7] & 0x7f) << 14 | (parsablebytearray.a[8] & 0x7f) << 7 | parsablebytearray.a[9] & 0x7f);
            extractorinput.c(parsablebytearray.a, 0, 2);
            parsablebytearray.b(0);
            i = parsablebytearray.g();
        }
        if ((i & 0xfff6) == 65520)
        {
            flag = true;
        }
        return flag;
    }

    public final void b()
    {
        d = true;
        c.a();
    }
}
