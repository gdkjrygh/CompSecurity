// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plg extends qlq
{

    public Boolean a;
    private Boolean b;

    public plg()
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
            a.booleanValue();
            j = i + (qlp.c(2) + 1);
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

            case 16: // '\020'
                a = Boolean.valueOf(qlo1.f());
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
            qlp1.a(2, a.booleanValue());
        }
        super.a(qlp1);
    }
}
