// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class bsk extends bmb
{

    private int a;
    private final cum b;

    bsk(bmb bmb1, cum cum1)
    {
        super(bmb1);
        new bsl(this, this, new bxg[] {
            bxg.k, bxg.o
        });
        b = (cum)b.a(cum1, "playerLimits", null);
    }

    static void a(bsk bsk1)
    {
        bsk1.b();
    }

    private void b()
    {
        c();
        if (c.c.g != -1L && c.b.z.d == -1L)
        {
            bww bww1 = c;
            long l = (long)((double)Math.max(0x4c4b40L, Math.min(c.c.g, a * 1000 * 1000)) * 0.84999999999999998D);
            int j = bww1.b.h.size();
            int i = 0;
            boolean flag = false;
            for (; i < j; i++)
            {
                bwz bwz1 = (bwz)bww1.b.h.get(i);
                if (!bwz1.b)
                {
                    bww1.b.h.set(i, bwz.a(bwz1.a));
                    flag = true;
                }
            }

            boolean flag1;
            if (bww1.b.z.d != l)
            {
                bww1.b.z.a(l);
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!bww1.b.z.c)
            {
                bww1.b.z.c = true;
                flag1 = true;
            }
            if (flag || flag1)
            {
                bww1.g();
            }
            if (flag)
            {
                bww1.a(new bxg[] {
                    bxg.i
                });
            }
            if (flag1)
            {
                bww1.a(new bxg[] {
                    bxg.a
                });
                return;
            }
        }
    }

    public final void e()
    {
        super.e();
        a = b.n();
        b();
    }
}
