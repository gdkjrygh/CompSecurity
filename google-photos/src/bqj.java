// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Arrays;

final class bqj
    implements bqw
{

    private bqa a;

    bqj(bqa bqa1)
    {
        a = bqa1;
        super();
    }

    public final void a()
    {
        a.q();
    }

    public final void a(float f)
    {
        if (a.c.m() != -1L)
        {
            long l = (long)((float)a.c.m() * f);
            bqa.a(a, l);
            if (!bqa.a(a).d())
            {
                bqa.a(a, true);
                a.q();
            }
        }
    }

    public final void a(int i)
    {
        cqf cqf1 = a.c.c.e;
        bqa bqa1 = a;
        long l1 = cqf1.e(i);
        long l = l1;
        if (i > 0)
        {
            l = l1 + cqf1.d(i - 1).b();
        }
        bqa.a(bqa1, l);
    }

    public final void b()
    {
        bqa.a(a).f();
    }

    public final void c()
    {
        if (a.c.v())
        {
            a.t();
        }
    }

    public final boolean d()
    {
        boolean flag;
        bww bww1 = a.c;
        if (bww1.x() != bxd.b || !bww1.b.r && !bww1.b.ab)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        pye pye = bww1.c.p;
        if (pye == null || Arrays.equals(b.a(pye), bww1.b.o))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        flag = true;
_L1:
        if (flag)
        {
            Log.e(bqa.u(), "There were unsaved storyboard changes.");
        }
        if (a.c.b.V && a.c.b.ab)
        {
            bqa.b(a).s();
            return true;
        } else
        {
            return false;
        }
        flag = false;
          goto _L1
    }
}
