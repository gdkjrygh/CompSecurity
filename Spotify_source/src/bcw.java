// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.exoplayer.ParserException;
import java.util.Arrays;

final class bcw
    implements bct
{

    private bcv a;

    private bcw(bcv bcv1)
    {
        a = bcv1;
        super();
    }

    bcw(bcv bcv1, byte byte0)
    {
        this(bcv1);
    }

    public final int a(int i)
    {
        switch (i)
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

    public final void a(int i, double d)
    {
        bcv bcv1 = a;
        switch (i)
        {
        default:
            return;

        case 17545: 
            bcv1.g = (long)d;
            return;

        case 181: 
            bcv1.i.m = (int)d;
            return;
        }
    }

    public final void a(int i, int j, bby bby1)
    {
        bcx bcx1;
        bcv bcv1;
        bce bce1;
        bcv1 = a;
        switch (i)
        {
        default:
            throw new ParserException((new StringBuilder("Unexpected id: ")).append(i).toString());

        case 21419: 
            Arrays.fill(bcv1.c.a, (byte)0);
            bby1.b(bcv1.c.a, 4 - j, j);
            bcv1.c.a(0);
            bcv1.m = (int)bcv1.c.e();
            return;

        case 25506: 
            bcv1.i.h = new byte[j];
            bby1.b(bcv1.i.h, 0, j);
            return;

        case 16981: 
            bcv1.i.f = new byte[j];
            bby1.b(bcv1.i.f, 0, j);
            return;

        case 18402: 
            bcv1.i.g = new byte[j];
            bby1.b(bcv1.i.g, 0, j);
            return;

        case 161: 
        case 163: 
            break;
        }
        if (bcv1.v == 0)
        {
            bcv1.A = (int)bcv1.a.a(bby1, false, true);
            bcv1.B = bcv1.a.a;
            bcv1.v = 1;
            bcv1.b.a();
        }
        if (bcv1.j != null && bcv1.k != null && bcv1.j.b != bcv1.A && bcv1.k.b != bcv1.A || bcv1.j != null && bcv1.k == null && bcv1.j.b != bcv1.A || bcv1.j == null && bcv1.k != null && bcv1.k.b != bcv1.A)
        {
            bby1.a(j - bcv1.B);
            bcv1.v = 0;
            return;
        }
        if (bcv1.j != null && bcv1.A == bcv1.j.b)
        {
            bcx1 = bcv1.j;
        } else
        {
            bcx1 = bcv1.k;
        }
        bce1 = bcx1.p;
        if (bcv1.v == 1)
        {
            bcv1.a(bby1, 3);
            int k = (bcv1.b.a[2] & 6) >> 1;
            if (k == 0)
            {
                bcv1.y = 1;
                bcv1.z = bcv.a(bcv1.z, 1);
                bcv1.z[0] = j - bcv1.B - 3;
            } else
            {
                if (i != 163)
                {
                    throw new ParserException("Lacing only supported in SimpleBlocks.");
                }
                bcv1.a(bby1, 4);
                bcv1.y = (bcv1.b.a[3] & 0xff) + 1;
                bcv1.z = bcv.a(bcv1.z, bcv1.y);
                if (k == 2)
                {
                    j = (j - bcv1.B - 4) / bcv1.y;
                    Arrays.fill(bcv1.z, 0, bcv1.y, j);
                } else
                if (k == 1)
                {
                    int j1 = 0;
                    k = 4;
                    for (int l = 0; l < bcv1.y - 1; l++)
                    {
                        bcv1.z[l] = 0;
                        int l1 = k;
                        int j2;
                        do
                        {
                            k = l1 + 1;
                            bcv1.a(bby1, k);
                            j2 = bcv1.b.a[k - 1] & 0xff;
                            int ai[] = bcv1.z;
                            ai[l] = ai[l] + j2;
                            l1 = k;
                        } while (j2 == 255);
                        j1 += bcv1.z[l];
                    }

                    bcv1.z[bcv1.y - 1] = j - bcv1.B - k - j1;
                } else
                {
label0:
                    {
                        if (k != 3)
                        {
                            break label0;
                        }
                        int k1 = 0;
                        k = 4;
                        int i1 = 0;
                        do
                        {
                            if (i1 >= bcv1.y - 1)
                            {
                                break;
                            }
                            bcv1.z[i1] = 0;
                            int k2 = k + 1;
                            bcv1.a(bby1, k2);
                            if (bcv1.b.a[k2 - 1] == 0)
                            {
                                throw new ParserException("No valid varint length mask found");
                            }
                            long l4 = 0L;
                            int i2 = 0;
                            long l3;
label1:
                            do
                            {
label2:
                                {
                                    k = k2;
                                    l3 = l4;
                                    if (i2 < 8)
                                    {
                                        int l2 = 1 << 7 - i2;
                                        if ((bcv1.b.a[k2 - 1] & l2) == 0)
                                        {
                                            break label2;
                                        }
                                        int i3 = k2 - 1;
                                        k2 += i2;
                                        bcv1.a(bby1, k2);
                                        byte abyte0[] = bcv1.b.a;
                                        k = i3 + 1;
                                        long l5 = abyte0[i3] & 0xff & ~l2;
                                        for (; k < k2; k++)
                                        {
                                            l5 = l5 << 8 | (long)(bcv1.b.a[k] & 0xff);
                                        }

                                        k = k2;
                                        l3 = l5;
                                        if (i1 > 0)
                                        {
                                            l3 = l5 - ((1L << i2 * 7 + 6) - 1L);
                                            k = k2;
                                        }
                                    }
                                    if (l3 < 0xffffffff80000000L || l3 > 0x7fffffffL)
                                    {
                                        throw new ParserException("EBML lacing sample size out of range.");
                                    }
                                    break label1;
                                }
                                i2++;
                            } while (true);
                            i2 = (int)l3;
                            int ai1[] = bcv1.z;
                            if (i1 != 0)
                            {
                                i2 += bcv1.z[i1 - 1];
                            }
                            ai1[i1] = i2;
                            k1 += bcv1.z[i1];
                            i1++;
                        } while (true);
                        bcv1.z[bcv1.y - 1] = j - bcv1.B - k - k1;
                    }
                }
            }
            j = bcv1.b.a[0];
            k = bcv1.b.a[1];
            bcv1.w = bcv1.r + bcv1.a(j << 8 | k & 0xff);
            if ((bcv1.b.a[2] & 8) == 8)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (i == 163 && (bcv1.b.a[2] & 0x80) == 128)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (j != 0)
            {
                j = 0x8000000;
            } else
            {
                j = 0;
            }
            bcv1.C = j | k;
            bcv1.D = bcx1.g;
            bcv1.v = 2;
            bcv1.x = 0;
        }
        if (i != 163)
        {
            break MISSING_BLOCK_LABEL_1460;
        }
        for (; bcv1.x < bcv1.y; bcv1.x = bcv1.x + 1)
        {
            bcv1.a(bby1, bce1, bcx1, bcv1.z[bcv1.x]);
            bcv1.a(bce1, bcv1.w + (long)((bcv1.x * bcx1.d) / 1000));
        }

        break MISSING_BLOCK_LABEL_1453;
        throw new IllegalStateException((new StringBuilder("Unexpected lacing value: ")).append(k).toString());
        bcv1.v = 0;
        return;
        bcv1.a(bby1, bce1, bcx1, bcv1.z[0]);
        return;
    }

    public final void a(int i, long l)
    {
        bcv bcv1 = a;
        i;
        JVM INSTR lookupswitch 21: default 184
    //                   131: 316
    //                   159: 358
    //                   176: 283
    //                   179: 555
    //                   186: 294
    //                   215: 305
    //                   231: 594
    //                   241: 570
    //                   251: 369
    //                   16980: 446
    //                   17029: 220
    //                   17143: 185
    //                   18401: 483
    //                   18408: 520
    //                   20529: 376
    //                   20530: 411
    //                   21420: 263
    //                   22186: 338
    //                   22203: 348
    //                   2352003: 327
    //                   2807729: 276;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        return;
_L13:
        if (l != 1L)
        {
            throw new ParserException((new StringBuilder("EBMLReadVersion ")).append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (l < 1L || l > 2L)
        {
            throw new ParserException((new StringBuilder("DocTypeReadVersion ")).append(l).append(" not supported").toString());
        }
        if (true) goto _L1; else goto _L18
_L18:
        bcv1.n = bcv1.d + l;
        return;
_L22:
        bcv1.f = l;
        return;
_L4:
        bcv1.i.i = (int)l;
        return;
_L6:
        bcv1.i.j = (int)l;
        return;
_L7:
        bcv1.i.b = (int)l;
        return;
_L2:
        bcv1.i.c = (int)l;
        return;
_L21:
        bcv1.i.d = (int)l;
        return;
_L19:
        bcv1.i.n = l;
        return;
_L20:
        bcv1.i.o = l;
        return;
_L3:
        bcv1.i.l = (int)l;
        return;
_L10:
        bcv1.E = true;
        return;
_L16:
        if (l != 0L)
        {
            throw new ParserException((new StringBuilder("ContentEncodingOrder ")).append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L17:
        if (l != 1L)
        {
            throw new ParserException((new StringBuilder("ContentEncodingScope ")).append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (l != 3L)
        {
            throw new ParserException((new StringBuilder("ContentCompAlgo ")).append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (l != 5L)
        {
            throw new ParserException((new StringBuilder("ContentEncAlgo ")).append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L15:
        if (l != 1L)
        {
            throw new ParserException((new StringBuilder("AESSettingsCipherMode ")).append(l).append(" not supported").toString());
        }
        if (true) goto _L1; else goto _L5
_L5:
        bcv1.s.a(bcv1.a(l));
        return;
_L9:
        if (!bcv1.u)
        {
            bcv1.t.a(l);
            bcv1.u = true;
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        bcv1.r = bcv1.a(l);
        return;
    }

    public final void a(int i, long l, long l1)
    {
        bcv bcv1 = a;
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   160: 230
    //                   174: 247
    //                   187: 176
    //                   19899: 136
    //                   20533: 237
    //                   25152: 88
    //                   408125543: 89
    //                   475249515: 151
    //                   524531317: 183;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L9
_L1:
        return;
_L7:
        if (bcv1.d != -1L && bcv1.d != l)
        {
            throw new ParserException("Multiple Segment elements not supported");
        } else
        {
            bcv1.d = l;
            bcv1.e = l1;
            return;
        }
_L5:
        bcv1.m = -1;
        bcv1.n = -1L;
        return;
_L8:
        bcv1.s = new bdv();
        bcv1.t = new bdv();
        return;
_L4:
        bcv1.u = false;
        return;
_L9:
        if (bcv1.q == 0)
        {
            if (bcv1.p != -1L)
            {
                bcv1.o = true;
                return;
            } else
            {
                bcv1.F.a(bcd.f);
                bcv1.q = 2;
                return;
            }
        }
          goto _L1
_L2:
        bcv1.E = false;
        return;
_L6:
        bcv1.i.e = true;
        return;
_L3:
        bcv1.i = new bcx((byte)0);
        return;
    }

    public final void a(int i, String s)
    {
        bcv bcv1 = a;
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   134: 83
    //                   17026: 33;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        if (!"webm".equals(s) && !"matroska".equals(s))
        {
            throw new ParserException((new StringBuilder("DocType ")).append(s).append(" not supported").toString());
        }
          goto _L1
_L2:
        bcv1.i.a = s;
        return;
    }

    public final void b(int i)
    {
        bcv bcv1 = a;
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   160: 471
    //                   174: 652
    //                   19899: 123
    //                   25152: 551
    //                   28032: 621
    //                   357149030: 81
    //                   374648427: 878
    //                   475249515: 172;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_878;
_L10:
        return;
_L7:
        if (bcv1.f == -1L)
        {
            bcv1.f = 0xf4240L;
        }
        if (bcv1.g != -1L)
        {
            bcv1.h = bcv1.a(bcv1.g);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (bcv1.m == -1 || bcv1.n == -1L)
        {
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        }
        if (bcv1.m == 0x1c53bb6b)
        {
            bcv1.p = bcv1.n;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (bcv1.q != 2)
        {
            bbz bbz1 = bcv1.F;
            Object obj;
            if (bcv1.d == -1L || bcv1.h == -1L || bcv1.s == null || bcv1.s.a == 0 || bcv1.t == null || bcv1.t.a != bcv1.s.a)
            {
                bcv1.s = null;
                bcv1.t = null;
                obj = bcd.f;
            } else
            {
                int j = bcv1.s.a;
                obj = new int[j];
                long al[] = new long[j];
                long al1[] = new long[j];
                long al2[] = new long[j];
                for (i = 0; i < j; i++)
                {
                    al2[i] = bcv1.s.a(i);
                    al[i] = bcv1.d + bcv1.t.a(i);
                }

                for (i = 0; i < j - 1; i++)
                {
                    obj[i] = (int)(al[i + 1] - al[i]);
                    al1[i] = al2[i + 1] - al2[i];
                }

                obj[j - 1] = (int)((bcv1.d + bcv1.e) - al[j - 1]);
                al1[j - 1] = bcv1.h - al2[j - 1];
                bcv1.s = null;
                bcv1.t = null;
                obj = new bbu(((int []) (obj)), al, al1, al2);
            }
            bbz1.a(((bcd) (obj)));
            bcv1.q = 2;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (bcv1.v == 2)
        {
            if (!bcv1.E)
            {
                bcv1.C = bcv1.C | 1;
            }
            bce bce1;
            if (bcv1.j != null && bcv1.A == bcv1.j.b)
            {
                bce1 = bcv1.j.p;
            } else
            {
                bce1 = bcv1.k.p;
            }
            bcv1.a(bce1, bcv1.w);
            bcv1.v = 0;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (bcv1.i.e)
        {
            if (bcv1.i.g == null)
            {
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
            }
            if (!bcv1.l)
            {
                bcv1.F.a(new bbl("video/webm", bcv1.i.g));
                bcv1.l = true;
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (bcv1.i.e && bcv1.i.f != null)
        {
            throw new ParserException("Combining encryption and compression is not supported");
        }
        if (true) goto _L10; else goto _L3
_L3:
        if (bcv1.i.b == -1 || bcv1.i.c == -1)
        {
            throw new ParserException("Mandatory element TrackNumber or TrackType not found");
        }
        if (bcv1.i.c == 2 && bcv1.j != null || bcv1.i.c == 1 && bcv1.k != null)
        {
            bcv1.i = null;
            return;
        }
        if (bcv1.i.c == 2 && bcv.a(bcv1.i.a))
        {
            bcv1.j = bcv1.i;
            bcv1.j.p = bcv1.F.a();
            bcv1.j.p.a(bcv1.j.a(bcv1.h));
        } else
        if (bcv1.i.c == 1 && bcv.a(bcv1.i.a))
        {
            bcv1.k = bcv1.i;
            bcv1.k.p = bcv1.F.a();
            bcv1.k.p.a(bcv1.k.a(bcv1.h));
        }
        bcv1.i = null;
        return;
        if (bcv1.k == null && bcv1.j == null)
        {
            throw new ParserException("No valid tracks were found");
        } else
        {
            bcv1.F.b();
            return;
        }
    }
}
