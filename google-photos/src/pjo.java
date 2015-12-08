// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjo extends qlq
{

    private Boolean a;
    private String b;
    private String c[];

    public pjo()
    {
        a = null;
        b = null;
        c = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        a.booleanValue();
        int j = i + (qlp.c(1) + 1);
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
                a = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                b = qlo1.g();
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
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a.booleanValue());
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
        super.a(qlp1);
    }
}
