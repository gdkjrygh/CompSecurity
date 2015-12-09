// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.c;

import com.google.b.b.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.b.a.c:
//            g, e

public final class d
{

    static final String a[] = {
        "UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"
    };
    static final int b[][];
    static final int c[][];
    private static final int d[][];
    private final byte e[];

    public d(byte abyte0[])
    {
        e = abyte0;
    }

    private static Collection a(Iterable iterable)
    {
        LinkedList linkedlist;
        linkedlist = new LinkedList();
        iterable = iterable.iterator();
_L5:
        if (!iterable.hasNext()) goto _L2; else goto _L1
_L1:
        g g1;
        Iterator iterator;
        g1 = (g)iterable.next();
        iterator = linkedlist.iterator();
_L6:
        g g2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        g2 = (g)iterator.next();
        if (!g2.a(g1)) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L7:
        if (flag)
        {
            linkedlist.add(g1);
        }
          goto _L5
_L4:
        if (g1.a(g2))
        {
            iterator.remove();
        }
          goto _L6
_L2:
        return linkedlist;
        flag = true;
          goto _L7
    }

    private Collection a(Iterable iterable, int i)
    {
        LinkedList linkedlist = new LinkedList();
        for (iterable = iterable.iterator(); iterable.hasNext(); a((g)iterable.next(), i, ((Collection) (linkedlist)))) { }
        return a(((Iterable) (linkedlist)));
    }

    private static Collection a(Iterable iterable, int i, int j)
    {
        LinkedList linkedlist = new LinkedList();
        for (iterable = iterable.iterator(); iterable.hasNext(); a((g)iterable.next(), i, j, ((Collection) (linkedlist)))) { }
        return a(((Iterable) (linkedlist)));
    }

    private static void a(g g1, int i, int j, Collection collection)
    {
        g g2 = g1.b(i);
        collection.add(g2.a(4, j));
        if (g1.a() != 4)
        {
            collection.add(g2.b(4, j));
        }
        if (j == 3 || j == 4)
        {
            collection.add(g2.a(2, 16 - j).a(2, 1));
        }
        if (g1.b() > 0)
        {
            collection.add(g1.a(i).a(i + 1));
        }
    }

    private void a(g g1, int i, Collection collection)
    {
        char c1 = (char)(e[i] & 0xff);
        g g2;
        boolean flag;
        if (d[g1.a()][c1] > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g2 = null;
        for (int j = 0; j <= 4;)
        {
            int k = d[j][c1];
            g g4 = g2;
            if (k > 0)
            {
                g g3 = g2;
                if (g2 == null)
                {
                    g3 = g1.b(i);
                }
                if (!flag || j == g1.a() || j == 2)
                {
                    collection.add(g3.a(j, k));
                }
                g4 = g3;
                if (!flag)
                {
                    g4 = g3;
                    if (c[g1.a()][j] >= 0)
                    {
                        collection.add(g3.b(j, k));
                        g4 = g3;
                    }
                }
            }
            j++;
            g2 = g4;
        }

        if (g1.b() > 0 || d[g1.a()][c1] == 0)
        {
            collection.add(g1.a(i));
        }
    }

    public a a()
    {
        Object obj;
        int i;
        obj = Collections.singletonList(com.google.b.a.c.g.a);
        i = 0;
_L6:
        byte byte0;
        if (i >= e.length)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (i + 1 < e.length)
        {
            byte0 = e[i + 1];
        } else
        {
            byte0 = 0;
        }
        e[i];
        JVM INSTR lookupswitch 4: default 88
    //                   13: 117
    //                   44: 149
    //                   46: 133
    //                   58: 165;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0 = 0;
_L7:
        if (byte0 > 0)
        {
            obj = a(((Iterable) (obj)), i, byte0);
            i++;
        } else
        {
            obj = a(((Iterable) (obj)), i);
        }
        i++;
        if (true) goto _L6; else goto _L2
_L2:
        if (byte0 == 10)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
          goto _L7
_L4:
        if (byte0 == 32)
        {
            byte0 = 3;
        } else
        {
            byte0 = 0;
        }
          goto _L7
_L3:
        if (byte0 == 32)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (byte0 == 32)
        {
            byte0 = 5;
        } else
        {
            byte0 = 0;
        }
          goto _L7
        return ((g)Collections.min(((Collection) (obj)), new e(this))).a(e);
    }

    static 
    {
        Object obj = {
            0x901ee, 0, 0x5001e, 0x5001d, 0xa03be
        };
        b = (new int[][] {
            new int[] {
                0, 0x5001c, 0x5001e, 0x5001d, 0xa03be
            }, obj, new int[] {
                0x4000e, 0x901dc, 0, 0x901dd, 0xe3bbe
            }, new int[] {
                0x5001d, 0x5001c, 0xa03be, 0, 0x5001e
            }, new int[] {
                0x5001f, 0xa03fc, 0xa03fe, 0xa03fd, 0
            }
        });
        d = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            5, 256
        });
        d[0][32] = 1;
        for (int i = 65; i <= 90; i++)
        {
            d[0][i] = (i - 65) + 2;
        }

