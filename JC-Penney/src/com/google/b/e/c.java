// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.d;
import com.google.b.e;
import com.google.b.h;
import com.google.b.m;
import com.google.b.q;
import com.google.b.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            q

public final class c extends com.google.b.e.q
{

    static final int a[][];

    public c()
    {
    }

    private static int a(a a1, int ai[], int i)
    {
        a(a1, i, ai);
        float f = 0.25F;
        int j = -1;
        for (i = 0; i < a.length;)
        {
            float f2 = a(ai, a[i], 0.7F);
            float f1 = f;
            if (f2 < f)
            {
                j = i;
                f1 = f2;
            }
            i++;
            f = f1;
        }

        if (j >= 0)
        {
            return j;
        } else
        {
            throw m.a();
        }
    }

    private static int[] a(a a1)
    {
        int i2 = a1.a();
        int i = a1.c(0);
        int ai[] = new int[6];
        int j2 = ai.length;
        int l1 = i;
        boolean flag = false;
        int j = 0;
        while (l1 < i2) 
        {
            int l;
            if (a1.a(l1) ^ flag)
            {
                ai[j] = ai[j] + 1;
                int k = j;
                j = i;
                i = k;
            } else
            {
                if (j == j2 - 1)
                {
                    float f = 0.25F;
                    byte byte0 = -1;
                    for (int i1 = 103; i1 <= 105; i1++)
                    {
                        float f1 = a(ai, a[i1], 0.7F);
                        if (f1 < f)
                        {
                            byte0 = i1;
                            f = f1;
                        }
                    }

                    if (byte0 >= 0 && a1.a(Math.max(0, i - (l1 - i) / 2), i, false))
                    {
                        return (new int[] {
                            i, l1, byte0
                        });
                    }
                    int j1 = ai[0] + ai[1] + i;
                    System.arraycopy(ai, 2, ai, 0, j2 - 2);
                    ai[j2 - 2] = 0;
                    ai[j2 - 1] = 0;
                    i = j - 1;
                    j = j1;
                } else
                {
                    int k1 = j + 1;
                    j = i;
                    i = k1;
                }
                ai[i] = 1;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            l1++;
            l = i;
            i = j;
            j = l;
        }
        throw m.a();
    }

    public q a(int i, a a1, Map map)
    {
        int ai[];
        int i2;
        boolean flag2;
        if (map != null && map.containsKey(e.h))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ai = a(a1);
        i2 = ai[2];
        map = new ArrayList(20);
        map.add(Byte.valueOf((byte)i2));
        i2;
        JVM INSTR tableswitch 103 105: default 84
    //                   103 94
    //                   104 272
    //                   105 279;
           goto _L1 _L2 _L3 _L4
_L1:
        throw h.a();
_L2:
        int j = 101;
_L50:
        Object obj;
        int ai1[];
        int l;
        int j1;
        int k1;
        int l1;
        int j2;
        int k2;
        int l2;
        int j3;
        int k3;
        int l3;
        obj = new StringBuilder(20);
        j3 = ai[0];
        j2 = ai[1];
        ai1 = new int[6];
        l1 = 1;
        boolean flag = false;
        k1 = 0;
        l3 = 0;
        k2 = 0;
        k3 = 0;
        l2 = 0;
        l = 0;
        j1 = j;
        j = ((flag) ? 1 : 0);
_L14:
        if (l != 0) goto _L6; else goto _L5
_L5:
        int i3;
        int i4;
        int j4;
        int k4;
        boolean flag3;
        boolean flag4;
        flag4 = false;
        flag3 = false;
        k4 = a(a1, ai1, j2);
        map.add(Byte.valueOf((byte)k4));
        if (k4 != 106)
        {
            l1 = 1;
        }
        j4 = k2;
        i4 = i2;
        if (k4 != 106)
        {
            j4 = k2 + 1;
            i4 = i2 + j4 * k4;
        }
        k2 = ai1.length;
        i2 = 0;
        i3 = j2;
        for (; i2 < k2; i2++)
        {
            i3 += ai1[i2];
        }

          goto _L7
_L3:
        j = 100;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 99;
        continue; /* Loop/switch isn't completed */
_L7:
        k4;
        JVM INSTR tableswitch 103 105: default 316
    //                   103 462
    //                   104 462
    //                   105 462;
           goto _L8 _L9 _L9 _L9
_L8:
        j1;
        JVM INSTR tableswitch 99 101: default 344
    //                   99 1528
    //                   100 1036
    //                   101 466;
           goto _L10 _L11 _L12 _L13
_L10:
        i2 = l1;
_L47:
        k2 = j1;
        l1 = 0;
        j3 = k1;
        k1 = i2;
        i2 = l;
        j1 = j;
        l = j3;
        j = k2;
_L17:
        k2 = j;
        boolean flag1;
        if (l3 != 0)
        {
            if (j == 101)
            {
                k2 = 100;
            } else
            {
                k2 = 101;
            }
        }
        l3 = l1;
        l1 = k2;
        j = j1;
        k3 = l2;
        l2 = k4;
        j3 = k1;
        j1 = i2;
        k2 = j4;
        i2 = i4;
        k1 = l;
        l = j1;
        j1 = l1;
        l1 = j3;
        j3 = j2;
        j2 = i3;
          goto _L14
_L9:
        throw h.a();
_L13:
        if (k4 >= 64) goto _L16; else goto _L15
_L15:
        if (k1 == j)
        {
            ((StringBuilder) (obj)).append((char)(k4 + 32));
        } else
        {
            ((StringBuilder) (obj)).append((char)(k4 + 32 + 128));
        }
        k2 = j1;
        j3 = 0;
        j1 = j;
        k3 = 0;
        k1 = l1;
        i2 = l;
        j = k2;
        l = k3;
        l1 = j3;
          goto _L17
_L16:
        if (k4 >= 96) goto _L19; else goto _L18
_L18:
        if (k1 == j)
        {
            ((StringBuilder) (obj)).append((char)(k4 - 64));
        } else
        {
            ((StringBuilder) (obj)).append((char)(k4 + 64));
        }
        k2 = j1;
        j3 = 0;
        j1 = j;
        k3 = 0;
        k1 = l1;
        i2 = l;
        j = k2;
        l = k3;
        l1 = j3;
          goto _L17
_L19:
        j3 = l1;
        if (k4 != 106)
        {
            j3 = 0;
        }
        l1 = k1;
        k2 = j;
        flag1 = flag3;
        k3 = l;
        i2 = j1;
        k4;
        JVM INSTR tableswitch 96 106: default 720
    //                   96 740
    //                   97 740
    //                   98 946
    //                   99 991
    //                   100 968
    //                   101 862
    //                   102 767
    //                   103 740
    //                   104 740
    //                   105 740
    //                   106 1014;
           goto _L20 _L21 _L21 _L22 _L23 _L24 _L25 _L26 _L21 _L21 _L21 _L27
_L21:
        break; /* Loop/switch isn't completed */
_L20:
        i2 = j1;
        k3 = l;
        flag1 = flag3;
        k2 = j;
        l1 = k1;
_L28:
        j = i2;
        j1 = k2;
        l = l1;
        k1 = j3;
        i2 = k3;
        l1 = ((flag1) ? 1 : 0);
          goto _L17
_L26:
        l1 = k1;
        k2 = j;
        flag1 = flag3;
        k3 = l;
        i2 = j1;
        if (flag2)
        {
            if (((StringBuilder) (obj)).length() == 0)
            {
                ((StringBuilder) (obj)).append("]C1");
                l1 = k1;
                k2 = j;
                flag1 = flag3;
                k3 = l;
                i2 = j1;
            } else
            {
                ((StringBuilder) (obj)).append('\035');
                l1 = k1;
                k2 = j;
                flag1 = flag3;
                k3 = l;
                i2 = j1;
            }
        }
          goto _L28
_L25:
        if (j == 0 && k1 != 0)
        {
            k2 = 1;
            l1 = 0;
            flag1 = flag3;
            k3 = l;
            i2 = j1;
        } else
        if (j != 0 && k1 != 0)
        {
            k2 = 0;
            l1 = 0;
            flag1 = flag3;
            k3 = l;
            i2 = j1;
        } else
        {
            l1 = 1;
            k2 = j;
            flag1 = flag3;
            k3 = l;
            i2 = j1;
        }
          goto _L28
_L22:
        flag1 = true;
        i2 = 100;
        l1 = k1;
        k2 = j;
        k3 = l;
          goto _L28
_L24:
        i2 = 100;
        l1 = k1;
        k2 = j;
        flag1 = flag3;
        k3 = l;
          goto _L28
_L23:
        i2 = 99;
        l1 = k1;
        k2 = j;
        flag1 = flag3;
        k3 = l;
          goto _L28
_L27:
        k3 = 1;
        l1 = k1;
        k2 = j;
        flag1 = flag3;
        i2 = j1;
          goto _L28
_L12:
        if (k4 >= 96) goto _L30; else goto _L29
_L29:
        if (k1 == j)
        {
            ((StringBuilder) (obj)).append((char)(k4 + 32));
        } else
        {
            ((StringBuilder) (obj)).append((char)(k4 + 32 + 128));
        }
        k2 = j1;
        j3 = 0;
        j1 = j;
        k3 = 0;
        k1 = l1;
        i2 = l;
        j = k2;
        l = k3;
        l1 = j3;
          goto _L17
_L30:
        j3 = l1;
        if (k4 != 106)
        {
            j3 = 0;
        }
        l1 = k1;
        k2 = j;
        flag1 = flag4;
        k3 = l;
        i2 = j1;
        k4;
        JVM INSTR tableswitch 96 106: default 1212
    //                   96 1232
    //                   97 1232
    //                   98 1438
    //                   99 1483
    //                   100 1354
    //                   101 1460
    //                   102 1259
    //                   103 1232
    //                   104 1232
    //                   105 1232
    //                   106 1506;
           goto _L31 _L32 _L32 _L33 _L34 _L35 _L36 _L37 _L32 _L32 _L32 _L38
_L32:
        break; /* Loop/switch isn't completed */
_L31:
        i2 = j1;
        k3 = l;
        flag1 = flag4;
        k2 = j;
        l1 = k1;
_L39:
        j = i2;
        j1 = k2;
        l = l1;
        k1 = j3;
        i2 = k3;
        l1 = ((flag1) ? 1 : 0);
          goto _L17
_L37:
        l1 = k1;
        k2 = j;
        flag1 = flag4;
        k3 = l;
        i2 = j1;
        if (flag2)
        {
            if (((StringBuilder) (obj)).length() == 0)
            {
                ((StringBuilder) (obj)).append("]C1");
                l1 = k1;
                k2 = j;
                flag1 = flag4;
                k3 = l;
                i2 = j1;
            } else
            {
                ((StringBuilder) (obj)).append('\035');
                l1 = k1;
                k2 = j;
                flag1 = flag4;
                k3 = l;
                i2 = j1;
            }
        }
          goto _L39
_L35:
        if (j == 0 && k1 != 0)
        {
            k2 = 1;
            l1 = 0;
            flag1 = flag4;
            k3 = l;
            i2 = j1;
        } else
        if (j != 0 && k1 != 0)
        {
            k2 = 0;
            l1 = 0;
            flag1 = flag4;
            k3 = l;
            i2 = j1;
        } else
        {
            l1 = 1;
            k2 = j;
            flag1 = flag4;
            k3 = l;
            i2 = j1;
        }
          goto _L39
_L33:
        flag1 = true;
        i2 = 101;
        l1 = k1;
        k2 = j;
        k3 = l;
          goto _L39
_L36:
        i2 = 101;
        l1 = k1;
        k2 = j;
        flag1 = flag4;
        k3 = l;
          goto _L39
_L34:
        i2 = 99;
        l1 = k1;
        k2 = j;
        flag1 = flag4;
        k3 = l;
          goto _L39
_L38:
        k3 = 1;
        l1 = k1;
        k2 = j;
        flag1 = flag4;
        i2 = j1;
          goto _L39
_L11:
        if (k4 >= 100) goto _L41; else goto _L40
_L40:
        if (k4 < 10)
        {
            ((StringBuilder) (obj)).append('0');
        }
        ((StringBuilder) (obj)).append(k4);
        k2 = j1;
        k3 = 0;
        j1 = j;
        j3 = k1;
        k1 = l1;
        i2 = l;
        j = k2;
        l = j3;
        l1 = k3;
          goto _L17
_L41:
        if (k4 != 106)
        {
            l1 = 0;
        }
        k4;
        JVM INSTR tableswitch 100 106: default 1652
    //                   100 1659
    //                   101 1806
    //                   102 1697
    //                   103 1652
    //                   104 1652
    //                   105 1652
    //                   106 1844;
           goto _L42 _L43 _L44 _L45 _L42 _L42 _L42 _L46
_L42:
        i2 = l1;
          goto _L47
_L43:
        k3 = 100;
        j3 = 0;
        j1 = j;
        k2 = k1;
        k1 = l1;
        i2 = l;
        j = k3;
        l = k2;
        l1 = j3;
          goto _L17
_L45:
        i2 = l1;
        if (!flag2) goto _L47; else goto _L48
_L48:
        if (((StringBuilder) (obj)).length() == 0)
        {
            ((StringBuilder) (obj)).append("]C1");
            k2 = j1;
            k3 = 0;
            j1 = j;
            j3 = k1;
            k1 = l1;
            i2 = l;
            j = k2;
            l = j3;
            l1 = k3;
        } else
        {
            ((StringBuilder) (obj)).append('\035');
            k2 = j1;
            k3 = 0;
            j1 = j;
            j3 = k1;
            k1 = l1;
            i2 = l;
            j = k2;
            l = j3;
            l1 = k3;
        }
          goto _L17
_L44:
        k3 = 101;
        j3 = 0;
        j1 = j;
        k2 = k1;
        k1 = l1;
        i2 = l;
        j = k3;
        l = k2;
        l1 = j3;
          goto _L17
_L46:
        l = j1;
        k2 = 0;
        j1 = j;
        i2 = k1;
        k1 = l1;
        j3 = 1;
        j = l;
        l = i2;
        l1 = k2;
        i2 = j3;
          goto _L17
_L6:
        int k = a1.d(j2);
        if (!a1.a(k, Math.min(a1.a(), (k - j3) / 2 + k), false))
        {
            throw m.a();
        }
        if ((i2 - k2 * k3) % 103 != k3)
        {
            throw d.a();
        }
        k = ((StringBuilder) (obj)).length();
        if (k == 0)
        {
            throw m.a();
        }
        float f;
        float f1;
        float f2;
        int i1;
        if (k > 0 && l1 != 0)
        {
            if (j1 == 99)
            {
                ((StringBuilder) (obj)).delete(k - 2, k);
            } else
            {
                ((StringBuilder) (obj)).delete(k - 1, k);
            }
        }
        f = (float)(ai[1] + ai[0]) / 2.0F;
        f1 = j3;
        f2 = (float)(j2 - j3) / 2.0F;
        i1 = map.size();
        a1 = new byte[i1];
        for (k = 0; k < i1; k++)
        {
            a1[k] = ((Byte)map.get(k)).byteValue();
        }

        map = ((StringBuilder) (obj)).toString();
        obj = new s(f, i);
        s s1 = new s(f1 + f2, i);
        com.google.b.a a2 = com.google.b.a.e;
        return new q(map, a1, new s[] {
            obj, s1
        }, a2);
        if (true) goto _L50; else goto _L49
_L49:
    }

    static 
    {
        int ai[] = {
            2, 2, 1, 3, 1, 2
        };
        int ai1[] = {
            1, 1, 3, 2, 2, 2
        };
        int ai2[] = {
            2, 2, 1, 1, 3, 2
        };
        int ai3[] = {
            3, 2, 2, 1, 1, 2
        };
        int ai4[] = {
            1, 1, 2, 3, 1, 3
        };
        int ai5[] = {
            1, 3, 2, 1, 1, 3
        };
        int ai6[] = {
            1, 3, 2, 3, 1, 1
        };
        int ai7[] = {
            1, 1, 2, 3, 3, 1
        };
        int ai8[] = {
            1, 3, 2, 1, 3, 1
        };
        int ai9[] = {
            3, 1, 3, 1, 2, 1
        };
        int ai10[] = {
            3, 1, 2, 1, 1, 3
        };
        int ai11[] = {
            1, 1, 1, 2, 2, 4
        };
        int ai12[] = {
            1, 2, 1, 4, 2, 1
        };
        int ai13[] = {
            1, 2, 2, 1, 1, 4
        };
        int ai14[] = {
            2, 4, 1, 1, 1, 2
        };
        int ai15[] = {
            1, 2, 1, 2, 4, 1
        };
        int ai16[] = {
            2, 1, 2, 1, 4, 1
        };
        int ai17[] = {
            4, 1, 2, 1, 2, 1
        };
        int ai18[] = {
            1, 1, 1, 3, 4, 1
        };
        int ai19[] = {
            2, 1, 1, 2, 1, 4
        };
        a = (new int[][] {
            new int[] {
                2, 1, 2, 2, 2, 2
            }, new int[] {
                2, 2, 2, 1, 2, 2
            }, new int[] {
                2, 2, 2, 2, 2, 1
            }, new int[] {
                1, 2, 1, 2, 2, 3
            }, new int[] {
                1, 2, 1, 3, 2, 2
            }, new int[] {
                1, 3, 1, 2, 2, 2
            }, new int[] {
                1, 2, 2, 2, 1, 3
            }, new int[] {
                1, 2, 2, 3, 1, 2
            }, new int[] {
                1, 3, 2, 2, 1, 2
            }, new int[] {
                2, 2, 1, 2, 1, 3
            }, ai, new int[] {
                2, 3, 1, 2, 1, 2
            }, new int[] {
                1, 1, 2, 2, 3, 2
            }, new int[] {
                1, 2, 2, 1, 3, 2
            }, new int[] {
                1, 2, 2, 2, 3, 1
            }, ai1, new int[] {
                1, 2, 3, 1, 2, 2
            }, new int[] {
                1, 2, 3, 2, 2, 1
            }, new int[] {
                2, 2, 3, 2, 1, 1
            }, ai2, new int[] {
                2, 2, 1, 2, 3, 1
            }, new int[] {
                2, 1, 3, 2, 1, 2
            }, new int[] {
                2, 2, 3, 1, 1, 2
            }, new int[] {
                3, 1, 2, 1, 3, 1
            }, new int[] {
                3, 1, 1, 2, 2, 2
            }, new int[] {
                3, 2, 1, 1, 2, 2
            }, new int[] {
                3, 2, 1, 2, 2, 1
            }, new int[] {
                3, 1, 2, 2, 1, 2
            }, ai3, new int[] {
                3, 2, 2, 2, 1, 1
            }, new int[] {
                2, 1, 2, 1, 2, 3
            }, new int[] {
                2, 1, 2, 3, 2, 1
            }, new int[] {
                2, 3, 2, 1, 2, 1
            }, new int[] {
                1, 1, 1, 3, 2, 3
            }, new int[] {
                1, 3, 1, 1, 2, 3
            }, new int[] {
                1, 3, 1, 3, 2, 1
            }, ai4, ai5, ai6, new int[] {
                2, 1, 1, 3, 1, 3
            }, new int[] {
                2, 3, 1, 1, 1, 3
            }, new int[] {
                2, 3, 1, 3, 1, 1
            }, new int[] {
                1, 1, 2, 1, 3, 3
            }, ai7, ai8, new int[] {
                1, 1, 3, 1, 2, 3
            }, new int[] {
                1, 1, 3, 3, 2, 1
            }, new int[] {
                1, 3, 3, 1, 2, 1
            }, ai9, new int[] {
                2, 1, 1, 3, 3, 1
            }, new int[] {
                2, 3, 1, 1, 3, 1
            }, new int[] {
                2, 1, 3, 1, 1, 3
            }, new int[] {
                2, 1, 3, 3, 1, 1
            }, new int[] {
                2, 1, 3, 1, 3, 1
            }, new int[] {
                3, 1, 1, 1, 2, 3
            }, new int[] {
                3, 1, 1, 3, 2, 1
            }, new int[] {
                3, 3, 1, 1, 2, 1
            }, ai10, new int[] {
                3, 1, 2, 3, 1, 1
            }, new int[] {
                3, 3, 2, 1, 1, 1
            }, new int[] {
                3, 1, 4, 1, 1, 1
            }, new int[] {
                2, 2, 1, 4, 1, 1
            }, new int[] {
                4, 3, 1, 1, 1, 1
            }, ai11, new int[] {
                1, 1, 1, 4, 2, 2
            }, new int[] {
                1, 2, 1, 1, 2, 4
            }, ai12, new int[] {
                1, 4, 1, 1, 2, 2
            }, new int[] {
                1, 4, 1, 2, 2, 1
            }, new int[] {
                1, 1, 2, 2, 1, 4
            }, new int[] {
                1, 1, 2, 4, 1, 2
            }, ai13, new int[] {
                1, 2, 2, 4, 1, 1
            }, new int[] {
                1, 4, 2, 1, 1, 2
            }, new int[] {
                1, 4, 2, 2, 1, 1
            }, new int[] {
                2, 4, 1, 2, 1, 1
            }, new int[] {
                2, 2, 1, 1, 1, 4
            }, new int[] {
                4, 1, 3, 1, 1, 1
            }, ai14, new int[] {
                1, 3, 4, 1, 1, 1
            }, new int[] {
                1, 1, 1, 2, 4, 2
            }, new int[] {
                1, 2, 1, 1, 4, 2
            }, ai15, new int[] {
                1, 1, 4, 2, 1, 2
            }, new int[] {
                1, 2, 4, 1, 1, 2
            }, new int[] {
                1, 2, 4, 2, 1, 1
            }, new int[] {
                4, 1, 1, 2, 1, 2
            }, new int[] {
                4, 2, 1, 1, 1, 2
            }, new int[] {
                4, 2, 1, 2, 1, 1
            }, ai16, new int[] {
                2, 1, 4, 1, 2, 1
            }, ai17, new int[] {
                1, 1, 1, 1, 4, 3
            }, ai18, new int[] {
                1, 3, 1, 1, 4, 1
            }, new int[] {
                1, 1, 4, 1, 1, 3
            }, new int[] {
                1, 1, 4, 3, 1, 1
            }, new int[] {
                4, 1, 1, 1, 1, 3
            }, new int[] {
                4, 1, 1, 3, 1, 1
            }, new int[] {
                1, 1, 3, 1, 4, 1
            }, new int[] {
                1, 1, 4, 1, 3, 1
            }, new int[] {
                3, 1, 1, 1, 4, 1
            }, new int[] {
                4, 1, 1, 1, 3, 1
            }, new int[] {
                2, 1, 1, 4, 1, 2
            }, ai19, new int[] {
                2, 1, 1, 2, 3, 2
            }, new int[] {
                2, 3, 3, 1, 1, 1, 2
            }
        });
    }
}
