// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cwg extends qlw
{

    public float a[];
    private float b;
    private float c;
    private float d;

    public cwg()
    {
        b = 0.0F;
        c = 0.0F;
        d = 0.0F;
        a = qmb.c;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (Float.floatToIntBits(b) != Float.floatToIntBits(0.0F))
        {
            float f = b;
            i = j + (qlp.c(1) + 4);
        }
        j = i;
        if (Float.floatToIntBits(c) != Float.floatToIntBits(0.0F))
        {
            float f1 = c;
            j = i + (qlp.c(2) + 4);
        }
        i = j;
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            float f2 = d;
            i = j + (qlp.c(3) + 4);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                j = i + a.length * 4 + a.length * 1;
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

            case 13: // '\r'
                b = Float.intBitsToFloat(qlo1.k());
                break;

            case 21: // '\025'
                c = Float.intBitsToFloat(qlo1.k());
                break;

            case 29: // '\035'
                d = Float.intBitsToFloat(qlo1.k());
                break;

            case 37: // '%'
                int l = qmb.b(qlo1, 37);
                float af[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                af = new float[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, af, 0, j);
                    l = j;
                }
                for (; l < af.length - 1; l++)
                {
                    af[l] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af[l] = Float.intBitsToFloat(qlo1.k());
                a = af;
                break;

            case 34: // '"'
                int k = qlo1.i();
                int j1 = qlo1.c(k);
                int i1 = k / 4;
                float af1[];
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                af1 = new float[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, af1, 0, k);
                    i1 = k;
                }
                for (; i1 < af1.length; i1++)
                {
                    af1[i1] = Float.intBitsToFloat(qlo1.k());
                }

                a = af1;
                qlo1.d(j1);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (Float.floatToIntBits(b) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(1, b);
        }
        if (Float.floatToIntBits(c) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(2, c);
        }
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(3, d);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                qlp1.a(4, a[i]);
            }

        }
        super.a(qlp1);
    }
}
