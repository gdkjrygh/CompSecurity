// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public abstract class aer
{

    private ArrayList a;
    public aet h;
    long i;
    public long j;
    public long k;
    long l;
    public boolean m;

    public aer()
    {
        h = null;
        a = new ArrayList();
        i = 120L;
        j = 120L;
        k = 250L;
        l = 250L;
        m = true;
    }

    public abstract void a();

    public final void a(afn afn, boolean flag)
    {
        if (h != null)
        {
            h.d(afn);
        }
    }

    public final boolean a(aes aes1)
    {
        boolean flag;
label0:
        {
            flag = b();
            if (aes1 != null)
            {
                if (flag)
                {
                    break label0;
                }
                aes1.a();
            }
            return flag;
        }
        a.add(aes1);
        return flag;
    }

    public abstract boolean a(afn afn);

    public abstract boolean a(afn afn, int i1, int j1, int k1, int l1);

    public abstract boolean a(afn afn, afn afn1, int i1, int j1, int k1, int l1);

    public abstract boolean b();

    public abstract boolean b(afn afn);

    public abstract void c(afn afn);

    public abstract void d();

    public final void d(afn afn)
    {
        if (h != null)
        {
            h.a(afn);
        }
    }

    public final void e(afn afn)
    {
        if (h != null)
        {
            h.c(afn);
        }
    }

    public boolean e()
    {
        return m;
    }

    public final void f()
    {
        int j1 = a.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((aes)a.get(i1)).a();
        }

        a.clear();
    }

    public final void f(afn afn)
    {
        if (h != null)
        {
            h.b(afn);
        }
    }
}
