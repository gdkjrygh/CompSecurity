// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aeC extends aeN
    implements aeF
{

    public static final aeC A;
    public static final aeC B;
    public static final aeC C;
    public static final aeC D;
    public static final aeC E;
    public static final aeC F;
    public static final aeC G;
    public static final aeC H;
    public static final aeC I;
    public static final aeC J;
    public static final aeC a = new aeC(0);
    public static final aeC b;
    public static final aeC c;
    public static final aeC d;
    public static final aeC e;
    public static final aeC f;
    public static final aeC g;
    public static final aeC h;
    public static final aeC i;
    public static final aeC j;
    public static final aeC k;
    public static final aeC l;
    public static final aeC m;
    public static final aeC n;
    public static final aeC o;
    public static final aeC p;
    public static final aeC q;
    public static final aeC r;
    public static final aeC s;
    public static final aeC t;
    public static final aeC u;
    public static final aeC v;
    public static final aeC w;
    public static final aeC x;
    public static final aeC y;
    public static final aeC z;

    public aeC(int i1)
    {
        super(i1);
    }

    public static int a(aeF aef)
    {
        int i1 = 0;
        int k1 = aef.a();
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            j1 = j1 * 31 + aef.a(i1).hashCode();
        }

        return j1;
    }

    public static int a(aeF aef, aeF aef1)
    {
        int j1 = aef.a();
        int k1 = aef1.a();
        int l1 = Math.min(j1, k1);
        for (int i1 = 0; i1 < l1; i1++)
        {
            int i2 = aef.a(i1).a(aef1.a(i1));
            if (i2 != 0)
            {
                return i2;
            }
        }

        if (j1 == k1)
        {
            return 0;
        }
        return j1 >= k1 ? 1 : -1;
    }

    public static aeC a(aeD aed)
    {
        aeC aec = new aeC(1);
        aec.a(0, aed);
        return aec;
    }

    public static aeC a(aeD aed, aeD aed1)
    {
        aeC aec = new aeC(2);
        aec.a(0, aed);
        aec.a(1, aed1);
        return aec;
    }

    public static aeC a(aeD aed, aeD aed1, aeD aed2)
    {
        aeC aec = new aeC(3);
        aec.a(0, aed);
        aec.a(1, aed1);
        aec.a(2, aed2);
        return aec;
    }

    public static aeC a(aeD aed, aeD aed1, aeD aed2, aeD aed3)
    {
        aeC aec = new aeC(4);
        aec.a(0, aed);
        aec.a(1, aed1);
        aec.a(2, aed2);
        aec.a(3, aed3);
        return aec;
    }

    public final aeD a(int i1)
    {
        return b(i1);
    }

    public final void a(int i1, aeD aed)
    {
        a(i1, aed);
    }

    public final int b()
    {
        int i1 = 0;
        int k1 = super.K.length;
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            j1 += b(i1).e();
        }

        return j1;
    }

    public final aeC b(aeD aed)
    {
        int i1 = 0;
        int j1 = super.K.length;
        aeC aec = new aeC(j1 + 1);
        aec.a(0, aed);
        for (; i1 < j1; i1++)
        {
            aec.a(i1 + 1, super.K[i1]);
        }

        return aec;
    }

    public final aeD b(int i1)
    {
        return (aeD)d(i1);
    }

    static 
    {
        b = a(aeD.f);
        c = a(aeD.g);
        d = a(aeD.e);
        e = a(aeD.d);
        f = a(aeD.m);
        g = a(aeD.k);
        h = a(aeD.o);
        i = a(aeD.f, aeD.f);
        j = a(aeD.g, aeD.g);
        k = a(aeD.e, aeD.e);
        l = a(aeD.d, aeD.d);
        m = a(aeD.m, aeD.m);
        n = a(aeD.f, aeD.m);
        o = a(aeD.g, aeD.m);
        p = a(aeD.e, aeD.m);
        q = a(aeD.d, aeD.m);
        r = a(aeD.g, aeD.f);
        s = a(aeD.D, aeD.f);
        t = a(aeD.E, aeD.f);
        u = a(aeD.C, aeD.f);
        v = a(aeD.B, aeD.f);
        w = a(aeD.F, aeD.f);
        x = a(aeD.y, aeD.f);
        y = a(aeD.z, aeD.f);
        z = a(aeD.A, aeD.f);
        A = a(aeD.G, aeD.f);
        B = a(aeD.f, aeD.D, aeD.f);
        C = a(aeD.g, aeD.E, aeD.f);
        D = a(aeD.e, aeD.C, aeD.f);
        E = a(aeD.d, aeD.B, aeD.f);
        F = a(aeD.m, aeD.F, aeD.f);
        G = a(aeD.f, aeD.y, aeD.f);
        H = a(aeD.f, aeD.z, aeD.f);
        I = a(aeD.f, aeD.A, aeD.f);
        J = a(aeD.f, aeD.G, aeD.f);
    }
}
