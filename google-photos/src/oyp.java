// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyp extends qlq
{

    private static volatile oyp d[];
    public ozd a;
    public Long b;
    public oyr c;
    private ozg e[];
    private String f[];

    public oyp()
    {
        a = null;
        b = null;
        c = null;
        e = ozg.b();
        f = qmb.f;
        F = null;
        G = -1;
    }

    public static oyp[] b()
    {
        if (d == null)
        {
            synchronized (qlu.a)
            {
                if (d == null)
                {
                    d = new oyp[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        if (b != null)
        {
            j = i + qlp.d(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    ozg ozg1 = e[j];
                    int k = i;
                    if (ozg1 != null)
                    {
                        k = i + qlp.c(4, ozg1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (f != null)
        {
            i = j;
            if (f.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (i = ((flag) ? 1 : 0); i < f.length;)
                {
                    String s = f[i];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + qlp.a(s);
                    }
                    i++;
                    l = k1;
                    i1 = j1;
                }

                i = j + l + i1 * 1;
            }
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
                if (a == null)
                {
                    a = new ozd();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(qlo1.j());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new oyr();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                int l = qmb.b(qlo1, 34);
                ozg aozg[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                aozg = new ozg[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, aozg, 0, j);
                    l = j;
                }
                for (; l < aozg.length - 1; l++)
                {
                    aozg[l] = new ozg();
                    qlo1.a(aozg[l]);
                    qlo1.a();
                }

                aozg[l] = new ozg();
                qlo1.a(aozg[l]);
                e = aozg;
                break;

            case 42: // '*'
                int i1 = qmb.b(qlo1, 42);
                String as[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                as = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = qlo1.g();
                    qlo1.a();
                }

                as[i1] = qlo1.g();
                f = as;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                ozg ozg1 = e[i];
                if (ozg1 != null)
                {
                    qlp1.a(4, ozg1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                String s = f[j];
                if (s != null)
                {
                    qlp1.a(5, s);
                }
            }

        }
        super.a(qlp1);
    }
}
