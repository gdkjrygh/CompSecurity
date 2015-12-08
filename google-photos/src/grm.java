// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class grm
    implements gak, grh
{

    private final gri a;
    private final ehr b;
    private final gaj c;
    private final grg d;
    private gai e;
    private gre f;
    private boolean g;

    public grm(Context context, ehr ehr, gaj gaj1, gri gri1)
    {
        d = (grg)olm.a(context, grg);
        a = gri1;
        b = ehr;
        c = gaj1;
        c.a(ehr, this);
        e = c.a(ehr);
    }

    private boolean a(ekp ekp)
    {
        return ekp != null && e.b(ekp) >= 0;
    }

    private void b()
    {
        gre gre1;
        int i;
        int k;
        i = 0;
        k = e.a();
        if (k == 0)
        {
            a.a(null, -1);
            return;
        }
        gre1 = f;
        if (gre1 == null) goto _L2; else goto _L1
_L1:
        if (!gre1.a()) goto _L4; else goto _L3
_L3:
        boolean flag = a(gre1.b);
_L6:
        if (flag)
        {
            gre1 = f;
            f = null;
            b(gre1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (gre1.a < c.a(b).a())
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        ekp ekp = d.h;
        if (a(ekp))
        {
            b(gre.a(ekp));
            return;
        }
        int j = d.j;
        if (j >= 0)
        {
            if (j >= k)
            {
                i = k - 1;
            } else
            {
                i = j;
            }
        }
        b(gre.a(i));
        return;
    }

    private void b(gre gre1)
    {
        int i;
        if (gre1.a())
        {
            gre1 = gre1.b;
            i = e.b(gre1);
            gre1 = e.a(i);
        } else
        {
            i = gre1.a;
            gre1 = e.a(i);
        }
        a.a(gre1, i);
    }

    public final void a()
    {
        c.b(b, this);
    }

    public final void a(eke eke)
    {
    }

    public final void a(gai gai1)
    {
        e = gai1;
    }

    public final void a(gre gre1)
    {
        f = gre1;
        if (g)
        {
            b();
        }
    }

    public final void s()
    {
        g = true;
        if (f == null)
        {
            Object obj = d.h;
            if (obj != null)
            {
                obj = gre.a(((ekp) (obj)));
            } else
            {
                obj = gre.a(Math.max(0, d.j));
            }
            f = ((gre) (obj));
        }
        b();
    }
}
