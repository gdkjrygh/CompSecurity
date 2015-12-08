// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class cwb extends qlw
{

    public String a;
    public long b;
    public cwc c[];
    public cwa d[];
    public cvv e;
    public boolean f;
    public long g;
    public byte h[];

    public cwb()
    {
        a = "";
        b = 0L;
        c = cwc.b();
        d = cwa.b();
        e = null;
        f = true;
        g = 0L;
        h = qmb.h;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (!a.equals(""))
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != 0L)
        {
            j = i + qlp.e(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (j = 0; j < c.length;)
                {
                    cwc cwc1 = c[j];
                    int k = i;
                    if (cwc1 != null)
                    {
                        k = i + qlp.c(3, cwc1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    cwa cwa1 = d[l];
                    j = i;
                    if (cwa1 != null)
                    {
                        j = i + qlp.c(4, cwa1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.c(5, e);
        }
        j = i;
        if (!f)
        {
            boolean flag1 = f;
            j = i + (qlp.c(6) + 1);
        }
        i = j;
        if (g != 0L)
        {
            i = j + qlp.e(7, g);
        }
        j = i;
        if (!Arrays.equals(h, qmb.h))
        {
            j = i + qlp.b(8, h);
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
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 16: // '\020'
                b = qlo1.j();
                break;

            case 26: // '\032'
                int l = qmb.b(qlo1, 26);
                cwc acwc[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                acwc = new cwc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, acwc, 0, j);
                    l = j;
                }
                for (; l < acwc.length - 1; l++)
                {
                    acwc[l] = new cwc();
                    qlo1.a(acwc[l]);
                    qlo1.a();
                }

                acwc[l] = new cwc();
                qlo1.a(acwc[l]);
                c = acwc;
                break;

            case 34: // '"'
                int i1 = qmb.b(qlo1, 34);
                cwa acwa[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                acwa = new cwa[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, acwa, 0, k);
                    i1 = k;
                }
                for (; i1 < acwa.length - 1; i1++)
                {
                    acwa[i1] = new cwa();
                    qlo1.a(acwa[i1]);
                    qlo1.a();
                }

                acwa[i1] = new cwa();
                qlo1.a(acwa[i1]);
                d = acwa;
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new cvv();
                }
                qlo1.a(e);
                break;

            case 48: // '0'
                f = qlo1.f();
                break;

            case 56: // '8'
                g = qlo1.j();
                break;

            case 66: // 'B'
                h = qlo1.h();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (!a.equals(""))
        {
            qlp1.a(1, a);
        }
        if (b != 0L)
        {
            qlp1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                cwc cwc1 = c[i];
                if (cwc1 != null)
                {
                    qlp1.a(3, cwc1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                cwa cwa1 = d[j];
                if (cwa1 != null)
                {
                    qlp1.a(4, cwa1);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (!f)
        {
            qlp1.a(6, f);
        }
        if (g != 0L)
        {
            qlp1.b(7, g);
        }
        if (!Arrays.equals(h, qmb.h))
        {
            qlp1.a(8, h);
        }
        super.a(qlp1);
    }
}
