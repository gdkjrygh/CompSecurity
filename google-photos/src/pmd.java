// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmd extends qlq
{

    public Boolean a;

    public pmd()
    {
        a = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        a.booleanValue();
        return i + (qlp.c(1) + 1);
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
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a.booleanValue());
        super.a(qlp1);
    }
}
