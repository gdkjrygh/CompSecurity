// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvt extends qlw
{

    private static volatile cvt a[];
    private float b;
    private float c;

    public cvt()
    {
        b = 0.0F;
        c = 0.0F;
        G = -1;
    }

    public static cvt[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new cvt[0];
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
        int i = super.a();
        float f = b;
        int j = qlp.c(1);
        f = c;
        return i + (j + 4) + (qlp.c(2) + 4);
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
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, b);
        qlp1.a(2, c);
        super.a(qlp1);
    }
}
