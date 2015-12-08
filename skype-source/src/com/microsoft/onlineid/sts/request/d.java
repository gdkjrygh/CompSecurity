// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import com.microsoft.onlineid.sts.b.b;
import com.microsoft.onlineid.sts.b.c;
import com.microsoft.onlineid.sts.f;
import com.microsoft.onlineid.sts.h;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Element;

// Referenced classes of package com.microsoft.onlineid.sts.request:
//            c, g

public final class d extends com.microsoft.onlineid.sts.request.c
{

    private h a;

    public d()
    {
    }

    public final void a(h h1)
    {
        a = h1;
    }

    public final com.microsoft.onlineid.sts.n.b b()
    {
        return com.microsoft.onlineid.sts.n.b.b;
    }

    protected final void b(Element element)
    {
        Element element1 = com.microsoft.onlineid.sts.request.g.a(element, "wsse:UsernameToken");
        element1.setAttribute("wsu:Id", "devicesoftware");
        com.microsoft.onlineid.sts.request.g.a(element1, "wsse:Username", a.a());
        com.microsoft.onlineid.sts.request.g.a(element1, "wsse:Password", a.b());
        d(element);
    }

    public final b f()
    {
        return new c(d());
    }

    protected final List g()
    {
        return Collections.singletonList(f.a);
    }
}
