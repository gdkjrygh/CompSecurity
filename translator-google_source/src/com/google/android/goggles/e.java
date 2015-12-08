// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles;

import android.text.TextUtils;
import com.google.bionics.goggles.api2.g;
import com.google.bionics.goggles.api2.i;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.goggles:
//            f, c

public final class e
    implements f
{

    final c a;
    private final i b = new i();
    private final List c = new ArrayList();
    private int d;
    private int e;

    e(c c1)
    {
        a = c1;
        super();
        d = 1;
        e = -1;
    }

    public final i a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(b.a);
        if (!flag) goto _L2; else goto _L1
_L1:
        i j = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return j;
_L2:
        b.b = (g[])c.toArray(new g[c.size()]);
        j = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.goggles.c.a(a, this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
