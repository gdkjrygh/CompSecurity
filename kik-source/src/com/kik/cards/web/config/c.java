// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.config;

import com.b.a.n;
import com.kik.g.as;

// Referenced classes of package com.kik.cards.web.config:
//            XDataPlugin

final class c
    implements as
{

    final String a;
    final Class b;
    final XDataPlugin c;

    c(XDataPlugin xdataplugin, String s, Class class1)
    {
        c = xdataplugin;
        a = s;
        b = class1;
        super();
    }

    public final volatile Object a(Object obj)
    {
        return XDataPlugin.a(c, a, (n)obj, b);
    }
}
