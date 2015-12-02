// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import com.facebook.analytics.periodicreporters.ClientPeriodicReporters;
import com.facebook.analytics.periodicreporters.l;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;
import com.facebook.inject.t;
import com.facebook.reflex.a.c;
import com.facebook.reflex.a.d;

// Referenced classes of package com.facebook.reflex:
//            ac, Transaction, ad, ab

public class z extends b
{

    public z()
    {
    }

    protected void a()
    {
        f(com/facebook/breakpad/b);
        a(com/facebook/analytics/periodicreporters/l, com/facebook/analytics/periodicreporters/ClientPeriodicReporters).a(com/facebook/reflex/a/d).a(com/facebook/reflex/a/c);
        a(com/facebook/reflex/a/d).a(new ac(null)).a();
        a(com/facebook/reflex/Transaction).a(new ad(this, null)).a();
        a(com/facebook/reflex/a/c).a(new ab(this, null)).a();
    }

    public void a(t t1)
    {
        super.a(t1);
        ((BreakpadManager)t1.a(com/facebook/breakpad/BreakpadManager)).a();
    }
}
