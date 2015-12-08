// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oys extends qlq
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private oyu f[];
    private String g;
    private String h;
    private String i[];
    private oyw j;
    private oyt k[];
    private Boolean l;

    public oys()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = oyu.b();
        g = null;
        h = null;
        i = qmb.f;
        j = null;
        k = oyt.b();
        l = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + qlp.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    oyu oyu1 = f[j1];
                    int k1 = i1;
                    if (oyu1 != null)
                    {
                        k1 = i1 + qlp.c(6, oyu1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        int l1 = j1;
        if (g != null)
        {
            l1 = j1 + qlp.b(7, g);
        }
        i1 = l1;
        if (h != null)
        {
            i1 = l1 + qlp.b(8, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                j1 = 0;
                int i2 = 0;
                int k2;
                int l2;
                for (k2 = 0; j1 < i.length; k2 = l2)
                {
                    String s = i[j1];
                    int i3 = i2;
                    l2 = k2;
                    if (s != null)
                    {
                        l2 = k2 + 1;
                        i3 = i2 + qlp.a(s);
                    }
                    j1++;
                    i2 = i3;
                }

                j1 = i1 + i2 + k2 * 1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= k.length)
                    {
                        break;
                    }
                    oyt oyt1 = k[j2];
                    j1 = i1;
                    if (oyt1 != null)
                    {
                        j1 = i1 + qlp.c(11, oyt1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (l != null)
        {
            l.booleanValue();
            i1 = j1 + (qlp.c(12) + 1);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i1 = qlo1.a();
            switch (i1)
            {
            default:
                if (super.a(qlo1, i1))
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
                b = qlo1.g();
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                d = qlo1.g();
                break;

            case 42: // '*'
                e = qlo1.g();
                break;

            case 50: // '2'
                int i2 = qmb.b(qlo1, 50);
                oyu aoyu[];
                int j1;
                if (f == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = f.length;
                }
                aoyu = new oyu[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(f, 0, aoyu, 0, j1);
                    i2 = j1;
                }
                for (; i2 < aoyu.length - 1; i2++)
                {
                    aoyu[i2] = new oyu();
                    qlo1.a(aoyu[i2]);
                    qlo1.a();
                }

                aoyu[i2] = new oyu();
                qlo1.a(aoyu[i2]);
                f = aoyu;
                break;

            case 58: // ':'
                g = qlo1.g();
                break;

            case 66: // 'B'
                h = qlo1.g();
                break;

            case 74: // 'J'
                int j2 = qmb.b(qlo1, 74);
                String as[];
                int k1;
                if (i == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = i.length;
                }
                as = new String[j2 + k1];
                j2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(i, 0, as, 0, k1);
                    j2 = k1;
                }
                for (; j2 < as.length - 1; j2++)
                {
                    as[j2] = qlo1.g();
                    qlo1.a();
                }

                as[j2] = qlo1.g();
                i = as;
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new oyw();
                }
                qlo1.a(j);
                break;

            case 90: // 'Z'
                int k2 = qmb.b(qlo1, 90);
                oyt aoyt[];
                int l1;
                if (k == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = k.length;
                }
                aoyt = new oyt[k2 + l1];
                k2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(k, 0, aoyt, 0, l1);
                    k2 = l1;
                }
                for (; k2 < aoyt.length - 1; k2++)
                {
                    aoyt[k2] = new oyt();
                    qlo1.a(aoyt[k2]);
                    qlo1.a();
                }

                aoyt[k2] = new oyt();
                qlo1.a(aoyt[k2]);
                k = aoyt;
                break;

            case 96: // '`'
                l = Boolean.valueOf(qlo1.f());
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
            for (int i1 = 0; i1 < f.length; i1++)
            {
                oyu oyu1 = f[i1];
                if (oyu1 != null)
                {
                    qlp1.a(6, oyu1);
                }
            }

        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (i != null && i.length > 0)
        {
            for (int j1 = 0; j1 < i.length; j1++)
            {
                String s = i[j1];
                if (s != null)
                {
                    qlp1.a(9, s);
                }
            }

        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        if (k != null && k.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < k.length; k1++)
            {
                oyt oyt1 = k[k1];
                if (oyt1 != null)
                {
                    qlp1.a(11, oyt1);
                }
            }

        }
        if (l != null)
        {
            qlp1.a(12, l.booleanValue());
        }
        super.a(qlp1);
    }
}
