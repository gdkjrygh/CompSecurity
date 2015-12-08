// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvq extends qlw
{

    private static volatile cvq c[];
    public String a;
    public long b[];

    public cvq()
    {
        a = "";
        b = qmb.b;
        G = -1;
    }

    public static cvq[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new cvq[0];
                }
            }
        }
        return c;
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
        if (!a.equals(""))
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < b.length; j++)
                {
                    k += qlp.a(b[j]);
                }

                j = i + k + b.length * 1;
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
                if (qmb.a(qlo1, i))
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
                int l = qmb.b(qlo1, 16);
                long al[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                al = new long[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, al, 0, j);
                    l = j;
                }
                for (; l < al.length - 1; l++)
                {
                    al[l] = qlo1.j();
                    qlo1.a();
                }

                al[l] = qlo1.j();
                b = al;
                break;

            case 18: // '\022'
                int j1 = qlo1.c(qlo1.i());
                int k = qlo1.o();
                int i1;
                for (i1 = 0; qlo1.m() > 0; i1++)
                {
                    qlo1.j();
                }

                qlo1.e(k);
                long al1[];
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                al1 = new long[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, al1, 0, k);
                    i1 = k;
                }
                for (; i1 < al1.length; i1++)
                {
                    al1[i1] = qlo1.j();
                }

                b = al1;
                qlo1.d(j1);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (!a.equals(""))
        {
            qlp1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                qlp1.a(2, b[i]);
            }

        }
        super.a(qlp1);
    }
}
