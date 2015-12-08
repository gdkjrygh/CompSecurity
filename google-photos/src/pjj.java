// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjj extends qlq
{

    private static volatile pjj f[];
    public qgg a;
    public Boolean b;
    public qfz c;
    public Boolean d;
    public String e;
    private pkh g;
    private pkh h;
    private pnt i;
    private ppq j;
    private pjx k;

    public pjj()
    {
        g = null;
        h = null;
        i = null;
        a = null;
        j = null;
        b = null;
        c = null;
        k = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static pjj[] b()
    {
        if (f == null)
        {
            synchronized (qlu.a)
            {
                if (f == null)
                {
                    f = new pjj[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i1 = super.a();
        int l = i1;
        if (g != null)
        {
            l = i1 + qlp.c(1, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + qlp.c(2, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + qlp.c(3, i);
        }
        i1 = l;
        if (d != null)
        {
            d.booleanValue();
            i1 = l + (qlp.c(4) + 1);
        }
        l = i1;
        if (j != null)
        {
            l = i1 + qlp.c(5, j);
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + qlp.b(6, e);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + qlp.c(7, c);
        }
        i1 = l;
        if (a != null)
        {
            i1 = l + qlp.c(8, a);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + qlp.c(9, k);
        }
        i1 = l;
        if (b != null)
        {
            b.booleanValue();
            i1 = l + (qlp.c(10) + 1);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int l = qlo1.a();
            switch (l)
            {
            default:
                if (super.a(qlo1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (g == null)
                {
                    g = new pkh();
                }
                qlo1.a(g);
                break;

            case 18: // '\022'
                if (h == null)
                {
                    h = new pkh();
                }
                qlo1.a(h);
                break;

            case 26: // '\032'
                if (i == null)
                {
                    i = new pnt();
                }
                qlo1.a(i);
                break;

            case 32: // ' '
                d = Boolean.valueOf(qlo1.f());
                break;

            case 42: // '*'
                if (j == null)
                {
                    j = new ppq();
                }
                qlo1.a(j);
                break;

            case 50: // '2'
                e = qlo1.g();
                break;

            case 58: // ':'
                if (c == null)
                {
                    c = new qfz();
                }
                qlo1.a(c);
                break;

            case 66: // 'B'
                if (a == null)
                {
                    a = new qgg();
                }
                qlo1.a(a);
                break;

            case 74: // 'J'
                if (k == null)
                {
                    k = new pjx();
                }
                qlo1.a(k);
                break;

            case 80: // 'P'
                b = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (g != null)
        {
            qlp1.a(1, g);
        }
        if (h != null)
        {
            qlp1.a(2, h);
        }
        if (i != null)
        {
            qlp1.a(3, i);
        }
        if (d != null)
        {
            qlp1.a(4, d.booleanValue());
        }
        if (j != null)
        {
            qlp1.a(5, j);
        }
        if (e != null)
        {
            qlp1.a(6, e);
        }
        if (c != null)
        {
            qlp1.a(7, c);
        }
        if (a != null)
        {
            qlp1.a(8, a);
        }
        if (k != null)
        {
            qlp1.a(9, k);
        }
        if (b != null)
        {
            qlp1.a(10, b.booleanValue());
        }
        super.a(qlp1);
    }
}
