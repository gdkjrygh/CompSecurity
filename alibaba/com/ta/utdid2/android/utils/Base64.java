// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ta.utdid2.android.utils;


public class Base64
{
    static abstract class a
    {

        public byte a[];
        public int b;

        a()
        {
        }
    }

    static class b extends a
    {

        private static final int c[] = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 
            54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
            -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
            5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
            15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
            25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 
            29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
            49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1
        };
        private static final int d[] = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 
            54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
            -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
            5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
            15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
            25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
            29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
            49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1
        };
        private int e;
        private int f;
        private final int g[];

        public boolean a(byte abyte0[], int i, int j, boolean flag)
        {
            byte abyte1[];
            int ai[];
            int k;
            int l;
            int j2;
            if (e == 6)
            {
                return false;
            }
            j2 = j + i;
            l = e;
            j = f;
            k = 0;
            abyte1 = a;
            ai = g;
            break MISSING_BLOCK_LABEL_42;
            j = ai[abyte0[i2] & 0xff];
            l;
            JVM INSTR tableswitch 0 5: default 292
        //                       0 313
        //                       1 342
        //                       2 379
        //                       3 446
        //                       4 556
        //                       5 590;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            i = l;
            j = k1;
            k = i1;
_L8:
            l = i;
            i = i2 + 1;
            continue; /* Loop/switch isn't completed */
_L2:
            if (j < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = l + 1;
            k = i1;
              goto _L8
            if (j == -1) goto _L1; else goto _L9
_L9:
            e = 6;
            return false;
_L3:
            if (j < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            j = k1 << 6 | j;
            i = l + 1;
            k = i1;
              goto _L8
            if (j == -1) goto _L1; else goto _L10
_L10:
            e = 6;
            return false;
_L4:
            if (j >= 0)
            {
                j = k1 << 6 | j;
                i = l + 1;
                k = i1;
            } else
            {
                if (j != -2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                abyte1[i1] = (byte)(k1 >> 4);
                i = 4;
                k = i1 + 1;
                j = k1;
            }
              goto _L8
            if (j == -1) goto _L1; else goto _L11
_L11:
            e = 6;
            return false;
_L5:
            if (j >= 0)
            {
                j = k1 << 6 | j;
                abyte1[i1 + 2] = (byte)j;
                abyte1[i1 + 1] = (byte)(j >> 8);
                abyte1[i1] = (byte)(j >> 16);
                k = i1 + 3;
                i = 0;
            } else
            {
                if (j != -2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                abyte1[i1 + 1] = (byte)(k1 >> 2);
                abyte1[i1] = (byte)(k1 >> 10);
                k = i1 + 2;
                i = 5;
                j = k1;
            }
              goto _L8
            if (j == -1) goto _L1; else goto _L12
_L12:
            e = 6;
            return false;
_L6:
            if (j != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = l + 1;
            k = i1;
            j = k1;
              goto _L8
            if (j == -1) goto _L1; else goto _L13
_L13:
            e = 6;
            return false;
_L7:
            if (j == -1) goto _L1; else goto _L14
_L14:
            e = 6;
            return false;
_L23:
            int i1;
            int k1;
            int i2;
            if (i < j2)
            {
                i1 = k;
                k1 = j;
                i2 = i;
                if (l != 0)
                {
                    break MISSING_BLOCK_LABEL_238;
                }
                int l1 = i;
                i = j;
                do
                {
                    if (l1 + 4 > j2)
                    {
                        break;
                    }
                    j = ai[abyte0[l1] & 0xff] << 18 | ai[abyte0[l1 + 1] & 0xff] << 12 | ai[abyte0[l1 + 2] & 0xff] << 6 | ai[abyte0[l1 + 3] & 0xff];
                    i = j;
                    if (j < 0)
                    {
                        break;
                    }
                    abyte1[k + 2] = (byte)j;
                    abyte1[k + 1] = (byte)(j >> 8);
                    abyte1[k] = (byte)(j >> 16);
                    k += 3;
                    l1 += 4;
                    i = j;
                } while (true);
                i1 = k;
                k1 = i;
                i2 = l1;
                if (l1 < j2)
                {
                    break MISSING_BLOCK_LABEL_238;
                }
                j = i;
            }
            if (!flag)
            {
                e = l;
                f = j;
                b = k;
                return true;
            }
            i = k;
            l;
            JVM INSTR tableswitch 0 4: default 644
        //                       0 647
        //                       1 660
        //                       2 668
        //                       3 685
        //                       4 718;
               goto _L15 _L16 _L17 _L18 _L19 _L20
_L16:
            break; /* Loop/switch isn't completed */
_L15:
            i = k;
_L21:
            e = l;
            b = i;
            return true;
_L17:
            e = 6;
            return false;
_L18:
            abyte1[k] = (byte)(j >> 4);
            i = k + 1;
            continue; /* Loop/switch isn't completed */
_L19:
            int j1 = k + 1;
            abyte1[k] = (byte)(j >> 10);
            i = j1 + 1;
            abyte1[j1] = (byte)(j >> 2);
            if (true) goto _L21; else goto _L20
_L20:
            e = 6;
            return false;
            if (true) goto _L23; else goto _L22
_L22:
        }


        public b(int i, byte abyte0[])
        {
            a = abyte0;
            if ((i & 8) == 0)
            {
                abyte0 = c;
            } else
            {
                abyte0 = d;
            }
            g = abyte0;
            e = 0;
            f = 0;
        }
    }

    static class c extends a
    {

        static final boolean g;
        private static final byte h[] = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
            75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
            85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
            121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
            56, 57, 43, 47
        };
        private static final byte i[] = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
            75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
            85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
            121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
            56, 57, 45, 95
        };
        int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        private final byte j[] = new byte[2];
        private int k;
        private final byte l[];

        public boolean a(byte abyte0[], int i1, int j1, boolean flag)
        {
            byte abyte1[];
            byte abyte2[];
            int k1;
            int i2;
            int j2;
            int i3;
            abyte1 = l;
            abyte2 = a;
            k1 = 0;
            j2 = k;
            i3 = j1 + i1;
            i2 = -1;
            c;
            JVM INSTR tableswitch 0 2: default 60
        //                       0 352
        //                       1 357
        //                       2 419;
               goto _L1 _L2 _L3 _L4
_L1:
            j1 = i1;
_L10:
            int l1;
            i1 = j2;
            l1 = j1;
            if (i2 == -1) goto _L6; else goto _L5
_L5:
            abyte2[0] = abyte1[i2 >> 18 & 0x3f];
            abyte2[1] = abyte1[i2 >> 12 & 0x3f];
            abyte2[2] = abyte1[i2 >> 6 & 0x3f];
            k1 = 4;
            abyte2[3] = abyte1[i2 & 0x3f];
            i2 = j2 - 1;
            i1 = i2;
            l1 = j1;
            if (i2 != 0) goto _L6; else goto _L7
_L7:
            byte abyte3[];
            int k2;
            int l2;
            if (f)
            {
                i1 = 5;
                abyte2[4] = 13;
            } else
            {
                i1 = 4;
            }
            abyte2[i1] = 10;
            l1 = 19;
            i1++;
            if (j1 + 3 > i3) goto _L9; else goto _L8
_L8:
            k1 = (abyte0[j1] & 0xff) << 16 | (abyte0[j1 + 1] & 0xff) << 8 | abyte0[j1 + 2] & 0xff;
            abyte2[i1] = abyte1[k1 >> 18 & 0x3f];
            abyte2[i1 + 1] = abyte1[k1 >> 12 & 0x3f];
            abyte2[i1 + 2] = abyte1[k1 >> 6 & 0x3f];
            abyte2[i1 + 3] = abyte1[k1 & 0x3f];
            j1 += 3;
            i2 = i1 + 4;
            k2 = l1 - 1;
            i1 = k2;
            k1 = i2;
            l1 = j1;
            if (k2 == 0)
            {
                if (f)
                {
                    i1 = i2 + 1;
                    abyte2[i2] = 13;
                } else
                {
                    i1 = i2;
                }
                abyte2[i1] = 10;
                l1 = 19;
                i1++;
                break MISSING_BLOCK_LABEL_180;
            }
              goto _L6
_L2:
            j1 = i1;
              goto _L10
_L3:
            if (i1 + 2 > i3) goto _L1; else goto _L11
_L11:
            l1 = j[0];
            j1 = i1 + 1;
            i2 = (l1 & 0xff) << 16 | (abyte0[i1] & 0xff) << 8 | abyte0[j1] & 0xff;
            c = 0;
            j1++;
              goto _L10
_L4:
            if (i1 + 1 > i3) goto _L1; else goto _L12
_L12:
            l1 = j[0];
            i2 = j[1];
            j1 = i1 + 1;
            i2 = (l1 & 0xff) << 16 | (i2 & 0xff) << 8 | abyte0[i1] & 0xff;
            c = 0;
              goto _L10
_L9:
            if (!flag) goto _L14; else goto _L13
_L13:
            if (j1 - c != i3 - 1) goto _L16; else goto _L15
_L15:
            if (c > 0)
            {
                abyte0 = j;
                k1 = 1;
                i2 = abyte0[0];
            } else
            {
                i2 = abyte0[j1];
                j1++;
                k1 = 0;
            }
            i2 = (i2 & 0xff) << 4;
            c = c - k1;
            k2 = i1 + 1;
            abyte2[i1] = abyte1[i2 >> 6 & 0x3f];
            k1 = k2 + 1;
            abyte2[k2] = abyte1[i2 & 0x3f];
            i1 = k1;
            if (d)
            {
                i2 = k1 + 1;
                abyte2[k1] = 61;
                i1 = i2 + 1;
                abyte2[i2] = 61;
            }
            k1 = i1;
            if (e)
            {
                k1 = i1;
                if (f)
                {
                    abyte2[i1] = 13;
                    k1 = i1 + 1;
                }
                abyte2[k1] = 10;
                k1++;
            }
            i2 = j1;
_L18:
            if (!g && c != 0)
            {
                throw new AssertionError();
            }
            break; /* Loop/switch isn't completed */
_L16:
            if (j1 - c == i3 - 2)
            {
                if (c > 1)
                {
                    abyte3 = j;
                    k2 = 1;
                    i2 = abyte3[0];
                    k1 = j1;
                    j1 = k2;
                } else
                {
                    i2 = abyte0[j1];
                    k1 = j1 + 1;
                    j1 = 0;
                }
                if (c > 0)
                {
                    k2 = j[j1];
                    l2 = j1 + 1;
                    j1 = k1;
                    k1 = l2;
                } else
                {
                    k2 = abyte0[k1];
                    l2 = k1 + 1;
                    k1 = j1;
                    j1 = l2;
                }
                i2 = (k2 & 0xff) << 2 | (i2 & 0xff) << 10;
                c = c - k1;
                k1 = i1 + 1;
                abyte2[i1] = abyte1[i2 >> 12 & 0x3f];
                k2 = k1 + 1;
                abyte2[k1] = abyte1[i2 >> 6 & 0x3f];
                i1 = k2 + 1;
                abyte2[k2] = abyte1[i2 & 0x3f];
                if (d)
                {
                    k1 = i1 + 1;
                    abyte2[i1] = 61;
                    i1 = k1;
                }
                k1 = i1;
                if (e)
                {
                    k1 = i1;
                    if (f)
                    {
                        abyte2[i1] = 13;
                        k1 = i1 + 1;
                    }
                    abyte2[k1] = 10;
                    k1++;
                }
                i2 = j1;
            } else
            {
                i2 = j1;
                k1 = i1;
                if (e)
                {
                    i2 = j1;
                    k1 = i1;
                    if (i1 > 0)
                    {
                        i2 = j1;
                        k1 = i1;
                        if (l1 != 19)
                        {
                            if (f)
                            {
                                k1 = i1 + 1;
                                abyte2[i1] = 13;
                                i1 = k1;
                            }
                            k1 = i1 + 1;
                            abyte2[i1] = 10;
                            i2 = j1;
                        }
                    }
                }
            }
            if (true) goto _L18; else goto _L17
_L17:
            k2 = k1;
            if (!g)
            {
                k2 = k1;
                if (i2 != i3)
                {
                    throw new AssertionError();
                }
            }
              goto _L19
_L14:
            if (j1 != i3 - 1) goto _L21; else goto _L20
_L20:
            abyte1 = j;
            k1 = c;
            c = k1 + 1;
            abyte1[k1] = abyte0[j1];
            k2 = i1;
_L19:
            b = k2;
            k = l1;
            return true;
_L21:
            k2 = i1;
            if (j1 == i3 - 2)
            {
                abyte1 = j;
                k1 = c;
                c = k1 + 1;
                abyte1[k1] = abyte0[j1];
                abyte1 = j;
                k1 = c;
                c = k1 + 1;
                abyte1[k1] = abyte0[j1 + 1];
                k2 = i1;
            }
            if (true) goto _L19; else goto _L6
_L6:
            i2 = i1;
            i1 = k1;
            j1 = l1;
            l1 = i2;
            break MISSING_BLOCK_LABEL_180;
        }

        static 
        {
            boolean flag;
            if (!com/ta/utdid2/android/utils/Base64.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = flag;
        }

        public c(int i1, byte abyte0[])
        {
            boolean flag1 = true;
            super();
            a = abyte0;
            boolean flag;
            if ((i1 & 1) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = flag;
            if ((i1 & 2) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = flag;
            if ((i1 & 4) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f = flag;
            if ((i1 & 8) == 0)
            {
                abyte0 = h;
            } else
            {
                abyte0 = i;
            }
            l = abyte0;
            c = 0;
            if (e)
            {
                i1 = 19;
            } else
            {
                i1 = -1;
            }
            k = i1;
        }
    }


    static final boolean $assertionsDisabled;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    private Base64()
    {
    }

    public static byte[] decode(String s, int i)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] decode(byte abyte0[], int i)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] decode(byte abyte0[], int i, int j, int k)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] encode(byte abyte0[], int i)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] encode(byte abyte0[], int i, int j, int k)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String encodeToString(byte abyte0[], int i)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String encodeToString(byte abyte0[], int i, int j, int k)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        boolean flag;
        if (!com/ta/utdid2/android/utils/Base64.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
