// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pge extends qlq
{

    private static volatile pge c[];
    public pfz a;
    public Float b;

    public pge()
    {
        a = null;
        b = null;
        F = null;
        G = -1;
    }

    public static pge[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new pge[0];
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
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (b != null)
        {
            b.floatValue();
            j = i + (qlp.c(2) + 4);
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
                if (a == null)
                {
                    a = new pfz();
                }
                qlo1.a(a);
                break;

            case 21: // '\025'
                b = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
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
            qlp1.a(2, b.floatValue());
        }
        super.a(qlp1);
    }
}
