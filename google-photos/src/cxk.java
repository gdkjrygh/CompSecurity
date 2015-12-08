// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cxk
{

    private final int a[];
    private final SparseArray b = b();

    public cxk(int ai[])
    {
        b.a(ai, "memberships", null);
        a = ai;
    }

    private static void a(List list, int i, int ai[])
    {
        for (list = list.iterator(); list.hasNext();)
        {
            ai[((Integer)list.next()).intValue()] = i;
        }

    }

    private static void a(List list, List list1, float af[][], int ai[])
    {
        int i;
        int k;
label0:
        for (list = list.iterator(); list.hasNext(); ai[k] = i)
        {
            k = ((Integer)list.next()).intValue();
            float af1[] = af[k];
            Iterator iterator = list1.iterator();
            i = -1;
            float f = 3.402823E+38F;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                int j = ((Integer)iterator.next()).intValue();
                if (af1[j] < f)
                {
                    f = af1[j];
                    i = j;
                }
            } while (true);
        }

    }

    private SparseArray b()
    {
        SparseArray sparsearray = new SparseArray();
        boolean aflag[] = new boolean[a.length];
        int ai[] = a;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            if (!aflag[k])
            {
                aflag[k] = true;
                sparsearray.put(k, new cxl(b(k)));
            }
        }

        return sparsearray;
    }

    private List b(int i)
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] == i)
            {
                arraylist.add(Integer.valueOf(j));
            }
        }

        return arraylist;
    }

    public final cxk a(List list, float af[][])
    {
        int ai[] = (int[])a.clone();
        Iterator iterator = a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            List list1 = a(((Integer)iterator.next()).intValue());
            ArrayList arraylist = new ArrayList(list1);
            arraylist.retainAll(list);
            if (arraylist.size() == 1)
            {
                a(list1, ((Integer)arraylist.get(0)).intValue(), ai);
            } else
            if (arraylist.size() > 1)
            {
                a(list1, ((List) (arraylist)), af, ai);
            }
        } while (true);
        return new cxk(ai);
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < b.size(); i++)
        {
            arraylist.add(Integer.valueOf(b.keyAt(i)));
        }

        return arraylist;
    }

    public final List a(int i)
    {
        return ((cxl)b.get(i)).a;
    }
}
