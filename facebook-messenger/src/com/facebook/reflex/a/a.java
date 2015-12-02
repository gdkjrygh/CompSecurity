// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.a;

import com.facebook.analytics.periodicreporters.l;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

public abstract class a
    implements l
{

    private final d a;

    protected a(d d1)
    {
        a = d1;
    }

    abstract ae a();

    public boolean a(long l1)
    {
        long l2 = a.a(a(), 0L);
        return l2 == 0L || l1 - l2 > b();
    }

    abstract long b();

    protected void b(long l1)
    {
        a.b().a(a(), l1).a();
    }
}
