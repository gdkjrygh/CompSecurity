// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.PositionHolder;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.MpegAudioHeader;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.io.EOFException;

// Referenced classes of package com.google.android.exoplayer.extractor.mp3:
//            BufferingInput, ConstantBitrateSeeker, XingSeeker, VbriSeeker

public final class Mp3Extractor
    implements Extractor
{

    private static final int a = Util.e("ID3");
    private static final int b = Util.e("Xing");
    private static final int c = Util.e("Info");
    private static final int d = Util.e("VBRI");
    private final BufferingInput e = new BufferingInput(12288);
    private final ParsableByteArray f = new ParsableByteArray(4);
    private final MpegAudioHeader g = new MpegAudioHeader();
    private ExtractorOutput h;
    private TrackOutput i;
    private int j;
    private Seeker k;
    private long l;
    private int m;
    private int n;

    public Mp3Extractor()
    {
    }

    private static long a(ExtractorInput extractorinput, BufferingInput bufferinginput)
    {
        return extractorinput.b() - (long)bufferinginput.d();
    }

    private void a(ExtractorInput extractorinput, long l1)
    {
        if (a(extractorinput, l1, extractorinput.c()))
        {
            e.b();
            if (k != null)
            {
                return;
            }
            e.a(extractorinput, f.a, 0, 4);
            f.b(0);
            l1 += g.c;
            MpegAudioHeader.a(f.j(), g);
        }
        e.c();
        k = new ConstantBitrateSeeker(l1, g.f * 1000, extractorinput.c());
    }

    private boolean a(ExtractorInput extractorinput, long l1, long l2)
    {
        int i1;
        i1 = 17;
        e.b();
        k = null;
        extractorinput = e.a(extractorinput, g.c);
        if ((g.a & 1) != 1) goto _L2; else goto _L1
_L1:
        if (g.e != 1)
        {
            i1 = 32;
        }
_L4:
        extractorinput.b(i1 + 4);
        i1 = extractorinput.j();
        if (i1 == b || i1 == c)
        {
            k = XingSeeker.a(g, extractorinput, l1, l2);
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (g.e == 1)
        {
            i1 = 9;
        }
        if (true) goto _L4; else goto _L3
_L3:
        extractorinput.b(36);
        if (extractorinput.j() == d)
        {
            k = VbriSeeker.a(g, extractorinput, l1);
            return true;
        } else
        {
            return false;
        }
    }

    private int b(ExtractorInput extractorinput)
    {
        byte byte0 = 0;
        if (n != 0) goto _L2; else goto _L1
_L1:
        if (c(extractorinput) != -1L) goto _L4; else goto _L3
_L3:
        byte0 = -1;
_L6:
        return byte0;
_L4:
        if (l == -1L)
        {
            l = k.a(a(extractorinput, e));
        }
        n = g.c;
_L2:
        long l1;
        long l2;
        l1 = l;
        l2 = ((long)m * 0xf4240L) / (long)g.d;
        n = n - e.a(i, n);
        if (n <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        e.b();
        int i1 = i.a(extractorinput, n, true);
        if (i1 == -1)
        {
            return -1;
        }
        n = n - i1;
        if (n > 0) goto _L6; else goto _L5
_L5:
        i.a(l1 + l2, 1, g.c, 0, null);
        m = m + g.g;
        n = 0;
        return 0;
    }

    private long c(ExtractorInput extractorinput)
    {
        e.b();
        if (!e.b(extractorinput, f.a, 0, 4))
        {
            return -1L;
        }
        e.c();
        f.b(0);
        int i1 = f.j();
        if ((i1 & 0xfffe0c00) == (j & 0xfffe0c00) && MpegAudioHeader.a(i1) != -1)
        {
            MpegAudioHeader.a(i1, g);
            return 0L;
        } else
        {
            j = 0;
            e.b(extractorinput, 1);
            return d(extractorinput);
        }
    }

    private long d(ExtractorInput extractorinput)
    {
        long l1;
        try
        {
            l1 = e(extractorinput);
        }
        // Misplaced declaration of an exception variable
        catch (ExtractorInput extractorinput)
        {
            return -1L;
        }
        return l1;
    }

    private long e(ExtractorInput extractorinput)
    {
        int i1;
        int j1;
        long l2;
        long l3;
        if (extractorinput.b() == 0L)
        {
            e.a();
        } else
        {
            e.c();
        }
        l3 = a(extractorinput, e);
        l2 = l3;
        if (l3 == 0L)
        {
            e.a(extractorinput, f.a, 0, 3);
            f.b(0);
            if (f.h() == a)
            {
                extractorinput.a(3);
                extractorinput.b(f.a, 0, 4);
                extractorinput.a((f.a[0] & 0x7f) << 21 | (f.a[1] & 0x7f) << 14 | (f.a[2] & 0x7f) << 7 | f.a[3] & 0x7f);
                e.a();
                l2 = a(extractorinput, e);
            } else
            {
                e.c();
                l2 = l3;
            }
        }
        e.b();
        i1 = 0;
        j1 = 0;
        l3 = l2;
        do
        {
            int k1;
            int l1;
label0:
            {
                if (l3 - l2 >= 0x20000L)
                {
                    throw new ParserException("Searched too many bytes while resynchronizing.");
                }
                if (!e.b(extractorinput, f.a, 0, 4))
                {
                    return -1L;
                }
                f.b(0);
                k1 = f.j();
                if (i1 == 0 || (0xfffe0c00 & k1) == (0xfffe0c00 & i1))
                {
                    l1 = MpegAudioHeader.a(k1);
                    if (l1 != -1)
                    {
                        break label0;
                    }
                }
                i1 = 0;
                e.c();
                e.b(extractorinput, 1);
                e.b();
                l3++;
                j1 = 0;
                continue;
            }
            if (j1 == 0)
            {
                MpegAudioHeader.a(k1, g);
                i1 = k1;
            }
            j1++;
            if (j1 == 4)
            {
                break;
            }
            e.b(extractorinput, l1 - 4);
        } while (true);
        e.c();
        j = i1;
        if (k == null)
        {
            a(extractorinput, l3);
            h.a(k);
            i.a(MediaFormat.b(g.b, 4096, k.b(), g.e, g.d, null));
        }
        return l3;
    }

    public final int a(ExtractorInput extractorinput, PositionHolder positionholder)
    {
        if (j == 0 && d(extractorinput) == -1L)
        {
            return -1;
        } else
        {
            return b(extractorinput);
        }
    }

    public final void a(ExtractorOutput extractoroutput)
    {
        h = extractoroutput;
        i = extractoroutput.a_(0);
        extractoroutput.a();
    }

    public final boolean a(ExtractorInput extractorinput)
    {
        ParsableByteArray parsablebytearray = new ParsableByteArray(4);
        extractorinput.c(parsablebytearray.a, 0, 3);
        int j1;
        int k1;
        int l1;
        int i2;
        if (parsablebytearray.h() == a)
        {
            extractorinput.b(3);
            extractorinput.c(parsablebytearray.a, 0, 4);
            int i1 = (parsablebytearray.a[0] & 0x7f) << 21 | (parsablebytearray.a[1] & 0x7f) << 14 | (parsablebytearray.a[2] & 0x7f) << 7 | parsablebytearray.a[3] & 0x7f;
            extractorinput.b(i1);
            k1 = i1 + 10;
        } else
        {
            extractorinput.a();
            k1 = 0;
        }
        j1 = 0;
        l1 = 0;
        i2 = k1;
        do
        {
            int j2;
            int k2;
label0:
            {
                if (i2 - k1 >= 4096)
                {
                    return false;
                }
                extractorinput.c(parsablebytearray.a, 0, 4);
                parsablebytearray.b(0);
                j2 = parsablebytearray.j();
                if (j1 == 0 || (j2 & 0xfffe0c00) == (j1 & 0xfffe0c00))
                {
                    k2 = MpegAudioHeader.a(j2);
                    if (k2 != -1)
                    {
                        break label0;
                    }
                }
                extractorinput.a();
                i2++;
                extractorinput.b(i2);
                j1 = 0;
                l1 = 0;
                continue;
            }
            if (l1 == 0)
            {
                j1 = j2;
            }
            l1++;
            if (l1 == 4)
            {
                return true;
            }
            extractorinput.b(k2 - 4);
        } while (true);
    }

    public final void b()
    {
        j = 0;
        m = 0;
        l = -1L;
        n = 0;
        e.a();
    }


    private class Seeker
        implements SeekMap
    {

        public abstract long a(long l1);

        public abstract long b();
    }

}
