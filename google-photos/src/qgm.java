// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qgm extends qlq
{

    public qec a;
    public qdm b;
    private Boolean c;

    public qgm()
    {
        c = null;
        a = null;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + qlp.c(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(4, b);
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

            case 8: // '\b'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new qec();
                }
                qlo1.a(a);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new qdm();
                }
                qlo1.a(b);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(1, c.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        super.a(qlp1);
    }
}
