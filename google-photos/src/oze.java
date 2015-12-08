// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oze extends qlq
{

    public String a;
    public oza b[];
    private String c;
    private ozb d;
    private ozg e[];
    private String f;

    public oze()
    {
        c = null;
        a = null;
        b = oza.b();
        d = null;
        e = ozg.b();
        f = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (c != null)
        {
            j = i + qlp.b(1, c);
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.b(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    oza oza1 = b[j];
                    int k = i;
                    if (oza1 != null)
                    {
                        k = i + qlp.c(3, oza1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(4, d);
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
                    ozg ozg1 = e[l];
                    j = i;
                    if (ozg1 != null)
                    {
                        j = i + qlp.c(5, ozg1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.b(6, f);
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
                c = qlo1.g();
                break;

            case 18: // '\022'
                a = qlo1.g();
                break;

            case 26: // '\032'
                int l = qmb.b(qlo1, 26);
                oza aoza[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aoza = new oza[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aoza, 0, j);
                    l = j;
                }
                for (; l < aoza.length - 1; l++)
                {
                    aoza[l] = new oza();
                    qlo1.a(aoza[l]);
                    qlo1.a();
                }

                aoza[l] = new oza();
                qlo1.a(aoza[l]);
                b = aoza;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ozb();
                }
                qlo1.a(d);
                break;

            case 42: // '*'
                int i1 = qmb.b(qlo1, 42);
                ozg aozg[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aozg = new ozg[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aozg, 0, k);
                    i1 = k;
                }
                for (; i1 < aozg.length - 1; i1++)
                {
                    aozg[i1] = new ozg();
                    qlo1.a(aozg[i1]);
                    qlo1.a();
                }

                aozg[i1] = new ozg();
                qlo1.a(aozg[i1]);
                e = aozg;
                break;

            case 50: // '2'
                f = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (c != null)
        {
            qlp1.a(1, c);
        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                oza oza1 = b[i];
                if (oza1 != null)
                {
                    qlp1.a(3, oza1);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                ozg ozg1 = e[j];
                if (ozg1 != null)
                {
                    qlp1.a(5, ozg1);
                }
            }

        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        super.a(qlp1);
    }
}
