// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hdd extends qlq
{

    public String a[];

    public hdd()
    {
        a = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = 0;
        int j1 = super.a();
        if (a != null && a.length > 0)
        {
            int j = 0;
            int k;
            int l;
            for (k = 0; i < a.length; k = l)
            {
                String s = a[i];
                int i1 = j;
                l = k;
                if (s != null)
                {
                    l = k + 1;
                    i1 = j + qlp.a(s);
                }
                i++;
                j = i1;
            }

            return j1 + j + k * 1;
        } else
        {
            return j1;
        }
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    qlp1.a(1, s);
                }
            }

        }
        super.a(qlp1);
    }
}
