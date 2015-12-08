// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnp extends qlq
{

    public qor a;
    private String b;
    private Boolean c;
    private pyp d;
    private String e[];

    public pnp()
    {
        b = null;
        a = null;
        c = null;
        d = null;
        e = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (qlp.c(2) + 1);
        }
        int k = j;
        if (d != null)
        {
            k = j + qlp.c(3, d);
        }
        i = k;
        if (b != null)
        {
            i = k + qlp.b(4, b);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < e.length;)
                {
                    String s = e[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + qlp.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
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
                if (a == null)
                {
                    a = new qor();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new pyp();
                }
                qlo1.a(d);
                break;

            case 34: // '"'
                b = qlo1.g();
                break;

            case 42: // '*'
                int k = qmb.b(qlo1, 42);
                String as[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = qlo1.g();
                    qlo1.a();
                }

                as[k] = qlo1.g();
                e = as;
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
        if (c != null)
        {
            qlp1.a(2, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    qlp1.a(5, s);
                }
            }

        }
        super.a(qlp1);
    }
}
