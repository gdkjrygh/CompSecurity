// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class azr extends baa
{

    static final int a[][];

    public azr()
    {
    }

    private static int a(ayn ayn1, int ai[], int i)
        throws ayc
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static int[] a(ayn ayn1)
        throws ayc
    {
        int ai[];
        boolean flag;
        int i;
        int j;
        int l1;
        int j2;
        int k2;
        j2 = ayn1.a();
        i = ayn1.c(0);
        ai = new int[6];
        k2 = ai.length;
        l1 = i;
        flag = false;
        j = 0;
_L2:
        if (l1 >= j2)
        {
            throw ayc.a();
        }
        if (!(ayn1.a(l1) ^ flag))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[j] = ai[j] + 1;
        int k = j;
        j = i;
        i = k;
_L3:
        l1++;
        int l = i;
        i = j;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        if (j == k2 - 1)
        {
            int k1 = 64;
            byte byte0 = -1;
            int i1 = 103;
            do
            {
                if (i1 > 105)
                {
                    if (byte0 >= 0 && ayn1.a(Math.max(0, i - (l1 - i) / 2), i, false))
                    {
                        return (new int[] {
                            i, l1, byte0
                        });
                    }
                    break;
                }
                int i2 = a(ai, a[i1], 179);
                if (i2 < k1)
                {
                    byte0 = i1;
                    k1 = i2;
                }
                i1++;
            } while (true);
            i1 = ai[0] + ai[1] + i;
            System.arraycopy(ai, 2, ai, 0, k2 - 2);
            ai[k2 - 2] = 0;
            ai[k2 - 1] = 0;
            i = j - 1;
            j = i1;
        } else
        {
            int j1 = j + 1;
            j = i;
            i = j1;
        }
        ai[i] = 1;
        if (flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public ayf a(int i, ayn ayn1, Map map)
        throws ayc, axz, axx
    {
        int ai[];
        int i2;
        boolean flag;
        if (map != null && map.containsKey(axy.h))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai = a(ayn1);
        i2 = ai[2];
        map = new ArrayList(20);
        map.add(Byte.valueOf((byte)i2));
        i2;
        JVM INSTR tableswitch 103 105: default 84
    //                   103 94
    //                   104 203
    //                   105 210;
           goto _L1 _L2 _L3 _L4
_L1:
        throw axz.a();
_L2:
        int j = 101;
_L53:
        Object obj;
        int ai1[];
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        int k2;
        int k3;
        int l3;
        obj = new StringBuilder(20);
        l1 = ai[0];
        j1 = ai[1];
        ai1 = new int[6];
        i1 = 1;
        k3 = 0;
        l3 = 0;
        k2 = 0;
        j2 = 0;
        boolean flag1 = false;
        l = 0;
        k1 = 0;
        k = j;
        j = ((flag1) ? 1 : 0);
        break MISSING_BLOCK_LABEL_159;
_L3:
        j = 100;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 99;
        continue; /* Loop/switch isn't completed */
_L13:
        int l2;
        int i3;
        int j3;
        if (j != 0)
        {
            j = ayn1.d(j1);
            int i4;
            int k4;
            if (!ayn1.a(j, Math.min(ayn1.a(), (j - l1) / 2 + j), false))
            {
                throw ayc.a();
            }
            if ((i2 - j2 * l) % 103 != l)
            {
                throw axx.a();
            }
            j = ((StringBuilder) (obj)).length();
            if (j == 0)
            {
                throw ayc.a();
            }
            float f;
            float f1;
            float f2;
            if (j > 0 && i1 != 0)
            {
                if (k == 99)
                {
                    ((StringBuilder) (obj)).delete(j - 2, j);
                } else
                {
                    ((StringBuilder) (obj)).delete(j - 1, j);
                }
            }
            f = (float)(ai[1] + ai[0]) / 2.0F;
            f1 = l1;
            f2 = (float)(j1 - l1) / 2.0F;
            k = map.size();
            ayn1 = new byte[k];
            j = 0;
            do
            {
                if (j >= k)
                {
                    map = ((StringBuilder) (obj)).toString();
                    obj = new ayh(f, i);
                    ayh ayh1 = new ayh(f1 + f2, i);
                    axu axu1 = axu.e;
                    return new ayf(map, ayn1, new ayh[] {
                        obj, ayh1
                    }, axu1);
                }
                ayn1[j] = ((Byte)map.get(j)).byteValue();
                j++;
            } while (true);
        }
        i4 = 0;
        j3 = a(ayn1, ai1, j1);
        map.add(Byte.valueOf((byte)j3));
        if (j3 != 106)
        {
            i1 = 1;
        }
        i3 = j2;
        l2 = i2;
        if (j3 != 106)
        {
            i3 = j2 + 1;
            l2 = i2 + i3 * j3;
        }
        l1 = ai1.length;
        l = 0;
        j2 = j1;
_L14:
        if (l < l1) goto _L6; else goto _L5
_L5:
        j3;
        JVM INSTR tableswitch 103 105: default 332
    //                   103 454
    //                   104 454
    //                   105 454;
           goto _L7 _L8 _L8 _L8
_L7:
        k;
        JVM INSTR tableswitch 99 101: default 360
    //                   99 1323
    //                   100 919
    //                   101 458;
           goto _L9 _L10 _L11 _L12
_L9:
        i2 = i4;
        l1 = k3;
        l = l3;
_L17:
        if (k2 != 0)
        {
            if (k == 101)
            {
                k = 100;
            } else
            {
                k = 101;
            }
            k2 = i2;
            i4 = j2;
            k4 = k1;
            k1 = j3;
            j2 = i3;
            i2 = l2;
            l3 = l;
            k3 = l1;
            l = k4;
            l1 = j1;
            j1 = i4;
        } else
        {
            k2 = i2;
            int j4 = j2;
            int l4 = k1;
            k1 = j3;
            j2 = i3;
            i2 = l2;
            l3 = l;
            k3 = l1;
            l = l4;
            l1 = j1;
            j1 = j4;
        }
          goto _L13
_L6:
        j2 += ai1[l];
        l++;
          goto _L14
_L8:
        throw axz.a();
_L12:
        if (j3 >= 64) goto _L16; else goto _L15
_L15:
        if (l3 == k3)
        {
            ((StringBuilder) (obj)).append((char)(j3 + 32));
        } else
        {
            ((StringBuilder) (obj)).append((char)(j3 + 32 + 128));
        }
        l = 0;
        l1 = k3;
        i2 = i4;
          goto _L17
_L16:
        if (j3 >= 96) goto _L19; else goto _L18
_L18:
        if (l3 == k3)
        {
            ((StringBuilder) (obj)).append((char)(j3 - 64));
        } else
        {
            ((StringBuilder) (obj)).append((char)(j3 + 64));
        }
        l = 0;
        l1 = k3;
        i2 = i4;
          goto _L17
_L19:
        i2 = i1;
        if (j3 != 106)
        {
            i2 = 0;
        }
        l = j;
        j3;
        JVM INSTR tableswitch 96 106: default 652
    //                   96 750
    //                   97 750
    //                   98 841
    //                   99 890
    //                   100 867
    //                   101 769
    //                   102 679
    //                   103 656
    //                   104 656
    //                   105 656
    //                   106 913;
           goto _L20 _L21 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L27 _L27 _L28
_L27:
        break; /* Loop/switch isn't completed */
_L20:
        l = j;
_L30:
        j = l;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L26:
        i1 = i2;
        if (!flag) goto _L9; else goto _L29
_L29:
        if (((StringBuilder) (obj)).length() == 0)
        {
            ((StringBuilder) (obj)).append("]C1");
            l = l3;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        } else
        {
            ((StringBuilder) (obj)).append('\035');
            l = l3;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        }
          goto _L17
_L21:
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L25:
        if (k3 == 0 && l3 != 0)
        {
            l1 = 1;
            l = 0;
            i1 = i2;
            i2 = i4;
        } else
        if (k3 != 0 && l3 != 0)
        {
            l1 = 0;
            l = 0;
            i1 = i2;
            i2 = i4;
        } else
        {
            l = 1;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        }
          goto _L17
_L22:
        i4 = 1;
        k = 100;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L24:
        k = 100;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L23:
        k = 99;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L28:
        l = 1;
          goto _L30
_L11:
        if (j3 >= 96) goto _L32; else goto _L31
_L31:
        if (l3 == k3)
        {
            ((StringBuilder) (obj)).append((char)(j3 + 32));
        } else
        {
            ((StringBuilder) (obj)).append((char)(j3 + 32 + 128));
        }
        l = 0;
        l1 = k3;
        i2 = i4;
          goto _L17
_L32:
        i2 = i1;
        if (j3 != 106)
        {
            i2 = 0;
        }
        l = j;
        j3;
        JVM INSTR tableswitch 96 106: default 1056
    //                   96 1154
    //                   97 1154
    //                   98 1245
    //                   99 1294
    //                   100 1173
    //                   101 1271
    //                   102 1083
    //                   103 1060
    //                   104 1060
    //                   105 1060
    //                   106 1317;
           goto _L33 _L34 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L40 _L40 _L41
_L40:
        break; /* Loop/switch isn't completed */
_L33:
        l = j;
_L43:
        j = l;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L39:
        i1 = i2;
        if (!flag) goto _L9; else goto _L42
_L42:
        if (((StringBuilder) (obj)).length() == 0)
        {
            ((StringBuilder) (obj)).append("]C1");
            l = l3;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        } else
        {
            ((StringBuilder) (obj)).append('\035');
            l = l3;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        }
          goto _L17
_L34:
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L37:
        if (k3 == 0 && l3 != 0)
        {
            l1 = 1;
            l = 0;
            i1 = i2;
            i2 = i4;
        } else
        if (k3 != 0 && l3 != 0)
        {
            l1 = 0;
            l = 0;
            i1 = i2;
            i2 = i4;
        } else
        {
            l = 1;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        }
          goto _L17
_L35:
        i4 = 1;
        k = 101;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L38:
        k = 101;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L36:
        k = 99;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L41:
        l = 1;
          goto _L43
_L10:
        if (j3 >= 100) goto _L45; else goto _L44
_L44:
        if (j3 < 10)
        {
            ((StringBuilder) (obj)).append('0');
        }
        ((StringBuilder) (obj)).append(j3);
        l = l3;
        l1 = k3;
        i2 = i4;
          goto _L17
_L45:
        i2 = i1;
        if (j3 != 106)
        {
            i2 = 0;
        }
        j3;
        JVM INSTR tableswitch 100 106: default 1428
    //                   100 1435
    //                   101 1529
    //                   102 1458
    //                   103 1428
    //                   104 1428
    //                   105 1428
    //                   106 1552;
           goto _L46 _L47 _L48 _L49 _L46 _L46 _L46 _L50
_L46:
        i1 = i2;
          goto _L9
_L47:
        k = 100;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L49:
        i1 = i2;
        if (!flag) goto _L9; else goto _L51
_L51:
        if (((StringBuilder) (obj)).length() == 0)
        {
            ((StringBuilder) (obj)).append("]C1");
            l = l3;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        } else
        {
            ((StringBuilder) (obj)).append('\035');
            l = l3;
            l1 = k3;
            i1 = i2;
            i2 = i4;
        }
          goto _L17
_L48:
        k = 101;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
_L50:
        j = 1;
        l = l3;
        l1 = k3;
        i1 = i2;
        i2 = i4;
          goto _L17
        if (true) goto _L53; else goto _L52
_L52:
    }

    static 
    {
        int ai[] = {
            2, 2, 2, 1, 2, 2
        };
        int ai1[] = {
            1, 3, 1, 2, 2, 2
        };
        int ai2[] = {
            1, 2, 2, 2, 1, 3
        };
        int ai3[] = {
            1, 3, 2, 2, 1, 2
        };
        int ai4[] = {
            2, 2, 1, 2, 1, 3
        };
        int ai5[] = {
            1, 1, 2, 2, 3, 2
        };
        int ai6[] = {
            1, 2, 2, 1, 3, 2
        };
        int ai7[] = {
            1, 1, 3, 2, 2, 2
        };
        int ai8[] = {
            1, 2, 3, 1, 2, 2
        };
        int ai9[] = {
            1, 2, 3, 2, 2, 1
        };
        int ai10[] = {
            2, 2, 3, 2, 1, 1
        };
        int ai11[] = {
            2, 2, 1, 2, 3, 1
        };
        int ai12[] = {
            2, 1, 3, 2, 1, 2
        };
        int ai13[] = {
            3, 1, 2, 1, 3, 1
        };
        int ai14[] = {
            3, 2, 1, 1, 2, 2
        };
        int ai15[] = {
            3, 2, 2, 2, 1, 1
        };
        int ai16[] = {
            2, 1, 2, 1, 2, 3
        };
        int ai17[] = {
            2, 1, 2, 3, 2, 1
        };
        int ai18[] = {
            2, 3, 2, 1, 2, 1
        };
        int ai19[] = {
            1, 1, 1, 3, 2, 3
        };
        int ai20[] = {
            1, 3, 1, 1, 2, 3
        };
        int ai21[] = {
            1, 1, 2, 3, 1, 3
        };
        int ai22[] = {
            2, 1, 1, 3, 1, 3
        };
        int ai23[] = {
            2, 3, 1, 3, 1, 1
        };
        int ai24[] = {
            1, 1, 2, 1, 3, 3
        };
        int ai25[] = {
            1, 1, 2, 3, 3, 1
        };
        int ai26[] = {
            1, 3, 2, 1, 3, 1
        };
        int ai27[] = {
            1, 1, 3, 3, 2, 1
        };
        int ai28[] = {
            1, 3, 3, 1, 2, 1
        };
        int ai29[] = {
            3, 1, 3, 1, 2, 1
        };
        int ai30[] = {
            2, 3, 1, 1, 3, 1
        };
        int ai31[] = {
            2, 1, 3, 3, 1, 1
        };
        int ai32[] = {
            2, 1, 3, 1, 3, 1
        };
        int ai33[] = {
            3, 1, 1, 1, 2, 3
        };
        int ai34[] = {
            3, 1, 1, 3, 2, 1
        };
        int ai35[] = {
            3, 3, 1, 1, 2, 1
        };
        int ai36[] = {
            3, 1, 2, 1, 1, 3
        };
        int ai37[] = {
            3, 1, 2, 3, 1, 1
        };
        int ai38[] = {
            3, 1, 4, 1, 1, 1
        };
        int ai39[] = {
            1, 1, 1, 2, 2, 4
        };
        int ai40[] = {
            1, 1, 1, 4, 2, 2
        };
        int ai41[] = {
            1, 2, 1, 4, 2, 1
        };
        int ai42[] = {
            1, 4, 1, 1, 2, 2
        };
        int ai43[] = {
            1, 4, 1, 2, 2, 1
        };
        int ai44[] = {
            1, 2, 2, 4, 1, 1
        };
        int ai45[] = {
            1, 4, 2, 1, 1, 2
        };
        int ai46[] = {
            4, 1, 3, 1, 1, 1
        };
        int ai47[] = {
            2, 4, 1, 1, 1, 2
        };
        int ai48[] = {
            1, 3, 4, 1, 1, 1
        };
        int ai49[] = {
            1, 1, 1, 2, 4, 2
        };
        int ai50[] = {
            1, 2, 1, 1, 4, 2
        };
        int ai51[] = {
            1, 2, 1, 2, 4, 1
        };
        int ai52[] = {
            1, 1, 4, 2, 1, 2
        };
        int ai53[] = {
            1, 2, 4, 1, 1, 2
        };
        int ai54[] = {
            1, 2, 4, 2, 1, 1
        };
        int ai55[] = {
            4, 1, 1, 2, 1, 2
        };
        int ai56[] = {
            4, 2, 1, 1, 1, 2
        };
        int ai57[] = {
            4, 2, 1, 2, 1, 1
        };
        int ai58[] = {
            2, 1, 2, 1, 4, 1
        };
        int ai59[] = {
            2, 1, 4, 1, 2, 1
        };
        int ai60[] = {
            1, 1, 1, 1, 4, 3
        };
        int ai61[] = {
            1, 1, 1, 3, 4, 1
        };
        int ai62[] = {
            1, 1, 4, 1, 1, 3
        };
        int ai63[] = {
            1, 1, 4, 3, 1, 1
        };
        int ai64[] = {
            4, 1, 1, 1, 1, 3
        };
        int ai65[] = {
            4, 1, 1, 3, 1, 1
        };
        int ai66[] = {
            1, 1, 3, 1, 4, 1
        };
        int ai67[] = {
            3, 1, 1, 1, 4, 1
        };
        int ai68[] = {
            4, 1, 1, 1, 3, 1
        };
        int ai69[] = {
            2, 1, 1, 2, 1, 4
        };
        int ai70[] = {
            2, 3, 3, 1, 1, 1, 2
        };
        a = (new int[][] {
            new int[] {
                2, 1, 2, 2, 2, 2
            }, ai, new int[] {
                2, 2, 2, 2, 2, 1
            }, new int[] {
                1, 2, 1, 2, 2, 3
            }, new int[] {
                1, 2, 1, 3, 2, 2
            }, ai1, ai2, new int[] {
                1, 2, 2, 3, 1, 2
            }, ai3, ai4, new int[] {
                2, 2, 1, 3, 1, 2
            }, new int[] {
                2, 3, 1, 2, 1, 2
            }, ai5, ai6, new int[] {
                1, 2, 2, 2, 3, 1
            }, ai7, ai8, ai9, ai10, new int[] {
                2, 2, 1, 1, 3, 2
            }, ai11, ai12, new int[] {
                2, 2, 3, 1, 1, 2
            }, ai13, new int[] {
                3, 1, 1, 2, 2, 2
            }, ai14, new int[] {
                3, 2, 1, 2, 2, 1
            }, new int[] {
                3, 1, 2, 2, 1, 2
            }, new int[] {
                3, 2, 2, 1, 1, 2
            }, ai15, ai16, ai17, ai18, ai19, ai20, new int[] {
                1, 3, 1, 3, 2, 1
            }, ai21, new int[] {
                1, 3, 2, 1, 1, 3
            }, new int[] {
                1, 3, 2, 3, 1, 1
            }, ai22, new int[] {
                2, 3, 1, 1, 1, 3
            }, ai23, ai24, ai25, ai26, new int[] {
                1, 1, 3, 1, 2, 3
            }, ai27, ai28, ai29, new int[] {
                2, 1, 1, 3, 3, 1
            }, ai30, new int[] {
                2, 1, 3, 1, 1, 3
            }, ai31, ai32, ai33, ai34, ai35, ai36, ai37, new int[] {
                3, 3, 2, 1, 1, 1
            }, ai38, new int[] {
                2, 2, 1, 4, 1, 1
            }, new int[] {
                4, 3, 1, 1, 1, 1
            }, ai39, ai40, new int[] {
                1, 2, 1, 1, 2, 4
            }, ai41, ai42, ai43, new int[] {
                1, 1, 2, 2, 1, 4
            }, new int[] {
                1, 1, 2, 4, 1, 2
            }, new int[] {
                1, 2, 2, 1, 1, 4
            }, ai44, ai45, new int[] {
                1, 4, 2, 2, 1, 1
            }, new int[] {
                2, 4, 1, 2, 1, 1
            }, new int[] {
                2, 2, 1, 1, 1, 4
            }, ai46, ai47, ai48, ai49, ai50, ai51, ai52, ai53, ai54, ai55, ai56, ai57, ai58, ai59, new int[] {
                4, 1, 2, 1, 2, 1
            }, ai60, ai61, new int[] {
                1, 3, 1, 1, 4, 1
            }, ai62, ai63, ai64, ai65, ai66, new int[] {
                1, 1, 4, 1, 3, 1
            }, ai67, ai68, new int[] {
                2, 1, 1, 4, 1, 2
            }, ai69, new int[] {
                2, 1, 1, 2, 3, 2
            }, ai70
        });
    }
}
