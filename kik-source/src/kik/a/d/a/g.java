// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d.a;

import java.util.Iterator;
import java.util.Vector;
import kik.a.d.s;

public abstract class g
{

    private final int a;
    private final boolean b;
    private final boolean c;

    public g(boolean flag, boolean flag1)
    {
        this(flag, flag1, 0);
    }

    public g(boolean flag, boolean flag1, int i)
    {
        b = flag;
        a = i;
        c = flag1;
    }

    public static g a(s s1, Class class1)
    {
        for (s1 = s1.l().iterator(); s1.hasNext();)
        {
            g g1 = (g)s1.next();
            if (g1 != null && class1.isInstance(g1))
            {
                return g1;
            }
        }

        return null;
    }

    public static boolean a(s s1)
    {
        boolean flag1 = false;
        s1 = s1.l();
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < s1.size())
                {
                    if (!((g)s1.elementAt(i)).b)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static boolean b(s s1)
    {
        if (!s1.m())
        {
            s1 = s1.l();
            int i = 0;
            while (i < s1.size()) 
            {
                if (((g)s1.elementAt(i)).c)
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static int c(s s1)
    {
        s1 = s1.l();
        int i = 0;
        int j = 0;
        for (; i < s1.size(); i++)
        {
            j |= ((g)s1.elementAt(i)).a;
        }

        return j;
    }
}
