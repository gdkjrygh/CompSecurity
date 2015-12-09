// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public abstract class aay
{

    private ArrayList a;
    private long b;
    private long c;
    public aaz h;
    long i;
    long j;

    public aay()
    {
        h = null;
        a = new ArrayList();
        b = 120L;
        c = 120L;
        i = 250L;
        j = 250L;
    }

    public static int d(abo abo1)
    {
        int l = abo.h(abo1) & 0xe;
        int k;
        if (abo1.k())
        {
            k = 4;
        } else
        {
            k = l;
            if ((l & 4) == 0)
            {
                int i1 = abo1.c;
                int j1 = abo1.d();
                k = l;
                if (i1 != -1)
                {
                    k = l;
                    if (j1 != -1)
                    {
                        k = l;
                        if (i1 != j1)
                        {
                            return l | 0x800;
                        }
                    }
                }
            }
        }
        return k;
    }

    public abstract void a();

    public abstract boolean a(abo abo1, aba aba, aba aba1);

    public abstract boolean a(abo abo1, abo abo2, aba aba, aba aba1);

    public abstract boolean b();

    public abstract boolean b(abo abo1, aba aba, aba aba1);

    public abstract void c(abo abo1);

    public abstract boolean c(abo abo1, aba aba, aba aba1);

    public abstract void d();

    public long e()
    {
        return b;
    }

    public final void e(abo abo1)
    {
        if (h != null)
        {
            h.a(abo1);
        }
    }

    public long f()
    {
        return c;
    }

    public boolean f(abo abo1)
    {
        return true;
    }

    public final void g()
    {
        int l = a.size();
        for (int k = 0; k < l; k++)
        {
            a.get(k);
        }

        a.clear();
    }
}
