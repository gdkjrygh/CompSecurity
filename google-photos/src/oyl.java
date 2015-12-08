// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyl extends qlq
{

    private String a;
    private oyx b;
    private String c;
    private byte d[];
    private String e;
    private String f[];

    public oyl()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = qmb.f;
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
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < f.length;)
                {
                    String s = f[j];
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

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new oyx();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                d = qlo1.h();
                break;

            case 42: // '*'
                e = qlo1.g();
                break;

            case 50: // '2'
                int k = qmb.b(qlo1, 50);
                String as[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(f, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = qlo1.g();
                    qlo1.a();
                }

                as[k] = qlo1.g();
                f = as;
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
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                String s = f[i];
                if (s != null)
                {
                    qlp1.a(6, s);
                }
            }

        }
        super.a(qlp1);
    }
}
