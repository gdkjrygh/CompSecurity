// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class cym
{

    final List a = new ArrayList();

    public cym(cyk cyk, cnq cnq1, cnq cnq2, cnq cnq3, pxq pxq1, pxq pxq2, pxq pxq3)
    {
        boolean flag1 = true;
        super();
        if (cnq1.d == cnt.a)
        {
            a.add("V");
        } else
        {
            boolean flag;
            if (!a(cnq1, cnq2, pxq1, pxq2) && a(cnq1, cnq3, pxq1, pxq3) && pxq1.c != null)
            {
                if (pxq1.c.a == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a.add("B");
                return;
            }
            if (a(cnq1, cnq2, pxq1, pxq2) && pxq1.c != null)
            {
                if (pxq1.c.a == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a.add("b");
                return;
            }
            if (!a(cnq1, cnq2, pxq1, pxq2) && a(cnq1, cnq3, pxq1, pxq3) && pxq1.c != null)
            {
                if (pxq1.c.a == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a.add("F");
                return;
            }
            if (a(cnq1, cnq2, pxq1, pxq2) && pxq1.c != null)
            {
                if (pxq1.c.a == 2)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a.add("f");
                return;
            }
            if (cnq1.d == cnt.c)
            {
                a.add("P");
                a.add("Z2");
                a.add("Z3");
                int i = pxq1.d.length;
                if (i > 0)
                {
                    a.add("K1");
                }
                if (i == 2)
                {
                    a.add("K2");
                }
                if (i == 3)
                {
                    a.add("K3");
                    return;
                }
            }
        }
    }

    private static boolean a(cnq cnq1, cnq cnq2, pxq pxq1, pxq pxq2)
    {
        while (cnq1 == null || cnq2 == null || pxq1.c == null || pxq2.c == null || pxq1.c.a != pxq2.c.a || pxq1.c.b != pxq2.c.b) 
        {
            return false;
        }
        return true;
    }

    public final String toString()
    {
        return a.toString();
    }
}
