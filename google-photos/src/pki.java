// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pki extends qlq
{

    private static volatile pki b[];
    public pkh a;

    public pki()
    {
        a = null;
        F = null;
        G = -1;
    }

    public static pki[] b()
    {
        if (b == null)
        {
            synchronized (qlu.a)
            {
                if (b == null)
                {
                    b = new pki[0];
                }
            }
        }
        return b;
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
                if (a == null)
                {
                    a = new pkh();
                }
                qlo1.a(a);
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
        super.a(qlp1);
    }
}
