// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cwf extends qlw
{

    public int a;
    public int b;
    public float c[];

    public cwf()
    {
        a = 0;
        b = 0;
        c = qmb.c;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a() + qlp.e(1, a) + qlp.e(2, b);
        int i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j + c.length * 4 + c.length * 1;
            }
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
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = qlo1.i();
                break;

            case 16: // '\020'
                b = qlo1.i();
                break;

            case 29: // '\035'
                int l = qmb.b(qlo1, 29);
                float af[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                af = new float[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, af, 0, j);
                    l = j;
                }
                for (; l < af.length - 1; l++)
                {
                    af[l] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af[l] = Float.intBitsToFloat(qlo1.k());
                c = af;
                break;

            case 26: // '\032'
                int k = qlo1.i();
                int j1 = qlo1.c(k);
                int i1 = k / 4;
                float af1[];
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                af1 = new float[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, af1, 0, k);
                    i1 = k;
                }
                for (; i1 < af1.length; i1++)
                {
                    af1[i1] = Float.intBitsToFloat(qlo1.k());
                }

                c = af1;
                qlo1.d(j1);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        qlp1.a(2, b);
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                qlp1.a(3, c[i]);
            }

        }
        super.a(qlp1);
    }
}
