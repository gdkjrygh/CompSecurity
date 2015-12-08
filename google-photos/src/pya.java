// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pya extends qlq
{

    private static volatile pya d[];
    public String a;
    public Long b;
    public String c;
    private Long e;

    public pya()
    {
        a = null;
        b = null;
        c = null;
        e = null;
        F = null;
        G = -1;
    }

    public static pya[] b()
    {
        if (d == null)
        {
            synchronized (qlu.a)
            {
                if (d == null)
                {
                    d = new pya[0];
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
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            b.longValue();
            j = i + (qlp.c(2) + 8);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(3, e.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(4, c);
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

            case 17: // '\021'
                b = Long.valueOf(qlo1.l());
                break;

            case 24: // '\030'
                e = Long.valueOf(qlo1.j());
                break;

            case 34: // '"'
                c = qlo1.g();
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
            qlp1.c(2, b.longValue());
        }
        if (e != null)
        {
            qlp1.b(3, e.longValue());
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        super.a(qlp1);
    }
}
