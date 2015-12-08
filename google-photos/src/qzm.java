// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qzm extends qlq
{

    public String a[];
    private Integer b;

    public qzm()
    {
        a = qmb.f;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.e(1, b.intValue());
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < a.length;)
                {
                    String s = a[j];
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
                b = Integer.valueOf(qlo1.i());
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = qlo1.g();
                    qlo1.a();
                }

                as[k] = qlo1.g();
                a = as;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b.intValue());
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    qlp1.a(2, s);
                }
            }

        }
        super.a(qlp1);
    }
}
