// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.config;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;

// Referenced classes of package com.kik.cards.web.config:
//            XDataPlugin

final class e extends r
{

    final a a;
    final XDataPlugin b;

    e(XDataPlugin xdataplugin, a a1)
    {
        b = xdataplugin;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        a.a(new j());
    }

    public final void a(Throwable throwable)
    {
        a.a(new j(500));
    }
}
