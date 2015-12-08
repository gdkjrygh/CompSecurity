// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class cup
    implements jih
{

    private boolean a;
    private int b;
    private boolean c;
    private cun d;

    cup(cun cun1)
    {
        d = cun1;
        super();
        a = false;
        b = 0;
        c = false;
    }

    public final void a(jie jie)
    {
        d.a();
        cun.c(d).d();
    }

    public final void a(boolean flag, int i)
    {
        if (!c && i == 4)
        {
            c = true;
            cun.c(d).a();
        }
        if (flag && i == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b == i && a == flag)
        {
            return;
        }
        if (b == 2 && i != 2 && cun.a(d).e() != -1L)
        {
            bww bww1 = cun.d(d);
            long l = TimeUnit.MILLISECONDS.toMicros(cun.a(d).e());
            bww1.c.h = l;
        }
        if (i != 5) goto _L2; else goto _L1
_L1:
        cun.c(d).a(0, true);
        cun.a(d).a(false);
        cun.a(d).a(0L);
_L4:
        a = flag;
        b = i;
        return;
_L2:
        if (!flag)
        {
            cun.c(d).a(null);
        } else
        if (i == 3)
        {
            cun.c(d).c();
        } else
        if (flag)
        {
            cun.c(d).b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void z_()
    {
    }
}
