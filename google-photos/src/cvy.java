// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvy extends qlw
{

    public int a;
    public int b;

    public cvy()
    {
        a = 0;
        b = 0;
        G = -1;
    }

    protected final int a()
    {
        return super.a() + qlp.e(1, a) + qlp.e(2, b);
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
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        qlp1.a(2, b);
        super.a(qlp1);
    }
}
