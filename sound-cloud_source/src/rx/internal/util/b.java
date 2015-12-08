// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.ArrayList;
import java.util.List;

public class b
{

    final int h;
    public Object i[];
    Object j[];
    public volatile int k;
    int l;

    public b(int i1)
    {
        h = i1;
    }

    public final void a(Object obj)
    {
        if (k == 0)
        {
            i = new Object[h + 1];
            j = i;
            i[0] = obj;
            l = 1;
            k = 1;
            return;
        }
        if (l == h)
        {
            Object aobj[] = new Object[h + 1];
            aobj[0] = obj;
            j[h] = ((Object) (aobj));
            j = aobj;
            l = 1;
            k = k + 1;
            return;
        } else
        {
            j[l] = obj;
            l = l + 1;
            k = k + 1;
            return;
        }
    }

    public String toString()
    {
        int i2 = h;
        int j2 = k;
        ArrayList arraylist = new ArrayList(j2 + 1);
        Object aobj[] = i;
        int j1 = 0;
        int i1 = 0;
        do
        {
            if (j1 >= j2)
            {
                break;
            }
            arraylist.add(aobj[i1]);
            int k1 = j1 + 1;
            int l1 = i1 + 1;
            i1 = l1;
            j1 = k1;
            if (l1 == i2)
            {
                aobj = (Object[])(Object[])aobj[i2];
                i1 = 0;
                j1 = k1;
            }
        } while (true);
        return arraylist.toString();
    }
}
