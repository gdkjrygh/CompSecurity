// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jau extends qlq
{

    private static volatile jau k[];
    public String a;
    public Boolean b;
    public Integer c;
    public byte d[];
    public Double e;
    public Float f;
    public Integer g;
    public Long h;
    public Integer i;
    public String j;

    public jau()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        F = null;
        G = -1;
    }

    public static jau[] b()
    {
        if (k == null)
        {
            synchronized (qlu.a)
            {
                if (k == null)
                {
                    k = new jau[0];
                }
            }
        }
        return k;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i1 = super.a() + qlp.b(1, a);
        int l = i1;
        if (b != null)
        {
            b.booleanValue();
            l = i1 + (qlp.c(2) + 1);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l + qlp.e(3, c.intValue());
        }
        l = i1;
        if (d != null)
        {
            l = i1 + qlp.b(4, d);
        }
        i1 = l;
        if (e != null)
        {
            e.doubleValue();
            i1 = l + (qlp.c(5) + 8);
        }
        l = i1;
        if (f != null)
        {
            f.floatValue();
            l = i1 + (qlp.c(6) + 4);
        }
        i1 = l;
        if (g != null)
        {
            i1 = l + qlp.e(7, g.intValue());
        }
        l = i1;
        if (h != null)
        {
            l = i1 + qlp.e(8, h.longValue());
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + qlp.e(9, i.intValue());
        }
        l = i1;
        if (j != null)
        {
            l = i1 + qlp.b(10, j);
        }
        return l;
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
                a = qlo1.g();
                break;

            case 16: // '\020'
                b = Boolean.valueOf(qlo1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(qlo1.i());
                break;

            case 34: // '"'
                d = qlo1.h();
                break;

            case 41: // ')'
                e = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 53: // '5'
                f = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 56: // '8'
                g = Integer.valueOf(qlo1.i());
                break;

            case 64: // '@'
                h = Long.valueOf(qlo1.j());
                break;

            case 72: // 'H'
                i = Integer.valueOf(qlo1.i());
                break;

            case 82: // 'R'
                j = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        if (b != null)
        {
            qlp1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e.doubleValue());
        }
        if (f != null)
        {
            qlp1.a(6, f.floatValue());
        }
        if (g != null)
        {
            qlp1.a(7, g.intValue());
        }
        if (h != null)
        {
            qlp1.b(8, h.longValue());
        }
        if (i != null)
        {
            qlp1.a(9, i.intValue());
        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        super.a(qlp1);
    }
}
