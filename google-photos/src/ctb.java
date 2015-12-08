// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ctb
{

    private static final String a = ctb.getSimpleName();

    private ctb()
    {
    }

    static float a(long l, long l1)
    {
        return b(l, l1);
    }

    public static int a(long al[], long l)
    {
        int i = 0;
        long l1 = 0x7fffffffffffffffL;
        int j = 0;
        while (i < al.length) 
        {
            long l3 = Math.abs(al[i] - l);
            long l2 = l1;
            if (l3 < l1)
            {
                l2 = l3;
                j = i;
            }
            i++;
            l1 = l2;
        }
        return j;
    }

    public static final long a(cnx cnx1)
    {
        return Math.max(0L, cnx1.e - (long)Math.round(b(cnx1) / 2.0F));
    }

    private static List a(LongSparseArray longsparsearray, long l)
    {
        int i = 0;
        float f;
        int j;
        boolean flag;
        if (longsparsearray.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "solution array should be non-empty");
        j = 0;
        f = -3.402823E+38F;
        for (; i < longsparsearray.size(); i++)
        {
            long l1 = longsparsearray.keyAt(i);
            float f1 = ((ctd)longsparsearray.valueAt(i)).a - b(l1, l);
            if (f1 > f)
            {
                f = f1;
                j = i;
            }
        }

        ArrayList arraylist = new ArrayList();
        for (longsparsearray = (ctd)longsparsearray.valueAt(j); ((ctd) (longsparsearray)).c != null; longsparsearray = ((ctd) (longsparsearray)).c)
        {
            arraylist.add(Long.valueOf(((ctd) (longsparsearray)).b));
        }

        Collections.reverse(arraylist);
        return arraylist;
    }

    public static List a(List list, cte cte1)
    {
        Object obj = new LongSparseArray(cte1.a.length << 1);
        LongSparseArray longsparsearray = new LongSparseArray(cte1.a.length << 1);
        ((LongSparseArray) (obj)).put(0L, new ctd(0.0F, 0L, null));
        long l = 0L;
        Iterator iterator = list.iterator();
        list = longsparsearray;
        while (iterator.hasNext()) 
        {
            Object obj1 = (csd)iterator.next();
            list.clear();
            a(((LongSparseArray) (obj)), 60, l);
            long l1 = ((csd) (obj1)).b;
            int j = 0;
            int i = -1;
            for (; j < ((LongSparseArray) (obj)).size(); j++)
            {
                ctd ctd1 = (ctd)((LongSparseArray) (obj)).valueAt(j);
                long l2 = ((LongSparseArray) (obj)).keyAt(j);
                if (i == -1)
                {
                    i = b.a(l2, cte1.a);
                }
                for (; i < cte1.a.length && cte1.a[i] <= l2; i++) { }
                for (int k = i; k < cte1.a.length; k++)
                {
                    long l3 = cte1.a[k] - l2;
                    if (l3 > ((csd) (obj1)).c)
                    {
                        break;
                    }
                    if (l3 >= ((csd) (obj1)).a)
                    {
                        a(l3, k, ((csd) (obj1)), cte1, ctd1, l2, ((LongSparseArray) (list)));
                    }
                }

                a(((csd) (obj1)).b, -1, ((csd) (obj1)), cte1, ctd1, l2, ((LongSparseArray) (list)));
            }

            l += l1;
            obj1 = list;
            list = ((List) (obj));
            obj = obj1;
        }
        return a(((LongSparseArray) (obj)), l);
    }

    private static void a(long l, int i, csd csd1, cte cte1, ctd ctd1, long l1, 
            LongSparseArray longsparsearray)
    {
        b.a(csd1, "constraint", null);
        b.a(l, "lengthUs", csd1.a, csd1.c);
        float f;
        float f1;
        if (i == -1)
        {
            f = 0.0F;
        } else
        {
            f = cte1.b[i];
        }
        f1 = f;
        if (csd1.c > csd1.a)
        {
            f1 = f;
            if (csd1.b > 0L)
            {
                f1 = f - (float)Math.abs(csd1.b - l) / (float)csd1.b;
            }
        }
        f = ctd1.a + f1;
        l1 += l;
        csd1 = (ctd)longsparsearray.get(l1);
        if (csd1 == null)
        {
            longsparsearray.put(l1, new ctd(f, l, ctd1));
        } else
        if (((ctd) (csd1)).a < f)
        {
            csd1.a = f;
            csd1.b = l;
            csd1.c = ctd1;
            return;
        }
    }

    private static void a(LongSparseArray longsparsearray, int i, long l)
    {
        boolean flag = false;
        if (longsparsearray.size() > 60)
        {
            Long along[] = new Long[longsparsearray.size()];
            for (i = 0; i < along.length; i++)
            {
                along[i] = Long.valueOf(longsparsearray.keyAt(i));
            }

            Arrays.sort(along, new ctc(longsparsearray, l));
            int j = longsparsearray.size();
            i = ((flag) ? 1 : 0);
            while (i < j - 60) 
            {
                longsparsearray.remove(along[i].longValue());
                i++;
            }
        }
    }

    private static float b(long l, long l1)
    {
        return (float)Math.abs(l - l1) * 1E-06F;
    }

    public static float b(cnx cnx1)
    {
        long al[] = cnx1.a();
        if (al.length < 4)
        {
            String s = a;
            cnx1 = String.valueOf(cnx1);
            int i = al.length;
            Log.e(s, (new StringBuilder(String.valueOf(cnx1).length() + 71)).append("Track ").append(cnx1).append(" had only ").append(i).append(" beats so  not able to calculate beat times.").toString());
        } else
        {
            int j = Math.round((float)(al.length - 1) * 0.05000001F);
            int k = Math.round((float)(al.length - 1) * 0.95F);
            if (j != k)
            {
                return (float)(al[k] - al[j]) / (float)(k - j);
            }
        }
        return 0.0F;
    }

}
