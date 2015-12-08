// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.z;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            g

final class a
    implements z
{

    final g a;

    public final void a()
    {
    }

    public final void b()
    {
        v.b("Failed to ping");
    }

    public final void c()
    {
        v.b("Ping responded with bad location.");
        g.a(a);
    }

    (g g1)
    {
        a = g1;
        super();
    }
}
