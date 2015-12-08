// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.b:
//            ag, aj, V

public abstract class ai
{

    private final List a = new ArrayList();
    public final aj g;
    protected final ag h;

    public ai(aj aj, V v)
    {
        zzx.zzv(aj);
        g = aj;
        aj = new ag(this, v);
        aj.g = true;
        h = aj;
    }

    public void a(ag ag1)
    {
    }

    public ag b()
    {
        ag ag1 = h.a();
        e();
        return ag1;
    }

    public final ag c()
    {
        return h;
    }

    public final List d()
    {
        return h.i;
    }

    public final void e()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }
}
