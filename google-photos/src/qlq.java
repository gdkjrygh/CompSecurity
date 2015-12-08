// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public abstract class qlq extends qlw
{

    public qls F;

    public qlq()
    {
    }

    private qlq b()
    {
        qlq qlq1 = (qlq)super.c();
        qlu.a(this, qlq1);
        return qlq1;
    }

    public int a()
    {
        int j = 0;
        int k;
        if (F != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= F.a())
                {
                    break;
                }
                i += F.b(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public final Object a(qlr qlr1)
    {
        qlt qlt1;
        if (F != null)
        {
            if ((qlt1 = F.a(qmb.b(qlr1.b))) != null)
            {
                if (qlt1.b != null)
                {
                    if (qlt1.a != qlr1)
                    {
                        throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
                    }
                } else
                {
                    qlt1.a = qlr1;
                    List list = qlt1.c;
                    if (list == null)
                    {
                        qlr1 = null;
                    } else
                    if (qlr1.c)
                    {
                        qlr1 = ((qlr) (qlr1.a(list)));
                    } else
                    {
                        qlr1 = ((qlr) (qlr1.b(list)));
                    }
                    qlt1.b = qlr1;
                    qlt1.c = null;
                }
                return qlt1.b;
            }
        }
        return null;
    }

    public final qlq a(qlr qlr1, Object obj)
    {
        boolean flag = true;
        int i = qmb.b(qlr1.b);
        if (obj == null)
        {
            if (F != null)
            {
                qlr1 = F;
                i = qlr1.c(i);
                if (i >= 0 && ((qls) (qlr1)).c[i] != qls.a)
                {
                    ((qls) (qlr1)).c[i] = qls.a;
                    qlr1.b = true;
                }
                if (F.a() != 0)
                {
                    flag = false;
                }
                if (flag)
                {
                    F = null;
                }
            }
            return this;
        }
        qlt qlt1;
        if (F == null)
        {
            F = new qls();
            qlt1 = null;
        } else
        {
            qlt1 = F.a(i);
        }
        if (qlt1 == null)
        {
            F.a(i, new qlt(qlr1, obj));
            return this;
        } else
        {
            qlt1.a = qlr1;
            qlt1.b = obj;
            qlt1.c = null;
            return this;
        }
    }

    public void a(qlp qlp)
    {
        if (F != null)
        {
            int i = 0;
            while (i < F.a()) 
            {
                F.b(i).a(qlp);
                i++;
            }
        }
    }

    public final boolean a(qlo qlo1, int i)
    {
        int j = qlo1.o();
        if (!qlo1.b(i))
        {
            return false;
        }
        int k = qmb.b(i);
        int l = qlo1.o() - j;
        Object obj;
        qlz qlz1;
        if (l == 0)
        {
            qlo1 = qmb.h;
        } else
        {
            byte abyte0[] = new byte[l];
            int i1 = qlo1.b;
            System.arraycopy(qlo1.a, j + i1, abyte0, 0, l);
            qlo1 = abyte0;
        }
        qlz1 = new qlz(i, qlo1);
        qlo1 = null;
        if (F == null)
        {
            F = new qls();
        } else
        {
            qlo1 = F.a(k);
        }
        obj = qlo1;
        if (qlo1 == null)
        {
            obj = new qlt();
            F.a(k, ((qlt) (obj)));
        }
        ((qlt) (obj)).c.add(qlz1);
        return true;
    }

    public final qlw c()
    {
        return b();
    }

    public Object clone()
    {
        return b();
    }
}
