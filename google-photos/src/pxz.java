// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pxz extends qlq
{

    public pya a[];

    public pxz()
    {
        a = pya.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    pya pya1 = a[j];
                    k = i;
                    if (pya1 != null)
                    {
                        k = i + qlp.c(1, pya1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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
                int k = qmb.b(qlo1, 10);
                pya apya[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apya = new pya[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apya, 0, j);
                    k = j;
                }
                for (; k < apya.length - 1; k++)
                {
                    apya[k] = new pya();
                    qlo1.a(apya[k]);
                    qlo1.a();
                }

                apya[k] = new pya();
                qlo1.a(apya[k]);
                a = apya;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                pya pya1 = a[i];
                if (pya1 != null)
                {
                    qlp1.a(1, pya1);
                }
            }

        }
        super.a(qlp1);
    }
}
