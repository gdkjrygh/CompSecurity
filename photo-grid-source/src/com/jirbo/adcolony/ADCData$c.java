// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            ADCData, af

class a extends a
{

    ArrayList a;

    double a(int k, double d1)
    {
        a a1 = (a)a.get(k);
        double d2 = d1;
        if (a1 != null)
        {
            d2 = d1;
            if (a1.p())
            {
                d2 = a1.d();
            }
        }
        return d2;
    }

    int a(int k, int l)
    {
        d d1 = (d)a.get(k);
        k = l;
        if (d1 != null)
        {
            k = l;
            if (d1.p())
            {
                k = d1.e();
            }
        }
        return k;
    }

    e a(double d1)
    {
        a(((a) (new <init>(d1))));
        return this;
    }

    <init> a(int k)
    {
        a(((a) (new <init>(k))));
        return this;
    }

    <init> a(int k, <init> <init>1)
    {
        <init> <init>3 = (<init>)a.get(k);
        <init> <init>2 = <init>1;
        if (<init>3 != null)
        {
            <init>2 = <init>1;
            if (<init>3.f())
            {
                <init>2 = <init>3.h();
            }
        }
        return <init>2;
    }

    h a(h h1)
    {
        for (int k = 0; k < h1.i(); k++)
        {
            a((a)h1.a.get(k));
        }

        return this;
    }

    a a(a a1)
    {
        a.add(a1);
        return this;
    }

    a a(String s)
    {
        a(((a) (new <init>(s))));
        return this;
    }

    <init> a(boolean flag)
    {
        <init> <init>1;
        if (flag)
        {
            <init>1 = ADCData.a;
        } else
        {
            <init>1 = ADCData.b;
        }
        a(<init>1);
        return this;
    }

    a a(int k, a a1)
    {
        a a3 = (a)a.get(k);
        a a2 = a1;
        if (a3 != null)
        {
            a2 = a1;
            if (a3.m())
            {
                a2 = a3.n();
            }
        }
        return a2;
    }

    String a(int k, String s)
    {
        n n = (n)a.get(k);
        String s1 = s;
        if (n != null)
        {
            s1 = s;
            if (n.k())
            {
                s1 = n.b();
            }
        }
        return s1;
    }

    void a(af af1)
    {
        int l = a.size();
        if (l == 0)
        {
            af1.a("[]");
            return;
        }
        if (l == 1 && ((a)a.get(0)).g())
        {
            af1.a("[");
            ((g)a.get(0)).a(af1);
            af1.a("]");
            return;
        }
        af1.b("[");
        af1.i = af1.i + 2;
        int k = 0;
        boolean flag = true;
        while (k < l) 
        {
            if (flag)
            {
                flag = false;
            } else
            {
                af1.c(',');
            }
            ((a)a.get(k)).a(af1);
            k++;
        }
        af1.d();
        af1.i = af1.i - 2;
        af1.a("]");
    }

    boolean a(int k, boolean flag)
    {
        boolean flag1;
label0:
        {
            a a1 = (a)a.get(k);
            flag1 = flag;
            if (a1 == null)
            {
                break label0;
            }
            if (!a1.a())
            {
                flag1 = flag;
                if (!a1.k())
                {
                    break label0;
                }
            }
            flag1 = a1.l();
        }
        return flag1;
    }

    l a_()
    {
        return (l)a.remove(a.size() - 1);
    }

    a b(int k)
    {
        a a1 = a(k, ((a) (null)));
        if (a1 != null)
        {
            return a1;
        } else
        {
            return new <init>();
        }
    }

    <init> c(int k)
    {
        <init> <init>1 = a(k, ((a) (null)));
        if (<init>1 != null)
        {
            return <init>1;
        } else
        {
            return new <init>();
        }
    }

    String d(int k)
    {
        return a(k, "");
    }

    double e(int k)
    {
        return a(k, 0.0D);
    }

    int f(int k)
    {
        return a(k, 0);
    }

    boolean f()
    {
        return true;
    }

    boolean g()
    {
        return a.size() == 0 || a.size() == 1 && ((a)a.get(0)).g();
    }

    boolean g(int k)
    {
        return a(k, false);
    }

    a h()
    {
        return this;
    }

    int i()
    {
        return a.size();
    }

    void j()
    {
        a.clear();
    }

    ()
    {
        a = new ArrayList();
    }
}
