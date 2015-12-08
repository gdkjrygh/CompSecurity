// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzno, zznp, zzns, zzlb

public abstract class zznr
{

    protected final zzno a;
    private final zzns b;
    private final List c = new ArrayList();

    protected zznr(zzns zzns, zzlb zzlb)
    {
        zzu.a(zzns);
        b = zzns;
        zzns = new zzno(this, zzlb);
        zzns.k();
        a = zzns;
    }

    protected void a(zzno zzno1)
    {
    }

    protected void b(zzno zzno1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((zznp)iterator.next()).a(this, zzno1)) { }
    }

    public zzno l()
    {
        zzno zzno1 = a.a();
        b(zzno1);
        return zzno1;
    }

    public zzno m()
    {
        return a;
    }

    public List n()
    {
        return a.c();
    }

    protected zzns o()
    {
        return b;
    }
}
