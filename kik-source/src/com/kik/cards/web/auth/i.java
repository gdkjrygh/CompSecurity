// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.cards.web.plugin.a;
import com.kik.g.p;
import kik.android.b.s;

// Referenced classes of package com.kik.cards.web.auth:
//            AuthPlugin, j

final class i
    implements Runnable
{

    final String a;
    final a b;
    final String c;
    final AuthPlugin d;

    i(AuthPlugin authplugin, String s1, a a1, String s2)
    {
        d = authplugin;
        a = s1;
        b = a1;
        c = s2;
        super();
    }

    public final void run()
    {
        com.kik.g.s.c(d.b(a), com.kik.cards.web.auth.AuthPlugin.a(d).b(a)).a(new j(this));
    }
}
