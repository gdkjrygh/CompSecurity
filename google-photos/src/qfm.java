// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qfm extends qlq
{

    public Integer a;
    public Integer b;

    public qfm()
    {
        a = null;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            a.intValue();
            i = j + (qlp.c(1) + 4);
        }
        j = i;
        if (b != null)
        {
            b.intValue();
            j = i + (qlp.c(2) + 4);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i = qlo1.a();
            switch (i)
            {
            default:
                if (super.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 13: // '\r'
                a = Integer.valueOf(qlo1.k());
                break;

            case 21: // '\025'
                b = Integer.valueOf(qlo1.k());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.b(1, a.intValue());
        }
        if (b != null)
        {
            qlp1.b(2, b.intValue());
        }
        super.a(qlp1);
    }
}
