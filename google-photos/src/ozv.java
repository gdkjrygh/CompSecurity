// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozv extends qlq
{

    private static volatile ozv a[];
    private qeo b;
    private qcm c;
    private Long d;
    private Long e;
    private ozw f;

    public ozv()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static ozv[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ozv[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.c(1, b);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(2, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(3, e.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(4, c);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(5, f);
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
                if (b == null)
                {
                    b = new qeo();
                }
                qlo1.a(b);
                break;

            case 16: // '\020'
                d = Long.valueOf(qlo1.j());
                break;

            case 24: // '\030'
                e = Long.valueOf(qlo1.j());
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new qcm();
                }
                qlo1.a(c);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new ozw();
                }
                qlo1.a(f);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (d != null)
        {
            qlp1.b(2, d.longValue());
        }
        if (e != null)
        {
            qlp1.b(3, e.longValue());
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
