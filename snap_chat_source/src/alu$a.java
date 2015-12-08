// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class d extends alu
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
            if (obj instanceof )
            {
                if (b != ((b)obj).b)
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

    (String s, byte byte0, alA ala, alA ala1)
    {
        super(s);
        b = byte0;
        c = ala;
        d = ala1;
    }
}
