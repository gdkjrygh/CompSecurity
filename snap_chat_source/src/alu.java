// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class alu
    implements Serializable
{
    static final class a extends alu
    {

        private final byte b;
        private final transient alA c;
        private final transient alA d;

        public final alt a(alr alr1)
        {
            alr1 = alv.a(alr1);
            switch (b)
            {
            default:
                throw new InternalError();

            case 1: // '\001'
                return alr1.K();

            case 2: // '\002'
                return alr1.F();

            case 3: // '\003'
                return alr1.I();

            case 4: // '\004'
                return alr1.G();

            case 5: // '\005'
                return alr1.E();

            case 6: // '\006'
                return alr1.v();

            case 7: // '\007'
                return alr1.C();

            case 8: // '\b'
                return alr1.u();

            case 9: // '\t'
                return alr1.A();

            case 10: // '\n'
                return alr1.z();

            case 11: // '\013'
                return alr1.x();

            case 12: // '\f'
                return alr1.t();

            case 13: // '\r'
                return alr1.r();

            case 14: // '\016'
                return alr1.p();

            case 15: // '\017'
                return alr1.q();

            case 16: // '\020'
                return alr1.n();

            case 17: // '\021'
                return alr1.m();

            case 18: // '\022'
                return alr1.k();

            case 19: // '\023'
                return alr1.j();

            case 20: // '\024'
                return alr1.h();

            case 21: // '\025'
                return alr1.g();

            case 22: // '\026'
                return alr1.e();

            case 23: // '\027'
                return alr1.d();
            }
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof a)
                {
                    if (b != ((a)obj).b)
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return 1 << b;
        }

        public final alA x()
        {
            return c;
        }

        public final alA y()
        {
            return d;
        }

        a(String s1, byte byte0, alA ala, alA ala1)
        {
            super(s1);
            b = byte0;
            c = ala;
            d = ala1;
        }
    }


    private static final alu b = new a("era", (byte)1, alA.l(), null);
    private static final alu c = new a("yearOfEra", (byte)2, alA.j(), alA.l());
    private static final alu d = new a("centuryOfEra", (byte)3, alA.k(), alA.l());
    private static final alu e = new a("yearOfCentury", (byte)4, alA.j(), alA.k());
    private static final alu f = new a("year", (byte)5, alA.j(), null);
    private static final alu g = new a("dayOfYear", (byte)6, alA.f(), alA.j());
    private static final alu h = new a("monthOfYear", (byte)7, alA.i(), alA.j());
    private static final alu i = new a("dayOfMonth", (byte)8, alA.f(), alA.i());
    private static final alu j = new a("weekyearOfCentury", (byte)9, alA.h(), alA.k());
    private static final alu k = new a("weekyear", (byte)10, alA.h(), null);
    private static final alu l = new a("weekOfWeekyear", (byte)11, alA.g(), alA.h());
    private static final alu m = new a("dayOfWeek", (byte)12, alA.f(), alA.g());
    private static final alu n = new a("halfdayOfDay", (byte)13, alA.e(), alA.f());
    private static final alu o = new a("hourOfHalfday", (byte)14, alA.d(), alA.e());
    private static final alu p = new a("clockhourOfHalfday", (byte)15, alA.d(), alA.e());
    private static final alu q = new a("clockhourOfDay", (byte)16, alA.d(), alA.f());
    private static final alu r = new a("hourOfDay", (byte)17, alA.d(), alA.f());
    private static final alu s = new a("minuteOfDay", (byte)18, alA.c(), alA.f());
    private static final alu t = new a("minuteOfHour", (byte)19, alA.c(), alA.d());
    private static final alu u = new a("secondOfDay", (byte)20, alA.b(), alA.f());
    private static final alu v = new a("secondOfMinute", (byte)21, alA.b(), alA.c());
    private static final alu w = new a("millisOfDay", (byte)22, alA.a(), alA.f());
    private static final alu x = new a("millisOfSecond", (byte)23, alA.a(), alA.b());
    public final String a;

    protected alu(String s1)
    {
        a = s1;
    }

    public static alu a()
    {
        return x;
    }

    public static alu b()
    {
        return w;
    }

    public static alu c()
    {
        return v;
    }

    public static alu d()
    {
        return u;
    }

    public static alu e()
    {
        return t;
    }

    public static alu f()
    {
        return s;
    }

    public static alu g()
    {
        return r;
    }

    public static alu h()
    {
        return q;
    }

    public static alu i()
    {
        return o;
    }

    public static alu j()
    {
        return p;
    }

    public static alu k()
    {
        return n;
    }

    public static alu l()
    {
        return m;
    }

    public static alu m()
    {
        return i;
    }

    public static alu n()
    {
        return g;
    }

    public static alu o()
    {
        return l;
    }

    public static alu p()
    {
        return k;
    }

    public static alu q()
    {
        return j;
    }

    public static alu r()
    {
        return h;
    }

    public static alu s()
    {
        return f;
    }

    public static alu t()
    {
        return c;
    }

    public static alu u()
    {
        return e;
    }

    public static alu v()
    {
        return d;
    }

    public static alu w()
    {
        return b;
    }

    public abstract alt a(alr alr);

    public String toString()
    {
        return a;
    }

    public abstract alA x();

    public abstract alA y();

}
