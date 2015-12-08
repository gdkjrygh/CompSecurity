// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozn extends qlq
{

    public String a;
    public oyc b[];
    public ozm c;

    public ozn()
    {
        a = null;
        b = oyc.b();
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    oyc oyc1 = b[j];
                    int k = i;
                    if (oyc1 != null)
                    {
                        k = i + qlp.c(3, oyc1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(4, c);
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
                a = qlo1.g();
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                oyc aoyc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aoyc = new oyc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aoyc, 0, j);
                    k = j;
                }
                for (; k < aoyc.length - 1; k++)
                {
                    aoyc[k] = new oyc();
                    qlo1.a(aoyc[k]);
                    qlo1.a();
                }

                aoyc[k] = new oyc();
                qlo1.a(aoyc[k]);
                b = aoyc;
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new ozm();
                }
                qlo1.a(c);
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                oyc oyc1 = b[i];
                if (oyc1 != null)
                {
                    qlp1.a(3, oyc1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        super.a(qlp1);
    }
}
