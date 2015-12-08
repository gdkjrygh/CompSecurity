// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pdw extends qlq
{

    public pec a;
    public pgp b;
    public pew c[];
    public ped d;

    public pdw()
    {
        a = null;
        b = null;
        c = pew.b();
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.c(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    pew pew1 = c[j];
                    int k = i;
                    if (pew1 != null)
                    {
                        k = i + qlp.c(3, pew1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.c(4, a);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(5, d);
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
                if (b == null)
                {
                    b = new pgp();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                pew apew[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                apew = new pew[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, apew, 0, j);
                    k = j;
                }
                for (; k < apew.length - 1; k++)
                {
                    apew[k] = new pew();
                    qlo1.a(apew[k]);
                    qlo1.a();
                }

                apew[k] = new pew();
                qlo1.a(apew[k]);
                c = apew;
                break;

            case 34: // '"'
                if (a == null)
                {
                    a = new pec();
                }
                qlo1.a(a);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new ped();
                }
                qlo1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pew pew1 = c[i];
                if (pew1 != null)
                {
                    qlp1.a(3, pew1);
                }
            }

        }
        if (a != null)
        {
            qlp1.a(4, a);
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        super.a(qlp1);
    }
}
