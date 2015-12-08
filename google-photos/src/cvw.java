// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvw extends qlw
{

    private static volatile cvw h[];
    public cvx a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    public cvw()
    {
        a = null;
        b = 0.0F;
        c = 0.0F;
        d = 0.0F;
        e = 0.0F;
        f = 0.0F;
        g = 0.0F;
        G = -1;
    }

    public static cvw[] b()
    {
        if (h == null)
        {
            synchronized (qlu.a)
            {
                if (h == null)
                {
                    h = new cvw[0];
                }
            }
        }
        return h;
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
            i = j + qlp.c(1, a);
        }
        j = i;
        if (Float.floatToIntBits(b) != Float.floatToIntBits(0.0F))
        {
            float f1 = b;
            j = i + (qlp.c(2) + 4);
        }
        i = j;
        if (Float.floatToIntBits(c) != Float.floatToIntBits(0.0F))
        {
            float f2 = c;
            i = j + (qlp.c(3) + 4);
        }
        j = i;
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            float f3 = d;
            j = i + (qlp.c(4) + 4);
        }
        i = j;
        if (Float.floatToIntBits(e) != Float.floatToIntBits(0.0F))
        {
            float f4 = e;
            i = j + (qlp.c(5) + 4);
        }
        j = i;
        if (Float.floatToIntBits(f) != Float.floatToIntBits(0.0F))
        {
            float f5 = f;
            j = i + (qlp.c(6) + 4);
        }
        i = j;
        if (Float.floatToIntBits(g) != Float.floatToIntBits(0.0F))
        {
            float f6 = g;
            i = j + (qlp.c(7) + 4);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new cvx();
                }
                qlo1.a(a);
                break;

            case 21: // '\025'
                b = Float.intBitsToFloat(qlo1.k());
                break;

            case 29: // '\035'
                c = Float.intBitsToFloat(qlo1.k());
                break;

            case 37: // '%'
                d = Float.intBitsToFloat(qlo1.k());
                break;

            case 45: // '-'
                e = Float.intBitsToFloat(qlo1.k());
                break;

            case 53: // '5'
                f = Float.intBitsToFloat(qlo1.k());
                break;

            case 61: // '='
                g = Float.intBitsToFloat(qlo1.k());
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
        if (Float.floatToIntBits(b) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(2, b);
        }
        if (Float.floatToIntBits(c) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(3, c);
        }
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(4, d);
        }
        if (Float.floatToIntBits(e) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(5, e);
        }
        if (Float.floatToIntBits(f) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(6, f);
        }
        if (Float.floatToIntBits(g) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(7, g);
        }
        super.a(qlp1);
    }
}
