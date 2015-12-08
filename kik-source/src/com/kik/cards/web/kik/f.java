// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.kik;

import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package com.kik.cards.web.kik:
//            KikMessageParcelable, KikPlugin, h, g

final class f extends r
{

    final KikMessageParcelable a;
    final String b;
    final a c;
    final KikPlugin d;

    f(KikPlugin kikplugin, KikMessageParcelable kikmessageparcelable, String s, a a1)
    {
        d = kikplugin;
        a = kikmessageparcelable;
        b = s;
        c = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (com.kik.cards.web.av.a)obj;
        a.i = ((com.kik.cards.web.av.a) (obj)).f();
        if (((com.kik.cards.web.av.a) (obj)).g() != null)
        {
            a.k = bf.a(((com.kik.cards.web.av.a) (obj)).g(), b);
        }
        com.kik.cards.web.kik.KikPlugin.a(d).a(a).a(new g(this));
        super.a(obj);
    }

    public final void a(Throwable throwable)
    {
        KikPlugin.b(d);
        if (c != null)
        {
            c.a(new j());
        }
    }
}
