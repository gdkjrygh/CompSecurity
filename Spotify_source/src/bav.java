// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class bav
    implements Comparator
{

    ArrayList a;
    ArrayList b;
    ArrayList c;
    boolean d;

    protected bav()
    {
    }

    static void a(List list, bar bar1)
    {
        if (!list.contains(bar1))
        {
            int i = 0;
            while (i < list.size()) 
            {
                boolean flag;
                if (!((bar)list.get(i)).a.equals(bar1.a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                bds.b(flag);
                i++;
            }
            list.add(bar1);
        }
    }

    public final ArrayList a()
    {
        if (a == null)
        {
            return b;
        }
        if (b == null)
        {
            return a;
        }
        for (int i = 0; i < b.size(); i++)
        {
            a(((List) (a)), (bar)b.get(i));
        }

        return a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (bar)obj;
        obj1 = (bar)obj1;
        return ((bar) (obj)).a.compareTo(((bar) (obj1)).a);
    }
}
