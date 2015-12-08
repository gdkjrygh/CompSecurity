// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pse extends qlq
{

    private Integer a;
    private prk b[];

    public pse()
    {
        a = null;
        b = prk.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    prk prk1 = b[j];
                    int k = i;
                    if (prk1 != null)
                    {
                        k = i + qlp.c(2, prk1);
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

            case 8: // '\b'
                a = Integer.valueOf(qlo1.i());
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                prk aprk[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aprk = new prk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aprk, 0, j);
                    k = j;
                }
                for (; k < aprk.length - 1; k++)
                {
                    aprk[k] = new prk();
                    qlo1.a(aprk[k]);
                    qlo1.a();
                }

                aprk[k] = new prk();
                qlo1.a(aprk[k]);
                b = aprk;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                prk prk1 = b[i];
                if (prk1 != null)
                {
                    qlp1.a(2, prk1);
                }
            }

        }
        super.a(qlp1);
    }
}
