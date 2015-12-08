// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.util.Log;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class crg
{

    private static final String a = crg.getSimpleName();

    public crg()
    {
    }

    public static float a(float f, cor cor1, long l, long l1)
    {
        if (f == 1.0F)
        {
            return 0.0F;
        }
        ArrayList arraylist = new ArrayList();
        LongSparseArray longsparsearray = cor1.b;
        long l2 = (l + l1) / 2L;
        int i = b.c(longsparsearray, l);
        if (i != -1)
        {
            do
            {
                if (i >= longsparsearray.size())
                {
                    break;
                }
                long l3 = longsparsearray.keyAt(i);
                if (l3 >= l1)
                {
                    break;
                }
                cdx acdx[] = (cdx[])longsparsearray.valueAt(i);
                int k = acdx.length;
                for (int j = 0; j < k; j++)
                {
                    Rect rect = acdx[j].b.rect;
                    arraylist.add(new crh(((float)rect.top + 1000F) / 2000F, ((float)rect.bottom + 1000F) / 2000F, ((float)rect.left + 1000F) / 2000F, ((float)rect.right + 1000F) / 2000F, Math.abs(l3 - l2)));
                }

                i++;
            } while (true);
        }
        if (f < 1.0F)
        {
            cor1 = a(cor1, l, l1, false);
            float f1;
            if (!arraylist.isEmpty())
            {
                cor1 = a(((List) (arraylist)), f);
                f1 = ((crh) (cor1)).d - ((crh) (cor1)).a;
                if (f1 > f)
                {
                    f1 = ((crh) (cor1)).b - Math.max(0.0F, ((f - ((crh) (cor1)).c) + ((crh) (cor1)).b) / 3F);
                } else
                {
                    f1 = ((crh) (cor1)).a - (f - f1) / 3F;
                }
                f1 = Math.min(((crh) (cor1)).b, f1);
                if (((crh) (cor1)).c - ((crh) (cor1)).b > 1.3F * f)
                {
                    f1 = (((crh) (cor1)).b + ((crh) (cor1)).g * 0.1F) - f / 2.0F;
                }
                f1 = Math.max(0.0F, f1);
            } else
            if (cor1 != null)
            {
                f1 = a(((long []) (cor1)), f);
            } else
            {
                f1 = (2.0F * (1.0F - f)) / 5F;
            }
            return 1.0F - f - ddl.a(f1, 0.0F, 1.0F - f);
        }
        cor1 = a(cor1, l, l1, true);
        float f3 = 1.0F / f;
        if (!arraylist.isEmpty())
        {
            cor1 = b(arraylist, f3);
            f = ((crh) (cor1)).f;
            float f2 = ((crh) (cor1)).e;
            float f4 = (((crh) (cor1)).f + ((crh) (cor1)).e) / 2.0F;
            if (f - f2 > f3)
            {
                f2 = f4 - f3 / 2.0F;
            } else
            {
                f2 = f4 - f3 * f4;
                f = f2;
                if (f2 > ((crh) (cor1)).e)
                {
                    f = ((crh) (cor1)).e;
                }
                f2 = f;
                if (f + f3 < ((crh) (cor1)).f)
                {
                    f2 = ((crh) (cor1)).f - f3;
                }
            }
            f = Math.max(0.0F, f2);
        } else
        if (cor1 != null)
        {
            f = a(((long []) (cor1)), f3);
        } else
        {
            f = (1.0F - f3) / 2.0F;
        }
        return ddl.a(f, 0.0F, 1.0F - f3);
    }

    private static float a(long al[], float f)
    {
        long l3 = 0L;
        boolean flag = false;
        if (f < 0.0F || f > 1.0F)
        {
            b.a((new StringBuilder()).append("proportion").append(" must be between ").append(0.0F).append(" and ").append(1.0F).append(": ").append(f), null);
        }
        int l = Math.max(1, Math.round((float)al.length * f));
        int i = 0;
        long l1 = 0L;
        for (; i < l - 1; i++)
        {
            l1 += al[i];
        }

        int k = 0;
        long l4 = l1;
        for (int j = ((flag) ? 1 : 0); j <= al.length - l;)
        {
            long l2;
label0:
            {
                l4 += al[(j + l) - 1];
                if (j != 0)
                {
                    l2 = l3;
                    if (l4 <= l3)
                    {
                        break label0;
                    }
                }
                k = j;
                l2 = l4;
            }
            l4 -= al[j];
            j++;
            l3 = l2;
        }

        return (float)k / (float)Math.max(1, al.length);
    }

    public static cnw a(pxq pxq1, int i, int j, boolean flag)
    {
        float f;
        float f1;
        float f2;
        if (pxq1.a == null || pxq1.a.a.length == 0 || pxq1.a.a[0].a == null)
        {
            return null;
        }
        f2 = pxq1.a.a[0].a.floatValue();
        f1 = (1.0F * (float)i) / (float)j;
        pxq1 = pxq1.a.a;
        if (flag)
        {
            if (f2 > 1.0F)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (f1 > 1.0F)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (i == j)
            {
                f = f1;
            } else
            if (i != 0)
            {
                f = 1.333333F;
            } else
            {
                f = 0.75F;
            }
        } else
        {
            f = f1;
        }
        if (f2 < f1)
        {
            f = Math.max(f2, Math.min(f, f1));
        } else
        {
            f = Math.max(f1, Math.min(f, f2));
        }
        i = 0;
_L13:
        if (i >= pxq1.length) goto _L2; else goto _L1
_L1:
        if ((double)Math.abs(((pxs) (pxq1[i])).a.floatValue() - f) >= 0.01D) goto _L4; else goto _L3
_L3:
        pxq1 = pxq1[i];
_L8:
        if (pxq1 == null) goto _L6; else goto _L5
_L5:
        pxs pxs1;
        if (f == f1)
        {
            return cnw.a(pxq1, 0.0F);
        }
        pxs1 = new pxs();
        pxs1.a = Float.valueOf(f1);
          goto _L7
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        pxq1 = null;
          goto _L8
_L7:
        if (f1 >= f) goto _L10; else goto _L9
_L9:
        f = ((pxs) (pxq1)).b.floatValue();
        float f3 = ((pxs) (pxq1)).c.floatValue();
        pxs1.b = ((pxs) (pxq1)).b;
        pxs1.c = ((pxs) (pxq1)).c;
        f = ((1.0F - (f + f3)) * f2) / f1;
        f1 = 0.5F * ((1.0F + ((pxs) (pxq1)).d.floatValue()) - ((pxs) (pxq1)).e.floatValue());
        pxs1.d = Float.valueOf(f1 - 0.5F * f);
        pxs1.e = Float.valueOf(1.0F - (f * 0.5F + f1));
_L11:
        return new con(pxs1.b.floatValue(), pxs1.c.floatValue(), pxs1.d.floatValue(), pxs1.e.floatValue(), 0.0F, cnw.a(pxq1, 0.0F));
_L10:
        if (f1 > f)
        {
            f = ((pxs) (pxq1)).d.floatValue();
            float f4 = ((pxs) (pxq1)).e.floatValue();
            pxs1.d = ((pxs) (pxq1)).d;
            pxs1.e = ((pxs) (pxq1)).e;
            f = ((1.0F - (f + f4)) * f1) / f2;
            f1 = 0.5F * ((1.0F + ((pxs) (pxq1)).b.floatValue()) - ((pxs) (pxq1)).c.floatValue());
            pxs1.b = Float.valueOf(f1 - 0.5F * f);
            pxs1.c = Float.valueOf(1.0F - (f * 0.5F + f1));
        }
        if (true) goto _L11; else goto _L6
_L6:
        pxq1 = new pxs();
        pxq1.a = Float.valueOf(f1);
        Float float1;
        if (f1 < f2)
        {
            f2 = f / f2;
            f /= f1;
            f1 = f2;
        } else
        if (f1 > f2)
        {
            f1 /= f;
            f = f2 / f;
        } else
        {
            f = 1.0F;
            f1 = 1.0F;
        }
        float1 = Float.valueOf((1.0F - f1) * 0.5F);
        pxq1.c = float1;
        pxq1.b = float1;
        float1 = Float.valueOf((1.0F - f) * 0.5F);
        pxq1.e = float1;
        pxq1.d = float1;
        return cnw.a(pxq1, 0.0F);
        if (true) goto _L13; else goto _L12
_L12:
    }

    private static crh a(List list, float f)
    {
        Collections.sort(list);
        crh crh1 = (crh)list.get(0);
        float f4 = crh1.b;
        float f2 = crh1.a;
        float f3 = crh1.c;
        float f1 = crh1.d;
        int i = 1;
        do
        {
            if (i >= list.size())
            {
                break;
            }
            crh crh2 = (crh)list.get(i);
            float f5 = Math.min(crh2.b, f4);
            float f6 = Math.max(crh2.c, f3);
            if (f6 - f5 > f)
            {
                break;
            }
            f2 = Math.min(crh2.a, f2);
            f1 = Math.max(crh2.d, f1);
            i++;
            f3 = f6;
            f4 = f5;
        } while (true);
        return new crh(f2, f3, f4, f1, 0.0F, 0.0F);
    }

    private static long[] a(cor cor1, long l, long l1, boolean flag)
    {
        long al[];
        long al1[];
        boolean flag1;
label0:
        {
            flag1 = false;
            int i;
            int k;
            int i1;
            boolean flag2;
            if (l <= l1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            b.a(flag2, "startPointUs must be less or equal to endPointUs");
            if (flag)
            {
                al = cor1.c;
            } else
            {
                al = cor1.d;
            }
            i1 = b.b(al, l);
            if (i1 != -1)
            {
                cor1 = (long[])al.valueAt(i1);
            } else
            {
                cor1 = null;
            }
            k = b.a(al, l1);
            if (k != -1)
            {
                i = k;
                if (k != i1)
                {
                    break label0;
                }
            }
            i = b.c(al, l1);
        }
        if (i != -1)
        {
            al = (long[])al.valueAt(i);
        } else
        {
            al = null;
        }
        if (al != null && cor1 != al) goto _L2; else goto _L1
_L1:
        al1 = cor1;
_L4:
        return al1;
_L2:
label1:
        {
            if (cor1 == null)
            {
                break label1;
            }
            if (cor1.length != al.length)
            {
                Log.w(a, String.format("Invalid length of projection, %d was expected, but it was %d.", new Object[] {
                    Integer.valueOf(cor1.length), Integer.valueOf(al.length)
                }));
                return null;
            }
            long al2[] = new long[cor1.length];
            int j = ((flag1) ? 1 : 0);
            do
            {
                al1 = al2;
                if (j >= cor1.length)
                {
                    break;
                }
                al2[j] = al[j] - cor1[j];
                j++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return al;
    }

    private static crh b(List list, float f)
    {
        Collections.sort(list);
        crh crh1 = (crh)list.get(0);
        float f1 = crh1.e;
        float f2 = crh1.f;
        int i = 1;
        do
        {
            if (i >= list.size())
            {
                break;
            }
            crh crh2 = (crh)list.get(i);
            float f3 = Math.min(crh2.e, f1);
            float f4 = Math.max(crh2.f, f2);
            if (f4 - f3 > f)
            {
                break;
            }
            i++;
            f2 = f4;
            f1 = f3;
        } while (true);
        return new crh(0.0F, 0.0F, 0.0F, 0.0F, f1, f2);
    }

}
