// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.d;


public class com.ut.mini.d.c
{
    static abstract class a
    {

        public int b;
        public byte hA[];

        a()
        {
        }
    }

    static class b extends a
    {

        private static final int hB[] = {
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
        private static final int hC[] = {
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
        private int hD;
        private final int hE[];

        public boolean b(byte abyte0[], int i, int j, boolean flag)
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
            j = hD;
            k = 0;
            abyte1 = hA;
            ai = hE;
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
                hD = j;
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
            hA = abyte0;
            if ((i & 8) == 0)
            {
                abyte0 = hB;
            } else
            {
                abyte0 = hC;
            }
            hE = abyte0;
            e = 0;
            hD = 0;
        }
    }

    static class c extends a
    {

        static final boolean g;
        private static final byte hF[] = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
            75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
            85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
            121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
            56, 57, 43, 47
        };
        private static final byte hG[] = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
            75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
            85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
            121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
            56, 57, 45, 95
        };
        public final boolean d;
        public final boolean e;
        public final boolean f;
        private final byte hH[] = new byte[2];
        private int hI;
        private final byte hJ[];
        int hs;

        public boolean b(byte abyte0[], int i, int j, boolean flag)
        {
            byte abyte1[];
            byte abyte2[];
            int k;
            int i1;
            int j1;
            int i2;
            abyte1 = hJ;
            abyte2 = hA;
            k = 0;
            j1 = hI;
            i2 = j + i;
            i1 = -1;
            hs;
            JVM INSTR tableswitch 0 2: default 60
        //                       0 352
        //                       1 357
        //                       2 419;
               goto _L1 _L2 _L3 _L4
_L1:
            j = i;
_L10:
            int l;
            i = j1;
            l = j;
            if (i1 == -1) goto _L6; else goto _L5
_L5:
            abyte2[0] = abyte1[i1 >> 18 & 0x3f];
            abyte2[1] = abyte1[i1 >> 12 & 0x3f];
            abyte2[2] = abyte1[i1 >> 6 & 0x3f];
            k = 4;
            abyte2[3] = abyte1[i1 & 0x3f];
            i1 = j1 - 1;
            i = i1;
            l = j;
            if (i1 != 0) goto _L6; else goto _L7
_L7:
            byte abyte3[];
            int k1;
            int l1;
            if (f)
            {
                i = 5;
                abyte2[4] = 13;
            } else
            {
                i = 4;
            }
            abyte2[i] = 10;
            l = 19;
            i++;
            if (j + 3 > i2) goto _L9; else goto _L8
_L8:
            k = (abyte0[j] & 0xff) << 16 | (abyte0[j + 1] & 0xff) << 8 | abyte0[j + 2] & 0xff;
            abyte2[i] = abyte1[k >> 18 & 0x3f];
            abyte2[i + 1] = abyte1[k >> 12 & 0x3f];
            abyte2[i + 2] = abyte1[k >> 6 & 0x3f];
            abyte2[i + 3] = abyte1[k & 0x3f];
            j += 3;
            i1 = i + 4;
            k1 = l - 1;
            i = k1;
            k = i1;
            l = j;
            if (k1 == 0)
            {
                if (f)
                {
                    i = i1 + 1;
                    abyte2[i1] = 13;
                } else
                {
                    i = i1;
                }
                abyte2[i] = 10;
                l = 19;
                i++;
                break MISSING_BLOCK_LABEL_180;
            }
              goto _L6
_L2:
            j = i;
              goto _L10
_L3:
            if (i + 2 > i2) goto _L1; else goto _L11
_L11:
            l = hH[0];
            j = i + 1;
            i1 = (l & 0xff) << 16 | (abyte0[i] & 0xff) << 8 | abyte0[j] & 0xff;
            hs = 0;
            j++;
              goto _L10
_L4:
            if (i + 1 > i2) goto _L1; else goto _L12
_L12:
            l = hH[0];
            i1 = hH[1];
            j = i + 1;
            i1 = (l & 0xff) << 16 | (i1 & 0xff) << 8 | abyte0[i] & 0xff;
            hs = 0;
              goto _L10
_L9:
            if (!flag) goto _L14; else goto _L13
_L13:
            if (j - hs != i2 - 1) goto _L16; else goto _L15
_L15:
            if (hs > 0)
            {
                abyte0 = hH;
                k = 1;
                i1 = abyte0[0];
            } else
            {
                i1 = abyte0[j];
                j++;
                k = 0;
            }
            i1 = (i1 & 0xff) << 4;
            hs = hs - k;
            k1 = i + 1;
            abyte2[i] = abyte1[i1 >> 6 & 0x3f];
            k = k1 + 1;
            abyte2[k1] = abyte1[i1 & 0x3f];
            i = k;
            if (d)
            {
                i1 = k + 1;
                abyte2[k] = 61;
                i = i1 + 1;
                abyte2[i1] = 61;
            }
            k = i;
            if (e)
            {
                k = i;
                if (f)
                {
                    abyte2[i] = 13;
                    k = i + 1;
                }
                abyte2[k] = 10;
                k++;
            }
            i1 = j;
_L18:
            if (!g && hs != 0)
            {
                throw new AssertionError();
            }
            break; /* Loop/switch isn't completed */
_L16:
            if (j - hs == i2 - 2)
            {
                if (hs > 1)
                {
                    abyte3 = hH;
                    k1 = 1;
                    i1 = abyte3[0];
                    k = j;
                    j = k1;
                } else
                {
                    i1 = abyte0[j];
                    k = j + 1;
                    j = 0;
                }
                if (hs > 0)
                {
                    k1 = hH[j];
                    l1 = j + 1;
                    j = k;
                    k = l1;
                } else
                {
                    k1 = abyte0[k];
                    l1 = k + 1;
                    k = j;
                    j = l1;
                }
                i1 = (k1 & 0xff) << 2 | (i1 & 0xff) << 10;
                hs = hs - k;
                k = i + 1;
                abyte2[i] = abyte1[i1 >> 12 & 0x3f];
                k1 = k + 1;
                abyte2[k] = abyte1[i1 >> 6 & 0x3f];
                i = k1 + 1;
                abyte2[k1] = abyte1[i1 & 0x3f];
                if (d)
                {
                    k = i + 1;
                    abyte2[i] = 61;
                    i = k;
                }
                k = i;
                if (e)
                {
                    k = i;
                    if (f)
                    {
                        abyte2[i] = 13;
                        k = i + 1;
                    }
                    abyte2[k] = 10;
                    k++;
                }
                i1 = j;
            } else
            {
                i1 = j;
                k = i;
                if (e)
                {
                    i1 = j;
                    k = i;
                    if (i > 0)
                    {
                        i1 = j;
                        k = i;
                        if (l != 19)
                        {
                            if (f)
                            {
                                k = i + 1;
                                abyte2[i] = 13;
                                i = k;
                            }
                            k = i + 1;
                            abyte2[i] = 10;
                            i1 = j;
                        }
                    }
                }
            }
            if (true) goto _L18; else goto _L17
_L17:
            k1 = k;
            if (!g)
            {
                k1 = k;
                if (i1 != i2)
                {
                    throw new AssertionError();
                }
            }
              goto _L19
_L14:
            if (j != i2 - 1) goto _L21; else goto _L20
_L20:
            abyte1 = hH;
            k = hs;
            hs = k + 1;
            abyte1[k] = abyte0[j];
            k1 = i;
_L19:
            b = k1;
            hI = l;
            return true;
_L21:
            k1 = i;
            if (j == i2 - 2)
            {
                abyte1 = hH;
                k = hs;
                hs = k + 1;
                abyte1[k] = abyte0[j];
                abyte1 = hH;
                k = hs;
                hs = k + 1;
                abyte1[k] = abyte0[j + 1];
                k1 = i;
            }
            if (true) goto _L19; else goto _L6
_L6:
            i1 = i;
            i = k;
            j = l;
            l = i1;
            break MISSING_BLOCK_LABEL_180;
        }

        static 
        {
            boolean flag;
            if (!com/ut/mini/d/c.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = flag;
        }

        public c(int i, byte abyte0[])
        {
            boolean flag1 = true;
            super();
            hA = abyte0;
            boolean flag;
            if ((i & 1) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = flag;
            if ((i & 2) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = flag;
            if ((i & 4) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f = flag;
            if ((i & 8) == 0)
            {
                abyte0 = hF;
            } else
            {
                abyte0 = hG;
            }
            hJ = abyte0;
            hs = 0;
            if (e)
            {
                i = 19;
            } else
            {
                i = -1;
            }
            hI = i;
        }
    }


    static final boolean a;

    private com.ut.mini.d.c()
    {
    }

    public static byte[] a(byte abyte0[], int i)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] a(byte abyte0[], int i, int j, int k)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String b(byte abyte0[], int i)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] b(byte abyte0[], int i, int j, int k)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] c(byte abyte0[], int i)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        boolean flag;
        if (!com/ut/mini/d/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
