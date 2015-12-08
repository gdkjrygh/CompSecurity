// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmg extends qlq
{

    public Boolean a;
    private pny b;

    public pmg()
    {
        a = null;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        a.booleanValue();
        int j = i + (qlp.c(1) + 1);
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
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
                a = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pny();
                }
                qlo1.a(b);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a.booleanValue());
        if (b != null)
        {
            qlp1.a(2, b);
        }
        super.a(qlp1);
    }
}
