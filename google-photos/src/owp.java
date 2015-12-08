// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class owp extends qlq
{

    public Integer a;
    public String b;
    public owq c[];

    public owp()
    {
        a = null;
        b = null;
        c = owq.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i + qlp.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    owq owq1 = c[j];
                    int k = i;
                    if (owq1 != null)
                    {
                        k = i + qlp.c(3, owq1);
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
                b = qlo1.g();
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                owq aowq[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aowq = new owq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aowq, 0, j);
                    k = j;
                }
                for (; k < aowq.length - 1; k++)
                {
                    aowq[k] = new owq();
                    qlo1.a(aowq[k]);
                    qlo1.a();
                }

                aowq[k] = new owq();
                qlo1.a(aowq[k]);
                c = aowq;
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
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                owq owq1 = c[i];
                if (owq1 != null)
                {
                    qlp1.a(3, owq1);
                }
            }

        }
        super.a(qlp1);
    }
}
