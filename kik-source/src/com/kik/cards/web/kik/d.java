// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.kik;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import kik.a.d.k;

// Referenced classes of package com.kik.cards.web.kik:
//            KikPlugin, h

final class d extends r
{

    final String a;
    final a b;
    final KikPlugin c;

    d(KikPlugin kikplugin, String s, a a1)
    {
        c = kikplugin;
        a = s;
        b = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (k)obj;
        com.kik.cards.web.kik.KikPlugin.a(c).a(((k) (obj)).b(), a);
        b.a(new j());
    }

    public final void a(Throwable throwable)
    {
        b.a(new j(404));
    }
}
