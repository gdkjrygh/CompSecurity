// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class olk extends qlw
{

    public int a;
    public long b;
    public long c;
    public byte d[];

    public olk()
    {
        a = 0;
        b = 0L;
        c = 0L;
        d = qmb.h;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a() + qlp.e(1, a);
        int i = j;
        if (b != 0L)
        {
            i = j + qlp.e(2, b);
        }
        j = i;
        if (c != 0L)
        {
            j = i + qlp.e(3, c);
        }
        i = j;
        if (!Arrays.equals(d, qmb.h))
        {
            i = j + qlp.b(4, d);
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
                b = qlo1.j();
                break;

            case 24: // '\030'
                c = qlo1.j();
                break;

            case 34: // '"'
                d = qlo1.h();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        if (b != 0L)
        {
            qlp1.b(2, b);
        }
        if (c != 0L)
        {
            qlp1.b(3, c);
        }
        if (!Arrays.equals(d, qmb.h))
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
