// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvo extends qlw
{

    private static volatile cvo c[];
    public int a;
    public String b;

    public cvo()
    {
        a = 0;
        b = "";
        G = -1;
    }

    public static cvo[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new cvo[0];
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
        if (a != 0)
        {
            i = j + qlp.e(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + qlp.b(2, b);
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

            case 8: // '\b'
                a = qlo1.i();
                break;

            case 18: // '\022'
                b = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != 0)
        {
            qlp1.a(1, a);
        }
        if (!b.equals(""))
        {
            qlp1.a(2, b);
        }
        super.a(qlp1);
    }
}
