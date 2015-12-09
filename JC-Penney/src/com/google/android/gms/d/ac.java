// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.d:
//            z, aa, ad, q

public abstract class ac
{

    protected final z a;
    private final ad b;
    private final List c = new ArrayList();

    protected ac(ad ad, q q)
    {
        u.a(ad);
        b = ad;
        ad = new z(this, q);
        ad.k();
        a = ad;
    }

    protected void a(z z1)
    {
    }

    protected void b(z z1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((aa)iterator.next()).a(this, z1)) { }
    }

    public z j()
    {
        z z1 = a.a();
        b(z1);
        return z1;
    }

    public z k()
    {
        return a;
    }

    public List l()
    {
        return a.c();
    }

    protected ad m()
    {
        return b;
    }
}
