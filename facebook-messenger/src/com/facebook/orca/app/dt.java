// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.orca.f.ad;
import com.facebook.orca.f.z;
import com.facebook.orca.g.aa;
import com.facebook.orca.g.p;

public class dt
{

    private final aa a;
    private final p b;
    private final ad c;
    private final z d;

    public dt(aa aa1, p p1, ad ad1, z z1)
    {
        a = aa1;
        b = p1;
        c = ad1;
        d = z1;
    }

    public void a()
    {
        a.b();
        b.a();
        c.b();
        d.a();
    }

    public void b()
    {
        c.c();
        d.b();
    }

    public void c()
    {
        a.c();
        b.b();
    }
}
