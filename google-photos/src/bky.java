// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class bky
    implements bjx
{

    private final boolean b = true;

    public bky(boolean flag)
    {
    }

    private static LongSparseArray a(LongSparseArray longsparsearray, int i, boolean flag)
    {
        LongSparseArray longsparsearray1 = new LongSparseArray();
        if (5 > longsparsearray.size())
        {
            return longsparsearray1;
        }
        ArrayList arraylist = new ArrayList();
        for (i = 0; i < 4; i++)
        {
            arraylist.add((Float)longsparsearray.valueAt(i));
        }

        i = 4;
        while (i < longsparsearray.size()) 
        {
            arraylist.add((Float)longsparsearray.valueAt(i));
            int j = i - 2;
            long l = longsparsearray.keyAt(j);
            Float float1 = (Float)longsparsearray.valueAt(j);
            Collections.sort(arraylist);
            Float float2 = (Float)arraylist.get(2);
            if (flag && float1.floatValue() > float2.floatValue())
            {
                longsparsearray1.append(l, float1);
            } else
            {
                longsparsearray1.append(l, float2);
            }
            arraylist.remove(longsparsearray.valueAt((i - 5) + 1));
            i++;
        }
        return longsparsearray1;
    }

    private static List a(long al[], List list)
    {
        Collections.sort(list);
        ArrayList arraylist = new ArrayList();
        boolean aflag[] = new boolean[al.length];
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            bkz bkz1 = (bkz)list.next();
            if (!aflag[bkz1.a])
            {
                long l = al[bkz1.a];
                long l1 = al[bkz1.b];
                arraylist.add(new cod(l, l1));
                for (int i = bkz1.b; i >= 0 && al[i] >= l - 0x2dc6c0L - 0x7a120L; i--)
                {
                    aflag[i] = true;
                }

                int j = bkz1.b;
                while (j < al.length && al[j] <= 0x7a120L + l1) 
                {
                    aflag[j] = true;
                    j++;
                }
            }
        } while (true);
        return arraylist;
    }

    private static List a(long al[], long al1[], long l, List list)
    {
        Object obj;
        int k;
        obj = b.a(new cod(al1[0], l), list);
        list = new ArrayList();
        obj = ((List) (obj)).iterator();
        k = 0;
_L2:
        int i;
        int j;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_264;
        }
        cod cod1 = (cod)((Iterator) (obj)).next();
        for (i = k; i < al1.length - 1 && al1[i] < cod1.b; i++) { }
        for (j = i; j < al1.length - 1 && al1[j] < cod1.c; j++) { }
        i1 = i;
_L4:
        k = j;
        if (i1 >= j) goto _L2; else goto _L1
_L1:
        k = j;
        if (i >= j) goto _L2; else goto _L3
