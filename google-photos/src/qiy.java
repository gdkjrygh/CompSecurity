// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qiy extends qlq
{

    public Long a;
    public qja b[];
    public Integer c;
    public Integer d;
    private qiz e[];

    public qiy()
    {
        a = null;
        b = qja.b();
        e = qiz.b();
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i + qlp.e(1, a.longValue());
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    qja qja1 = b[j];
                    int k = i;
                    if (qja1 != null)
                    {
                        k = i + qlp.c(2, qja1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    qiz qiz1 = e[l];
                    j = i;
                    if (qiz1 != null)
                    {
                        j = i + qlp.c(3, qiz1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(4, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(5, d.intValue());
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
                a = Long.valueOf(qlo1.j());
                break;

            case 18: // '\022'
                int l = qmb.b(qlo1, 18);
                qja aqja[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aqja = new qja[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aqja, 0, j);
                    l = j;
                }
                for (; l < aqja.length - 1; l++)
                {
                    aqja[l] = new qja();
                    qlo1.a(aqja[l]);
                    qlo1.a();
                }

                aqja[l] = new qja();
                qlo1.a(aqja[l]);
                b = aqja;
                break;

            case 26: // '\032'
                int i1 = qmb.b(qlo1, 26);
                qiz aqiz[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aqiz = new qiz[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aqiz, 0, k);
                    i1 = k;
                }
                for (; i1 < aqiz.length - 1; i1++)
                {
                    aqiz[i1] = new qiz();
                    qlo1.a(aqiz[i1]);
                    qlo1.a();
                }

                aqiz[i1] = new qiz();
                qlo1.a(aqiz[i1]);
                e = aqiz;
                break;

            case 32: // ' '
                c = Integer.valueOf(qlo1.i());
                break;

            case 40: // '('
                d = Integer.valueOf(qlo1.i());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                qja qja1 = b[i];
                if (qja1 != null)
                {
                    qlp1.a(2, qja1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                qiz qiz1 = e[j];
                if (qiz1 != null)
                {
                    qlp1.a(3, qiz1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(4, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(5, d.intValue());
        }
        super.a(qlp1);
    }
}
