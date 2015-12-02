// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import com.facebook.abtest.qe.d.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.reflex:
//            e, d

class g
    implements d
{

    final com.facebook.orca.reflex.e a;

    g(com.facebook.orca.reflex.e e1)
    {
        a = e1;
        super();
    }

    public void a(Boolean boolean1)
    {
        e.a(a).b().a(d.a, boolean1.booleanValue()).a();
    }

    public volatile void a(Object obj)
    {
        a((Boolean)obj);
    }
}
