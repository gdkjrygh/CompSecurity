// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozd extends qlq
{

    public oyx a;
    public ozb b[];
    public String c;
    public String d;
    private oza e[];
    private String f;
    private oyx g;
    private oyx h;

    public ozd()
    {
        a = null;
        b = ozb.b();
        c = null;
        d = null;
        e = oza.b();
        f = null;
        g = null;
        h = null;
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
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ozb ozb1 = b[j];
                    int k = i;
                    if (ozb1 != null)
                    {
                        k = i + qlp.c(2, ozb1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        int l = j;
        if (c != null)
        {
            l = j + qlp.b(3, c);
        }
        i = l;
        if (d != null)
        {
            i = l + qlp.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= e.length)
                    {
                        break;
                    }
                    oza oza1 = e[i1];
                    j = i;
                    if (oza1 != null)
                    {
                        j = i + qlp.c(5, oza1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.b(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i + qlp.c(7, g);
        }
        i = j;
        if (h != null)
        {
            i = j + qlp.c(8, h);
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
                    a = new oyx();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                int l = qmb.b(qlo1, 18);
                ozb aozb[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aozb = new ozb[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aozb, 0, j);
                    l = j;
                }
                for (; l < aozb.length - 1; l++)
                {
                    aozb[l] = new ozb();
                    qlo1.a(aozb[l]);
                    qlo1.a();
                }

                aozb[l] = new ozb();
                qlo1.a(aozb[l]);
                b = aozb;
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                d = qlo1.g();
                break;

            case 42: // '*'
                int i1 = qmb.b(qlo1, 42);
                oza aoza[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aoza = new oza[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aoza, 0, k);
                    i1 = k;
                }
                for (; i1 < aoza.length - 1; i1++)
                {
                    aoza[i1] = new oza();
                    qlo1.a(aoza[i1]);
                    qlo1.a();
                }

                aoza[i1] = new oza();
                qlo1.a(aoza[i1]);
                e = aoza;
                break;

            case 50: // '2'
                f = qlo1.g();
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new oyx();
                }
                qlo1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new oyx();
                }
                qlo1.a(h);
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ozb ozb1 = b[i];
                if (ozb1 != null)
                {
                    qlp1.a(2, ozb1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                oza oza1 = e[j];
                if (oza1 != null)
                {
                    qlp1.a(5, oza1);
                }
            }

        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        super.a(qlp1);
    }
}
