// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class aoo
{

    final List a = new ArrayList();
    final List b = new ArrayList();
    public ama c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public aou h;
    public ani i;
    public Map j;
    public Class k;
    boolean l;
    boolean m;
    public ane n;
    public amb o;
    public apa p;
    public boolean q;

    aoo()
    {
    }

    final ard a()
    {
        return h.a();
    }

    final List a(File file)
    {
        return c.b.a(file);
    }

    final boolean a(Class class1)
    {
        return b(class1) != null;
    }

    final apx b(Class class1)
    {
        return c.b.a(class1, g, k);
    }

    final List b()
    {
        if (!l)
        {
            l = true;
            a.clear();
            List list = c.b.a(d);
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                atn atn1 = ((atm)list.get(i1)).a(d, e, f, i);
                if (atn1 != null)
                {
                    a.add(atn1);
                }
            }

        }
        return a;
    }

    final anl c(Class class1)
    {
        anl anl1 = (anl)j.get(class1);
        Object obj = anl1;
        if (anl1 == null)
        {
            if (j.isEmpty() && q)
            {
                class1 = String.valueOf(class1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(class1).length() + 115)).append("Missing transformation for ").append(class1).append(". If you wish to ignore unknown resource types, use the optional transformation methods.").toString());
            }
            obj = auz.a();
        }
        return ((anl) (obj));
    }

    final List c()
    {
        if (!m)
        {
            m = true;
            b.clear();
            List list = b();
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                atn atn1 = (atn)list.get(i1);
                b.add(atn1.a);
                b.addAll(atn1.b);
            }

        }
        return b;
    }
}
