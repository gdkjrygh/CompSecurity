// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class czq
    implements czs
{

    private static final String a = czq.getSimpleName();
    private static final float b[] = {
        0.625F, 1.0F
    };
    private static final float c[] = {
        0.769F, 0.625F, 1.0F
    };
    private static final float d[] = {
        0.25F, 0.25F, 0.5F
    };
    private final blp e;
    private List f;
    private List g;

    public czq(blp blp1)
    {
        f = new ArrayList();
        g = new ArrayList();
        e = (blp)b.a(blp1, "clipIdentifierGenerator", null);
    }

    private SparseArray a(cok cok1, List list)
    {
        SparseArray sparsearray = new SparseArray(list.size());
        for (int i = 0; i < list.size(); i++)
        {
            cnq cnq1 = (cnq)list.get(i);
            pxq pxq1 = (pxq)f.get(i);
            pyg pyg1 = (pyg)g.get(i);
            sparsearray.put(cnq1.b, cnu.a(pyg1, pxq1, cok1.a, cok1.b, false));
        }

        return sparsearray;
    }

    private cnq a(pxo pxo1, pyg pyg1)
    {
        b.a(pxo1.a, "cloud clip type", 4, null);
        cns cns1 = new cns();
        cns1.a = e.a();
        pxo1 = cns1.a(b.a(pxo1.c)).a(cnt.d);
        pxo1.d = cnq.a;
        pxo1.c = true;
        return pxo1.a((pyg)b.a(pyg1, "themeParams", null)).a();
    }

    private static pxs a(pxs pxs1, cok cok1)
    {
        float f4 = ((float)cok1.a * 1.0F) / (float)cok1.b;
        cok1 = new pxs();
        cok1.a = Float.valueOf(f4);
        float f5 = 1.0F - pxs1.b.floatValue() - pxs1.c.floatValue();
        float f1 = pxs1.b.floatValue() + 0.5F * f5;
        float f6 = 1.0F - pxs1.d.floatValue() - pxs1.e.floatValue();
        float f3 = pxs1.d.floatValue() + 0.5F * f6;
        if (f4 < pxs1.a.floatValue())
        {
            f3 = (f4 * f5) / pxs1.a.floatValue();
            cok1.b = Float.valueOf(f1 - 0.5F * f3);
            cok1.c = Float.valueOf(1.0F - (f1 - f3 * 0.5F));
            cok1.d = pxs1.d;
            cok1.e = pxs1.e;
            return cok1;
        } else
        {
            float f2 = (f6 / f4) * pxs1.a.floatValue();
            cok1.b = pxs1.b;
            cok1.c = pxs1.c;
            cok1.d = Float.valueOf(f3 - 0.5F * f2);
            cok1.e = Float.valueOf(1.0F - (f2 * 0.5F + f3));
            return cok1;
        }
    }

    private static pxu a(int i)
    {
        pxu pxu1 = new pxu();
        pxu1.a = Integer.valueOf(i);
        return pxu1;
    }

    private static void a(List list)
    {
        int i = list.size() - 1;
        do
        {
label0:
            {
                if (i >= 0)
                {
                    if (list.get(i) == cyj.R)
                    {
                        break label0;
                    }
                    list.add(i + 1, cyj.Q);
                }
                return;
            }
            i--;
        } while (true);
    }

    private static void a(List list, List list1, List list2, List list3, cok cok1)
    {
        int i;
        int j;
        int k9;
        j = 0;
        i = 0;
        k9 = 0;
_L25:
        Object obj;
        if (k9 >= list.size())
        {
            break MISSING_BLOCK_LABEL_3747;
        }
        obj = ((cyl)list.get(k9)).b;
        ((cyj) (obj)).toString();
        list3.add(obj);
        czr.a[((cyj) (obj)).ordinal()];
        JVM INSTR tableswitch 1 42: default 244
    //                   1 342
    //                   2 342
    //                   3 364
    //                   4 364
    //                   5 364
    //                   6 454
    //                   7 454
    //                   8 454
    //                   9 565
    //                   10 847
    //                   11 1151
    //                   12 1362
    //                   13 1573
    //                   14 1784
    //                   15 1915
    //                   16 1993
    //                   17 1993
    //                   18 1993
    //                   19 1993
    //                   20 2222
    //                   21 2222
    //                   22 2222
    //                   23 2222
    //                   24 2451
    //                   25 2632
    //                   26 2763
    //                   27 2763
    //                   28 2908
    //                   29 2908
    //                   30 3053
    //                   31 3206
    //                   32 3359
    //                   33 3490
    //                   34 3490
    //                   35 3546
    //                   36 3546
    //                   37 3546
    //                   38 3546
    //                   39 3636
    //                   40 3636
    //                   41 3636
    //                   42 3636;
           goto _L1 _L2 _L2 _L3 _L3 _L3 _L4 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L12 _L13 _L13 _L13 _L13 _L14 _L15 _L16 _L16 _L17 _L17 _L18 _L19 _L20 _L21 _L21 _L22 _L22 _L22 _L22 _L23 _L23 _L23 _L23
_L23:
        break MISSING_BLOCK_LABEL_3636;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        int i11 = ((cyj) (obj)).T.length();
        int l9 = 0;
        int k = j;
        int k5 = i;
        do
        {
            i = k5;
            j = k;
            if (l9 >= i11)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = new pxt();
            obj.a = 1;
            obj.b = Integer.valueOf(k);
            ((pyg)list1.get(k5)).f = ((pxt) (obj));
            l9++;
            k5++;
            k++;
        } while (true);
_L2:
        i += ((cyj) (obj)).T.length();
_L26:
        k9++;
        if (true) goto _L25; else goto _L24
_L24:
        int l5 = ((cyj) (obj)).T.length();
        for (int l = 0; l < l5;)
        {
            obj = new pxt();
            if (l == 0)
            {
                obj.a = 2;
            }
            obj.b = Integer.valueOf(j);
            ((pyg)list1.get(i)).f = ((pxt) (obj));
            l++;
            i++;
        }

        j++;
          goto _L26
_L4:
        int i6 = ((cyj) (obj)).T.length();
        for (int i1 = 0; i1 < i6;)
        {
            obj = new pxt();
            if (i1 == 0)
            {
                obj.a = 3;
            }
            obj.b = Integer.valueOf(j);
            obj.d = a((pxq)list2.get(i), cok1);
            ((pyg)list1.get(i)).f = ((pxt) (obj));
            i1++;
            i++;
        }

        j++;
          goto _L26
_L5:
        obj = new pxt();
        obj.a = 1;
        int j1 = j + 1;
        obj.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        i = j1 + 1;
        obj.b = Integer.valueOf(j1);
        obj.c = (new pxu[] {
            a(j - 1)
        });
        j1 = j + 1;
        ((pyg)list1.get(j)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        int j6 = i + 1;
        obj.b = Integer.valueOf(i);
        obj.c = (new pxu[] {
            a(j1 - 2), a(j1 - 1)
        });
        int i10 = j1 + 1;
        ((pyg)list1.get(j1)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        j = j6 + 1;
        obj.b = Integer.valueOf(j6);
        obj.c = (new pxu[] {
            a(i10 - 1)
        });
        i = i10 + 1;
        ((pyg)list1.get(i10)).f = ((pxt) (obj));
          goto _L26
_L6:
        obj = new pxt();
        obj.a = 1;
        int k1 = j + 1;
        obj.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        i = k1 + 1;
        obj.b = Integer.valueOf(k1);
        obj.c = (new pxu[] {
            a(j - 1)
        });
        k1 = j + 1;
        ((pyg)list1.get(j)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        int k6 = i + 1;
        obj.b = Integer.valueOf(i);
        obj.c = (new pxu[] {
            a(k1 - 2), a(k1 - 1)
        });
        int j10 = k1 + 1;
        ((pyg)list1.get(k1)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 4;
        j = k6 + 1;
        obj.b = Integer.valueOf(k6);
        obj.d = a((pxq)list2.get(j10), 2, cok1);
        obj.c = (new pxu[] {
            a(j10 - 1)
        });
        i = j10 + 1;
        ((pyg)list1.get(j10)).f = ((pxt) (obj));
          goto _L26
_L7:
        obj = new pxt();
        obj.a = 1;
        int l1 = j + 1;
        obj.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        i = l1 + 1;
        obj.b = Integer.valueOf(l1);
        obj.c = (new pxu[] {
            a(j - 1)
        });
        l1 = j + 1;
        ((pyg)list1.get(j)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 4;
        j = i + 1;
        obj.b = Integer.valueOf(i);
        obj.d = a((pxq)list2.get(l1), 2, cok1);
        a(l1 - 1);
        i = l1 + 1;
        ((pyg)list1.get(l1)).f = ((pxt) (obj));
          goto _L26
_L8:
        obj = new pxt();
        obj.a = 1;
        int i2 = j + 1;
        obj.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        i = i2 + 1;
        obj.b = Integer.valueOf(i2);
        obj.c = (new pxu[] {
            a(j - 1)
        });
        i2 = j + 1;
        ((pyg)list1.get(j)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 4;
        j = i + 1;
        obj.b = Integer.valueOf(i);
        obj.d = a((pxq)list2.get(i2), 3, cok1);
        a(i2 - 1);
        i = i2 + 1;
        ((pyg)list1.get(i2)).f = ((pxt) (obj));
          goto _L26
_L9:
        obj = new pxt();
        obj.a = 1;
        int j2 = j + 1;
        obj.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        i = j2 + 1;
        obj.b = Integer.valueOf(j2);
        obj.c = (new pxu[] {
            a(j - 1)
        });
        j2 = j + 1;
        ((pyg)list1.get(j)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 5;
        j = i + 1;
        obj.b = Integer.valueOf(i);
        obj.d = b((pxq)list2.get(j2), 1, cok1);
        a(j2 - 1);
        i = j2 + 1;
        ((pyg)list1.get(j2)).f = ((pxt) (obj));
          goto _L26
_L10:
        obj = new pxt();
        obj.a = 1;
        int k2 = j + 1;
        obj.b = Integer.valueOf(j);
        int l6 = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 5;
        j = k2 + 1;
        obj.b = Integer.valueOf(k2);
        obj.d = b((pxq)list2.get(l6), 2, cok1);
        i = l6 + 1;
        ((pyg)list1.get(l6)).f = ((pxt) (obj));
          goto _L26
_L11:
        obj = new pxt();
        obj.a = 5;
        obj.b = Integer.valueOf(j);
        obj.d = b((pxq)list2.get(i), 3, cok1);
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        i++;
        j++;
          goto _L26
_L12:
        pxt pxt2 = new pxt();
        pxt2.a = 1;
        int l2 = j + 1;
        pxt2.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = pxt2;
        pxt2 = new pxt();
        pxt2.a = 1;
        int i7 = l2 + 1;
        pxt2.b = Integer.valueOf(l2);
        pxt2.c = (new pxu[] {
            a(j - 1)
        });
        l2 = j + 1;
        ((pyg)list1.get(j)).f = pxt2;
        int k10 = ((cyj) (obj)).T.length();
        j = 0;
        for (i = l2; j < k10 - 2; i++)
        {
            obj = new pxt();
            if (j == 0)
            {
                obj.a = 2;
            }
            obj.b = Integer.valueOf(i7);
            a(l2 - 1);
            ((pyg)list1.get(i)).f = ((pxt) (obj));
            j++;
        }

        j = i7 + 1;
          goto _L26
_L13:
        pxt pxt3 = new pxt();
        pxt3.a = 1;
        int i3 = j + 1;
        pxt3.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = pxt3;
        pxt3 = new pxt();
        pxt3.a = 1;
        int j7 = i3 + 1;
        pxt3.b = Integer.valueOf(i3);
        pxt3.c = (new pxu[] {
            a(j - 1)
        });
        i3 = j + 1;
        ((pyg)list1.get(j)).f = pxt3;
        int l10 = ((cyj) (obj)).T.length();
        j = 0;
        for (i = i3; j < l10 - 2; i++)
        {
            obj = new pxt();
            if (j == 0)
            {
                obj.a = 3;
            }
            obj.b = Integer.valueOf(j7);
            a(i3 - 1);
            ((pyg)list1.get(i)).f = ((pxt) (obj));
            j++;
        }

        j = j7 + 1;
          goto _L26
_L14:
        obj = new pxt();
        obj.a = 1;
        int j3 = j + 1;
        obj.b = Integer.valueOf(j);
        j = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        i = j3 + 1;
        obj.b = Integer.valueOf(j3);
        obj.c = (new pxu[] {
            a(j - 1)
        });
        j3 = j + 1;
        ((pyg)list1.get(j)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        j = i + 1;
        obj.b = Integer.valueOf(i);
        i = j3 + 1;
        ((pyg)list1.get(j3)).f = ((pxt) (obj));
          goto _L26
_L15:
        obj = new pxt();
        obj.a = 5;
        int k3 = j + 1;
        obj.b = Integer.valueOf(j);
        obj.d = b((pxq)list2.get(i), 1, cok1);
        int k7 = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        j = k3 + 1;
        obj.b = Integer.valueOf(k3);
        i = k7 + 1;
        ((pyg)list1.get(k7)).f = ((pxt) (obj));
          goto _L26
_L16:
        pxt pxt4 = new pxt();
        pxt4.a = 1;
        int l3 = j + 1;
        pxt4.b = Integer.valueOf(j);
        ((pyg)list1.get(i)).f = pxt4;
        int l7 = ((cyj) (obj)).T.length();
        i++;
        for (j = 0; j < l7 - 1;)
        {
            obj = new pxt();
            if (j == 0)
            {
                obj.a = 2;
            }
            obj.b = Integer.valueOf(l3);
            ((pyg)list1.get(i)).f = ((pxt) (obj));
            j++;
            i++;
        }

        j = l3 + 1;
          goto _L26
_L17:
        pxt pxt5 = new pxt();
        pxt5.a = 1;
        int i4 = j + 1;
        pxt5.b = Integer.valueOf(j);
        ((pyg)list1.get(i)).f = pxt5;
        int i8 = ((cyj) (obj)).T.length();
        i++;
        for (j = 0; j < i8 - 1;)
        {
            obj = new pxt();
            if (j == 0)
            {
                obj.a = 3;
            }
            obj.b = Integer.valueOf(i4);
            ((pyg)list1.get(i)).f = ((pxt) (obj));
            j++;
            i++;
        }

        j = i4 + 1;
          goto _L26
_L18:
        obj = new pxt();
        obj.a = 4;
        int j4 = j + 1;
        obj.b = Integer.valueOf(j);
        obj.d = a((pxq)list2.get(i), 2, cok1);
        int j8 = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 5;
        j = j4 + 1;
        obj.b = Integer.valueOf(j4);
        obj.d = b((pxq)list2.get(j8), 1, cok1);
        i = j8 + 1;
        ((pyg)list1.get(j8)).f = ((pxt) (obj));
          goto _L26
_L19:
        obj = new pxt();
        obj.a = 4;
        int k4 = j + 1;
        obj.b = Integer.valueOf(j);
        obj.d = a((pxq)list2.get(i), 2, cok1);
        int k8 = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 4;
        j = k4 + 1;
        obj.b = Integer.valueOf(k4);
        obj.d = a((pxq)list2.get(k8), 2, cok1);
        i = k8 + 1;
        ((pyg)list1.get(k8)).f = ((pxt) (obj));
          goto _L26
_L20:
        obj = new pxt();
        obj.a = 4;
        int l4 = j + 1;
        obj.b = Integer.valueOf(j);
        obj.d = a((pxq)list2.get(i), 2, cok1);
        int l8 = i + 1;
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        obj = new pxt();
        obj.a = 1;
        j = l4 + 1;
        obj.b = Integer.valueOf(l4);
        i = l8 + 1;
        ((pyg)list1.get(l8)).f = ((pxt) (obj));
          goto _L26
_L21:
        obj = new pxt();
        obj.a = 1;
        obj.b = Integer.valueOf(j);
        ((pyg)list1.get(i)).f = ((pxt) (obj));
        i++;
        j++;
          goto _L26
_L22:
        int i9 = ((cyj) (obj)).T.length();
        for (int i5 = 0; i5 < i9;)
        {
            obj = new pxt();
            if (i5 == 0)
            {
                obj.a = 2;
            }
            obj.b = Integer.valueOf(j);
            ((pyg)list1.get(i)).f = ((pxt) (obj));
            i5++;
            i++;
        }

        j++;
          goto _L26
        int j9 = ((cyj) (obj)).T.length();
        for (int j5 = 0; j5 < j9;)
        {
            pxt pxt1 = new pxt();
            if (j5 == 0)
            {
                pxt1.a = 3;
            }
            pxt1.b = Integer.valueOf(j);
            pxt1.d = a((pxq)list2.get(i), cok1);
            ((pyg)list1.get(i)).f = pxt1;
            j5++;
            i++;
        }

        j++;
          goto _L26
    }

    private void a(pye pye1, List list)
    {
        f.clear();
        int i = 0;
label0:
        do
        {
            if (i < list.size())
            {
                nnt nnt1 = ((cnq)list.get(i)).e.a;
                int j = 0;
                do
                {
label1:
                    {
                        if (j < pye1.b.length)
                        {
                            if (pye1.d[j])
                            {
                                break label1;
                            }
                            pxo pxo1 = pye1.b[j];
                            if (!nnt1.equals(nnt.a(pxo1.b)))
                            {
                                break label1;
                            }
                            f.add(pxo1.d);
                            g.add(pye1.h.b.b[j]);
                        }
                        i++;
                        continue label0;
                    }
                    j++;
                } while (true);
            }
            return;
        } while (true);
    }

    private static pxv[] a(pxq pxq1, int i, cok cok1)
    {
        pxq1 = crg.a(pxq1, cok1.a, cok1.b, false);
        if (pxq1 == null)
        {
            return new pxv[0];
        }
        float f3 = 1.0F - ((cnw) (pxq1)).a - ((cnw) (pxq1)).b;
        float f4 = ((cnw) (pxq1)).a + 0.5F * f3;
        float f5 = 1.0F - ((cnw) (pxq1)).c - ((cnw) (pxq1)).d;
        float f6 = ((cnw) (pxq1)).c + 0.5F * f5;
        pxq1 = new pxv[i];
        float f2 = 1.0F / (float)i;
        int j = 0;
        while (j < i) 
        {
            float f1;
            pxv pxv1;
            if (i == 2)
            {
                f1 = b[j];
            } else
            if (i == 3)
            {
                f1 = c[j];
                f2 = d[j];
            } else
            {
                f1 = 1.0F;
            }
            cok1 = new pxs();
            cok1.b = Float.valueOf(f4 - 0.5F * f3 * f1);
            cok1.c = Float.valueOf(1.0F - (0.5F * f3 * f1 + f4));
            cok1.d = Float.valueOf(f6 - 0.5F * f5 * f1);
            cok1.e = Float.valueOf(1.0F - (f1 * (0.5F * f5) + f6));
            pxv1 = new pxv();
            pxv1.a = cok1;
            pxv1.c = Float.valueOf(0.0F);
            pxv1.b = Float.valueOf(f2);
            pxq1[j] = pxv1;
            j++;
        }
        return pxq1;
    }

    private static pxv[] a(pxq pxq1, cok cok1)
    {
        if (pxq1.d.length == 0)
        {
            return new pxv[0];
        } else
        {
            pxv pxv1 = new pxv();
            pxv1.a = a(pxq1.d[0].a, cok1);
            pxv1.c = Float.valueOf(0.0F);
            pxv1.b = Float.valueOf(1.0F);
            return (new pxv[] {
                pxv1
            });
        }
    }

    private static pxv[] b(pxq pxq1, int i, cok cok1)
    {
        float f1;
        pxv apxv[];
        int j;
        if (pxq1.d.length < i)
        {
            j = pxq1.d.length;
        } else
        {
            j = i;
        }
        apxv = new pxv[i + 1];
        f1 = 1.0F / (float)(i + 1);
        for (int k = 0; k < j; k++)
        {
            pyc pyc1 = pxq1.d[k];
            pxv pxv1 = new pxv();
            pxv1.a = a(pyc1.a, cok1);
            pxv1.b = Float.valueOf(f1);
            pxv1.c = Float.valueOf(0.0F);
            apxv[k] = pxv1;
        }

        cok1 = crg.a(pxq1, cok1.a, cok1.b, false);
        pxq1 = cok1;
        int l = j;
        if (cok1 == null)
        {
            pxq1 = new cnw(0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            l = j;
        }
        for (; l < i + 1; l++)
        {
            cok1 = new pxv();
            pxs pxs1 = new pxs();
            pxs1.b = Float.valueOf(((cnw) (pxq1)).a);
            pxs1.c = Float.valueOf(((cnw) (pxq1)).b);
            pxs1.d = Float.valueOf(((cnw) (pxq1)).c);
            pxs1.e = Float.valueOf(((cnw) (pxq1)).d);
            cok1.a = pxs1;
            cok1.b = Float.valueOf(f1);
            cok1.c = Float.valueOf(0.0F);
            apxv[l] = cok1;
        }

        return apxv;
    }

    public final cnq a(cnq cnq1, cyy cyy1)
    {
        return null;
    }

    public final czt a(boolean flag, pye pye1, int i, List list, cyy cyy1, List list1, SparseArray sparsearray, 
            boolean flag1, Map map, Map map1, boolean flag2, boolean flag3)
    {
        cok cok1;
        b.a(pye1, "cloud storyboard should not be null for FunFactory movies!", null);
        char c1 = '\u0500';
        char c2 = '\u02D0';
        int j = c2;
        i = c1;
        if (pye1 != null)
        {
            j = c2;
            i = c1;
            if (pye1.i != null)
            {
                j = c2;
                i = c1;
                if (pye1.j != null)
                {
                    i = pye1.i.intValue();
                    j = pye1.j.intValue();
                }
            }
        }
        cok1 = cok.a(list, map, i, j);
        if (!b.a(pye1, flag1, cyy1, cok1))
        {
            break MISSING_BLOCK_LABEL_614;
        }
        if (pye1.h != null && pye1.h.b != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L5:
        if (flag)
        {
            list1 = String.valueOf("copying theme params from cloud storyboard [cloudStoryboard_is_null:");
            pxu apxu[];
            pxo apxo[];
            pyg apyg[];
            int k;
            int l;
            int i1;
            if (pye1 == null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (pye1 != null && cyy.a(pye1.h.a) == cyy1)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            (new StringBuilder(String.valueOf(list1).length() + 59)).append(list1).append(flag2).append(" hasUserEdits:").append(flag1).append(" theme_matches:").append(flag3).append(" isValid:").append(flag).append("]");
            return b.a(cok1, pye1, list, cyy1, e, sparsearray);
        }
        break MISSING_BLOCK_LABEL_614;
_L2:
        apxo = pye1.b;
        apyg = pye1.h.b.b;
        map1 = null;
        k = 0;
_L4:
        if (k >= apxo.length)
        {
            break MISSING_BLOCK_LABEL_597;
        }
        map = apyg[k];
        if (((pyg) (map)).f != null)
        {
            break; /* Loop/switch isn't completed */
        }
        map = null;
_L7:
        k++;
        map1 = map;
        if (true) goto _L4; else goto _L3
_L3:
        apxu = ((pyg) (map)).f.c;
        if (apxu.length > 2)
        {
            flag = false;
        } else
        {
label0:
            {
                if (map1 != null)
                {
                    break MISSING_BLOCK_LABEL_383;
                }
                if (apxu.length < 2)
                {
                    break label0;
                }
                flag = false;
            }
        }
          goto _L5
        map = apxu;
        if (apxu.length != 1) goto _L7; else goto _L6
_L6:
        map = apxu;
        if (apxu[0].a.intValue() == k - 1) goto _L7; else goto _L8
_L8:
        flag = false;
          goto _L5
        if (map1.length == apxu.length) goto _L10; else goto _L9
_L9:
        i = 0;
_L17:
        map = apxu;
        if (i != 0) goto _L7; else goto _L11
_L11:
        if (apxu.length == 0)
        {
            break MISSING_BLOCK_LABEL_592;
        }
        i = 0;
_L19:
        if (i >= apxu.length) goto _L13; else goto _L12
_L12:
        if (apxu[i].a != null) goto _L15; else goto _L14
_L14:
        i = 0;
_L20:
        map = apxu;
        if (i != 0) goto _L7; else goto _L16
_L16:
        flag = false;
          goto _L5
_L10:
        i = 0;
_L18:
label1:
        {
            if (i >= map1.length)
            {
                break MISSING_BLOCK_LABEL_480;
            }
            if (((pxu) (map1[i])).a == apxu[i].a)
            {
                break label1;
            }
            i = 0;
        }
          goto _L17
        i++;
          goto _L18
        i = 1;
          goto _L17
_L15:
        i++;
          goto _L19
_L13:
        if (apxu[apxu.length - 1].a.intValue() != k - 1)
        {
            i = 0;
        } else
        {
label2:
            {
                if (apxu.length <= map1.length + 1)
                {
                    break label2;
                }
                i = 0;
            }
        }
          goto _L20
        l = map1.length;
        i1 = apxu.length;
        i = 0;
_L21:
label3:
        {
            if (i >= apxu.length - 1)
            {
                break MISSING_BLOCK_LABEL_592;
            }
            if (((pxu) (map1[(l - i1) + 1 + i])).a == apxu[i].a)
            {
                break label3;
            }
            i = 0;
        }
          goto _L20
        i++;
          goto _L21
        i = 1;
          goto _L20
        flag = true;
          goto _L5
        ArrayList arraylist = new ArrayList();
        map1 = null;
        map = null;
        cyy1 = new pyj();
        if (pye1.h.b.a != null)
        {
            cyy1 = pye1.h.b.a;
        }
        i = 0;
        while (i < pye1.b.length) 
        {
            pyg pyg1 = pye1.h.b.b[i];
            Object obj = map1;
            Object obj1 = map;
            if (pye1.d[i])
            {
                if (i == 0)
                {
                    obj = a(pye1.b[i], pyg1);
                    obj1 = map;
                } else
                {
                    c.b(map, "afterFadeOutClip", null);
                    obj1 = a(pye1.b[i], pyg1);
                    obj = map1;
                }
            }
            i++;
            map1 = ((Map) (obj));
            map = ((Map) (obj1));
        }
        a(pye1, list);
        List list2;
        if (list.size() == f.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "clips and mClipsMetadata should have the same length!");
        list2 = (new cyk()).a(list, f);
        if (list2 == null)
        {
            Log.e(a, "clipGroups have size 0");
        }
        a(list2, g, f, list1, cok1);
        if (map != null)
        {
            a(list1);
        }
        if (pye1 == null)
        {
            pye1 = sparsearray;
        } else
        {
            pye1 = a(cok1, list);
        }
        if (list.size() == g.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "clips and mThemeDisplayableClipParams should have the same length!");
        for (i = 0; i < list.size(); i++)
        {
            list1 = (cnq)list.get(i);
            sparsearray = (pyg)g.get(i);
            arraylist.add(list1.a().a(sparsearray).a());
        }

        return new czt(cok1, pye1, cyy1, arraylist, map1, map);
    }

}