_L3:
        for (; i < j && al1[i] - al1[i1] < 0x2dc6c0L; i++) { }
        boolean flag;
        if (al1[i] - al1[i1] >= 0xf4240L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            list.add(new bkz((float)(al[i] - al[i1]) / (float)(i - i1), i1, i));
        }
        i1++;
          goto _L4
        return a(al1, list);
    }

    private static void a(cmi cmi1, cme cme1, List list, int i)
    {
        ArrayList arraylist = new ArrayList();
        cod cod1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new cof(cod1, cml.a(cmi1, cod1), i)))
        {
            cod1 = (cod)list.next();
        }

        cme1.a(i, arraylist);
    }

    private static void a(Map map, cmi cmi1, cos cos1, ddr ddr1, Object obj)
    {
        map.put(cos1, new ddn(cmi1.b(cos1), ddr1, obj));
    }

    private static void a(Map map, cmi cmi1, ddr ddr1, Object obj)
    {
        cos cos1;
        LongSparseArray longsparsearray;
        LongSparseArray longsparsearray1;
        LongSparseArray longsparsearray2;
        ArrayDeque arraydeque;
        int i;
        int k;
        cos1 = cos.t;
        cmi1 = cmi1.b(cos1);
        longsparsearray = a(((LongSparseArray) (cmi1)), 5, false);
        longsparsearray1 = a(((LongSparseArray) (cmi1)), 5, true);
        longsparsearray2 = new LongSparseArray();
        arraydeque = new ArrayDeque();
        k = 0;
        i = 0;
_L7:
        if (i >= longsparsearray.size()) goto _L2; else goto _L1
_L1:
        int l;
        long l1;
        l1 = longsparsearray.keyAt(i);
        do
        {
            l = k;
            if (arraydeque.size() <= 0)
            {
                break;
            }
            l = k;
            if (((Integer)arraydeque.peekFirst()).intValue() >= i)
            {
                break;
            }
            arraydeque.removeFirst();
        } while (true);
_L6:
        if (l >= longsparsearray.size() || longsparsearray.keyAt(l) >= 0xb71b0L + l1)
        {
            break; /* Loop/switch isn't completed */
        }
        float f = ((Float)longsparsearray.valueAt(l)).floatValue();
        while (arraydeque.size() > 0 && ((Float)longsparsearray.valueAt(((Integer)arraydeque.peekLast()).intValue())).floatValue() < f) 
        {
            arraydeque.removeLast();
        }
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        arraydeque.addLast(Integer.valueOf(l));
        l++;
        if (true) goto _L6; else goto _L5
_L5:
        longsparsearray2.append(l1, Float.valueOf(((Float)longsparsearray.valueAt(((Integer)arraydeque.peekFirst()).intValue())).floatValue()));
        i++;
        k = l;
          goto _L7
_L2:
        LongSparseArray longsparsearray3 = new LongSparseArray();
        int j = 0;
        while (j < longsparsearray.size()) 
        {
            long l2 = longsparsearray.keyAt(j);
            float f2 = ((Float)longsparsearray1.get(l2)).floatValue();
            float f1;
            if (f2 > 0.2F)
            {
                f1 = 0.0F;
            } else
            {
                f1 = ((Float)longsparsearray2.get(l2)).floatValue() - ((Float)longsparsearray.get(l2)).floatValue();
            }
            longsparsearray3.append(l2, Float.valueOf(f1 + f2));
            j++;
        }
        if (longsparsearray.size() == 0)
        {
            cmi1 = new ddn(cmi1, ddr1, obj);
        } else
        {
            cmi1 = new ddn(longsparsearray3, ddr1, obj);
        }
        map.put(cos1, cmi1);
        return;
    }

    private static long[] a(cmi cmi1, long al[])
    {
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        hashmap1.put(cos.g, Float.valueOf(3F));
        hashmap1.put(cos.f, Float.valueOf(10F));
        hashmap1.put(cos.l, Float.valueOf(5F));
        Object obj = b.a(cmi1);
        long al1[];
        if (obj == cos.a)
        {
            al1 = cxh.a(0.0F, 0.0F, 1.0F);
        } else
        if (obj == cos.b)
        {
            al1 = cxh.a(cxh.a());
        } else
        if (obj == cos.r)
        {
            al1 = cxh.a(cxh.a());
        } else
        {
            cmi1 = String.valueOf(obj);
            throw b.a((new StringBuilder(String.valueOf(cmi1).length() + 23)).append("unexpected field type: ").append(cmi1).toString());
        }
        do
        {
            hashmap1.put(obj, Float.valueOf(10F));
            hashmap1.put(cos.t, Float.valueOf(1.5F));
            ddo ddo1 = new ddo();
            ddq ddq1 = new ddq();
            a(((Map) (hashmap)), cmi1, cos.f, ((ddr) (ddo1)), Float.valueOf(0.0F));
            a(((Map) (hashmap)), cmi1, cos.g, ((ddr) (ddq1)), new cdx[0]);
            a(((Map) (hashmap)), cmi1, cos.l, ((ddr) (ddo1)), Float.valueOf(0.0F));
            a(((Map) (hashmap)), cmi1, ((cos) (obj)), ((ddr) (ddq1)), al1);
            a(((Map) (hashmap)), cmi1, ((ddr) (ddo1)), Float.valueOf(0.0F));
            al1 = new long[al.length];
            long l = 0L;
            int i = 0;
            do
            {
                if (i >= al.length)
                {
                    break;
                }
                obj = hashmap1.entrySet().iterator();
                float f1 = 0.0F;
                while (((Iterator) (obj)).hasNext()) 
                {
                    cmi1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                    float f2 = ((Float)cmi1.getValue()).floatValue();
                    cos cos1 = (cos)cmi1.getKey();
                    ddn ddn1 = (ddn)hashmap.get(cmi1.getKey());
                    long l1 = al[i];
                    float f;
                    if (ddn1.a.isEmpty())
                    {
                        cmi1 = ((cmi) (ddn1.c));
                    } else
                    {
                        cmi1 = ((cmi) (ddn1.a.get(Long.valueOf(l1))));
                        if (cmi1 == null)
                        {
                            cmi1 = ddn1.a.lowerEntry(Long.valueOf(l1));
                            java.util.Map.Entry entry = ddn1.a.higherEntry(Long.valueOf(l1));
                            if (cmi1 == null)
                            {
                                cmi1 = ((cmi) (entry.getValue()));
                            } else
                            if (entry == null)
                            {
                                cmi1 = ((cmi) (cmi1.getValue()));
                            } else
                            {
                                f = (float)(l1 - ((Long)cmi1.getKey()).longValue()) / (float)(((Long)entry.getKey()).longValue() - ((Long)cmi1.getKey()).longValue());
                                if (f < 0.0F || f > 1.0F)
                                {
                                    c.a((new StringBuilder()).append("ratio").append(" must be between ").append(0.0F).append(" and ").append(1.0F).append(": ").append(f), null);
                                }
                                cmi1 = ((cmi) (ddn1.b.a(cmi1.getValue(), entry.getValue(), f)));
                            }
                        }
                    }
                    if (cos1 == cos.g)
                    {
                        if (((cdx[])cmi1).length == 0)
                        {
                            f = 1.0F;
                        } else
                        {
                            f = 0.0F;
                        }
                    } else
                    if (cos1 == cos.f)
                    {
                        f = Math.min(15F / ((Float)cmi1).floatValue(), 1.0F);
                        f *= f;
                    } else
                    if (cos1 == cos.l)
                    {
                        f = (float)(Math.log(6D) / Math.log(2D));
                        f = 1.0F - ((Float)cmi1).floatValue() / f;
                        f *= f;
                    } else
                    if (cos1 == cos.a || cos1 == cos.r)
                    {
                        cmi1 = (cxh)cmi1;
                        f = cmi1.c();
                        float f3 = cmi1.d();
                        f = Math.min((f3 * f3 + f * f) * 50F, 1.0F);
                    } else
                    if (cos1 == cos.t)
                    {
                        f = 1.0F - ((Float)cmi1).floatValue();
                        f *= f;
                    } else
                    {
                        cmi1 = String.valueOf(cos1);
                        throw new RuntimeException((new StringBuilder(String.valueOf(cmi1).length() + 19)).append("Unknown field type ").append(cmi1).toString());
                    }
                    f1 = f * f2 + f1;
                }
                l += Math.round(100F * f1);
                al1[i] = l;
                i++;
            } while (true);
            return al1;
        } while (true);
    }

    public final void a(cmb cmb1, cmi cmi1, cme cme1)
    {
        Object obj = (List)cme1.a.get(3);
        ArrayList arraylist;
        if (obj != null)
        {
            arraylist = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((cof)((Iterator) (obj)).next()).b)) { }
        } else
        {
            arraylist = new ArrayList();
        }
        obj = Arrays.copyOf(cmi1.d, cmi1.d.length);
        if (obj.length == 0)
        {
            obj = Collections.emptyList();
        } else
        {
            obj = a(a(cmi1, ((long []) (obj))), ((long []) (obj)), cmb1.b, ((List) (arraylist)));
        }
        if (b)
        {
            arraylist.addAll(((java.util.Collection) (obj)));
            a(cmi1, cme1, b.a(new cod(0L, cmb1.a), arraylist), 6);
        }
        a(cmi1, cme1, ((List) (obj)), 2);
    }

    static 
    {
        bky.getSimpleName();
    }
}
