// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            ElementaryStreamReader, NalUnitTargetBuffer, SeiReader

final class H264Reader extends ElementaryStreamReader
{

    private boolean b;
    private final SeiReader c;
    private final boolean d[] = new boolean[3];
    private final IfrParserBuffer e;
    private final NalUnitTargetBuffer f = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer g = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer h = new NalUnitTargetBuffer(6, 128);
    private boolean i;
    private long j;
    private boolean k;
    private long l;
    private long m;
    private final ParsableByteArray n = new ParsableByteArray();

    public H264Reader(TrackOutput trackoutput, SeiReader seireader, boolean flag)
    {
        super(trackoutput);
        c = seireader;
        if (flag)
        {
            trackoutput = null;
        } else
        {
            trackoutput = new IfrParserBuffer();
        }
        e = trackoutput;
    }

    private void a(int i1)
    {
        if (e != null)
        {
            e.a(i1);
        }
        if (!b)
        {
            f.a(i1);
            g.a(i1);
        }
        h.a(i1);
    }

    private void a(long l1, int i1)
    {
        f.b(i1);
        g.b(i1);
        if (h.b(i1))
        {
            i1 = NalUnitUtil.a(h.a, h.b);
            n.a(h.a, i1);
            n.b(4);
            c.a(n, l1, true);
        }
    }

    private void a(NalUnitTargetBuffer nalunittargetbuffer, NalUnitTargetBuffer nalunittargetbuffer1)
    {
        float f1;
        int j1;
        byte abyte0[] = new byte[nalunittargetbuffer.b];
        byte abyte1[] = new byte[nalunittargetbuffer1.b];
        System.arraycopy(nalunittargetbuffer.a, 0, abyte0, 0, nalunittargetbuffer.b);
        System.arraycopy(nalunittargetbuffer1.a, 0, abyte1, 0, nalunittargetbuffer1.b);
        nalunittargetbuffer1 = new ArrayList();
        nalunittargetbuffer1.add(abyte0);
        nalunittargetbuffer1.add(abyte1);
        NalUnitUtil.a(nalunittargetbuffer.a, nalunittargetbuffer.b);
        nalunittargetbuffer = new ParsableBitArray(nalunittargetbuffer.a);
        nalunittargetbuffer.b(32);
        int i1 = nalunittargetbuffer.c(8);
        nalunittargetbuffer.b(16);
        nalunittargetbuffer.d();
        j1 = 1;
        if (i1 == 100 || i1 == 110 || i1 == 122 || i1 == 244 || i1 == 44 || i1 == 83 || i1 == 86 || i1 == 118 || i1 == 128 || i1 == 138)
        {
            int i2 = nalunittargetbuffer.d();
            if (i2 == 3)
            {
                nalunittargetbuffer.b(1);
            }
            nalunittargetbuffer.d();
            nalunittargetbuffer.d();
            nalunittargetbuffer.b(1);
            if (nalunittargetbuffer.b())
            {
                if (i2 != 3)
                {
                    i1 = 8;
                } else
                {
                    i1 = 12;
                }
                j1 = 0;
                while (j1 < i1) 
                {
                    if (nalunittargetbuffer.b())
                    {
                        byte byte0;
                        if (j1 < 6)
                        {
                            byte0 = 16;
                        } else
                        {
                            byte0 = 64;
                        }
                        a(((ParsableBitArray) (nalunittargetbuffer)), byte0);
                    }
                    j1++;
                }
            }
            j1 = i2;
        }
        nalunittargetbuffer.d();
        long l3 = nalunittargetbuffer.d();
        int k1;
        int j2;
        int k2;
        boolean flag;
        if (l3 == 0L)
        {
            nalunittargetbuffer.d();
        } else
        if (l3 == 1L)
        {
            nalunittargetbuffer.b(1);
            nalunittargetbuffer.e();
            nalunittargetbuffer.e();
            long l4 = nalunittargetbuffer.d();
            i1 = 0;
            while ((long)i1 < l4) 
            {
                nalunittargetbuffer.d();
                i1++;
            }
        }
        nalunittargetbuffer.d();
        nalunittargetbuffer.b(1);
        j2 = nalunittargetbuffer.d();
        k1 = nalunittargetbuffer.d();
        flag = nalunittargetbuffer.b();
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!flag)
        {
            nalunittargetbuffer.b(1);
        }
        nalunittargetbuffer.b(1);
        j2 = (j2 + 1) * 16;
        k2 = (2 - i1) * (k1 + 1) * 16;
        k1 = j2;
        i1 = k2;
        if (nalunittargetbuffer.b())
        {
            int j3 = nalunittargetbuffer.d();
            int k3 = nalunittargetbuffer.d();
            int l2 = nalunittargetbuffer.d();
            int i3 = nalunittargetbuffer.d();
            if (j1 == 0)
            {
                j1 = 1;
                float f2;
                if (flag)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                k1 = 2 - i1;
                i1 = j1;
                j1 = k1;
            } else
            {
                int l1;
                if (j1 == 3)
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
                if (j1 == 1)
                {
                    j1 = 2;
                } else
                {
                    j1 = 1;
                }
                if (flag)
                {
                    l1 = 1;
                } else
                {
                    l1 = 0;
                }
                j1 = (2 - l1) * j1;
            }
            k1 = j2 - i1 * (j3 + k3);
            i1 = k2 - j1 * (l2 + i3);
        }
        f2 = 1.0F;
        if (!nalunittargetbuffer.b() || !nalunittargetbuffer.b()) goto _L2; else goto _L1
_L1:
        j1 = nalunittargetbuffer.c(8);
        if (j1 != 255) goto _L4; else goto _L3
_L3:
        j1 = nalunittargetbuffer.c(16);
        j2 = nalunittargetbuffer.c(16);
        f1 = f2;
        if (j1 != 0)
        {
            f1 = f2;
            if (j2 != 0)
            {
                f1 = (float)j1 / (float)j2;
            }
        }
_L6:
        a.a(MediaFormat.a("video/avc", -1, -1L, k1, i1, f1, nalunittargetbuffer1));
        b = true;
        return;
_L4:
        if (j1 < NalUnitUtil.b.length)
        {
            f1 = NalUnitUtil.b[j1];
            continue; /* Loop/switch isn't completed */
        }
        Log.w("H264Reader", (new StringBuilder("Unexpected aspect_ratio_idc value: ")).append(j1).toString());
_L2:
        f1 = 1.0F;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(ParsableBitArray parsablebitarray, int i1)
    {
        int i2 = 8;
        int k1 = 0;
        int l1 = 8;
        while (k1 < i1) 
        {
            int j1 = i2;
            if (i2 != 0)
            {
                j1 = (parsablebitarray.e() + l1 + 256) % 256;
            }
            if (j1 != 0)
            {
                l1 = j1;
            }
            k1++;
            i2 = j1;
        }
    }

