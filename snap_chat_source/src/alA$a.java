// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class b extends alA
{

    private final byte b;

    public final alz a(alr alr1)
    {
        alr1 = alv.a(alr1);
        switch (b)
        {
        default:
            throw new InternalError();

        case 1: // '\001'
            return alr1.J();

        case 2: // '\002'
            return alr1.H();

        case 3: // '\003'
            return alr1.y();

        case 4: // '\004'
            return alr1.D();

        case 5: // '\005'
            return alr1.B();

        case 6: // '\006'
            return alr1.w();

        case 7: // '\007'
            return alr1.s();

        case 8: // '\b'
            return alr1.o();

        case 9: // '\t'
            return alr1.l();

        case 10: // '\n'
            return alr1.i();

        case 11: // '\013'
            return alr1.f();

        case 12: // '\f'
            return alr1.c();
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

    (String s, byte byte0)
    {
        super(s);
        b = byte0;
    }
}
