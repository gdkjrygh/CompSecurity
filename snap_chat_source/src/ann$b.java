// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

static final class d
    implements ano, anq
{

    final anq a[];
    final ano b[];
    private final int c;
    private final int d;

    private static void a(List list, List list1, List list2)
    {
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            Object obj = list.get(i);
            if (obj instanceof til.List.get)
            {
                a(list1, ((Object []) (((ang.Object)obj).a)));
            } else
            {
                list1.add(obj);
            }
            obj = list.get(i + 1);
            if (obj instanceof til.List.get)
            {
                a(list2, ((Object []) (((ang.Object)obj).b)));
            } else
            {
                list2.add(obj);
            }
            i += 2;
        }
    }

    private static void a(List list, Object aobj[])
    {
        if (aobj != null)
        {
            for (int i = 0; i < aobj.length; i++)
            {
                list.add(aobj[i]);
            }

        }
    }

    public final int a()
    {
        return c;
    }

    public final int a(anp anp, String s, int i)
    {
        ano aano[] = b;
        if (aano == null)
        {
            throw new UnsupportedOperationException();
        }
        int k = aano.length;
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < k && j >= 0; i++)
        {
            j = aano[i].a(anp, s, j);
        }

        return j;
    }

    public final void a(StringBuffer stringbuffer, long l, alr alr, int i, alw alw, Locale locale)
    {
        anq aanq[] = a;
        if (aanq == null)
        {
            throw new UnsupportedOperationException();
        }
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        int k = aanq.length;
        for (int j = 0; j < k; j++)
        {
            aanq[j].a(stringbuffer, l, alr, i, alw, locale);
        }

    }

    public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
    {
        anq aanq[] = a;
        if (aanq == null)
        {
            throw new UnsupportedOperationException();
        }
        Locale locale1 = locale;
        if (locale == null)
        {
            locale1 = Locale.getDefault();
        }
        int j = aanq.length;
        for (int i = 0; i < j; i++)
        {
            aanq[i].a(stringbuffer, alo, locale1);
        }

    }

    public final int b()
    {
        return d;
    }

    (List list)
    {
        boolean flag = false;
        super();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        a(list, arraylist1, arraylist);
        if (arraylist1.contains(null) || arraylist1.isEmpty())
        {
            a = null;
            c = 0;
        } else
        {
            int i1 = arraylist1.size();
            a = new anq[i1];
            int i = 0;
            int k = 0;
            for (; i < i1; i++)
            {
                list = (anq)arraylist1.get(i);
                k += list.a();
                a[i] = list;
            }

            c = k;
        }
        if (arraylist.contains(null) || arraylist.isEmpty())
        {
            b = null;
            d = 0;
            return;
        }
        int j1 = arraylist.size();
        b = new ano[j1];
        int l = 0;
        for (int j = ((flag) ? 1 : 0); j < j1; j++)
        {
            list = (ano)arraylist.get(j);
            l += list.b();
            b[j] = list;
        }

        d = l;
    }
}
