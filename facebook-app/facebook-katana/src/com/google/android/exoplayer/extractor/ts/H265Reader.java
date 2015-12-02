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
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            ElementaryStreamReader, NalUnitTargetBuffer, SeiReader

final class H265Reader extends ElementaryStreamReader
{

    private boolean b;
    private final SeiReader c;
    private final boolean d[] = new boolean[3];
    private final NalUnitTargetBuffer e = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer f = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer g = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer h = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer i = new NalUnitTargetBuffer(40, 128);
    private boolean j;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private final ParsableByteArray o = new ParsableByteArray();

    public H265Reader(TrackOutput trackoutput, SeiReader seireader)
    {
        super(trackoutput);
        c = seireader;
    }

    private void a(int i1)
    {
        if (!b)
        {
            e.a(i1);
            f.a(i1);
            g.a(i1);
        }
        h.a(i1);
        i.a(i1);
    }

    private void a(long l1, int i1)
    {
        e.b(i1);
        f.b(i1);
        g.b(i1);
        if (h.b(i1))
        {
            int j1 = NalUnitUtil.a(h.a, h.b);
            o.a(h.a, j1);
            o.c(5);
            c.a(o, l1, true);
        }
        if (i.b(i1))
        {
            i1 = NalUnitUtil.a(i.a, i.b);
            o.a(i.a, i1);
            o.c(5);
            c.a(o, l1, true);
        }
    }

