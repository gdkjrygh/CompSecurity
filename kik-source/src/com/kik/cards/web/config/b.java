// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.config;

import com.b.a.n;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;

// Referenced classes of package com.kik.cards.web.config:
//            XDataPlugin

final class b extends r
{

    final String a;
    final Class b;
    final a c;
    final XDataPlugin d;

    b(XDataPlugin xdataplugin, String s, Class class1, a a1)
    {
        d = xdataplugin;
        a = s;
        b = class1;
        c = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = com.kik.cards.web.config.XDataPlugin.a(d, a, (n)obj, b);
        c.a(new j(((org.json.JSONObject) (obj))));
    }
}
