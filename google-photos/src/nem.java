// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class nem
{

    private final List a;
    private final Comparator b;
    private final int c;

    nem(List list, Comparator comparator)
    {
        int i;
        if (comparator != null)
        {
            b = comparator;
        } else
        {
            b = new nen(this);
        }
        a = new ArrayList(list.size());
        list = list.iterator();
        for (i = 0; list.hasNext(); i = comparator.size() + i)
        {
            comparator = (List)list.next();
            a.add(new neo(comparator));
        }

        c = i;
    }

    final List a(int i)
    {
        for (int j = a.size() - 1; j >= 0; j--)
        {
            if (!((neo)a.get(j)).hasNext())
            {
                a.remove(j);
            }
        }

        int l = Math.min(c, i);
        ArrayList arraylist = new ArrayList(l);
        if (a.size() > 1)
        {
            int k = 0;
            do
            {
                i = k + 1;
                if (k >= l)
                {
                    break;
                }
                neo neo2 = (neo)a.get(0);
                Object obj = neo2.a();
                for (k = 1; k < a.size();)
                {
                    neo neo3 = (neo)a.get(k);
                    Object obj2 = neo3.a();
                    Object obj1 = obj;
                    if (b.compare(obj2, obj) < 0)
                    {
                        obj1 = obj2;
                        neo2 = neo3;
                    }
                    k++;
                    obj = obj1;
                }

                arraylist.add(obj);
                neo2.next();
                if (!neo2.hasNext())
                {
                    a.remove(neo2);
                    if (a.size() == 1)
                    {
                        break;
                    }
                }
                k = i;
            } while (true);
        } else
        {
            i = 0;
        }
        if (!a.isEmpty())
        {
            for (neo neo1 = (neo)a.get(0); neo1.hasNext() && i < l; i++)
            {
                arraylist.add(neo1.next());
            }

        }
        return arraylist;
    }
}
