// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class iug
{

    public pev a;
    public iui b;
    public long c;
    public boolean d;
    public int e;

    public iug()
    {
    }

    public final boolean equals(Object obj)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if ((obj instanceof iug) && obj != null)
            {
                pev pev1 = ((iug)obj).a;
                pev pev2 = a;
                if (pev1 != null && pev1.a != null && pev1.a.c != null && pev2 != null && pev2.a != null && pev2.a.c != null)
                {
                    pev1.a.c = pev2.a.c;
                }
                if (pev1 != null && pev1.g != null && pev1.g.b != null && pev1.g.b.a != null && pev1.g.b.a.a != null && pev2 != null && pev2.g != null && pev2.g.b != null && pev2.g.b.a != null && pev2.g.b.a.a != null)
                {
                    pev1.g.b.a.a = pev2.g.b.a.a;
                }
                if (pev1 != null && pev1.c != null && pev1.c.c != null && pev2 != null && pev2.c != null && pev2.c.c != null)
                {
                    for (int i = 0; i < pev2.c.c.length && i < pev1.c.c.length; i++)
                    {
                        if (pev1.c.c[i].f != null && pev1.c.c[i].f.a != null && pev2.c.c[i].f != null && pev2.c.c[i].f.a != null)
                        {
                            pev1.c.c[i].f.a = pev2.c.c[i].f.a;
                        }
                    }

                }
                for (int j = 0; j < pev2.e.length && j < pev1.e.length; j++)
                {
                    pef pef1 = pev2.e[j];
                    pef pef2 = pev1.e[j];
                    for (int k = 0; k < pef1.a.length && k < pef2.a.length; k++)
                    {
                        peu peu1 = pef1.a[k];
                        peu peu2 = pef2.a[k];
                        for (int l = 0; l < peu1.a.length && l < peu2.a.length; l++)
                        {
                            Object obj2 = peu1.a[l];
                            Object obj1 = peu2.a[l];
                            obj2 = ((peq) (obj2)).d;
                            obj1 = ((peq) (obj1)).d;
                            if (obj1 != null && ((qgg) (obj1)).d != null && ((qgg) (obj1)).d.c != null && ((qgg) (obj1)).d.c.a != null && obj2 != null && ((qgg) (obj2)).d != null && ((qgg) (obj2)).d.c != null && ((qgg) (obj2)).d.c.a != null && ((qgg) (obj1)).d.c.a.equals(((qgg) (obj2)).d.c.a))
                            {
                                ((qgg) (obj1)).d.c = ((qgg) (obj2)).d.c;
                            }
                        }

                    }

                }

            }
            flag = flag1;
            if (!(obj instanceof iug))
            {
                break label0;
            }
            flag = flag1;
            if (((iug)obj).e != e)
            {
                break label0;
            }
            if (((iug)obj).b == null)
            {
                flag = flag1;
                if (b != null)
                {
                    break label0;
                }
            }
            if (((iug)obj).b != null || b != null)
            {
                flag = flag1;
                if (!((iug)obj).b.equals(b))
                {
                    break label0;
                }
            }
            flag = flag1;
            if (qlw.a(((iug)obj).a, a))
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(e), b, a
        });
    }
}
