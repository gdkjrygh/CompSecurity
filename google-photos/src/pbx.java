// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pbx extends qlq
{

    public qqr a;
    public pah apiHeader;

    public pbx()
    {
        apiHeader = null;
        a = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (apiHeader != null)
        {
            i = j + qlp.c(1, apiHeader);
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

            case 10: // '\n'
                if (apiHeader == null)
                {
                    apiHeader = new pah();
                }
                qlo1.a(apiHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new qqr();
                }
                qlo1.a(a);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (apiHeader != null)
        {
            qlp1.a(1, apiHeader);
        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        super.a(qlp1);
    }
}
