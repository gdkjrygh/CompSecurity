// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qan extends qlq
{

    public qaq a;
    private Boolean b;

    public qan()
    {
        b = null;
        a = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + qlp.c(2, a);
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

            case 8: // '\b'
                b = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new qaq();
                }
                qlo1.a(a);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        super.a(qlp1);
    }
}
