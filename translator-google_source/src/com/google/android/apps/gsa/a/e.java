// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import com.google.android.apps.gsa.shared.io.h;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.base.p;
import com.google.common.base.s;
import com.google.g.a.a.t;
import java.util.UUID;

// Referenced classes of package com.google.android.apps.gsa.a:
//            h, g, c

public final class e
{

    private final t a;
    private final h b;
    private final boolean c;
    private g d;
    private com.google.android.apps.gsa.a.h e;
    private int f;

    public e(t t1, h h1, boolean flag)
    {
        a = t1;
        b = h1;
        c = flag;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        e.a();
        e = null;
        d.a();
        d = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(c c1, s s)
    {
        this;
        JVM INSTR monitorenter ;
        p.a(c1);
        p.a(s);
        a(0);
        String s1 = UUID.randomUUID().toString();
        d = new g(this, a, s1, b, c1);
        d.start();
        e = new com.google.android.apps.gsa.a.h(this, a.b, s1, b, s, c1);
        e.start();
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    protected final boolean a(int i)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        i;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 186
    //                   1 43
    //                   2 84
    //                   3 134;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag = flag1;
_L13:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        if (f != 2) goto _L7; else goto _L6
_L6:
        L.a(5, "PairHttpConnection", "The response is sent in the up and down", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        throw exception;
_L7:
        f = 1;
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        if (f != 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (f != 1) goto _L9; else goto _L8
_L8:
        L.a(5, "PairHttpConnection", "The response is sent in the up and down", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L9:
        f = 2;
        flag = true;
        continue; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
        if (!c)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f != 2) goto _L11; else goto _L10
_L10:
        f = 3;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L11:
        if (f == 1)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        f = 3;
        flag = true;
        continue; /* Loop/switch isn't completed */
_L2:
        f = 0;
        flag = true;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
