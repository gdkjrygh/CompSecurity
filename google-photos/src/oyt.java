// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyt extends qlq
{

    private static volatile oyt a[];
    private byte b[];
    private String c;
    private String d;
    private oyu e[];
    private String f;

    public oyt()
    {
        b = null;
        c = null;
        d = null;
        e = oyu.b();
        f = null;
        F = null;
        G = -1;
    }

    public static oyt[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new oyt[0];
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
            i = j + qlp.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    oyu oyu1 = e[j];
                    int k = i;
                    if (oyu1 != null)
                    {
                        k = i + qlp.c(4, oyu1);
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
            i = j + qlp.b(5, f);
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
                b = qlo1.h();
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 34: // '"'
                int k = qmb.b(qlo1, 34);
                oyu aoyu[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                aoyu = new oyu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, aoyu, 0, j);
                    k = j;
                }
                for (; k < aoyu.length - 1; k++)
                {
                    aoyu[k] = new oyu();
                    qlo1.a(aoyu[k]);
                    qlo1.a();
                }

                aoyu[k] = new oyu();
                qlo1.a(aoyu[k]);
                e = aoyu;
                break;

            case 42: // '*'
                f = qlo1.g();
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
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                oyu oyu1 = e[i];
                if (oyu1 != null)
                {
                    qlp1.a(4, oyu1);
                }
            }

        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
