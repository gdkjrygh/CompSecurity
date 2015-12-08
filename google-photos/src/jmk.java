// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class jmk
    implements jmg
{

    private jmj a;

    jmk(jmj jmj1)
    {
        a = jmj1;
        super();
    }

    public final int a(int i)
    {
        return jmj.a(i);
    }

    public final void a(int i, double d)
    {
        jmj jmj1 = a;
        switch (i)
        {
        default:
            return;

        case 17545: 
            jmj1.h = (long)d;
            return;

        case 181: 
            jmj1.j.l = (int)d;
            return;
        }
    }

    public final void a(int i, int j, jke jke1)
    {
        jmj jmj1;
        jml jml1;
        jmj1 = a;
        switch (i)
        {
        default:
            throw new jjj((new StringBuilder(26)).append("Unexpected id: ").append(i).toString());

        case 21419: 
            Arrays.fill(jmj1.d.a, (byte)0);
            jke1.b(jmj1.d.a, 4 - j, j);
            jmj1.d.b(0);
            jmj1.m = (int)jmj1.d.g();
            return;

        case 25506: 
            jmj1.j.h = new byte[j];
            jke1.b(jmj1.j.h, 0, j);
            return;

        case 16981: 
            jmj1.j.f = new byte[j];
            jke1.b(jmj1.j.f, 0, j);
            return;

        case 18402: 
            jmj1.j.g = new byte[j];
            jke1.b(jmj1.j.g, 0, j);
            return;

        case 161: 
        case 163: 
            break;
        }
        if (jmj1.u == 0)
        {
            jmj1.A = (int)jmj1.a.a(jke1, false, true, 8);
            jmj1.B = jmj1.a.a;
            jmj1.w = -1L;
            jmj1.u = 1;
            jmj1.c.a();
        }
        jml1 = (jml)jmj1.b.get(jmj1.A);
        if (jml1 == null)
        {
            jke1.a(j - jmj1.B);
            jmj1.u = 0;
            return;
        }
        if (jmj1.u == 1)
        {
            jmj1.a(jke1, 3);
            int k = (jmj1.c.a[2] & 6) >> 1;
            if (k == 0)
            {
                jmj1.y = 1;
                jmj1.z = jmj.a(jmj1.z, 1);
                jmj1.z[0] = j - jmj1.B - 3;
            } else
            {
                if (i != 163)
                {
                    throw new jjj("Lacing only supported in SimpleBlocks.");
                }
                jmj1.a(jke1, 4);
                jmj1.y = (jmj1.c.a[3] & 0xff) + 1;
                jmj1.z = jmj.a(jmj1.z, jmj1.y);
                if (k == 2)
                {
                    j = (j - jmj1.B - 4) / jmj1.y;
                    Arrays.fill(jmj1.z, 0, jmj1.y, j);
                } else
                if (k == 1)
                {
                    int l = 0;
                    k = 4;
                    for (int j1 = 0; j1 < jmj1.y - 1; j1++)
                    {
                        jmj1.z[j1] = 0;
                        int l1 = k;
                        int j2;
                        do
                        {
                            k = l1 + 1;
                            jmj1.a(jke1, k);
                            j2 = jmj1.c.a[k - 1] & 0xff;
                            int ai[] = jmj1.z;
                            ai[j1] = ai[j1] + j2;
                            l1 = k;
                        } while (j2 == 255);
                        l += jmj1.z[j1];
                    }

                    jmj1.z[jmj1.y - 1] = j - jmj1.B - k - l;
                } else
                {
label0:
                    {
                        if (k != 3)
                        {
                            break label0;
                        }
                        int i1 = 0;
                        k = 4;
                        int k1 = 0;
                        do
                        {
                            if (k1 >= jmj1.y - 1)
                            {
                                break;
                            }
                            jmj1.z[k1] = 0;
                            int k2 = k + 1;
                            jmj1.a(jke1, k2);
                            if (jmj1.c.a[k2 - 1] == 0)
                            {
                                throw new jjj("No valid varint length mask found");
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
                                        k = 1 << 7 - i2;
                                        if ((jmj1.c.a[k2 - 1] & k) == 0)
                                        {
                                            break label2;
                                        }
                                        int l2 = k2 - 1;
                                        k2 += i2;
                                        jmj1.a(jke1, k2);
                                        long l5 = jmj1.c.a[l2] & 0xff & ~k;
                                        for (k = l2 + 1; k < k2; k++)
                                        {
                                            l5 = (long)(jmj1.c.a[k] & 0xff) | l5 << 8;
                                        }

                                        k = k2;
                                        l3 = l5;
                                        if (k1 > 0)
                                        {
                                            l3 = l5 - ((1L << i2 * 7 + 6) - 1L);
                                            k = k2;
                                        }
                                    }
                                    if (l3 < 0xffffffff80000000L || l3 > 0x7fffffffL)
                                    {
                                        throw new jjj("EBML lacing sample size out of range.");
                                    }
                                    break label1;
                                }
                                i2++;
                            } while (true);
                            i2 = (int)l3;
                            int ai1[] = jmj1.z;
                            if (k1 != 0)
                            {
                                i2 += jmj1.z[k1 - 1];
                            }
                            ai1[k1] = i2;
                            i1 += jmj1.z[k1];
                            k1++;
                        } while (true);
                        jmj1.z[jmj1.y - 1] = j - jmj1.B - k - i1;
                    }
                }
            }
            j = jmj1.c.a[0];
            k = jmj1.c.a[1];
            jmj1.v = jmj1.q + jmj1.a(j << 8 | k & 0xff);
            if ((jmj1.c.a[2] & 8) == 8)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (jml1.c == 2 || i == 163 && (jmj1.c.a[2] & 0x80) == 128)
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
            jmj1.C = j | k;
            jmj1.u = 2;
            jmj1.x = 0;
        }
        if (i != 163)
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        for (; jmj1.x < jmj1.y; jmj1.x = jmj1.x + 1)
        {
            jmj1.a(jke1, jml1, jmj1.z[jmj1.x]);
            jmj1.a(jml1, jmj1.v + (long)((jmj1.x * jml1.d) / 1000));
        }

        break MISSING_BLOCK_LABEL_1329;
        throw new jjj((new StringBuilder(36)).append("Unexpected lacing value: ").append(k).toString());
        jmj1.u = 0;
        return;
        jmj1.a(jke1, jml1, jmj1.z[0]);
        return;
    }

    public final void a(int i, long l)
    {
        jmj jmj1 = a;
        i;
        JVM INSTR lookupswitch 22: default 192
    //                   131: 334
    //                   155: 649
    //                   159: 376
    //                   176: 301
    //                   179: 598
    //                   186: 312
    //                   215: 323
    //                   231: 637
    //                   241: 613
    //                   251: 387
    //                   16980: 474
    //                   17029: 233
    //                   17143: 193
    //                   18401: 516
    //                   18408: 558
    //                   20529: 394
    //                   20530: 434
    //                   21420: 281
    //                   22186: 356
    //                   22203: 366
    //                   2352003: 345
    //                   2807729: 294;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_649;
_L24:
        return;
_L14:
        if (l != 1L)
        {
            throw new jjj((new StringBuilder(50)).append("EBMLReadVersion ").append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (l < 1L || l > 2L)
        {
            throw new jjj((new StringBuilder(53)).append("DocTypeReadVersion ").append(l).append(" not supported").toString());
        }
        if (true) goto _L24; else goto _L19
_L19:
        jmj1.n = jmj1.e + l;
        return;
_L23:
        jmj1.g = l;
        return;
_L5:
        jmj1.j.i = (int)l;
        return;
_L7:
        jmj1.j.j = (int)l;
        return;
_L8:
        jmj1.j.b = (int)l;
        return;
_L2:
        jmj1.j.c = (int)l;
        return;
_L22:
        jmj1.j.d = (int)l;
        return;
_L20:
        jmj1.j.m = l;
        return;
_L21:
        jmj1.j.n = l;
        return;
_L4:
        jmj1.j.k = (int)l;
        return;
_L11:
        jmj1.D = true;
        return;
_L17:
        if (l != 0L)
        {
            throw new jjj((new StringBuilder(55)).append("ContentEncodingOrder ").append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L18:
        if (l != 1L)
        {
            throw new jjj((new StringBuilder(55)).append("ContentEncodingScope ").append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (l != 3L)
        {
            throw new jjj((new StringBuilder(50)).append("ContentCompAlgo ").append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L15:
        if (l != 5L)
        {
            throw new jjj((new StringBuilder(49)).append("ContentEncAlgo ").append(l).append(" not supported").toString());
        }
        continue; /* Loop/switch isn't completed */
_L16:
        if (l != 1L)
        {
            throw new jjj((new StringBuilder(56)).append("AESSettingsCipherMode ").append(l).append(" not supported").toString());
        }
        if (true) goto _L24; else goto _L6
_L6:
        jmj1.r.a(jmj1.a(l));
        return;
_L10:
        if (!jmj1.t)
        {
            jmj1.s.a(l);
            jmj1.t = true;
            return;
        }
        if (true) goto _L24; else goto _L9
_L9:
        jmj1.q = jmj1.a(l);
        return;
        jmj1.w = jmj1.a(l);
        return;
    }

    public final void a(int i, long l, long l1)
    {
        jmj jmj1 = a;
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
        if (jmj1.e != -1L && jmj1.e != l)
        {
            throw new jjj("Multiple Segment elements not supported");
        } else
        {
            jmj1.e = l;
            jmj1.f = l1;
            return;
        }
_L5:
        jmj1.m = -1;
        jmj1.n = -1L;
        return;
_L8:
        jmj1.r = new jnh();
        jmj1.s = new jnh();
        return;
_L4:
        jmj1.t = false;
        return;
_L9:
        if (!jmj1.l)
        {
            if (jmj1.p != -1L)
            {
                jmj1.o = true;
                return;
            } else
            {
                jmj1.E.a(jko.a);
                jmj1.l = true;
                return;
            }
        }
          goto _L1
_L2:
        jmj1.D = false;
        return;
_L6:
        jmj1.j.e = true;
        return;
_L3:
        jmj1.j = new jml();
        return;
    }

    public final void a(int i, String s)
    {
        jmj jmj1 = a;
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   134: 104
    //                   17026: 41
    //                   2274716: 113;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        if (!"webm".equals(s) && !"matroska".equals(s))
        {
            throw new jjj((new StringBuilder(String.valueOf(s).length() + 22)).append("DocType ").append(s).append(" not supported").toString());
        }
          goto _L1
_L2:
        jmj1.j.a = s;
        return;
_L4:
        jmj1.j.o = s;
        return;
    }

    public final boolean b(int i)
    {
        return jmj.b(i);
    }

    public final void c(int i)
    {
        jmj jmj1 = a;
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   160: 500
    //                   174: 671
    //                   19899: 129
    //                   25152: 562
    //                   28032: 638
    //                   357149030: 81
    //                   374648427: 2000
    //                   475249515: 183;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L7:
        if (jmj1.g == -1L)
        {
            jmj1.g = 0xf4240L;
        }
        if (jmj1.h != -1L)
        {
            jmj1.i = jmj1.a(jmj1.h);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (jmj1.m == -1 || jmj1.n == -1L)
        {
            throw new jjj("Mandatory element SeekID or SeekPosition not found");
        }
        if (jmj1.m == 0x1c53bb6b)
        {
            jmj1.p = jmj1.n;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (!jmj1.l)
        {
            jkf jkf1 = jmj1.E;
            Object obj;
            if (jmj1.e == -1L || jmj1.i == -1L || jmj1.r == null || jmj1.r.a == 0 || jmj1.s == null || jmj1.s.a != jmj1.r.a)
            {
                jmj1.r = null;
                jmj1.s = null;
                obj = jko.a;
            } else
            {
                int j = jmj1.r.a;
                obj = new int[j];
                long al[] = new long[j];
                long al1[] = new long[j];
                long al2[] = new long[j];
                for (i = 0; i < j; i++)
                {
                    al2[i] = jmj1.r.a(i);
                    al[i] = jmj1.e + jmj1.s.a(i);
                }

                for (i = 0; i < j - 1; i++)
                {
                    obj[i] = (int)(al[i + 1] - al[i]);
                    al1[i] = al2[i + 1] - al2[i];
                }

                obj[j - 1] = (int)((jmj1.e + jmj1.f) - al[j - 1]);
                al1[j - 1] = jmj1.i - al2[j - 1];
                jmj1.r = null;
                jmj1.s = null;
                obj = new jkb(((int []) (obj)), al, al1, al2);
            }
            jkf1.a(((jko) (obj)));
            jmj1.l = true;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (jmj1.u == 2)
        {
            if (!jmj1.D)
            {
                jmj1.C = jmj1.C | 1;
            }
            jmj1.a((jml)jmj1.b.get(jmj1.A), jmj1.v);
            jmj1.u = 0;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (jmj1.j.e)
        {
            if (jmj1.j.g == null)
            {
                throw new jjj("Encrypted Track found but ContentEncKeyID was not found");
            }
            if (!jmj1.k)
            {
                jmj1.E.a(new jka("video/webm", jmj1.j.g));
                jmj1.k = true;
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (jmj1.j.e && jmj1.j.f != null)
        {
            throw new jjj("Combining encryption and compression is not supported");
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (jmj1.b.get(jmj1.j.b) != null) goto _L11; else goto _L10
_L10:
        Object obj1;
        jml jml1;
        jkf jkf2;
        byte byte0;
        int k;
        long l;
        obj1 = jmj1.j.a;
        if ("V_VP8".equals(obj1) || "V_VP9".equals(obj1) || "V_MPEG2".equals(obj1) || "V_MPEG4/ISO/SP".equals(obj1) || "V_MPEG4/ISO/ASP".equals(obj1) || "V_MPEG4/ISO/AP".equals(obj1) || "V_MPEG4/ISO/AVC".equals(obj1) || "V_MPEGH/ISO/HEVC".equals(obj1) || "A_OPUS".equals(obj1) || "A_VORBIS".equals(obj1) || "A_AAC".equals(obj1) || "A_MPEG/L3".equals(obj1) || "A_AC3".equals(obj1) || "A_TRUEHD".equals(obj1) || "A_DTS".equals(obj1) || "A_DTS/EXPRESS".equals(obj1) || "A_DTS/LOSSLESS".equals(obj1) || "S_TEXT/UTF8".equals(obj1))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L11; else goto _L12
_L12:
        jml1 = jmj1.j;
        jkf2 = jmj1.E;
        k = jmj1.j.b;
        l = jmj1.i;
        byte0 = -1;
        obj1 = jml1.a;
        i = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 18: default 1084
    //                   -2095576542: 1263
    //                   -2095575984: 1233
    //                   -1784763192: 1390
    //                   -1730367663: 1310
    //                   -1482641357: 1358
    //                   -538363189: 1248
    //                   -538363109: 1278
    //                   -356037306: 1438
    //                   62923557: 1342
    //                   62923603: 1374
    //                   62927045: 1406
    //                   82338133: 1188
    //                   82338134: 1203
    //                   542569478: 1422
    //                   855502857: 1294
    //                   1422270023: 1454
    //                   1809237540: 1218
    //                   1951062397: 1326;
           goto _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L13:
        i;
        JVM INSTR tableswitch 0 17: default 1172
    //                   0 1470
    //                   1 1567
    //                   2 1579
    //                   3 1591
    //                   4 1591
    //                   5 1591
    //                   6 1625
    //                   7 1674
    //                   8 1723
    //                   9 1743
    //                   10 1833
    //                   11 1852
    //                   12 1865
    //                   13 1877
    //                   14 1889
    //                   15 1889
    //                   16 1901
    //                   17 1913;
           goto _L32 _L33 _L34 _L35 _L36 _L36 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L45 _L46 _L47
_L32:
        throw new jjj("Unrecognized codec identifier.");
_L25:
        if (((String) (obj1)).equals("V_VP8"))
        {
            i = 0;
        }
          goto _L13
_L26:
        if (((String) (obj1)).equals("V_VP9"))
        {
            i = 1;
        }
          goto _L13
_L30:
        if (((String) (obj1)).equals("V_MPEG2"))
        {
            i = 2;
        }
          goto _L13
_L15:
        if (((String) (obj1)).equals("V_MPEG4/ISO/SP"))
        {
            i = 3;
        }
          goto _L13
_L19:
        if (((String) (obj1)).equals("V_MPEG4/ISO/ASP"))
        {
            i = 4;
        }
          goto _L13
_L14:
        if (((String) (obj1)).equals("V_MPEG4/ISO/AP"))
        {
            i = 5;
        }
          goto _L13
_L20:
        if (((String) (obj1)).equals("V_MPEG4/ISO/AVC"))
        {
            i = 6;
        }
          goto _L13
_L28:
        if (((String) (obj1)).equals("V_MPEGH/ISO/HEVC"))
        {
            i = 7;
        }
          goto _L13
_L17:
        if (((String) (obj1)).equals("A_VORBIS"))
        {
            i = 8;
        }
          goto _L13
_L31:
        if (((String) (obj1)).equals("A_OPUS"))
        {
            i = 9;
        }
          goto _L13
_L22:
        if (((String) (obj1)).equals("A_AAC"))
        {
            i = 10;
        }
          goto _L13
_L18:
        if (((String) (obj1)).equals("A_MPEG/L3"))
        {
            i = 11;
        }
          goto _L13
_L23:
        if (((String) (obj1)).equals("A_AC3"))
        {
            i = 12;
        }
          goto _L13
_L16:
        if (((String) (obj1)).equals("A_TRUEHD"))
        {
            i = 13;
        }
          goto _L13
_L24:
        if (((String) (obj1)).equals("A_DTS"))
        {
            i = 14;
        }
          goto _L13
_L27:
        if (((String) (obj1)).equals("A_DTS/EXPRESS"))
        {
            i = 15;
        }
          goto _L13
_L21:
        if (((String) (obj1)).equals("A_DTS/LOSSLESS"))
        {
            i = 16;
        }
          goto _L13
_L29:
        if (((String) (obj1)).equals("S_TEXT/UTF8"))
        {
            i = 17;
        }
          goto _L13
_L33:
        Object obj2;
        obj2 = null;
        obj1 = "video/x-vnd.on2.vp8";
        i = byte0;
_L49:
        if (c.a(((String) (obj1))))
        {
            obj1 = jjh.a(k, ((String) (obj1)), -1, i, l, jml1.k, jml1.l, ((List) (obj2)), jml1.o);
        } else
        if (c.b(((String) (obj1))))
        {
            obj1 = jjh.a(k, ((String) (obj1)), -1, i, l, jml1.i, jml1.j, ((List) (obj2)), -1, -1F);
        } else
        if ("application/x-subrip".equals(obj1))
        {
            obj1 = jjh.a(k, ((String) (obj1)), -1, l, jml1.o);
        } else
        {
            throw new jjj("Unexpected MIME type.");
        }
        jml1.p = jkf2.c(jml1.b);
        jml1.p.a(((jjh) (obj1)));
        jmj1.b.put(jmj1.j.b, jmj1.j);
_L11:
        jmj1.j = null;
        return;
_L34:
        obj2 = null;
        obj1 = "video/x-vnd.on2.vp9";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L35:
        obj2 = null;
        obj1 = "video/mpeg2";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L36:
        if (jml1.h == null)
        {
            obj1 = null;
        } else
        {
            obj1 = Collections.singletonList(jml1.h);
        }
        obj2 = obj1;
        obj1 = "video/mp4v-es";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L37:
        obj1 = jml.a(new jnl(jml1.h));
        obj2 = (List)((Pair) (obj1)).first;
        jml1.q = ((Integer)((Pair) (obj1)).second).intValue();
        obj1 = "video/avc";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L38:
        obj1 = jml.b(new jnl(jml1.h));
        obj2 = (List)((Pair) (obj1)).first;
        jml1.q = ((Integer)((Pair) (obj1)).second).intValue();
        obj1 = "video/hevc";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L39:
        i = 8192;
        obj2 = jml.a(jml1.h);
        obj1 = "audio/vorbis";
        continue; /* Loop/switch isn't completed */
_L40:
        i = 5760;
        obj2 = new ArrayList(3);
        ((List) (obj2)).add(jml1.h);
        ((List) (obj2)).add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(jml1.m).array());
        ((List) (obj2)).add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(jml1.n).array());
        obj1 = "audio/opus";
        continue; /* Loop/switch isn't completed */
_L41:
        obj2 = Collections.singletonList(jml1.h);
        obj1 = "audio/mp4a-latm";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L42:
        i = 4096;
        obj2 = null;
        obj1 = "audio/mpeg";
        continue; /* Loop/switch isn't completed */
_L43:
        obj2 = null;
        obj1 = "audio/ac3";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L44:
        obj2 = null;
        obj1 = "audio/true-hd";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L45:
        obj2 = null;
        obj1 = "audio/vnd.dts";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L46:
        obj2 = null;
        obj1 = "audio/vnd.dts.hd";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L47:
        obj2 = null;
        obj1 = "application/x-subrip";
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L8:
        if (jmj1.b.size() == 0)
        {
            throw new jjj("No valid tracks were found");
        }
        jmj1.E.g();
        return;
        if (true) goto _L49; else goto _L48
_L48:
    }
}
