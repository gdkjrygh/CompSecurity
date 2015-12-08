// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.jirbo.adcolony:
//            af, ADCData

class b extends b
    implements Serializable
{

    HashMap a;
    ArrayList b;

    double a(String s, double d1)
    {
        s = (b)a.get(s);
        double d2 = d1;
        if (s != null)
        {
            d2 = d1;
            if (s.p())
            {
                d2 = s.d();
            }
        }
        return d2;
    }

    int a(String s, int i)
    {
        s = (d)a.get(s);
        int j = i;
        if (s != null)
        {
            j = i;
            if (s.p())
            {
                j = s.e();
            }
        }
        return j;
    }

    e a(String s, e e1)
    {
        e e2 = (e)a.get(s);
        s = e1;
        if (e2 != null)
        {
            s = e1;
            if (e2.f())
            {
                s = e2.h();
            }
        }
        return s;
    }

    h a(String s, h h1)
    {
        h h2 = (h)a.get(s);
        s = h1;
        if (h2 != null)
        {
            s = h1;
            if (h2.m())
            {
                s = h2.n();
            }
        }
        return s;
    }

    String a(int i)
    {
        return (String)b.get(i);
    }

    String a(String s, String s1)
    {
        b b1 = (b)a.get(s);
        s = s1;
        if (b1 != null)
        {
            s = s1;
            if (b1.k())
            {
                s = b1.b();
            }
        }
        return s;
    }

    ArrayList a(String s, ArrayList arraylist)
    {
        b b1 = c(s);
        if (b1 != null) goto _L2; else goto _L1
_L1:
        return arraylist;
_L2:
        s = new ArrayList();
        int i = 0;
        do
        {
            arraylist = s;
            if (i >= b1.i())
            {
                continue;
            }
            arraylist = b1.d(i);
            if (arraylist != null)
            {
                s.add(arraylist);
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    void a(af af1)
    {
        int j = b.size();
        if (j == 0)
        {
            af1.a("{}");
            return;
        }
        if (j == 1 && ((b)a.get(b.get(0))).g())
        {
            af1.a("{");
            String s = (String)b.get(0);
            d d1 = (b)a.get(s);
            a(af1, s);
            af1.b(':');
            d1.a(af1);
            af1.a("}");
            return;
        }
        af1.b("{");
        af1.i = af1.i + 2;
        int i = 0;
        boolean flag = true;
        while (i < j) 
        {
            String s1;
            d d2;
            if (flag)
            {
                flag = false;
            } else
            {
                af1.c(',');
            }
            s1 = (String)b.get(i);
            d2 = (b)a.get(s1);
            a(af1, s1);
            af1.b(':');
            if (!d2.g())
            {
                af1.d();
            }
            d2.a(af1);
            i++;
        }
        af1.d();
        af1.i = af1.i - 2;
        af1.a("}");
    }

    void a(String s, a a1)
    {
        if (!a.containsKey(s))
        {
            b.add(s);
        }
        a.put(s, a1);
    }

    boolean a(String s)
    {
        return a.containsKey(s);
    }

    boolean a(String s, boolean flag)
    {
        boolean flag1;
label0:
        {
            s = ()a.get(s);
            flag1 = flag;
            if (s == null)
            {
                break label0;
            }
            if (!s.a())
            {
                flag1 = flag;
                if (!s.k())
                {
                    break label0;
                }
            }
            flag1 = s.l();
        }
        return flag1;
    }

    l b(String s)
    {
        s = a(s, ((a) (null)));
        if (s != null)
        {
            return s;
        } else
        {
            return new <init>();
        }
    }

    void b(String s, double d1)
    {
        a(s, new <init>(d1));
    }

    void b(String s, int i)
    {
        a(s, new <init>(i));
    }

    void b(String s, String s1)
    {
        a(s, new <init>(s1));
    }

    void b(String s, boolean flag)
    {
        <init> <init>1;
        if (flag)
        {
            <init>1 = ADCData.a;
        } else
        {
            <init>1 = ADCData.b;
        }
        a(s, <init>1);
    }

    a c(String s)
    {
        s = a(s, ((a) (null)));
        if (s != null)
        {
            return s;
        } else
        {
            return new <init>();
        }
    }

    ArrayList d(String s)
    {
        ArrayList arraylist = a(s, ((ArrayList) (null)));
        s = arraylist;
        if (arraylist == null)
        {
            s = new ArrayList();
        }
        return s;
    }

    String e(String s)
    {
        return a(s, "");
    }

    double f(String s)
    {
        return a(s, 0.0D);
    }

    int g(String s)
    {
        return a(s, 0);
    }

    boolean g()
    {
        return a.size() < 0 || a.size() == 1 && ((a)a.get(b.get(0))).g();
    }

    boolean h(String s)
    {
        return a(s, false);
    }

    boolean m()
    {
        return true;
    }

    a n()
    {
        return this;
    }

    int o()
    {
        return b.size();
    }

    ()
    {
        a = new HashMap();
        b = new ArrayList();
    }
}
