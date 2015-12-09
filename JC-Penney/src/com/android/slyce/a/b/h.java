// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.b;

import java.util.ArrayList;

// Referenced classes of package com.android.slyce.a.b:
//            l, i, g, f

public class h extends l
{

    ArrayList a;
    final g b = new i(this);

    public h()
    {
    }

    public f a(g g)
    {
        return c(g);
    }

    public h c(g g)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ArrayList();
        }
        a.add(g);
        this;
        JVM INSTR monitorexit ;
        super.d(b);
        return this;
        g;
        this;
        JVM INSTR monitorexit ;
        throw g;
    }

    public l d(g g)
    {
        return c(g);
    }
}