        d[1][32] = 1;
        for (int j = 97; j <= 122; j++)
        {
            d[1][j] = (j - 97) + 2;
        }

        d[2][32] = 1;
        for (int k = 48; k <= 57; k++)
        {
            d[2][k] = (k - 48) + 2;
        }

        d[2][44] = 12;
        d[2][46] = 13;
        obj = new int[28];
        Object _tmp = obj;
        obj[0] = 0;
        obj[1] = 32;
        obj[2] = 1;
        obj[3] = 2;
        obj[4] = 3;
        obj[5] = 4;
        obj[6] = 5;
        obj[7] = 6;
        obj[8] = 7;
        obj[9] = 8;
        obj[10] = 9;
        obj[11] = 10;
        obj[12] = 11;
        obj[13] = 12;
        obj[14] = 13;
        obj[15] = 27;
        obj[16] = 28;
        obj[17] = 29;
        obj[18] = 30;
        obj[19] = 31;
        obj[20] = 64;
        obj[21] = 92;
        obj[22] = 94;
        obj[23] = 95;
        obj[24] = 96;
        obj[25] = 124;
        obj[26] = 126;
        obj[27] = 127;
        for (int l = 0; l < obj.length; l++)
        {
            d[3][obj[l]] = l;
        }

        obj = new int[31];
        Object _tmp1 = obj;
        obj[0] = 0;
        obj[1] = 13;
        obj[2] = 0;
        obj[3] = 0;
        obj[4] = 0;
        obj[5] = 0;
        obj[6] = 33;
        obj[7] = 39;
        obj[8] = 35;
        obj[9] = 36;
        obj[10] = 37;
        obj[11] = 38;
        obj[12] = 39;
        obj[13] = 40;
        obj[14] = 41;
        obj[15] = 42;
        obj[16] = 43;
        obj[17] = 44;
        obj[18] = 45;
        obj[19] = 46;
        obj[20] = 47;
        obj[21] = 58;
        obj[22] = 59;
        obj[23] = 60;
        obj[24] = 61;
        obj[25] = 62;
        obj[26] = 63;
        obj[27] = 91;
        obj[28] = 93;
        obj[29] = 123;
        obj[30] = 125;
        for (int i1 = 0; i1 < obj.length; i1++)
        {
            if (obj[i1] > 0)
            {
                d[4][obj[i1]] = i1;
            }
        }

        c = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            6, 6
        });
        obj = c;
        int k1 = obj.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            Arrays.fill(obj[j1], -1);
        }

        c[0][4] = 0;
        c[1][4] = 0;
        c[1][0] = 28;
        c[3][4] = 0;
        c[2][4] = 0;
        c[2][0] = 15;
    }
}
