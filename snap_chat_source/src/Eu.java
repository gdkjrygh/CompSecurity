// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class Eu
{

    private final LA a;

    public Eu()
    {
        this(LA.a());
    }

    private Eu(LA la)
    {
        a = la;
    }

    public final List a(List list)
    {
        int i = a.f();
        if (i == -1)
        {
            i = 3;
        }
        ArrayList arraylist = new ArrayList(i);
        if (i == 0 || list.size() == 0)
        {
            return arraylist;
        }
        Bk bk = (Bk)list.get(0);
        arraylist.add(bk);
        if (list.size() == 1)
        {
            return arraylist;
        }
        if (i > 2 && list.size() > 2)
        {
            long l = bk.W();
            long l2 = (long)Math.ceil((double)Math.abs(((Bk)list.get(list.size() - 1)).W() - l) / (double)(i - 1));
            l -= l2;
            for (int j = 1; j < list.size() - 1;)
            {
                Bk bk1 = (Bk)list.get(j);
                bk1.W();
                bk1.W();
                long l1 = l;
                if (bk1.W() <= l)
                {
                    l1 = l - l2;
                    arraylist.add(bk1);
                }
                j++;
                l = l1;
            }

        }
        if (i > 1 && list.size() > 1)
        {
            arraylist.add(list.get(list.size() - 1));
        }
        arraylist.size();
        String.format("Selected too many stories for thumbnail! (%d/%s)", new Object[] {
            Integer.valueOf(arraylist.size()), Integer.valueOf(i)
        });
        return arraylist;
    }
}
