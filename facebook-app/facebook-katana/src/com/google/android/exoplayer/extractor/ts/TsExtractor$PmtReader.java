// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            TsExtractor, Id3Reader, MpegAudioReader, AdtsReader, 
//            Ac3Reader, H264Reader, SeiReader, H265Reader

class eader extends eader
{

    final TsExtractor a;
    private final ParsableBitArray b = new ParsableBitArray(new byte[5]);

    public final void a()
    {
    }

    public final void a(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
    {
        int i;
        if (flag)
        {
            parsablebytearray.c(parsablebytearray.f());
        }
        parsablebytearray.a(b, 3);
        b.b(12);
        i = b.c(12);
        parsablebytearray.c(7);
        parsablebytearray.a(b, 2);
        b.b(4);
        int j = b.c(12);
        parsablebytearray.c(j);
        if (a.d == null)
        {
            a.d = new Id3Reader(extractoroutput.a_(21));
        }
        i = i - 9 - j - 4;
_L12:
        if (i <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int k;
        int l;
        parsablebytearray.a(b, 5);
        k = b.c(8);
        b.b(3);
        l = b.c(13);
        b.b(4);
        int i1 = b.c(12);
        parsablebytearray.c(i1);
        i -= i1 + 5;
        if (a.a.get(k))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        k;
        JVM INSTR lookupswitch 8: default 296
    //                   3: 342
    //                   4: 361
    //                   15: 380
    //                   21: 514
    //                   27: 435
    //                   36: 478
    //                   129: 400
    //                   135: 400;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10
_L3:
        if (obj != null)
        {
            a.a.put(k, true);
            a.c.put(l, new <init>(a, ((ElementaryStreamReader) (obj))));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new MpegAudioReader(extractoroutput.a_(3));
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new MpegAudioReader(extractoroutput.a_(4));
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new AdtsReader(extractoroutput.a_(15));
        continue; /* Loop/switch isn't completed */
_L10:
        if (!a.b.get(k))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new Ac3Reader(extractoroutput.a_(k));
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new H264Reader(extractoroutput.a_(27), new SeiReader(extractoroutput.a_(256)), TsExtractor.a(a));
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new H265Reader(extractoroutput.a_(36), new SeiReader(extractoroutput.a_(256)));
        continue; /* Loop/switch isn't completed */
_L7:
        obj = a.d;
        if (true) goto _L3; else goto _L2
_L2:
        extractoroutput.a();
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public eader(TsExtractor tsextractor)
    {
        a = tsextractor;
        super((byte)0);
    }
}
