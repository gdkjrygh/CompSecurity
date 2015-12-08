// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.cards.web.plugin.a;
import com.kik.g.p;

// Referenced classes of package com.kik.cards.web.auth:
//            AuthPlugin, h

final class g
    implements Runnable
{

    final String a;
    final a b;
    final AuthPlugin c;

    g(AuthPlugin authplugin, String s, a a1)
    {
        c = authplugin;
        a = s;
        b = a1;
        super();
    }

    public final void run()
    {
        c.b(a).a(new h(this));
    }
}
