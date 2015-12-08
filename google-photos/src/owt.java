// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class owt extends qlq
{

    public oxb a[];
    public owx b;

    public owt()
    {
        a = oxb.b();
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    oxb oxb1 = a[k];
                    j = i;
                    if (oxb1 != null)
                    {
                        j = i + qlp.c(1, oxb1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
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
                int k = qmb.b(qlo1, 10);
                oxb aoxb[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aoxb = new oxb[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aoxb, 0, j);
                    k = j;
                }
                for (; k < aoxb.length - 1; k++)
                {
                    aoxb[k] = new oxb();
                    qlo1.a(aoxb[k]);
                    qlo1.a();
                }

                aoxb[k] = new oxb();
                qlo1.a(aoxb[k]);
                a = aoxb;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new owx();
                }
                qlo1.a(b);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                oxb oxb1 = a[i];
                if (oxb1 != null)
                {
                    qlp1.a(1, oxb1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        super.a(qlp1);
    }
}
