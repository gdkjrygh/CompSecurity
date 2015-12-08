// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qqu extends qlq
{

    public String a;
    public oyh b;
    public String c[];
    private ozi d;

    public qqu()
    {
        a = null;
        b = null;
        c = qmb.f;
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
            j = i + qlp.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < c.length;)
                {
                    String s = c[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + qlp.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(4, d);
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

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new oyh();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                String as[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = qlo1.g();
                    qlo1.a();
                }

                as[k] = qlo1.g();
                c = as;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ozi();
                }
                qlo1.a(d);
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
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    qlp1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }

    static 
    {
        qlr.a(11, qqu, 0x28890baaL);
    }
}
