// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.b;

import com.google.android.apps.gsa.shared.exception.a;
import com.google.android.apps.gsa.shared.util.a.l;
import com.google.c.a.a.a.a.b;
import com.google.common.base.p;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.apps.gsa.shared.b:
//            f, e, a, d

final class c extends f
{

    final com.google.android.apps.gsa.shared.util.debug.c a;
    private final l f;
    private final com.google.android.apps.gsa.shared.util.b g;
    private final e h;

    c(a a1, l l1, com.google.android.apps.gsa.shared.util.debug.c c1, com.google.android.apps.gsa.shared.util.b b1, e e1)
    {
        super(a1);
        g = b1;
        h = e1;
        f = (l)p.a(l1);
        a = (com.google.android.apps.gsa.shared.util.debug.c)p.a(c1);
    }

    public final void a()
    {
        b ab[];
        int i;
        boolean flag;
        int j;
        flag = false;
        ab = h.a;
        j = ab.length;
        i = 0;
_L3:
        b b1;
        int i1;
        int j1;
        int l1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        b1 = ab[i];
        i1 = b1.a;
        j1 = b1.b;
        l1 = b1.c;
        if (i1 != 0 && i1 != b.getErrorType() || j1 != 0 && j1 != b.getErrorCode() || l1 != 0 && l1 != c || j1 == 0 && l1 == 0) goto _L2; else goto _L1
_L1:
        int ai[] = b1.d;
        int i2 = ai.length;
        int k = 0;
        flag = false;
        i = 0;
        while (k < i2) 
        {
            int k1 = ai[k];
            boolean flag1;
            if (k1 == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (k1 == 1)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            flag |= k1;
            k++;
            i = flag1 | i;
        }
_L4:
        b();
        if (i != 0 && (h.c.get() == 0L || g.a() - h.c.get() > com.google.android.apps.gsa.shared.b.a.a()))
        {
            e = b.asException();
            h.c.set(g.a());
        }
        if (flag)
        {
            if (h.b.get() == 0L || g.a() - h.b.get() > com.google.android.apps.gsa.shared.b.a.b())
            {
                new d(this, "Grab state dump");
                h.b.set(g.a());
                return;
            } else
            {
                c();
                return;
            }
        } else
        {
            c();
            return;
        }
_L2:
        i++;
          goto _L3
        i = 0;
          goto _L4
    }
}
