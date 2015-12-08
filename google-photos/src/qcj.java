// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qcj extends qlq
{

    public pze a;
    private Boolean b;
    private qcd c;

    public qcj()
    {
        b = null;
        a = null;
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        return i;
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new pze();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new qcd();
                }
                qlo1.a(c);
                break;

            case 24: // '\030'
                b = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (b != null)
        {
            qlp1.a(3, b.booleanValue());
        }
        super.a(qlp1);
    }
}
