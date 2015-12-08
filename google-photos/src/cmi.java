// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class cmi
{

    public final Map a;
    public final long b[];
    public final cog c;
    public final long d[];

    public cmi(cwb cwb1)
    {
        a = new HashMap();
        cwb1 = cwb1.c;
        b = a(cwb1);
        cos acos[] = cos.values();
        int k = acos.length;
        for (int i = 0; i < k; i++)
        {
            cos cos1 = acos[i];
            LongSparseArray longsparsearray = new LongSparseArray();
            int l = cwb1.length;
            for (int j = 0; j < l; j++)
            {
                cwc cwc1 = cwb1[j];
                Object obj = cos1.x.a(cwc1);
                if (obj != null)
                {
                    longsparsearray.put(cwc1.a, obj);
                }
            }

            a.put(cos1, longsparsearray);
        }

        c = a(a);
        d = b(a);
    }

    cmi(Map map, TreeSet treeset)
    {
        a = map;
        b = a(treeset);
        d = b(a);
        c = a(a);
    }

    private static cog a(Map map)
    {
        map = (LongSparseArray)map.get(cos.o);
        if (map != null && map.size() != 0)
        {
            coh coh1 = new coh(map.size());
            int i = 0;
            while (i < map.size()) 
            {
                long l = map.keyAt(i);
                b.b(l, "timestampUs");
                c.a(coh1.b, "mIndex", 0, coh1.a.length - 1, null);
                if (coh1.b > 0)
                {
                    long al[];
                    int j;
                    boolean flag;
                    if (coh1.a[coh1.b - 1] < l)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    b.a(flag, "timestamps should be strictly monotonic");
                }
                al = coh1.a;
                j = coh1.b;
                coh1.b = j + 1;
                al[j] = l;
                i++;
            }
            c.a(coh1.b, "mTimestampsUs", coh1.a.length, "not all values were set");
            if (coh1.a.length == 0)
            {
                return cog.a;
            } else
            {
                return new cog(coh1.a);
            }
        } else
        {
            return cog.a;
        }
    }

    private static long[] a(TreeSet treeset)
    {
        long al[] = new long[treeset.size()];
        treeset = treeset.iterator();
        for (int i = 0; treeset.hasNext(); i++)
        {
            al[i] = ((Long)treeset.next()).longValue();
        }

        return al;
    }

    private static long[] a(cwc acwc[])
    {
        int j = 0;
        long al[] = new long[acwc.length];
        int k = acwc.length;
        for (int i = 0; j < k; i++)
        {
            al[i] = acwc[j].a;
            j++;
        }

        Arrays.sort(al);
        return al;
    }

    private static long[] b(Map map)
    {
        long al[] = (LongSparseArray)map.get(cos.b);
        if (al == null)
        {
            map = (LongSparseArray)map.get(cos.a);
        } else
        {
            map = al;
        }
        if (map != null)
        {
            al = new long[map.size()];
            for (int i = 0; i < map.size(); i++)
            {
                al[i] = map.keyAt(i);
            }

            return al;
        } else
        {
            return new long[0];
        }
    }

    public final Object a(cos cos1, long l)
    {
        return b(cos1).get(l);
    }

    public final void a(cwb cwb1)
    {
        TreeMap treemap = new TreeMap();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            int i = 0;
            while (i < ((LongSparseArray)entry.getValue()).size()) 
            {
                long l = ((LongSparseArray)entry.getValue()).keyAt(i);
                cwc cwc1 = (cwc)treemap.get(Long.valueOf(l));
                if (cwc1 == null)
                {
                    cwc1 = new cwc();
                    cwc1.a = l;
                    treemap.put(Long.valueOf(l), cwc1);
                }
                cos cos1 = (cos)entry.getKey();
                Object obj = ((LongSparseArray)entry.getValue()).valueAt(i);
                cos1.x.a(obj, cwc1);
                i++;
            }
        }

        cwb1.c = (cwc[])treemap.values().toArray(new cwc[treemap.size()]);
    }

    public final boolean a(cos cos1)
    {
        return a.containsKey(cos1) && b(cos1).size() != 0;
    }

    public final long[] a()
    {
        return Arrays.copyOf(b, b.length);
    }

    public final LongSparseArray b(cos cos1)
    {
        LongSparseArray longsparsearray = (LongSparseArray)a.get(cos1);
        cos1 = longsparsearray;
        if (longsparsearray == null)
        {
            cos1 = ddi.a();
        }
        return cos1;
    }
}
