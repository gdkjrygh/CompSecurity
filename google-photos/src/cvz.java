// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvz extends qlw
{

    public int a;
    public int b;
    public int c;
    public int d;

    public cvz()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        G = -1;
    }

    protected final int a()
    {
        return super.a() + qlp.e(1, a) + qlp.e(2, b) + qlp.e(3, c) + qlp.e(4, d);
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i = qlo1.a();
            switch (i)
            {
            default:
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = qlo1.i();
                break;

            case 16: // '\020'
                b = qlo1.i();
                break;

            case 24: // '\030'
                c = qlo1.i();
                break;

            case 32: // ' '
                d = qlo1.i();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        qlp1.a(2, b);
        qlp1.a(3, c);
        qlp1.a(4, d);
        super.a(qlp1);
    }
}
