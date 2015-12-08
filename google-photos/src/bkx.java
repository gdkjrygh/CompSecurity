// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bkx
    implements bjx
{

    private static final String b = bkx.getSimpleName();

    public bkx()
    {
    }

    private static LongSparseArray a(LongSparseArray longsparsearray, long l)
    {
        cxc cxc1 = new cxc();
        LongSparseArray longsparsearray1 = new LongSparseArray();
        int i = 0;
        while (i < longsparsearray.size()) 
        {
            cob cob1 = (cob)longsparsearray.valueAt(i);
            l = longsparsearray.keyAt(i);
            int j;
            for (j = i; j < longsparsearray.size() && longsparsearray.keyAt(j) < 0x10c8e0L + l; j++) { }
            if (j != longsparsearray.size())
            {
                cob cob2 = (cob)longsparsearray.valueAt(j);
                if (cxc.b(cob1, cob2))
                {
                    longsparsearray1.append(l, Float.valueOf(cxc1.a(cob1, cob2)));
                } else
                {
                    Log.e(b, "ChromaHistogram dimensions are mismatched.");
                }
            }
            i++;
        }
        return longsparsearray1;
    }

    private static cob a(ArrayList arraylist)
    {
        b.a(arraylist.size(), "matrices.size()");
        cob cob2 = (cob)arraylist.get(0);
        cob cob1 = new cob(cob2.a, cob2.b);
        int l = cob2.b();
        float af[] = new float[l];
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            cob cob3 = (cob)arraylist.next();
            int i = 0;
            while (i < l) 
            {
                af[i] = cob3.c[i] + af[i];
                i++;
            }
        }

        float f = 0.0F;
        for (int j = 0; j < l; j++)
        {
            f += af[j];
        }

        for (int k = 0; k < l; k++)
        {
            float f1 = af[k] / f;
            cob1.c[k] = f1;
        }

        return cob1;
    }

    private static ArrayList a(LongSparseArray longsparsearray, long l, long l1)
    {
        ArrayList arraylist = new ArrayList();
        ArrayDeque arraydeque = new ArrayDeque();
        for (int i = 0; i < longsparsearray.size(); i++)
        {
            long l2 = longsparsearray.keyAt(i);
            float f = ((Float)longsparsearray.valueAt(i)).floatValue();
            for (; !arraydeque.isEmpty() && ((Long)((Pair)arraydeque.getFirst()).first).longValue() < l2 - l; arraydeque.removeFirst()) { }
            for (; !arraydeque.isEmpty() && ((Float)((Pair)arraydeque.getLast()).second).floatValue() < f; arraydeque.removeLast()) { }
            arraydeque.add(new Pair(Long.valueOf(l2), Float.valueOf(f)));
            Pair pair = (Pair)arraydeque.getFirst();
            long l3 = ((Long)pair.first).longValue();
            f = ((Float)pair.second).floatValue();
            long l4 = (l + l1) / 2L;
            long l5 = (l - l1) / 2L;
            if (l3 >= l2 - l4 && l3 < l2 - l5 && f > 0.15F)
            {
                arraylist.add(Long.valueOf(l3));
            }
        }

        return arraylist;
    }

    private ArrayList a(LongSparseArray longsparsearray, long l, long l1, long l2, 
            long l3)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = a(longsparsearray, 0x1e8480L, 0x2e630L);
        if (!arraylist1.isEmpty())
        {
            l1 = longsparsearray.keyAt(0);
            l = longsparsearray.keyAt(longsparsearray.size() - 1);
            int i;
            for (i = 0; i < arraylist1.size() && ((Long)arraylist1.get(i)).longValue() < 0x10c8e0L + l1; i++) { }
            for (; i < arraylist1.size() && ((Long)arraylist1.get(i)).longValue() < l - 0x10c8e0L; i++)
            {
                l1 = ((Long)arraylist1.get(i)).longValue();
                int j = longsparsearray.indexOfKey(l1);
                boolean flag = a(longsparsearray, j, false, 0x10c8e0L, 0x2dc6c0L);
                boolean flag1 = a(longsparsearray, j, true, 0x10c8e0L, 0x2dc6c0L);
                if (flag && flag1)
                {
                    arraylist.add(new cof(new cod((l1 - 0x2e630L) + 0x86470L, 0x2e630L + l1 + 0x86470L), 3));
                }
            }

        }
        return arraylist;
    }

    private static boolean a(LongSparseArray longsparsearray, int i, boolean flag, long l, long l1)
    {
        float f4;
        long l2;
        long l3;
        long l5;
        f4 = ((Float)longsparsearray.valueAt(i)).floatValue();
        l2 = longsparsearray.keyAt(i);
        l3 = longsparsearray.keyAt(0);
        l5 = longsparsearray.keyAt(longsparsearray.size() - 1);
        if ((flag || l2 <= l3 + l1) && (!flag || l2 >= l5 - l1)) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        float f2;
        float f5;
        int j;
        int k;
        boolean flag1;
        long l4;
        if (flag)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        f = 0.0F;
        f1 = 0.0F;
        flag1 = false;
        k = i;
        i = ((flag1) ? 1 : 0);
_L5:
        l4 = Math.abs(longsparsearray.keyAt(k) - l2);
        if (l4 > l1) goto _L4; else goto _L3
_L3:
        if (l4 > l)
        {
            f5 = ((Float)longsparsearray.valueAt(k)).floatValue();
            i++;
            f2 = f1 + f5 * f5;
            f1 = f + f5;
            f = f2;
        } else
        {
            float f3 = f;
            f = f1;
            f1 = f3;
        }
        k += j;
        f2 = f1;
        f1 = f;
        f = f2;
        if (true) goto _L5; else goto _L4
_L4:
        if (i > 0)
        {
            f /= i;
            f1 = (float)Math.sqrt(f1 / (float)i - f * f);
            return Math.abs(f4 - f) > f1 * 3F;
        }
_L2:
        return false;
    }

    private static LongSparseArray b(LongSparseArray longsparsearray, long l)
    {
        LongSparseArray longsparsearray1 = new LongSparseArray();
        int j = 0;
        float f = 0.0F;
        int i = 0;
        int i1 = 0;
        do
        {
            if (i1 >= longsparsearray.size())
            {
                break;
            }
            l = longsparsearray.keyAt(i1);
            float f1;
            for (f1 = f; i < longsparsearray.size() && longsparsearray.keyAt(i) - l < 0x100590L; f1 = f + f1)
            {
                f = ((Float)longsparsearray.valueAt(i)).floatValue();
                i++;
                j++;
            }

            f = f1;
            int k = j;
            if (i1 > 0)
            {
                f = f1 - ((Float)longsparsearray.valueAt(i1 - 1)).floatValue();
                k = j - 1;
            }
            l = longsparsearray.keyAt(i1);
            if (k > 0)
            {
                f1 = f / (float)k;
            } else
            {
                f1 = 0.0F;
            }
            longsparsearray1.append(l, Float.valueOf(f1));
            if (i == longsparsearray.size())
            {
                break;
            }
            i1++;
            j = k;
        } while (true);
        return longsparsearray1;
    }

    public final void a(cmb cmb, cmi cmi1, cme cme1)
    {
        cmb = cmi1.b(cos.m);
        if (cmb.size() == 0)
        {
            return;
        }
        cmi1 = new LongSparseArray();
        ArrayList arraylist = new ArrayList();
        long l = cmb.keyAt(0);
        int i = 0;
        while (i < cmb.size()) 
        {
            long l2 = cmb.keyAt(i);
            long l1 = l;
            if (l2 - l > 0x2e630L)
            {
                if (arraylist.size() > 0)
                {
                    cmi1.append(l, a(arraylist));
                    arraylist.clear();
                } else
                {
                    Log.e(b, (new StringBuilder(79)).append("averaged interval from ").append(l).append(" to ").append(l2).append(" has no data").toString());
                }
                l1 = l2;
            }
            arraylist.add((cob)cmb.valueAt(i));
            i++;
            l = l1;
        }
        cmb = a(b(a(((LongSparseArray) (cmi1)), 0x10c8e0L), 0x100590L), 0x1e8480L, 0x2e630L, 0x10c8e0L, 0x2dc6c0L);
        if (cme1.a.get(3) == null)
        {
            cme1.a(3, cmb);
            return;
        } else
        {
            ((List)cme1.a.get(3)).addAll(cmb);
            return;
        }
    }

}
