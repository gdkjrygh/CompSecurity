// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pst extends qlq
{

    private String a;
    private psu b[];

    public pst()
    {
        a = null;
        b = psu.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    psu psu1 = b[j];
                    int k = i;
                    if (psu1 != null)
                    {
                        k = i + qlp.c(2, psu1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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
                a = qlo1.g();
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                psu apsu[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                apsu = new psu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, apsu, 0, j);
                    k = j;
                }
                for (; k < apsu.length - 1; k++)
                {
                    apsu[k] = new psu();
                    qlo1.a(apsu[k]);
                    qlo1.a();
                }

                apsu[k] = new psu();
                qlo1.a(apsu[k]);
                b = apsu;
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                psu psu1 = b[i];
                if (psu1 != null)
                {
                    qlp1.a(2, psu1);
                }
            }

        }
        super.a(qlp1);
    }
}
