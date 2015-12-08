// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class cjw
{

    final List a = new ArrayList();
    final List b = new ArrayList();
    final List c = new ArrayList();

    public cjw()
    {
    }

    public final cjw a(String s, double d, double d1)
    {
        int i = 0;
        do
        {
            if (i >= a.size())
            {
                break;
            }
            double d2 = ((Double)c.get(i)).doubleValue();
            double d3 = ((Double)b.get(i)).doubleValue();
            if (d < d2 || d2 == d && d1 < d3)
            {
                break;
            }
            i++;
        } while (true);
        a.add(i, s);
        c.add(i, Double.valueOf(d));
        b.add(i, Double.valueOf(d1));
        return this;
    }
}
