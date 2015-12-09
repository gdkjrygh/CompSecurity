// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pe, ov, ot

public final class os extends pe
    implements ov
{

    public static final os A;
    public static final os B;
    public static final os C;
    public static final os D;
    public static final os E;
    public static final os F;
    public static final os G;
    public static final os H;
    public static final os I;
    public static final os J;
    public static final os a = new os(0);
    public static final os b;
    public static final os c;
    public static final os d;
    public static final os e;
    public static final os f;
    public static final os g;
    public static final os h;
    public static final os i;
    public static final os j;
    public static final os k;
    public static final os l;
    public static final os m;
    public static final os n;
    public static final os o;
    public static final os p;
    public static final os q;
    public static final os r;
    public static final os s;
    public static final os t;
    public static final os u;
    public static final os v;
    public static final os w;
    public static final os x;
    public static final os y;
    public static final os z;

    public os(int i1)
    {
        super(i1);
    }

    public static int a(ov ov1, ov ov2)
    {
        int j1 = ov1.a();
        int k1 = ov2.a();
        int l1 = Math.min(j1, k1);
        for (int i1 = 0; i1 < l1; i1++)
        {
            int i2 = ov1.a(i1).a(ov2.a(i1));
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

    public static os a(ot ot1)
    {
        os os1 = new os(1);
        os1.a(0, ot1);
        return os1;
    }

    public static os a(ot ot1, ot ot2)
    {
        os os1 = new os(2);
        os1.a(0, ot1);
        os1.a(1, ot2);
        return os1;
    }

    public static os a(ot ot1, ot ot2, ot ot3)
    {
        os os1 = new os(3);
        os1.a(0, ot1);
        os1.a(1, ot2);
        os1.a(2, ot3);
        return os1;
    }

    public static os a(ot ot1, ot ot2, ot ot3, ot ot4)
    {
        os os1 = new os(4);
        os1.a(0, ot1);
        os1.a(1, ot2);
        os1.a(2, ot3);
        os1.a(3, ot4);
        return os1;
    }

    public static String a(ov ov1)
    {
        int j1 = ov1.a();
        if (j1 == 0)
        {
            return "<empty>";
        }
        StringBuffer stringbuffer = new StringBuffer(100);
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (i1 != 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(ov1.a(i1).h_());
        }

        return stringbuffer.toString();
    }

    public static int b(ov ov1)
    {
        int i1 = 0;
        int k1 = ov1.a();
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            j1 = j1 * 31 + ov1.a(i1).hashCode();
        }

        return j1;
    }

    public final ot a(int i1)
    {
        return b(i1);
    }

    public final void a(int i1, ot ot1)
    {
        a(i1, ot1);
    }

    public final int b()
    {
        int i1 = 0;
        int k1 = super.K.length;
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            j1 += b(i1).f();
        }

        return j1;
    }

    public final os b(ot ot1)
    {
        int i1 = 0;
        int j1 = super.K.length;
        os os1 = new os(j1 + 1);
        os1.a(0, ot1);
        for (; i1 < j1; i1++)
        {
            os1.a(i1 + 1, super.K[i1]);
        }

        return os1;
    }

    public final ot b(int i1)
    {
        return (ot)d(i1);
    }

    static 
    {
        b = a(ot.f);
        c = a(ot.g);
        d = a(ot.e);
        e = a(ot.d);
        f = a(ot.o);
        g = a(ot.k);
        h = a(ot.r);
        i = a(ot.f, ot.f);
        j = a(ot.g, ot.g);
        k = a(ot.e, ot.e);
        l = a(ot.d, ot.d);
        m = a(ot.o, ot.o);
        n = a(ot.f, ot.o);
        o = a(ot.g, ot.o);
        p = a(ot.e, ot.o);
        q = a(ot.d, ot.o);
        r = a(ot.g, ot.f);
        s = a(ot.G, ot.f);
        t = a(ot.H, ot.f);
        u = a(ot.F, ot.f);
        v = a(ot.E, ot.f);
        w = a(ot.I, ot.f);
        x = a(ot.B, ot.f);
        y = a(ot.C, ot.f);
        z = a(ot.D, ot.f);
        A = a(ot.J, ot.f);
        B = a(ot.f, ot.G, ot.f);
        C = a(ot.g, ot.H, ot.f);
        D = a(ot.e, ot.F, ot.f);
        E = a(ot.d, ot.E, ot.f);
        F = a(ot.o, ot.I, ot.f);
        G = a(ot.f, ot.B, ot.f);
        H = a(ot.f, ot.C, ot.f);
        I = a(ot.f, ot.D, ot.f);
        J = a(ot.f, ot.J, ot.f);
    }
}