    private void a(byte abyte0[], int i1, int j1)
    {
        if (e != null)
        {
            e.a(abyte0, i1, j1);
        }
        if (!b)
        {
            f.a(abyte0, i1, j1);
            g.a(abyte0, i1, j1);
        }
        h.a(abyte0, i1, j1);
    }

    public final void a()
    {
        c.a();
        NalUnitUtil.a(d);
        f.a();
        g.a();
        h.a();
        if (e != null)
        {
            e.a();
        }
        i = false;
        j = 0L;
    }

    public final void a(ParsableByteArray parsablebytearray, long l1, boolean flag)
    {
_L8:
        byte abyte0[];
        int i1;
        int j1;
        if (parsablebytearray.b() <= 0)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        i1 = parsablebytearray.d();
        j1 = parsablebytearray.c();
        abyte0 = parsablebytearray.a;
        j = j + (long)parsablebytearray.b();
        a.a(parsablebytearray, parsablebytearray.b());
_L6:
        int k1;
        int i2;
        int j2;
        int k2;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = NalUnitUtil.a(abyte0, i1, j1, d);
        if (k1 >= j1)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        j2 = k1 - i1;
        if (j2 > 0)
        {
            a(abyte0, i1, k1);
        }
        i2 = NalUnitUtil.b(abyte0, k1);
        k2 = j1 - k1;
        i2;
        JVM INSTR lookupswitch 2: default 148
    //                   5: 180
    //                   9: 188;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_188;
_L4:
        int l2;
        if (j2 < 0)
        {
            i1 = -j2;
        } else
        {
            i1 = 0;
        }
        a(l1, i1);
        a(i2);
        i1 = k1 + 3;
        continue; /* Loop/switch isn't completed */
_L2:
        k = true;
          goto _L4
        if (i)
        {
            if (e != null && e.b())
            {
                i1 = e.c();
                flag = k;
                if (i1 == 2 || i1 == 7)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                k = i1 | flag;
                e.a();
            }
            if (k && !b && f.b() && g.b())
            {
                a(f, g);
            }
            if (k)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            l2 = (int)(j - l);
            a.a(m, i1, l2 - k2, k2, null);
        }
        i = true;
        l = j - (long)k2;
        m = l1;
        k = false;
          goto _L4
        a(abyte0, i1, j1);
        i1 = j1;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b()
    {
    }

    private class IfrParserBuffer
    {

        private final ParsableBitArray a;
        private byte b[];
        private int c;
        private boolean d;
        private int e;

        public final void a()
        {
            d = false;
            c = 0;
            e = -1;
        }

        public final void a(int i1)
        {
            if (i1 == 1)
            {
                a();
                d = true;
            }
        }

        public final void a(byte abyte0[], int i1, int j1)
        {
            if (d)
            {
                j1 -= i1;
                if (b.length < c + j1)
                {
                    b = Arrays.copyOf(b, (c + j1) * 2);
                }
                System.arraycopy(abyte0, i1, b, c, j1);
                c = j1 + c;
                a.a(b, c);
                i1 = a.c();
                if (i1 != -1 && i1 <= a.a())
                {
                    a.b(i1);
                    i1 = a.c();
                    if (i1 != -1 && i1 <= a.a())
                    {
                        e = a.d();
                        d = false;
                        return;
                    }
                }
            }
        }

        public final boolean b()
        {
            return e != -1;
        }

        public final int c()
        {
            return e;
        }

        public IfrParserBuffer()
        {
            b = new byte[128];
            a = new ParsableBitArray(b);
            a();
        }
    }

}
