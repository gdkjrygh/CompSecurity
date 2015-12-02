// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ChunkIndex;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.PositionHolder;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.LongArray;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//            DefaultEbmlReader, EbmlReader, VarintReader, Sniffer

public final class WebmExtractor
    implements Extractor
{

    private boolean A;
    private int B;
    private long C;
    private int D;
    private int E;
    private int F[];
    private int G;
    private int H;
    private int I;
    private byte J[];
    private int K;
    private boolean L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private ExtractorOutput Q;
    private final EbmlReader a;
    private final VarintReader b;
    private final ParsableByteArray c;
    private final ParsableByteArray d;
    private final ParsableByteArray e;
    private final ParsableByteArray f;
    private final ParsableByteArray g;
    private final ParsableByteArray h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private TrackFormat n;
    private TrackFormat o;
    private TrackFormat p;
    private boolean q;
    private int r;
    private long s;
    private boolean t;
    private long u;
    private long v;
    private int w;
    private long x;
    private LongArray y;
    private LongArray z;

    public WebmExtractor()
    {
        this(((EbmlReader) (new DefaultEbmlReader())));
    }

    private WebmExtractor(EbmlReader ebmlreader)
    {
        i = -1L;
        j = -1L;
        k = -1L;
        l = -1L;
        m = -1L;
        u = -1L;
        v = -1L;
        w = 0;
        x = -1L;
        a = ebmlreader;
        a.a(new InnerEbmlReaderOutput((byte)0));
        b = new VarintReader();
        e = new ParsableByteArray(4);
        f = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        g = new ParsableByteArray(4);
        c = new ParsableByteArray(NalUnitUtil.a);
        d = new ParsableByteArray(4);
        h = new ParsableByteArray();
    }

    static int a(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 160: 
        case 174: 
        case 183: 
        case 187: 
        case 224: 
        case 225: 
        case 18407: 
        case 19899: 
        case 20532: 
        case 20533: 
        case 25152: 
        case 28032: 
        case 290298740: 
        case 357149030: 
        case 374648427: 
        case 408125543: 
        case 440786851: 
        case 475249515: 
        case 524531317: 
            return 1;

        case 131: 
        case 159: 
        case 176: 
        case 179: 
        case 186: 
        case 215: 
        case 231: 
        case 241: 
        case 251: 
        case 16980: 
        case 17029: 
        case 17143: 
        case 18401: 
        case 18408: 
        case 20529: 
        case 20530: 
        case 21420: 
        case 22186: 
        case 22203: 
        case 2352003: 
        case 2807729: 
            return 2;

        case 134: 
        case 17026: 
            return 3;

        case 161: 
        case 163: 
        case 16981: 
        case 18402: 
        case 21419: 
        case 25506: 
            return 4;

        case 181: 
        case 17545: 
            return 5;
        }
    }

    private int a(ExtractorInput extractorinput, TrackOutput trackoutput, int i1)
    {
        int j1 = h.b();
        if (j1 > 0)
        {
            i1 = Math.min(i1, j1);
            trackoutput.a(h, i1);
        } else
        {
            i1 = trackoutput.a(extractorinput, i1, false);
        }
        K = K + i1;
        N = N + i1;
        return i1;
    }

    private long a(long l1)
    {
        if (k == -1L)
        {
            throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
        } else
        {
            return Util.a(l1, k, 1000L);
        }
    }

    private void a()
    {
        K = 0;
        N = 0;
        M = 0;
        L = false;
        h.a();
    }

    private void a(ExtractorInput extractorinput, int i1)
    {
        if (e.c() >= i1)
        {
            return;
        }
        if (e.e() < i1)
        {
            e.a(Arrays.copyOf(e.a, Math.max(e.a.length * 2, i1)), e.c());
        }
        extractorinput.b(e.a, e.c(), i1 - e.c());
        e.a(i1);
    }

    private void a(ExtractorInput extractorinput, TrackOutput trackoutput, TrackFormat trackformat, int i1)
    {
        if (L) goto _L2; else goto _L1
_L1:
        if (!trackformat.e) goto _L4; else goto _L3
_L3:
        I = I & -3;
        extractorinput.b(e.a, 0, 1);
        K = K + 1;
        if ((e.a[0] & 0x80) == 128)
        {
            throw new ParserException("Extension bit is set in signal byte");
        }
        if ((e.a[0] & 1) == 1)
        {
            e.a[0] = 8;
            e.b(0);
            trackoutput.a(e, 1);
            N = N + 1;
            I = I | 2;
        }
_L6:
        L = true;
_L2:
        i1 = h.c() + i1;
        if (!"V_MPEG4/ISO/AVC".equals(trackformat.a) && !"V_MPEGH/ISO/HEVC".equals(trackformat.a))
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = d.a;
        abyte0[0] = 0;
        abyte0[1] = 0;
        abyte0[2] = 0;
        int j1 = trackformat.k;
        int k1 = trackformat.k;
        while (K < i1) 
        {
            if (M == 0)
            {
                a(extractorinput, abyte0, 4 - k1, j1);
                d.b(0);
                M = d.m();
                c.b(0);
                trackoutput.a(c, 4);
                N = N + 4;
            } else
            {
                M = M - a(extractorinput, trackoutput, M);
            }
        }
        break MISSING_BLOCK_LABEL_375;
_L4:
        if (trackformat.f != null)
        {
            h.a(trackformat.f, trackformat.f.length);
        }
        if (true) goto _L6; else goto _L5
_L5:
        while (K < i1) 
        {
            a(extractorinput, trackoutput, i1 - K);
        }
        if ("A_VORBIS".equals(trackformat.a))
        {
            f.b(0);
            trackoutput.a(f, 4);
            N = N + 4;
        }
        return;
    }

    private void a(ExtractorInput extractorinput, byte abyte0[], int i1, int j1)
    {
        int k1 = Math.min(j1, h.b());
        extractorinput.b(abyte0, i1 + k1, j1 - k1);
        if (k1 > 0)
        {
            h.a(abyte0, i1, k1);
        }
        K = K + j1;
    }

    private void a(TrackOutput trackoutput, long l1)
    {
        trackoutput.a(l1, I, N, 0, J);
        O = true;
        a();
    }

    private boolean a(PositionHolder positionholder, long l1)
    {
        if (t)
        {
            v = l1;
            positionholder.a = u;
            w = 1;
            t = false;
            return true;
        }
        if (w == 2 && v != -1L)
        {
            positionholder.a = v;
            v = -1L;
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean a(String s1)
    {
        return "V_VP8".equals(s1) || "V_VP9".equals(s1) || "V_MPEG4/ISO/SP".equals(s1) || "V_MPEG4/ISO/ASP".equals(s1) || "V_MPEG4/ISO/AP".equals(s1) || "V_MPEG4/ISO/AVC".equals(s1) || "V_MPEGH/ISO/HEVC".equals(s1) || "A_OPUS".equals(s1) || "A_VORBIS".equals(s1) || "A_AAC".equals(s1) || "A_MPEG/L3".equals(s1) || "A_AC3".equals(s1);
    }

    private static int[] a(int ai[], int i1)
    {
        int ai1[];
        if (ai == null)
        {
            ai1 = new int[i1];
        } else
        {
            ai1 = ai;
            if (ai.length < i1)
            {
                return new int[Math.max(ai.length * 2, i1)];
            }
        }
        return ai1;
    }

    private SeekMap c()
    {
        boolean flag = false;
        if (i == -1L || m == -1L || y == null || y.a() == 0 || z == null || z.a() != y.a())
        {
            y = null;
            z = null;
            return SeekMap.f;
        }
        int k1 = y.a();
        int ai[] = new int[k1];
        long al[] = new long[k1];
        long al1[] = new long[k1];
        long al2[] = new long[k1];
        int i1 = 0;
        int j1;
        do
        {
            j1 = ((flag) ? 1 : 0);
            if (i1 >= k1)
            {
                break;
            }
            al2[i1] = y.a(i1);
            al[i1] = i + z.a(i1);
            i1++;
        } while (true);
        for (; j1 < k1 - 1; j1++)
        {
            ai[j1] = (int)(al[j1 + 1] - al[j1]);
            al1[j1] = al2[j1 + 1] - al2[j1];
        }

        ai[k1 - 1] = (int)((i + j) - al[k1 - 1]);
        al1[k1 - 1] = m - al2[k1 - 1];
        y = null;
        z = null;
        return new ChunkIndex(ai, al, al1, al2);
    }

    public final int a(ExtractorInput extractorinput, PositionHolder positionholder)
    {
        O = false;
        boolean flag;
        for (flag = true; flag && !O;)
        {
            boolean flag1 = a.a(extractorinput);
            flag = flag1;
            if (flag1)
            {
                flag = flag1;
                if (a(positionholder, extractorinput.b()))
                {
                    return 1;
                }
            }
        }

        return !flag ? -1 : 0;
    }

    final void a(int i1, double d1)
    {
        switch (i1)
        {
        default:
            return;

        case 17545: 
            l = (long)d1;
            return;

        case 181: 
            n.m = (int)d1;
            return;
        }
    }

    final void a(int i1, int j1, ExtractorInput extractorinput)
    {
        TrackFormat trackformat;
        TrackOutput trackoutput;
        switch (i1)
        {
        default:
            throw new ParserException((new StringBuilder("Unexpected id: ")).append(i1).toString());

        case 21419: 
            Arrays.fill(g.a, (byte)0);
            extractorinput.b(g.a, 4 - j1, j1);
            g.b(0);
            r = (int)g.i();
            return;

        case 25506: 
            n.h = new byte[j1];
            extractorinput.b(n.h, 0, j1);
            return;

        case 16981: 
            n.f = new byte[j1];
            extractorinput.b(n.f, 0, j1);
            return;

        case 18402: 
            n.g = new byte[j1];
            extractorinput.b(n.g, 0, j1);
            return;

        case 161: 
        case 163: 
            break;
        }
        if (B == 0)
        {
            G = (int)b.a(extractorinput, false, true);
            H = b.b();
            B = 1;
            e.a();
        }
        if (o != null && p != null && o.b != G && p.b != G || o != null && p == null && o.b != G || o == null && p != null && p.b != G)
        {
            extractorinput.a(j1 - H);
            B = 0;
            return;
        }
        if (o != null && G == o.b)
        {
            trackformat = o;
        } else
        {
            trackformat = p;
        }
        trackoutput = trackformat.p;
        if (B == 1)
        {
            a(extractorinput, 3);
            int k1 = (e.a[2] & 6) >> 1;
            if (k1 == 0)
            {
                E = 1;
                F = a(F, 1);
                F[0] = j1 - H - 3;
            } else
            {
                if (i1 != 163)
                {
                    throw new ParserException("Lacing only supported in SimpleBlocks.");
                }
                a(extractorinput, 4);
                E = (e.a[3] & 0xff) + 1;
                F = a(F, E);
                if (k1 == 2)
                {
                    j1 = (j1 - H - 4) / E;
                    Arrays.fill(F, 0, E, j1);
                } else
                if (k1 == 1)
                {
                    int l1 = 0;
                    k1 = 4;
                    for (int j2 = 0; j2 < E - 1; j2++)
                    {
                        F[j2] = 0;
                        int l2 = k1;
                        int j3;
                        do
                        {
                            k1 = l2 + 1;
                            a(extractorinput, k1);
                            j3 = e.a[k1 - 1] & 0xff;
                            int ai[] = F;
                            ai[j2] = ai[j2] + j3;
                            l2 = k1;
                        } while (j3 == 255);
                        l1 += F[j2];
                    }

                    F[E - 1] = j1 - H - k1 - l1;
                } else
                {
label0:
                    {
                        if (k1 != 3)
                        {
                            break label0;
                        }
                        int i2 = 0;
                        k1 = 4;
                        int k2 = 0;
                        do
                        {
                            if (k2 >= E - 1)
                            {
                                break;
                            }
                            F[k2] = 0;
                            int k3 = k1 + 1;
                            a(extractorinput, k3);
                            if (e.a[k3 - 1] == 0)
                            {
                                throw new ParserException("No valid varint length mask found");
                            }
                            long l5 = 0L;
                            int i3 = 0;
                            long l4;
label1:
                            do
                            {
label2:
                                {
                                    k1 = k3;
                                    l4 = l5;
                                    if (i3 < 8)
                                    {
                                        k1 = 1 << 7 - i3;
                                        if ((e.a[k3 - 1] & k1) == 0)
                                        {
                                            break label2;
                                        }
                                        int l3 = k3 - 1;
                                        k3 += i3;
                                        a(extractorinput, k3);
                                        long l6 = e.a[l3] & 0xff & ~k1;
                                        for (k1 = l3 + 1; k1 < k3; k1++)
                                        {
                                            l6 = (long)(e.a[k1] & 0xff) | l6 << 8;
                                        }

                                        k1 = k3;
                                        l4 = l6;
                                        if (k2 > 0)
                                        {
                                            l4 = l6 - ((1L << i3 * 7 + 6) - 1L);
                                            k1 = k3;
                                        }
                                    }
                                    if (l4 < 0xffffffff80000000L || l4 > 0x7fffffffL)
                                    {
                                        throw new ParserException("EBML lacing sample size out of range.");
                                    }
                                    break label1;
                                }
                                i3++;
                            } while (true);
                            i3 = (int)l4;
                            int ai1[] = F;
                            if (k2 != 0)
                            {
                                i3 += F[k2 - 1];
                            }
                            ai1[k2] = i3;
                            i2 += F[k2];
                            k2++;
                        } while (true);
                        F[E - 1] = j1 - H - k1 - i2;
                    }
                }
            }
            j1 = e.a[0];
            k1 = e.a[1];
            C = x + a(j1 << 8 | k1 & 0xff);
            if ((e.a[2] & 8) == 8)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (i1 == 163 && (e.a[2] & 0x80) == 128)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (k1 != 0)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (j1 != 0)
            {
                j1 = 0x8000000;
            } else
            {
                j1 = 0;
            }
            I = j1 | k1;
            J = trackformat.g;
            B = 2;
            D = 0;
        }
        if (i1 != 163)
        {
            break MISSING_BLOCK_LABEL_1356;
        }
        for (; D < E; D = D + 1)
        {
            a(extractorinput, trackoutput, trackformat, F[D]);
            a(trackoutput, C + (long)((D * trackformat.d) / 1000));
        }

        break MISSING_BLOCK_LABEL_1350;
        throw new IllegalStateException((new StringBuilder("Unexpected lacing value: ")).append(k1).toString());
        B = 0;
        return;
        a(extractorinput, trackoutput, trackformat, F[0]);
        return;
    }

    final void a(int i1, long l1)
    {
        i1;
        JVM INSTR lookupswitch 21: default 180
    //                   131: 310
    //                   159: 348
    //                   176: 280
    //                   179: 553
    //                   186: 290
    //                   215: 300
    //                   231: 587
    //                   241: 566
    //                   251: 358
    //                   16980: 438
    //                   17029: 218
    //                   17143: 181
    //                   18401: 477
    //                   18408: 516
    //                   20529: 364
    //                   20530: 401
    //                   21420: 263
    //                   22186: 330
    //                   22203: 339
    //                   2352003: 320
    //                   2807729: 274;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        return;
_L13:
        if (l1 != 1L)
        {
            throw new ParserException((new StringBuilder("EBMLReadVersion ")).append(l1).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (l1 < 1L || l1 > 2L)
        {
            throw new ParserException((new StringBuilder("DocTypeReadVersion ")).append(l1).append(" not supported").toString());
        }
        if (true) goto _L1; else goto _L18
_L18:
        s = i + l1;
        return;
_L22:
        k = l1;
        return;
_L4:
        n.i = (int)l1;
        return;
_L6:
        n.j = (int)l1;
        return;
_L7:
        n.b = (int)l1;
        return;
_L2:
        n.c = (int)l1;
        return;
_L21:
        n.d = (int)l1;
        return;
_L19:
        n.n = l1;
        return;
_L20:
        n.o = l1;
        return;
_L3:
        n.l = (int)l1;
        return;
_L10:
        P = true;
        return;
_L16:
        if (l1 != 0L)
        {
            throw new ParserException((new StringBuilder("ContentEncodingOrder ")).append(l1).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L17:
        if (l1 != 1L)
        {
            throw new ParserException((new StringBuilder("ContentEncodingScope ")).append(l1).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (l1 != 3L)
        {
            throw new ParserException((new StringBuilder("ContentCompAlgo ")).append(l1).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (l1 != 5L)
        {
            throw new ParserException((new StringBuilder("ContentEncAlgo ")).append(l1).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L15:
        if (l1 != 1L)
        {
            throw new ParserException((new StringBuilder("AESSettingsCipherMode ")).append(l1).append(" not supported").toString());
        }
        if (true) goto _L1; else goto _L5
_L5:
        y.a(a(l1));
        return;
_L9:
        if (!A)
        {
            z.a(l1);
            A = true;
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        x = a(l1);
        return;
    }

    final void a(int i1, long l1, long l2)
    {
        i1;
        JVM INSTR lookupswitch 9: default 84
    //                   160: 212
    //                   174: 227
    //                   187: 164
    //                   19899: 128
    //                   20533: 218
    //                   25152: 84
    //                   408125543: 85
    //                   475249515: 141
    //                   524531317: 170;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L9
_L1:
        return;
_L7:
        if (i != -1L && i != l1)
        {
            throw new ParserException("Multiple Segment elements not supported");
        } else
        {
            i = l1;
            j = l2;
            return;
        }
_L5:
        r = -1;
        s = -1L;
        return;
_L8:
        y = new LongArray();
        z = new LongArray();
        return;
_L4:
        A = false;
        return;
_L9:
        if (w == 0)
        {
            if (u != -1L)
            {
                t = true;
                return;
            } else
            {
                Q.a(SeekMap.f);
                w = 2;
                return;
            }
        }
          goto _L1
_L2:
        P = false;
        return;
_L6:
        n.e = true;
        return;
_L3:
        n = new TrackFormat((byte)0);
        return;
    }

    final void a(int i1, String s1)
    {
        i1;
        JVM INSTR lookupswitch 2: default 28
    //                   134: 80
    //                   17026: 29;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        if (!"webm".equals(s1) && !"matroska".equals(s1))
        {
            throw new ParserException((new StringBuilder("DocType ")).append(s1).append(" not supported").toString());
        }
          goto _L1
_L2:
        n.a = s1;
        return;
    }

    public final void a(ExtractorOutput extractoroutput)
    {
        Q = extractoroutput;
    }

    public final boolean a(ExtractorInput extractorinput)
    {
        return (new Sniffer()).a(extractorinput);
    }

    public final void b()
    {
        x = -1L;
        B = 0;
        a.a();
        b.a();
        a();
    }

    final void b(int i1)
    {
        i1;
        JVM INSTR lookupswitch 8: default 76
    //                   160: 195
    //                   174: 376
    //                   19899: 119
    //                   25152: 275
    //                   28032: 345
    //                   357149030: 77
    //                   374648427: 616
    //                   475249515: 168;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_616;
_L10:
        return;
_L7:
        if (k == -1L)
        {
            k = 0xf4240L;
        }
        if (l != -1L)
        {
            m = a(l);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (r == -1 || s == -1L)
        {
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        }
        if (r == 0x1c53bb6b)
        {
            u = s;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (w != 2)
        {
            Q.a(c());
            w = 2;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (B == 2)
        {
            if (!P)
            {
                I = I | 1;
            }
            TrackOutput trackoutput;
            if (o != null && G == o.b)
            {
                trackoutput = o.p;
            } else
            {
                trackoutput = p.p;
            }
            a(trackoutput, C);
            B = 0;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (n.e)
        {
            if (n.g == null)
            {
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
            }
            if (!q)
            {
                Q.a(new com.google.android.exoplayer.drm.DrmInitData.Universal("video/webm", n.g));
                q = true;
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (n.e && n.f != null)
        {
            throw new ParserException("Combining encryption and compression is not supported");
        }
        if (true) goto _L10; else goto _L3
_L3:
        if (n.b == -1 || n.c == -1)
        {
            throw new ParserException("Mandatory element TrackNumber or TrackType not found");
        }
        if (n.c == 2 && o != null || n.c == 1 && p != null)
        {
            n = null;
            return;
        }
        if (n.c == 2 && a(n.a))
        {
            o = n;
            o.p = Q.a_(o.b);
            o.p.a(o.a(m));
        } else
        if (n.c == 1 && a(n.a))
        {
            p = n;
            p.p = Q.a_(p.b);
            p.p.a(p.a(m));
        }
        n = null;
        return;
        if (p == null && o == null)
        {
            throw new ParserException("No valid tracks were found");
        } else
        {
            Q.a();
            return;
        }
    }

    private class InnerEbmlReaderOutput
        implements EbmlReaderOutput
    {

        final WebmExtractor a;

        public final int a(int i1)
        {
            return WebmExtractor.a(i1);
        }

        public final void a(int i1, double d1)
        {
            a.a(i1, d1);
        }

        public final void a(int i1, int j1, ExtractorInput extractorinput)
        {
            a.a(i1, j1, extractorinput);
        }

        public final void a(int i1, long l1)
        {
            a.a(i1, l1);
        }

        public final void a(int i1, long l1, long l2)
        {
            a.a(i1, l1, l2);
        }

        public final void a(int i1, String s1)
        {
            a.a(i1, s1);
        }

        public final void b(int i1)
        {
            a.b(i1);
        }

        private InnerEbmlReaderOutput()
        {
            a = WebmExtractor.this;
            super();
        }

        InnerEbmlReaderOutput(byte byte0)
        {
            this();
        }
    }


    private class TrackFormat
    {

        public String a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public byte f[];
        public byte g[];
        public byte h[];
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public long n;
        public long o;
        public TrackOutput p;

        private static Pair a(ParsableByteArray parsablebytearray)
        {
            boolean flag = false;
            ArrayList arraylist;
            int i1;
            int j1;
            int k1;
            boolean flag1;
            try
            {
                parsablebytearray.b(4);
                j1 = (parsablebytearray.f() & 3) + 1;
            }
            // Misplaced declaration of an exception variable
            catch (ParsableByteArray parsablebytearray)
            {
                throw new ParserException("Error parsing AVC codec private");
            }
            if (j1 != 3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Assertions.b(flag1);
            arraylist = new ArrayList();
            k1 = parsablebytearray.f();
            i1 = 0;
_L2:
            if (i1 >= (k1 & 0x1f))
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.add(NalUnitUtil.a(parsablebytearray));
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
            k1 = parsablebytearray.f();
            i1 = ((flag) ? 1 : 0);
_L4:
            if (i1 >= k1)
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.add(NalUnitUtil.a(parsablebytearray));
            i1++;
            if (true) goto _L4; else goto _L3
_L3:
            parsablebytearray = Pair.create(arraylist, Integer.valueOf(j1));
            return parsablebytearray;
        }

        private static List a(byte abyte0[])
        {
_L2:
            k1 = j1 + 1;
            j1 = abyte0[j1];
            if (abyte0[k1] == 1)
            {
                break MISSING_BLOCK_LABEL_89;
            }
            throw new ParserException("Error parsing vorbis codec private");
            abyte1 = new byte[i2];
            System.arraycopy(abyte0, k1, abyte1, 0, i2);
            k1 = i2 + k1;
            if (abyte0[k1] == 3)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            throw new ParserException("Error parsing vorbis codec private");
            i1 = i1 + j1 + k1;
            if (abyte0[i1] == 5)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            throw new ParserException("Error parsing vorbis codec private");
            byte abyte2[] = new byte[abyte0.length - i1];
            System.arraycopy(abyte0, i1, abyte2, 0, abyte0.length - i1);
            abyte0 = new ArrayList(2);
            abyte0.add(abyte1);
            abyte0.add(abyte2);
            return abyte0;
            int k1 = 0;
            if (abyte0[0] != 2)
            {
                try
                {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw new ParserException("Error parsing vorbis codec private");
                }
            }
            int i1 = 0;
            byte abyte1[];
            int j1;
            int i2;
            for (j1 = 1; abyte0[j1] == -1;)
            {
                j1++;
                i1 += 255;
            }

            int l1 = j1 + 1;
            i2 = i1 + abyte0[j1];
            j1 = l1;
            i1 = k1;
            while (abyte0[j1] == -1) 
            {
                i1 += 255;
                j1++;
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

        private static Pair b(ParsableByteArray parsablebytearray)
        {
            int i1;
            int j1;
            int k1;
            byte abyte0[];
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            try
            {
                parsablebytearray.b(21);
                i2 = parsablebytearray.f();
                j2 = parsablebytearray.f();
                l1 = parsablebytearray.d();
            }
            // Misplaced declaration of an exception variable
            catch (ParsableByteArray parsablebytearray)
            {
                throw new ParserException("Error parsing HEVC codec private");
            }
            j1 = 0;
            i1 = 0;
_L10:
            if (j1 >= j2) goto _L2; else goto _L1
_L1:
            parsablebytearray.c(1);
            k2 = parsablebytearray.g();
            k1 = 0;
_L4:
            if (k1 >= k2)
            {
                break; /* Loop/switch isn't completed */
            }
            l2 = parsablebytearray.g();
            i1 += l2 + 4;
            parsablebytearray.c(l2);
            k1++;
            if (true) goto _L4; else goto _L3
_L2:
            parsablebytearray.b(l1);
            abyte0 = new byte[i1];
            k1 = 0;
            j1 = 0;
_L11:
            if (k1 >= j2) goto _L6; else goto _L5
_L5:
            parsablebytearray.c(1);
            k2 = parsablebytearray.g();
            l1 = 0;
_L8:
            if (l1 >= k2)
            {
                continue; /* Loop/switch isn't completed */
            }
            l2 = parsablebytearray.g();
            System.arraycopy(NalUnitUtil.a, 0, abyte0, j1, NalUnitUtil.a.length);
            j1 += NalUnitUtil.a.length;
            System.arraycopy(parsablebytearray.a, parsablebytearray.d(), abyte0, j1, l2);
            j1 += l2;
            parsablebytearray.c(l2);
            l1++;
            if (true) goto _L8; else goto _L7
_L7:
            continue; /* Loop/switch isn't completed */
_L9:
            return Pair.create(parsablebytearray, Integer.valueOf((i2 & 3) + 1));
_L13:
            parsablebytearray = Collections.singletonList(abyte0);
              goto _L9
_L3:
            j1++;
              goto _L10
            k1++;
              goto _L11
_L6:
            if (i1 != 0) goto _L13; else goto _L12
_L12:
            parsablebytearray = null;
              goto _L9
        }

        public final MediaFormat a(long l1)
        {
            Object obj;
            Object obj1;
            obj = null;
            obj1 = a;
            ((String) (obj1)).hashCode();
            JVM INSTR lookupswitch 12: default 120
        //                       -2095576542: 262
        //                       -2095575984: 230
        //                       -1730367663: 311
        //                       -1482641357: 362
        //                       -538363189: 246
        //                       -538363109: 278
        //                       62923557: 345
        //                       62923603: 379
        //                       82338133: 198
        //                       82338134: 214
        //                       855502857: 294
        //                       1951062397: 328;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
            char c1 = '\uFFFF';
_L26:
            c1;
            JVM INSTR tableswitch 0 11: default 188
        //                       0 396
        //                       1 430
        //                       2 442
        //                       3 442
        //                       4 442
        //                       5 472
        //                       6 519
        //                       7 566
        //                       8 586
        //                       9 665
        //                       10 683
        //                       11 697;
               goto _L14 _L15 _L16 _L17 _L17 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L14:
            throw new ParserException("Unrecognized codec identifier.");
_L10:
            if (!((String) (obj1)).equals("V_VP8")) goto _L1; else goto _L25
_L25:
            c1 = '\0';
              goto _L26
_L11:
            if (!((String) (obj1)).equals("V_VP9")) goto _L1; else goto _L27
_L27:
            c1 = '\001';
              goto _L26
_L3:
            if (!((String) (obj1)).equals("V_MPEG4/ISO/SP")) goto _L1; else goto _L28
_L28:
            c1 = '\002';
              goto _L26
_L6:
            if (!((String) (obj1)).equals("V_MPEG4/ISO/ASP")) goto _L1; else goto _L29
_L29:
            c1 = '\003';
              goto _L26
_L2:
            if (!((String) (obj1)).equals("V_MPEG4/ISO/AP")) goto _L1; else goto _L30
_L30:
            c1 = '\004';
              goto _L26
_L7:
            if (!((String) (obj1)).equals("V_MPEG4/ISO/AVC")) goto _L1; else goto _L31
_L31:
            c1 = '\005';
              goto _L26
_L12:
            if (!((String) (obj1)).equals("V_MPEGH/ISO/HEVC")) goto _L1; else goto _L32
_L32:
            c1 = '\006';
              goto _L26
_L4:
            if (!((String) (obj1)).equals("A_VORBIS")) goto _L1; else goto _L33
_L33:
            c1 = '\007';
              goto _L26
_L13:
            if (!((String) (obj1)).equals("A_OPUS")) goto _L1; else goto _L34
_L34:
            c1 = '\b';
              goto _L26
_L8:
            if (!((String) (obj1)).equals("A_AAC")) goto _L1; else goto _L35
_L35:
            c1 = '\t';
              goto _L26
_L5:
            if (!((String) (obj1)).equals("A_MPEG/L3")) goto _L1; else goto _L36
_L36:
            c1 = '\n';
              goto _L26
_L9:
            if (!((String) (obj1)).equals("A_AC3")) goto _L1; else goto _L37
_L37:
            c1 = '\013';
              goto _L26
_L15:
            obj1 = null;
            obj = "video/x-vnd.on2.vp8";
            c1 = '\uFFFF';
_L39:
            if (MimeTypes.a(((String) (obj))))
            {
                return MediaFormat.b(((String) (obj)), c1, l1, l, m, ((List) (obj1)));
            }
            break; /* Loop/switch isn't completed */
_L16:
            obj1 = null;
            obj = "video/x-vnd.on2.vp9";
            c1 = '\uFFFF';
            continue; /* Loop/switch isn't completed */
_L17:
            if (h != null)
            {
                obj = Collections.singletonList(h);
            }
            obj1 = obj;
            obj = "video/mp4v-es";
            c1 = '\uFFFF';
            continue; /* Loop/switch isn't completed */
_L18:
            obj = a(new ParsableByteArray(h));
            obj1 = (List)((Pair) (obj)).first;
            k = ((Integer)((Pair) (obj)).second).intValue();
            c1 = '\uFFFF';
            obj = "video/avc";
            continue; /* Loop/switch isn't completed */
_L19:
            obj = b(new ParsableByteArray(h));
            obj1 = (List)((Pair) (obj)).first;
            k = ((Integer)((Pair) (obj)).second).intValue();
            c1 = '\uFFFF';
            obj = "video/hevc";
            continue; /* Loop/switch isn't completed */
_L20:
            obj = "audio/vorbis";
            c1 = '\u2000';
            obj1 = a(h);
            continue; /* Loop/switch isn't completed */
_L21:
            obj = "audio/opus";
            c1 = '\u1680';
            obj1 = new ArrayList(3);
            ((List) (obj1)).add(h);
            ((List) (obj1)).add(ByteBuffer.allocate(64).putLong(n).array());
            ((List) (obj1)).add(ByteBuffer.allocate(64).putLong(o).array());
            continue; /* Loop/switch isn't completed */
_L22:
            obj = "audio/mp4a-latm";
            obj1 = Collections.singletonList(h);
            c1 = '\uFFFF';
            continue; /* Loop/switch isn't completed */
_L23:
            obj1 = null;
            obj = "audio/mpeg";
            c1 = '\u1000';
            continue; /* Loop/switch isn't completed */
_L24:
            obj1 = null;
            obj = "audio/ac3";
            c1 = '\uFFFF';
            if (true) goto _L39; else goto _L38
_L38:
            if (MimeTypes.b(((String) (obj))))
            {
                return MediaFormat.a(((String) (obj)), c1, l1, i, j, ((List) (obj1)));
            } else
            {
                throw new ParserException("Unexpected MIME type.");
            }
        }

        private TrackFormat()
        {
            b = -1;
            c = -1;
            d = -1;
            i = -1;
            j = -1;
            k = -1;
            l = -1;
            m = -1;
            n = -1L;
            o = -1L;
        }

        TrackFormat(byte byte0)
        {
            this();
        }
    }

}
