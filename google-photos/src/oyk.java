// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyk extends qlq
{

    public static final qlr a = qlr.a(11, oyk, 0x26c4b492L);
    public oyj b[];
    private String c;

    public oyk()
    {
        c = null;
        b = oyj.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (c != null)
        {
            i = j + qlp.b(1, c);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    oyj oyj1 = b[j];
                    int k = i;
                    if (oyj1 != null)
                    {
                        k = i + qlp.c(2, oyj1);
                    }
                    j++;
                    i = k;
                }

                j = i;
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
                c = qlo1.g();
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                oyj aoyj[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aoyj = new oyj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aoyj, 0, j);
                    k = j;
                }
                for (; k < aoyj.length - 1; k++)
                {
                    aoyj[k] = new oyj();
                    qlo1.a(aoyj[k]);
                    qlo1.a();
                }

                aoyj[k] = new oyj();
                qlo1.a(aoyj[k]);
                b = aoyj;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(1, c);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                oyj oyj1 = b[i];
                if (oyj1 != null)
                {
                    qlp1.a(2, oyj1);
                }
            }

        }
        super.a(qlp1);
    }

}