    private void a(NalUnitTargetBuffer nalunittargetbuffer, NalUnitTargetBuffer nalunittargetbuffer1, NalUnitTargetBuffer nalunittargetbuffer2)
    {
        float f2;
        byte abyte0[];
        int i2;
        int k2;
        abyte0 = new byte[nalunittargetbuffer.b + nalunittargetbuffer1.b + nalunittargetbuffer2.b];
        System.arraycopy(nalunittargetbuffer.a, 0, abyte0, 0, nalunittargetbuffer.b);
        System.arraycopy(nalunittargetbuffer1.a, 0, abyte0, nalunittargetbuffer.b, nalunittargetbuffer1.b);
        System.arraycopy(nalunittargetbuffer2.a, 0, abyte0, nalunittargetbuffer.b + nalunittargetbuffer1.b, nalunittargetbuffer2.b);
        NalUnitUtil.a(nalunittargetbuffer1.a, nalunittargetbuffer1.b);
        nalunittargetbuffer = new ParsableBitArray(nalunittargetbuffer1.a);
        nalunittargetbuffer.b(44);
        int l2 = nalunittargetbuffer.c(3);
        nalunittargetbuffer.b(1);
        nalunittargetbuffer.b(88);
        nalunittargetbuffer.b(8);
        int i1 = 0;
        for (int j2 = 0; j2 < l2; j2++)
        {
            int l1 = i1;
            if (nalunittargetbuffer.c(1) == 1)
            {
                l1 = i1 + 89;
            }
            i1 = l1;
            if (nalunittargetbuffer.c(1) == 1)
            {
                i1 = l1 + 8;
            }
        }

        nalunittargetbuffer.b(i1);
        if (l2 > 0)
        {
            nalunittargetbuffer.b((8 - l2) * 2);
        }
        nalunittargetbuffer.d();
        int k4 = nalunittargetbuffer.d();
        if (k4 == 3)
        {
            nalunittargetbuffer.b(1);
        }
        int k3 = nalunittargetbuffer.d();
        int j3 = nalunittargetbuffer.d();
        k2 = k3;
        i2 = j3;
        if (nalunittargetbuffer.b())
        {
            k2 = nalunittargetbuffer.d();
            int j4 = nalunittargetbuffer.d();
            int l3 = nalunittargetbuffer.d();
            int i4 = nalunittargetbuffer.d();
            if (k4 == 1 || k4 == 2)
            {
                i1 = 2;
            } else
            {
                i1 = 1;
            }
            if (k4 == 1)
            {
                i2 = 2;
            } else
            {
                i2 = 1;
            }
            k2 = k3 - i1 * (k2 + j4);
            i2 = j3 - i2 * (l3 + i4);
        }
        nalunittargetbuffer.d();
        nalunittargetbuffer.d();
        j3 = nalunittargetbuffer.d();
        if (nalunittargetbuffer.b())
        {
            i1 = 0;
        } else
        {
            i1 = l2;
        }
        for (; i1 <= l2; i1++)
        {
            nalunittargetbuffer.d();
            nalunittargetbuffer.d();
            nalunittargetbuffer.d();
        }

        nalunittargetbuffer.d();
        nalunittargetbuffer.d();
        nalunittargetbuffer.d();
        nalunittargetbuffer.d();
        nalunittargetbuffer.d();
        nalunittargetbuffer.d();
        if (nalunittargetbuffer.b() && nalunittargetbuffer.b())
        {
            a(((ParsableBitArray) (nalunittargetbuffer)));
        }
        nalunittargetbuffer.b(2);
        if (nalunittargetbuffer.b())
        {
            nalunittargetbuffer.b(4);
            nalunittargetbuffer.d();
            nalunittargetbuffer.d();
            nalunittargetbuffer.b(1);
        }
        b(nalunittargetbuffer);
        if (nalunittargetbuffer.b())
        {
            for (int j1 = 0; j1 < nalunittargetbuffer.d(); j1++)
            {
                nalunittargetbuffer.b(j3 + 4 + 1);
            }

        }
        nalunittargetbuffer.b(2);
        f2 = 1.0F;
        if (!nalunittargetbuffer.b() || !nalunittargetbuffer.b()) goto _L2; else goto _L1
_L1:
        int k1 = nalunittargetbuffer.c(8);
        if (k1 != 255) goto _L4; else goto _L3
_L3:
        float f1;
        k1 = nalunittargetbuffer.c(16);
        int i3 = nalunittargetbuffer.c(16);
        f1 = f2;
        if (k1 != 0)
        {
            f1 = f2;
            if (i3 != 0)
            {
                f1 = (float)k1 / (float)i3;
            }
        }
_L6:
        a.a(MediaFormat.a("video/hevc", -1, -1L, k2, i2, f1, Collections.singletonList(abyte0)));
        b = true;
        return;
_L4:
        if (k1 < NalUnitUtil.b.length)
        {
            f1 = NalUnitUtil.b[k1];
            continue; /* Loop/switch isn't completed */
        }
        Log.w("H265Reader", (new StringBuilder("Unexpected aspect_ratio_idc value: ")).append(k1).toString());
_L2:
        f1 = 1.0F;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(ParsableBitArray parsablebitarray)
    {
        for (int i1 = 0; i1 < 4; i1++)
        {
            int j1 = 0;
            while (j1 < 6) 
            {
                int k1;
                if (!parsablebitarray.b())
                {
                    parsablebitarray.d();
                } else
                {
                    int l1 = Math.min(64, 1 << (i1 + 4 << 1));
                    if (i1 > 1)
                    {
                        parsablebitarray.e();
                    }
                    k1 = 0;
                    while (k1 < l1) 
                    {
                        parsablebitarray.e();
                        k1++;
                    }
                }
                if (i1 == 3)
                {
                    k1 = 3;
                } else
                {
                    k1 = 1;
                }
                j1 = k1 + j1;
            }
        }

    }

    private void a(byte abyte0[], int i1, int j1)
    {
        if (!b)
        {
            e.a(abyte0, i1, j1);
            f.a(abyte0, i1, j1);
            g.a(abyte0, i1, j1);
        }
        h.a(abyte0, i1, j1);
        i.a(abyte0, i1, j1);
    }

    private static boolean a(byte abyte0[], int i1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            int j1 = NalUnitUtil.c(abyte0, i1);
            if (j1 > 9)
            {
                flag = flag1;
                if (j1 < 16)
                {
                    break label0;
                }
                flag = flag1;
                if (j1 > 21)
                {
                    break label0;
                }
            }
            flag = flag1;
            if ((abyte0[i1 + 5] & 0x80) != 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static void b(ParsableBitArray parsablebitarray)
    {
        int j2 = parsablebitarray.d();
        int i1 = 0;
        int k1 = 0;
        boolean flag = false;
        while (i1 < j2) 
        {
            if (i1 != 0)
            {
                flag = parsablebitarray.b();
            }
            int j1;
            if (flag)
            {
                parsablebitarray.b(1);
                parsablebitarray.d();
                int l1 = 0;
                do
                {
                    j1 = k1;
                    if (l1 > k1)
                    {
                        break;
                    }
                    if (parsablebitarray.b())
                    {
                        parsablebitarray.b(1);
                    }
                    l1++;
                } while (true);
            } else
            {
                k1 = parsablebitarray.d();
                int k2 = parsablebitarray.d();
                int i2 = k1 + k2;
                for (j1 = 0; j1 < k1; j1++)
                {
                    parsablebitarray.d();
                    parsablebitarray.b(1);
                }

                k1 = 0;
                do
                {
                    j1 = i2;
                    if (k1 >= k2)
                    {
                        break;
                    }
                    parsablebitarray.d();
                    parsablebitarray.b(1);
                    k1++;
                } while (true);
            }
            i1++;
            k1 = j1;
        }
    }

    private static boolean b(int i1)
    {
        return i1 == 16 || i1 == 17 || i1 == 18 || i1 == 19 || i1 == 20 || i1 == 21;
    }

    public final void a()
    {
        c.a();
        NalUnitUtil.a(d);
        e.a();
        f.a();
        g.a();
        h.a();
        i.a();
        j = false;
        k = 0L;
    }

    public final void a(ParsableByteArray parsablebytearray, long l1, boolean flag)
    {
        while (parsablebytearray.b() > 0) 
        {
            int i1 = parsablebytearray.d();
            int j1 = parsablebytearray.c();
            byte abyte0[] = parsablebytearray.a;
            k = k + (long)parsablebytearray.b();
            a.a(parsablebytearray, parsablebytearray.b());
            while (i1 < j1) 
            {
                int k1 = NalUnitUtil.a(abyte0, i1, j1, d);
                if (k1 < j1)
                {
                    int j2 = k1 - i1;
                    if (j2 > 0)
                    {
                        a(abyte0, i1, k1);
                    }
                    int i2 = NalUnitUtil.c(abyte0, k1);
                    int k2 = j1 - k1;
                    if (a(abyte0, k1))
                    {
                        if (j)
                        {
                            if (l && !b && e.b() && f.b() && g.b())
                            {
                                a(e, f, g);
                            }
                            int l2;
                            if (l)
                            {
                                i1 = 1;
                            } else
                            {
                                i1 = 0;
                            }
                            l2 = (int)(k - m);
                            a.a(n, i1, l2 - k2, k2, null);
                        }
                        j = true;
                        m = k - (long)k2;
                        n = l1;
                        l = b(i2);
                    }
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
                } else
                {
                    a(abyte0, i1, j1);
                    i1 = j1;
                }
            }
        }
    }

    public final void b()
    {
    }
}
