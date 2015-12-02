// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.PositionHolder;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            Id3Reader

public final class TsExtractor
    implements Extractor
{

    final SparseBooleanArray a;
    final SparseBooleanArray b;
    final SparseArray c;
    Id3Reader d;
    private final ParsableByteArray e;
    private final ParsableBitArray f;
    private final boolean g;
    private final long h;
    private ExtractorOutput i;
    private long j;
    private long k;

    public TsExtractor()
    {
        this(0L);
    }

    private TsExtractor(long l)
    {
        this(l, null);
    }

    public TsExtractor(long l, AudioCapabilities audiocapabilities)
    {
        this(l, audiocapabilities, true);
    }

    private TsExtractor(long l, AudioCapabilities audiocapabilities, boolean flag)
    {
        h = l;
        g = flag;
        f = new ParsableBitArray(new byte[3]);
        e = new ParsableByteArray(188);
        a = new SparseBooleanArray();
        b = a(audiocapabilities);
        c = new SparseArray();
        c.put(0, new PatReader());
        k = 0x8000000000000000L;
    }

    private static SparseBooleanArray a(AudioCapabilities audiocapabilities)
    {
        SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
        if (audiocapabilities != null)
        {
            if (audiocapabilities.a(5))
            {
                sparsebooleanarray.put(129, true);
            }
            audiocapabilities.a(6);
        }
        return sparsebooleanarray;
    }

    static boolean a(TsExtractor tsextractor)
    {
        return tsextractor.g;
    }

    public final int a(ExtractorInput extractorinput, PositionHolder positionholder)
    {
        if (!extractorinput.a(e.a, 0, 188, true))
        {
            return -1;
        }
        e.b(0);
        e.a(188);
        if (e.f() != 71)
        {
            return 0;
        }
        e.a(f, 3);
        f.b(1);
        boolean flag = f.b();
        f.b(1);
        int l = f.c(13);
        f.b(2);
        boolean flag1 = f.b();
        boolean flag2 = f.b();
        if (flag1)
        {
            int i1 = e.f();
            e.c(i1);
        }
        if (flag2)
        {
            extractorinput = (TsPayloadReader)c.get(l);
            if (extractorinput != null)
            {
                extractorinput.a(e, flag, i);
            }
        }
        return 0;
    }

    final long a(long l)
    {
        if (k != 0x8000000000000000L)
        {
            long l3 = (k + 0xffffffffL) / 0x1ffffffffL;
            long l1 = (l3 - 1L) * 0x1ffffffffL + l;
            l = l3 * 0x1ffffffffL + l;
            if (Math.abs(l1 - k) < Math.abs(l - k))
            {
                l = l1;
            }
        }
        long l2 = (0xf4240L * l) / 0x15f90L;
        if (k == 0x8000000000000000L)
        {
            j = h - l2;
        }
        k = l;
        return j + l2;
    }

    public final void a(ExtractorOutput extractoroutput)
    {
        i = extractoroutput;
        extractoroutput.a(SeekMap.f);
    }

    public final boolean a(ExtractorInput extractorinput)
    {
        byte abyte0[] = new byte[1];
        for (int l = 0; l < 5; l++)
        {
            extractorinput.c(abyte0, 0, 1);
            if ((abyte0[0] & 0xff) != 71)
            {
                return false;
            }
            extractorinput.b(187);
        }

        return true;
    }

    public final void b()
    {
        j = 0L;
        k = 0x8000000000000000L;
        for (int l = 0; l < c.size(); l++)
        {
            ((TsPayloadReader)c.valueAt(l)).a();
        }

    }

    private class PatReader extends TsPayloadReader
    {
        private class TsPayloadReader
        {

            public abstract void a();

            public abstract void a(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput);

            private TsPayloadReader()
            {
            }

            TsPayloadReader(byte byte0)
            {
                this();
            }
        }


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
            int l = b.c(12);
            parsablebytearray.c(5);
            int j1 = (l - 9) / 4;
            for (int i1 = 0; i1 < j1; i1++)
            {
                parsablebytearray.a(b, 4);
                b.b(19);
                int k1 = b.c(13);
                a.c.put(k1, a. new PmtReader());
            }

        }

        public PatReader()
        {
            a = TsExtractor.this;
            super((byte)0);
        }

        private class PmtReader extends TsPayloadReader
        {

            final TsExtractor a;
            private final ParsableBitArray b = new ParsableBitArray(new byte[5]);

            public final void a()
            {
            }

            public final void a(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
            {
                int l;
                if (flag)
                {
                    parsablebytearray.c(parsablebytearray.f());
                }
                parsablebytearray.a(b, 3);
                b.b(12);
                l = b.c(12);
                parsablebytearray.c(7);
                parsablebytearray.a(b, 2);
                b.b(4);
                int i1 = b.c(12);
                parsablebytearray.c(i1);
                if (a.d == null)
                {
                    a.d = new Id3Reader(extractoroutput.a_(21));
                }
                l = l - 9 - i1 - 4;
_L12:
                if (l <= 0) goto _L2; else goto _L1
_L1:
                Object obj;
                int j1;
                int k1;
                parsablebytearray.a(b, 5);
                j1 = b.c(8);
                b.b(3);
                k1 = b.c(13);
                b.b(4);
                int l1 = b.c(12);
                parsablebytearray.c(l1);
                l -= l1 + 5;
                if (a.a.get(j1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj = null;
                j1;
                JVM INSTR lookupswitch 8: default 296
            //                           3: 342
            //                           4: 361
            //                           15: 380
            //                           21: 514
            //                           27: 435
            //                           36: 478
            //                           129: 400
            //                           135: 400;
                   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10
_L3:
                if (obj != null)
                {
                    a.a.put(j1, true);
                    a.c.put(k1, a. new PesReader(((ElementaryStreamReader) (obj))));
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
                if (!a.b.get(j1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj = new Ac3Reader(extractoroutput.a_(j1));
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

            public PmtReader()
            {
                a = TsExtractor.this;
                super((byte)0);
            }

            private class PesReader extends TsPayloadReader
            {

                final TsExtractor a;
                private final ParsableBitArray b = new ParsableBitArray(new byte[9]);
                private final ElementaryStreamReader c;
                private int d;
                private int e;
                private boolean f;
                private boolean g;
                private int h;
                private int i;
                private long j;

                private void a(int l)
                {
                    d = l;
                    e = 0;
                }

                private boolean a(ParsableByteArray parsablebytearray, byte abyte0[], int l)
                {
                    int i1 = Math.min(parsablebytearray.b(), l - e);
                    if (i1 > 0)
                    {
                        if (abyte0 == null)
                        {
                            parsablebytearray.c(i1);
                        } else
                        {
                            parsablebytearray.a(abyte0, e, i1);
                        }
                        e = i1 + e;
                        if (e != l)
                        {
                            return false;
                        }
                    }
                    return true;
                }

                private boolean b()
                {
                    b.a(0);
                    int l = b.c(24);
                    if (l != 1)
                    {
                        Log.w("TsExtractor", (new StringBuilder("Unexpected start code prefix: ")).append(l).toString());
                        i = -1;
                        return false;
                    }
                    b.b(8);
                    l = b.c(16);
                    b.b(8);
                    g = b.b();
                    b.b(7);
                    h = b.c(8);
                    if (l == 0)
                    {
                        i = -1;
                    } else
                    {
                        i = (l + 6) - 9 - h;
                    }
                    return true;
                }

                private void c()
                {
                    b.a(0);
                    j = 0L;
                    if (g)
                    {
                        b.b(4);
                        long l = b.c(3);
                        b.b(1);
                        long l1 = b.c(15) << 15;
                        b.b(1);
                        long l2 = b.c(15);
                        b.b(1);
                        j = a.a(l << 30 | l1 | l2);
                    }
                }

                public final void a()
                {
                    d = 0;
                    e = 0;
                    f = false;
                    c.a();
                }

                public final void a(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
                {
                    if (!flag) goto _L2; else goto _L1
_L1:
                    d;
                    JVM INSTR tableswitch 0 3: default 40
                //                               0 40
                //                               1 40
                //                               2 102
                //                               3 113;
                       goto _L3 _L3 _L3 _L4 _L5
_L3:
                    a(1);
_L2:
                    if (parsablebytearray.b() <= 0)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    switch (d)
                    {
                    case 0: // '\0'
                        parsablebytearray.c(parsablebytearray.b());
                        break;

                    case 1: // '\001'
                        if (a(parsablebytearray, b.a, 9))
                        {
                            byte byte0;
                            if (b())
                            {
                                byte0 = 2;
                            } else
                            {
                                byte0 = 0;
                            }
                            a(byte0);
                        }
                        break;

                    case 2: // '\002'
                        int l = Math.min(5, h);
                        if (a(parsablebytearray, b.a, l) && a(parsablebytearray, ((byte []) (null)), h))
                        {
                            c();
                            f = false;
                            a(3);
                        }
                        break;

                    case 3: // '\003'
                        int k1 = parsablebytearray.b();
                        int i1;
                        int j1;
                        long l1;
                        if (i == -1)
                        {
                            i1 = 0;
                        } else
                        {
                            i1 = k1 - i;
                        }
                        j1 = k1;
                        if (i1 > 0)
                        {
                            j1 = k1 - i1;
                            parsablebytearray.a(parsablebytearray.d() + j1);
                        }
                        extractoroutput = c;
                        l1 = j;
                        if (!f)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        extractoroutput.a(parsablebytearray, l1, flag);
                        f = true;
                        if (i != -1)
                        {
                            i = i - j1;
                            if (i == 0)
                            {
                                c.b();
                                a(1);
                            }
                        }
                        break;
                    }
                    continue; /* Loop/switch isn't completed */
_L4:
                    Log.w("TsExtractor", "Unexpected start indicator reading extended header");
                    continue; /* Loop/switch isn't completed */
_L5:
                    if (i != -1)
                    {
                        Log.w("TsExtractor", (new StringBuilder("Unexpected start indicator: expected ")).append(i).append(" more bytes").toString());
                    }
                    if (f)
                    {
                        c.b();
                    }
                    continue; /* Loop/switch isn't completed */
                    if (true) goto _L2; else goto _L6
_L6:
                    return;
                    if (true) goto _L3; else goto _L7
_L7:
                }

                public PesReader(ElementaryStreamReader elementarystreamreader)
                {
                    a = TsExtractor.this;
                    super((byte)0);
                    c = elementarystreamreader;
                    d = 0;
                }
            }

        }

    }

}
